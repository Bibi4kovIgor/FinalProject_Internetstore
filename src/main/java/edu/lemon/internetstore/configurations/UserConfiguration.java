package edu.lemon.internetstore.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class UserConfiguration {

  @Bean
  public SecurityFilterChain userSecurityFilterChain(HttpSecurity httpSecurity) throws Exception {
    return
        httpSecurity.csrf(withDefaults())
        .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())
            .build();
  }
}
