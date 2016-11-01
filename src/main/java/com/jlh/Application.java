package com.jlh;

import com.jlh.config.ServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by jlh
 * On 2016/10/17 0017.
 *
 * @description
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.jlh"})
public class Application  extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {

    @Autowired
    private ServerConfig serverConfig;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        if (!serverConfig.getContextPath().equals("/"))
            configurableEmbeddedServletContainer.setContextPath(serverConfig.getContextPath());
        configurableEmbeddedServletContainer.setPort(serverConfig.getPort());
    }
}
