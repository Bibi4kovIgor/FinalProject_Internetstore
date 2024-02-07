package edu.lemon.internetstore.dao;

import edu.lemon.internetstore.model.Orders;
import edu.lemon.internetstore.model.OrdersPk;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, OrdersPk> {
  @Nonnull List<Orders> findAll();

//  @Nonnull
//  Set<Orders> findByClientId(UUID clientId);
}
