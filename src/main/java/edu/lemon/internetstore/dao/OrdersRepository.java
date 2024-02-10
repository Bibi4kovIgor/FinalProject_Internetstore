package edu.lemon.internetstore.dao;

import edu.lemon.internetstore.model.Order;
import edu.lemon.internetstore.model.OrdersPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Order, OrdersPk> {

}
