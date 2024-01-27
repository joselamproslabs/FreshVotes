package com.freshvotes.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration {
 
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
      
        http.authorizeRequests()
            .requestMatchers("/login").permitAll()
            .and()
            .formLogin().loginPage("/login")
            .and()
            .logout().permitAll();
 
        http.headers().frameOptions().sameOrigin();
 
        return http.build();
    }
}