package edu.lemon.internetstore.dao;

import edu.lemon.internetstore.model.Order;
import edu.lemon.internetstore.model.OrdersPk;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Order, OrdersPk> {

}
