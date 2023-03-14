package com.outboxpayment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "payments")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {

    @Id
    @GeneratedValue
    private Integer id;
    private Integer orderId;
    private BigDecimal amount;
    private String source;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
