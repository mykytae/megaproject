package com.megaproject.config;


import com.megaproject.service.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 * Created by nik on 25.10.2016.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
     private UserDetailsServiceImpl userDetailsService;


    @Autowired
    public void registerGlobalAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth
                //.inMemoryAuthentication()
                //.withUser("root")
                //.password("root")
                //.roles("ADMIN");
                .userDetailsService(userDetailsService);

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // включаем защиту от CSRF атак
        //
        http
                .csrf()
                    .disable()
                // указываем правила запросов
                // по которым будет определятся доступ к ресурсам и остальным данным
                .authorizeRequests()
                    .antMatchers("/megaproject","/login","/signup","/register").permitAll()
                    .antMatchers("/admin").hasRole("ADMIN")
                    .antMatchers("/home").hasRole("USER")
                    .antMatchers("/open").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
                    .anyRequest().authenticated()
                    .and()
                .formLogin()
                    .loginPage("/")
                // указываем страницу с формой логина
                    .defaultSuccessUrl("/open", true)
                    .loginProcessingUrl("/j_spring_security_check")
                // указываем URL при неудачном логине
                    .failureUrl("/login?error=true")
                // Указываем параметры логина и пароля с формы логина
                    .usernameParameter("login")
                    .passwordParameter("password")
                // даем доступ к форме логина всем
                    .permitAll()
                    .and()
                .logout()
                    .permitAll()
                    .logoutUrl("/logout")
                    .logoutSuccessUrl("/login?logout")
                    .invalidateHttpSession(true);


    }
}