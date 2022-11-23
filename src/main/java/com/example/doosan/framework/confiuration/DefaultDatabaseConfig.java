package com.example.doosan.framework.confiuration;

import com.example.doosan.framework.properties.DoosanDBProperties;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration(exclude = {DataSourceTransactionManagerAutoConfiguration.class, DataSourceAutoConfiguration.class})
@EnableTransactionManagement(proxyTargetClass = true)
@EnableConfigurationProperties(DoosanDBProperties.class)
public class DefaultDatabaseConfig extends DatabaseConfig {

    private final ApplicationContext applicationContext;
    private final DoosanDBProperties doosanDBProperties;

    @Autowired
    public DefaultDatabaseConfig(ApplicationContext applicationContext, DoosanDBProperties doosanDBProperties) {
        this.applicationContext = applicationContext;
        this.doosanDBProperties = doosanDBProperties;
    }

    @Bean(name = "dataSource", destroyMethod = "close")
    public DataSource dataSource() {
        org.apache.tomcat.jdbc.pool.DataSource dataSource = new org.apache.tomcat.jdbc.pool.DataSource();
        configureDataSource(dataSource, doosanDBProperties);
        return dataSource;
    }

    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager(@Qualifier("dataSource") DataSource dataSource) {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(dataSource);
        transactionManager.setGlobalRollbackOnParticipationFailure(false);
        return transactionManager;
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setTypeAliasesPackage("com.stunstun.spring.repository.entity");
        sessionFactoryBean.setConfigLocation(applicationContext.getResource("classpath:com/example/doosan/demo/mybatis-config.xml"));
        sessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:com/example/doosan/demo/**/mapper/*.xml"));

        return sessionFactoryBean.getObject();
    }

    @Bean(name = "doosanSession")
    public SqlSessionTemplate sqlSession(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
