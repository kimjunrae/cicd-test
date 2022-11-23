package com.example.doosan.framework.properties;

public interface IDatabaseProperties {

	String getDriverClassName();
	String getUrl();
	String getUserName();
	String getPassword();
	int getInitialSize();
	int getMaxActive();
	int getMaxIdle();
	int getMinIdle();
	int getMaxWait();

	long getSleepTime();
}
