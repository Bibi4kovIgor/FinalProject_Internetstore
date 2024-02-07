package edu.lemon.internetstore.mapper;

import edu.lemon.internetstore.model.Order;
import edu.lemon.internetstore.web.dto.OrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
/**
 *
 * In this file I added comment which contains an analogue of mapper code, based on builder patterns approach.
 * The actual code in this and other files shows possibilities of using MapStruct library for these purposes
 * */
@Mapper(componentModel = "spring")
//@Component
public interface OrdersMapper {
  @Mapping(target = "clientDto", source = "client")
  @Mapping(target = "productDto", source = "product")
  OrderDto toDto(Order order);

  @Mapping(target = "client", source = "clientDto")
  @Mapping(target = "product", source = "productDto")
  Order fromDto(OrderDto orderDto);

//  private final ClientsMapper clientsMapper;
//  private final ProductsMapper productsMapper;
//
//  public OrdersMapper(ClientsMapper clientsMapper, ProductsMapper productsMapper) {
//    this.clientsMapper = clientsMapper;
//    this.productsMapper = productsMapper;
//  }

//  public OrderDto toDto(Order orders) {
//    return OrderDto.builder()
//        .clientsDto(clientsMapper.toDto(orders.getClient()))
//        .orderDate(orders.getOrderDate())
//        .quantity(orders.getQuantity())
//        .productDto(productsMapper.toDto(orders.getProduct()))
//        .build();
//  }
}
