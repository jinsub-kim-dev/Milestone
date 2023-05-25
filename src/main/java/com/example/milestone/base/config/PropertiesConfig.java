package com.example.milestone.base.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({
        "${database-properties:classpath:database.properties}"
})
public class PropertiesConfig {
}
