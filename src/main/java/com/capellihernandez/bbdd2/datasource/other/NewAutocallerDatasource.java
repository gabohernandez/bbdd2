/**
 * Copyright (c) 2022 masvoz
 *
 * Author: miquel.rodriguez@enreach.com
 */
package com.capellihernandez.bbdd2.datasource.other;

/*
@Configuration
@PropertySource({"classpath:autocaller.properties"})
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.masvoz.autocallermigrator",
        entityManagerFactoryRef = "newAuthenticationConfigEntityManagerFactory",
        transactionManagerRef = "newAuthenticationConfigTransactionManager")*/
public class NewAutocallerDatasource {
/*
    @Value("${spring.autocaller.datasource.driver-class-name}")
    private String driver;
    
    @Value("${spring.autocaller.new.datasource.url}")
    private String url;

    @Value("${spring.autocaller.new.datasource.username}")
    private String username;

    @Value("${spring.autocaller.new.datasource.password}")
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

   // @Primary
    @Bean
    public DataSource newAuthenticationConfigDataSource() {
        
    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        return dataSource;
    }

    //@Primary
    @Bean
    public LocalContainerEntityManagerFactoryBean newAuthenticationConfigEntityManagerFactory() {

        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(newAuthenticationConfigDataSource());
        em.setPackagesToScan("com.masvoz.autocallermigrator.core.model");
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        em.setJpaProperties(hibernateProperties());

        return em;
    }

    //@Primary
    @Bean
    public PlatformTransactionManager newAuthenticationConfigTransactionManager() {

        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(newAuthenticationConfigEntityManagerFactory().getObject());

        return transactionManager;
    }


    @Bean
    public LocalSessionFactoryBean newAuthenticationConfigSessionFactory() {

        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(newAuthenticationConfigDataSource());
        sessionFactoryBean.setPackagesToScan("com.masvoz.autocallermigrator.core.model");
        sessionFactoryBean.setHibernateProperties(hibernateProperties());

        return sessionFactoryBean;
    }

    private Properties hibernateProperties() {

        Properties properties = new Properties();
        properties.put("hibernate.dialect", dialect);
        properties.put("hibernate.temp.use_jdbc_metadata_defaults", "false");
        properties.put("hibernate.show_sql",showSQL);
        properties.put("hibernate.format_sql",formatSQL);
        properties.put("hibernate.hbm2ddl.auto", hbm2ddlAuto);
        properties.put("connection.release_mode",releaseMode);

        return properties;

    }*/
}