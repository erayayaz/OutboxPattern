package com.outboxorder.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.Hibernate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity(name = "orders")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    @Id
    @GeneratedValue
    private Integer id;
    private Integer customerId;
    private String productId;
    private BigDecimal price;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Order order = (Order) o;
        return id != null && Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
