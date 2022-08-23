package com.capellihernandez.bbdd2.datasource;

import org.hibernate.engine.jdbc.connections.spi.AbstractDataSourceBasedMultiTenantConnectionProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Component
public class CustomAbstractDataSourceBasedMultiTenantConnectionProviderImpl extends AbstractDataSourceBasedMultiTenantConnectionProviderImpl {

    boolean init = false;

    @Autowired
    private ApplicationContext context;

    @Autowired
    private DataSource defaultDS;

    private Map<String, DataSource> map = new HashMap<>();


    @PostConstruct
    public void load() {
        map.put(Constant.TENANT_B, defaultDS);
    }


    @Override
    protected DataSource selectAnyDataSource() {
        return map.get(Constant.TENANT_B);
    }

    @Override
    protected DataSource selectDataSource(String tenantIdentifier) {
        if (!init) {
            init = true;
            CustomDataSource tenantDataSource = context.getBean(CustomDataSource.class);
            map.putAll(tenantDataSource.getAll());
        }
        return map.get(tenantIdentifier) != null ? map.get(tenantIdentifier) : map.get(Constant.TENANT_A);
    }

}
