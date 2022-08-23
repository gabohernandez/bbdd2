package com.capellihernandez.bbdd2.datasource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Component
public class CustomDataSource {
    private HashMap<String, DataSource> dataSources = new HashMap<>();

    //Common
    @Value("${spring.datasource.driver-class-name}")
    private String driver;

    //New
    @Value("${spring.datasource.url}")
    private String newUrl;
    @Value("${spring.datasource.username}")
    private String newUsername;
    @Value("${spring.datasource.password}")
    private String newPassword;

    //Old
    @Value("${spring.tenant_b.datasource.url}")
    private String oldUrl;
    @Value("${spring.tenant_b.datasource.username}")
    private String oldUsername;
    @Value("${spring.tenant_b.datasource.password}")
    private String oldPassword;

    public DataSource getDataSource(String name) {
        if (dataSources.get(name) != null) {
            return dataSources.get(name);
        }
        DataSource dataSource = createDataSource(name);
        if (dataSource != null) {
            dataSources.put(name, dataSource);
        }
        return dataSource;
    }

    @PostConstruct
    public Map<String, DataSource> getAll() {
        Map<String, DataSource> result = new HashMap<>();
        for (String config : Arrays.asList(Constant.TENANT_A, Constant.TENANT_B)) {
            DataSource dataSource = getDataSource(config);
            result.put(config, dataSource);
        }
        return result;
    }

    private DataSource createDataSource(String name) {
        DataSourceBuilder factory = DataSourceBuilder
                .create().driverClassName(driver)
                .username(Constant.TENANT_A.equals(name) ? oldUsername : newUsername)
                .password(Constant.TENANT_A.equals(name) ? oldPassword : newPassword)
                .url(Constant.TENANT_A.equals(name) ? oldUrl : newUrl);
        DataSource ds = factory.build();
        return ds;
    }
}
