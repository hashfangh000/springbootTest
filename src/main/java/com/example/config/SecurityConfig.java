package com.example.config;



import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //首页所有人可以访问 功能页只有对应有权限的人才可以访问
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/emp/**").hasRole("vip1");
        http.formLogin();
    }

    //
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin")
                .password(new BCryptPasswordEncoder().encode("123456")).roles("vip1","vip2","vip3");
    }
}
