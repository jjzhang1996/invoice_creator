package com.jiajunzhang.invoicecreateor.invoice;

import com.jiajunzhang.invoicecreateor.invoice.customer.Customer;
import com.jiajunzhang.invoicecreateor.invoice.cart.Cart;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class Invoice {
    @Id
    private Long id; // serves as invoiceid
    private LocalDate date;
    private LocalDate payDate;
    @OneToOne
    private Customer customer;
    @OneToMany
    private Set<Cart> cart;
    private BigDecimal sum;

}
