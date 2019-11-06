package com.nespot2.springrestsample.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;


@Configuration
public class RestTemplateConfiguration {

    @Value("${api.read-time-out:5000}")
    private int readTimeOut;

    @Value("${api.connect-time-out:30000}")
    private int connectTimeOut;


    @Bean
    public RestTemplate restTemplate(){
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setReadTimeout(readTimeOut); // 읽기시간초과, ms
        factory.setConnectTimeout(connectTimeOut); // 연결시간초과, ms
        return new RestTemplate(factory);
    }
}
