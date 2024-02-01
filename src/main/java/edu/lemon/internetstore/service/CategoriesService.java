package edu.lemon.internetstore.service;

import edu.lemon.internetstore.dao.CategoriesRepository;
import edu.lemon.internetstore.mapper.CategoriesMapper;
import edu.lemon.internetstore.web.dto.CategoriesDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesService {
    private final CategoriesRepository categoriesRepository;
    private final CategoriesMapper categoriesMapper;
    public CategoriesService(CategoriesRepository categoriesRepository, CategoriesMapper categoriesMapper) {
        this.categoriesRepository = categoriesRepository;
        this.categoriesMapper = categoriesMapper;
    }


    public List<CategoriesDto> getCategories(){
        return categoriesRepository.findAll().stream()
                .map(categoriesMapper::toDto)
                .toList();
    }

}
