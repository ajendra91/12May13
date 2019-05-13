package com.example.Jersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig extends ResourceConfig {

    public AppConfig() {
        register(AppController.class);
    }
}
