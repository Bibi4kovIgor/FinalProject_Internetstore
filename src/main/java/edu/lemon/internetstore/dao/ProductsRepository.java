package edu.lemon.internetstore.dao;

import edu.lemon.internetstore.model.Products;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface ProductsRepository extends JpaRepository<Products, UUID> {
  @Nonnull
  List<Products> findAll();

  @Nonnull
  Set<Products> findByCategoriesId(UUID categoryId);
}
