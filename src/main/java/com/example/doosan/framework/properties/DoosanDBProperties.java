package com.example.doosan.framework.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = DoosanDBProperties.PREFIX)
public class DoosanDBProperties implements IDatabaseProperties {
    public static final String PREFIX = "datasource.doosan";

    private String driverClassName;
    private String url;
    private String userName;
    private String password;

    private int initialSize;
    private int maxActive;
    private int maxIdle;
    private int minIdle;
    private int maxWait;
    private String resourcePrefix;

    private long sleepTime;

}
