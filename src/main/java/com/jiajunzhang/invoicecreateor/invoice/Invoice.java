package com.jiajunzhang.invoicecreateor.invoice;

import com.jiajunzhang.invoicecreateor.invoice.customer.Customer;
import com.jiajunzhang.invoicecreateor.invoice.cart.Cart;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

public class Invoice {
    private Long id; // serves as invoiceid
    private LocalDate date;
    private LocalDate payDate;
    private Customer customer;
    private Set<Cart> cart;
    private BigDecimal sum;

}
