package com.capellihernandez.bbdd2.datasource;

import org.apache.logging.log4j.ThreadContext;
import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomSchemaResolver implements CurrentTenantIdentifierResolver {

    @Override
    public String resolveCurrentTenantIdentifier() {
        try {
            return Optional.ofNullable(ThreadContext.get("TenantId")).orElse(Constant.TENANT_B);
        }catch (Exception e){
            return Constant.TENANT_B;
        }
    }

    @Override
    public boolean validateExistingCurrentSessions() {
        return Boolean.TRUE;
    }
}
