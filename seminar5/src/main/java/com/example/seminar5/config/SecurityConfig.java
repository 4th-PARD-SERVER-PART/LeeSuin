package com.example.seminar5.config;

import com.example.seminar5.PrincipalOauth2UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {
    private final PrincipalOauth2UserService principalOauth2UserService;
    private final CorsConfig corsConfig;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.csrf(AbstractHttpConfigurer::disable);
        http.addFilter(corsConfig.corsFilter());
        http.authorizeHttpRequests(au ->
                au.anyRequest().permitAll());
        http.oauth2Login(
                oauth -> oauth
                        .loginPage("/loginForm")///loginForm이 구글 로그인 페이지
                        .defaultSuccessUrl("/home")//로그인 성공하면 Home으로
                        .userInfoEndpoint( //User정보를 User 서비스에서 요구하는 것들을 불러온다
                                userInfo ->
                                        userInfo.userService(principalOauth2UserService)
                        )
        );
        return http.build();
    }
}
