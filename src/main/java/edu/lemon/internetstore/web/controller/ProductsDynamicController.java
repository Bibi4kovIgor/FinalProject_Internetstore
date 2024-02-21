package edu.lemon.internetstore.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products-dynamic")
public class ProductsDynamicController {
  @GetMapping
  public String getAllProductsDynamically() {
    return "/pages/dynamic/products.html";
  }
}
