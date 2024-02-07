package edu.lemon.internetstore.service;

import edu.lemon.internetstore.dao.CategoriesRepository;
import edu.lemon.internetstore.mapper.CategoriesMapper;
import edu.lemon.internetstore.web.dto.CategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesService {
  @Autowired
  private CategoriesRepository categoriesRepository;
  @Autowired
  private CategoriesMapper categoriesMapper;

  public List<CategoryDto> getCategories() {
    return categoriesRepository.findAll().stream()
        .map(categoriesMapper::toDto)
        .toList();
  }

}
