package com.freshvotes.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration {
 
    @Bean
    /*public PasswordEncoder getPasswordEncoder() {
    	return new BCryptPasswordEncoder();
    }*/
    
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

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    	auth
        	.inMemoryAuthentication()
            .withUser("user").password("1234").roles("USER");
    }
}