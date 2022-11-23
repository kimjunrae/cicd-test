package com.example.doosan.framework.confiuration;

import com.example.doosan.framework.properties.IDatabaseProperties;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;

public abstract class DatabaseConfig {
    
    @Bean
    public abstract DataSource dataSource();
  
    void configureDataSource(DataSource dataSource, IDatabaseProperties databaseProperties) {
        dataSource.setDriverClassName(databaseProperties.getDriverClassName());
        dataSource.setUrl(databaseProperties.getUrl());
        dataSource.setUsername(databaseProperties.getUserName());
        dataSource.setPassword(databaseProperties.getPassword());
        dataSource.setMaxActive(databaseProperties.getMaxActive());
        dataSource.setMaxIdle(databaseProperties.getMaxIdle());
        dataSource.setMinIdle(databaseProperties.getMinIdle());
        dataSource.setInitialSize(databaseProperties.getInitialSize());
        dataSource.setTestOnBorrow(true);
        dataSource.setValidationQuery("SELECT 1");
    }
}
