package com.megaproject.config;

import com.megaproject.service.userImpl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;


    @Autowired
    public void registerGlobalAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userDetailsService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()

                .authorizeRequests()
                .antMatchers("/megaproject", "/login", "/signup", "/register").permitAll()
                .antMatchers("/admin").hasRole("ADMIN")
                .antMatchers("/home").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
                .antMatchers("/open").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
                .antMatchers("/pay").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
                .antMatchers("/payment").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
                .anyRequest().authenticated()
                .and()

                .formLogin()
                .loginPage("/")
                .defaultSuccessUrl("/open", true) // page with form login
                .loginProcessingUrl("/j_spring_security_check")
                .failureUrl("/login?error=true")// URL if incorrect password
                .usernameParameter("login") // name of inputs if login form
                .passwordParameter("password")
                .permitAll()// access to all
                .and()

                .logout()
                .permitAll()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login?logout")
                .invalidateHttpSession(true);
    }
}