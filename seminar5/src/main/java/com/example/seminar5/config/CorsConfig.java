package com.example.seminar5.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter(){
        UrlBasedCorsConfigurationSource source =
                new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);   //Frontend에서 서버와 통신할 때 쓰는 장식 툴 axios를 통해서 소통
        config.addAllowedOrigin("*");   //모든 IP에서 응답을 허용하겠다
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");   //POST GET PATCH등 처리하겠다
        source.registerCorsConfiguration("*", config);  //IP CONFIG따름
        return new CorsFilter(source);
    }
}
