package com.santander.ceptracker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

public class HttpClientConfig {
    @Bean
    public RestClient restClient() {
	return RestClient.builder().build();
    }
}
