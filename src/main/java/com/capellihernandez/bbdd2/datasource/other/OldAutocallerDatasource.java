/**
 * Copyright (c) 2022 masvoz
 * <p>
 * Author: miquel.rodriguez@enreach.com
 */
package com.capellihernandez.bbdd2.datasource.other;

/*
@Configuration
@PropertySource({"classpath:autocaller.properties"})
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.masvoz.autocallermigrator",
        entityManagerFactoryRef = "oldAuthenticationConfigEntityManagerFactory",
        transactionManagerRef = "oldAuthenticationConfigTransactionManager")
 */
public class OldAutocallerDatasource {
/*
    @Value("${spring.autocaller.datasource.driver-class-name}")
    private String driver;

    @Value("${spring.autocaller.old.datasource.url}")
    private String url;

    @Value("${spring.autocaller.old.datasource.username}")
    private String username;

    @Value("${spring.autocaller.old.datasource.password}")
    private String password;

    @Value("${hibernate.dialect:org.hibernate.dialect.MySQL5InnoDBDialect}")
    private String dialect;

    @Value("${hibernate.show_sql:false}")
    private boolean showSQL;

    @Value("${hibernate.format_sql:false}")
    private boolean formatSQL;

    @Value("${connection.release_mode:auto}")
    private String releaseMode;

    @Value("${hibernate.hbm2ddl.auto:none}")
    private String hbm2ddlAuto;

    @Primary
    @Bean
    public DataSource oldAuthenticationConfigDataSource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        return dataSource;
    }

    @Primary
    @Bean
    public LocalContainerEntityManagerFactoryBean oldAuthenticationConfigEntityManagerFactory() {

        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(oldAuthenticationConfigDataSource());
        em.setPackagesToScan("com.masvoz.autocallermigrator.core.model");
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        em.setJpaProperties(hibernateProperties());

        return em;
    }

    @Primary
    @Bean
    public PlatformTransactionManager oldAuthenticationConfigTransactionManager() {

        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(oldAuthenticationConfigEntityManagerFactory().getObject());

        return transactionManager;
    }

    @Primary
    @Bean
    public LocalSessionFactoryBean oldAuthenticationConfigSessionFactory() {

        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(oldAuthenticationConfigDataSource());
        sessionFactoryBean.setPackagesToScan("com.masvoz.autocallermigrator.core.model");
        sessionFactoryBean.setHibernateProperties(hibernateProperties());

        return sessionFactoryBean;
    }

    private Properties hibernateProperties() {

        Properties properties = new Properties();
        properties.put("hibernate.dialect", dialect);
        properties.put("hibernate.temp.use_jdbc_metadata_defaults", "false");
        properties.put("hibernate.show_sql", showSQL);
        properties.put("hibernate.format_sql", formatSQL);
        properties.put("hibernate.hbm2ddl.auto", hbm2ddlAuto);
        properties.put("connection.release_mode", releaseMode);

        return properties;
    }
*/
}