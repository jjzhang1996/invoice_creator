package com.jiajunzhang.invoicecreateor.invoice.cart;

import com.jiajunzhang.invoicecreateor.invoice.Invoice;
import com.jiajunzhang.invoicecreateor.invoice.item.Item;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Cart {
    private int quantity;
    @EmbeddedId
    private Item item;
    @ManyToMany
    private Set<Invoice> invoice;
}
