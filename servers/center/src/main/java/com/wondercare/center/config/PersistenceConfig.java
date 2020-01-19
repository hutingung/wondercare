package com.wondercare.center.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.wondercare.center.data")
public class PersistenceConfig {
}
