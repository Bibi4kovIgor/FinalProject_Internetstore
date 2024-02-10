package edu.lemon.internetstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class GreetingService {

  /**
   * It is also available to process configuration parameters
   * within parameters injecting,
   * but you SHOULD use it only in one way: constructor or parameters injecting
   * */
//  @Autowired
//  @Value("${paypal.login}")
  private final String userName;
//
//  @Autowired
//  @Value("${paypal.url}")
  private final String url;



  public GreetingService(
      @Value("${paypal.url}") String url,
      @Value("${paypal.login}") String userName) {
    this.userName = userName;
    this.url = url;
  }

  public String getUrlWithParameter() {
    return url + userName;
  }

  public String generateGreeting(String name) {
    return Objects.isNull(name) ? "World" : name;
  }


}
