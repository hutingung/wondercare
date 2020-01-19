package com.wondercare.center.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Import({ PersistenceConfig.class, WebConfig.class })
@ComponentScan(basePackages = "com.wondercare.center")
public class Config {
}
