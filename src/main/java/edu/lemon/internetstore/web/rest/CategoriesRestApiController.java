package edu.lemon.internetstore.web.rest;

import edu.lemon.internetstore.service.CategoriesService;
import edu.lemon.internetstore.web.dto.CategoryDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoriesRestApiController {
    private final CategoriesService categoriesService;

    public CategoriesRestApiController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @GetMapping
    public ResponseEntity<List<CategoryDto>> getCategories(){
        return ResponseEntity.ok(categoriesService.getCategories());
    }
}
