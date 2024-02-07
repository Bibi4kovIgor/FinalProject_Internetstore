package edu.lemon.internetstore.mapper;

import edu.lemon.internetstore.model.Orders;
import edu.lemon.internetstore.web.dto.OrdersDto;
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
  OrdersDto toDto(Orders orders);

//  private final ClientsMapper clientsMapper;
//  private final ProductsMapper productsMapper;
//
//  public OrdersMapper(ClientsMapper clientsMapper, ProductsMapper productsMapper) {
//    this.clientsMapper = clientsMapper;
//    this.productsMapper = productsMapper;
//  }

//  public OrdersDto toDto(Orders orders) {
//    return OrdersDto.builder()
//        .clientsDto(clientsMapper.toDto(orders.getClient()))
//        .orderDate(orders.getOrderDate())
//        .quantity(orders.getQuantity())
//        .productDto(productsMapper.toDto(orders.getProduct()))
//        .build();
//  }
}
