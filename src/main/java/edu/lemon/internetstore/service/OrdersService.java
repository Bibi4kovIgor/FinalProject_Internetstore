package edu.lemon.internetstore.service;

import edu.lemon.internetstore.dao.OrdersRepository;
import edu.lemon.internetstore.mapper.OrdersMapper;
import edu.lemon.internetstore.web.dto.OrderDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

  private final OrdersRepository ordersRepository;
  private final OrdersMapper ordersMapper;

  public OrdersService(OrdersRepository ordersRepository, OrdersMapper ordersMapper) {
    this.ordersRepository = ordersRepository;
    this.ordersMapper = ordersMapper;
  }

  public List<OrderDto> getOrdersInfo() {
    return ordersRepository.findAll().stream()
        .map(ordersMapper::toDto)
        .toList();
  }
}
