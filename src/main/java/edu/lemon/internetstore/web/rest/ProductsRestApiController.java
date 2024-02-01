package edu.lemon.internetstore.web.rest;

import edu.lemon.internetstore.service.ProductsService;
import edu.lemon.internetstore.web.dto.ProductsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsRestApiController {
    private final ProductsService productsService;

    public ProductsRestApiController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping
    public ResponseEntity<List<ProductsDto>> getProducts() {
        return ResponseEntity.ok(productsService.getProducts());
    }

}
