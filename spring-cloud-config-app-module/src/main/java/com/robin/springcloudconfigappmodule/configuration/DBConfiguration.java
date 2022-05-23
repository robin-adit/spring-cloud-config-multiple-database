package com.robin.springcloudconfigclient.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("db")
@EnableAutoConfiguration
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DBConfiguration {
    private String connection;
    private String host;
    private int post;
}