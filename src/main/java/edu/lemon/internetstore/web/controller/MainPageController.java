package edu.lemon.internetstore.web.controller;

import edu.lemon.internetstore.service.ProductsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainPageController {
  private final ProductsService productsService;

  public MainPageController(ProductsService productsService) {
    this.productsService = productsService;
  }

  @GetMapping
  public ModelAndView getAllProducts() {
    return new ModelAndView(
        "/pages/products",
        new ModelMap()
            .addAttribute("products", productsService.getProducts())
    );
  }
}
