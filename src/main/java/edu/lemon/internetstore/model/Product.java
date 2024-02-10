package edu.lemon.internetstore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.BatchSize;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "products", schema = "public")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "vendor_code")
    private String vendorCode;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "availability")
    private boolean availability;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "description")
    private String description;

    @ManyToMany(cascade = CascadeType.ALL,
                fetch = FetchType.EAGER,
                mappedBy = "products")
    @BatchSize(size = 20)
    List<Category> categories;
}
