package edu.lemon.internetstore.dao;

import edu.lemon.internetstore.model.CategoriesEntity;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CategoriesRepository extends JpaRepository<CategoriesEntity, UUID> {
    @Nonnull
    List<CategoriesEntity> findAll();
}
