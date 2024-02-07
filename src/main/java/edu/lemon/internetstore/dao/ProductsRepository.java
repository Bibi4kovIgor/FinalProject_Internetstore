package edu.lemon.internetstore.dao;

import edu.lemon.internetstore.model.Product;
import jakarta.annotation.Nonnull;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface ProductsRepository extends JpaRepository<Product, UUID> {

  @Nonnull
  Set<Product> findByCategoriesId(UUID categoryId);
}
