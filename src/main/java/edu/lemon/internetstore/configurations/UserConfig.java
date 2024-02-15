package edu.lemon.internetstore.configurations;

import edu.lemon.internetstore.model.User;
import edu.lemon.internetstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class UserConfig {
  @Autowired
  private UserService userDetailsService;

  @Bean
  public DaoAuthenticationProvider authProvider() {
    DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
    authProvider.setUserDetailsService(userDetailsService);
    authProvider.setPasswordEncoder(encoder());
    return authProvider;
  }

  @Bean
  User customUserDetailsService() {
    return User.builder().build();
  }

  @Bean
  public BCryptPasswordEncoder encoder(){
    return new BCryptPasswordEncoder();
  }
}
