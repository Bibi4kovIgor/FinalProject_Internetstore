package edu.lemon.internetstore.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
@IdClass(OrdersPkEntity.class)
public class OrdersEntity {
  @Id
  @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name = "client_id")
  @NonNull
  private ClientsEntity clients;

  @Id
  @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name = "product_id", referencedColumnName = "id")
  @NonNull
  private ProductsEntity products;

  @Id
  @NonNull
  @Column(name = "order_date")
  private Instant orderDate;

  private int quantity;
}
