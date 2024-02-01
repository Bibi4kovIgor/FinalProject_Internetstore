package edu.lemon.internetstore.service;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class GreetingService {
    public String generateGreeting(String name) {
        return Objects.isNull(name) ? "World" : name;
    }

}
