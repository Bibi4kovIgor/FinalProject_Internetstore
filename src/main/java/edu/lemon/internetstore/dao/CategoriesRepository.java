package edu.lemon.internetstore.dao;

import edu.lemon.internetstore.model.Category;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface CategoriesRepository extends JpaRepository<Category, UUID> {
    @Nonnull
    Set<Category> findByProductsId(UUID productId);
}
