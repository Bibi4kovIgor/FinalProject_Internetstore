package edu.lemon.internetstore.dao;

import edu.lemon.internetstore.model.OrdersEntity;
import edu.lemon.internetstore.model.OrdersPkEntity;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<OrdersEntity, OrdersPkEntity> {
  @Nonnull List<OrdersEntity> findAll();
}
