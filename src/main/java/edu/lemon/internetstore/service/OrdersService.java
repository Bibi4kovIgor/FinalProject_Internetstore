package edu.lemon.internetstore.service;

import edu.lemon.internetstore.dao.OrdersRepository;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {

  private final OrdersRepository ordersRepository;

  public OrdersService(OrdersRepository ordersRepository) {
    this.ordersRepository = ordersRepository;
  }

//  private final OrdersRepository ordersRepository;
//  public List<OrdersDto> getOrdersInfo() {
//    return ordersRepository.findAll().stream()
//        .map()
//        .toList();
//  }
}
