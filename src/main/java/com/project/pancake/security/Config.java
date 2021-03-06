package com.project.pancake.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class Config extends WebSecurityConfigurerAdapter {

    // Adding the roles
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("customer")
                .password("osd")
                .roles("customer")
                .and()
                .withUser("employee")
                .password("palacinke")
                .roles("employee")
                .and()
                .withUser("owner")
                .password("store")
                .roles("owner");
    }

    // Configuring the api
    // according to the roles.
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().
                httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/ingredients", "/ingredients/*").hasRole("employee")
                .antMatchers("/orders", "/orders/*", "/pancakes", "/pancakes/*").hasRole("customer")
                .antMatchers("/report", "/report/*").hasRole("owner");

                //.and()
                //.formLogin();
    }

    // Function to encode the password
    // assign to the particular roles.
    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}
