package edu.lemon.internetstore.service;

import edu.lemon.internetstore.dao.ProductsRepository;
import edu.lemon.internetstore.mapper.ProductsMapper;
import edu.lemon.internetstore.web.dto.ProductsDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    private final ProductsRepository productsRepository;
    private final ProductsMapper productsMapper;

    public ProductsService(ProductsRepository productsRepository, ProductsMapper productsMapper) {
        this.productsRepository = productsRepository;
        this.productsMapper = productsMapper;
    }

    public List<ProductsDto> getProducts() {
        return productsRepository.findAll().stream()
                .map(productsMapper::toDto)
                .toList();

    }
}
