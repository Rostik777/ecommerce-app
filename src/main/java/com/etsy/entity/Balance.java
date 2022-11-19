package com.etsy.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class Balance extends BaseEntity{
    private BigDecimal amount;
    @OneToOne
    private Customer customer;
}
