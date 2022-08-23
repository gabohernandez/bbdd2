package com.capellihernandez.bbdd2.datasource.other;

//@Component
public class CustomConnectionProvider {// implements MultiTenantConnectionProvider {
/*
    //private static Logger logger = LoggerFactory.getLogger(TenantConnectionProvider.class);
    private String DEFAULT_TENANT = "OLD";
    private DataSource datasource;

    public CustomConnectionProvider(DataSource dataSource) {
        this.datasource = dataSource;
    }

    @Override
    public Connection getAnyConnection() throws SQLException {
        return datasource.getConnection();
    }

    @Override
    public void releaseAnyConnection(Connection connection) throws SQLException {
        connection.close();
    }

    @Override
    public Connection getConnection(String tenantIdentifier) throws SQLException {
        //logger.info("Get connection for tenant {}", tenantIdentifier);
        final Connection connection = getAnyConnection();
        connection.setSchema(tenantIdentifier);
        return connection;
    }

    @Override
    public void releaseConnection(String tenantIdentifier, Connection connection) throws SQLException {
       // logger.info("Release connection for tenant {}", tenantIdentifier);
        connection.setSchema(DEFAULT_TENANT);
        releaseAnyConnection(connection);
    }

    @Override
    public boolean supportsAggressiveRelease() {
        return false;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public boolean isUnwrappableAs(Class aClass) {
        return false;
    }

    @Override
    public <T> T unwrap(Class<T> aClass) {
        return null;
    }
    */
}
