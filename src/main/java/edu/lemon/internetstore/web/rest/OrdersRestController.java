package edu.lemon.internetstore.web.rest;

import edu.lemon.internetstore.service.OrdersService;
import edu.lemon.internetstore.web.dto.OrdersDto;
import edu.lemon.internetstore.web.dto.ProductsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrdersRestController {

  private final OrdersService ordersService;


  public OrdersRestController(OrdersService ordersService) {
    this.ordersService = ordersService;
  }

  @GetMapping
  public ResponseEntity<List<OrdersDto>> getOrders() {
    return ResponseEntity.ok(ordersService.getOrdersInfo());
  }

}
