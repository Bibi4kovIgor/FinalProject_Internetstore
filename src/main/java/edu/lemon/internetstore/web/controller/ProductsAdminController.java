package edu.lemon.internetstore.web.controller;

import edu.lemon.internetstore.service.ProductsService;
import edu.lemon.internetstore.web.dto.ProductDto;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/admin-products")
public class ProductsAdminController {

  private final ProductsService productsService;

  public ProductsAdminController(ProductsService productsService) {
    this.productsService = productsService;
  }

  @GetMapping
  public ModelAndView getAllProducts() {
    return new ModelAndView(
        "/pages/admin/product-edit",
        new ModelMap()
            .addAttribute("products", productsService.getProducts())
            .addAttribute("productType", ProductDto.getEmptyProductObject())
    );
  }

  @PostMapping(path = "/add-product", consumes = "application/x-www-form-urlencoded")
  public RedirectView createProduct(ProductDto productDto) {
    productsService.createProduct(productDto);
    return new RedirectView("/admin-products");
  }
}
