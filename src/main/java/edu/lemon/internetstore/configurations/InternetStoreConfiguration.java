package edu.lemon.internetstore.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.expression.WebExpressionAuthorizationManager;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;

@Configuration
@EnableWebSecurity
public class InternetStoreConfiguration {

  @Bean
  public SecurityFilterChain userSecurityFilterChain(HttpSecurity httpSecurity) throws Exception {
    return
        httpSecurity
            .csrf(
                csrf -> csrf.csrfTokenRepository(new HttpSessionCsrfTokenRepository())
            )
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/admin-products/**")
                .access(new WebExpressionAuthorizationManager("hasRole('ADMIN')"))
                .anyRequest().authenticated()
            )
            .formLogin(Customizer.withDefaults())
            .build();
  }
}
