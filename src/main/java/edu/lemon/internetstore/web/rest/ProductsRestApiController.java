package edu.lemon.internetstore.web.rest;

import edu.lemon.internetstore.service.ProductsService;
import edu.lemon.internetstore.web.dto.ProductDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsRestApiController {
  private final ProductsService productsService;

  public ProductsRestApiController(ProductsService productsService) {
    this.productsService = productsService;
  }

  @GetMapping
  public ResponseEntity<List<ProductDto>> getProducts() {
    return ResponseEntity.ok(productsService.getProducts());
  }

  @GetMapping("/{from}/{quantity}")
  public ResponseEntity<List<ProductDto>> getProducts(
      @PathVariable(value = "from", required = false) int from,
      @PathVariable(value = "quantity", required = false) int quantity) {
    return ResponseEntity.ok(productsService.getProductsPageable(from, quantity));
  }

  @PostMapping("/add-product")
  public ResponseEntity<ProductDto> createProduct(@RequestBody @Valid ProductDto productDto) {
    return ResponseEntity.status(HttpStatus.CREATED)
        .body(productsService.createProduct(productDto));
  }
}
