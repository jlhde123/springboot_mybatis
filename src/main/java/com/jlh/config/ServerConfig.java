package com.jlh.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by jlh
 * On 2016/10/28 0028.
 *
 * @description
 */
@Component
@ConfigurationProperties(prefix = "myserver")
public class ServerConfig {
    private String contextPath;
    private Integer port;

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
