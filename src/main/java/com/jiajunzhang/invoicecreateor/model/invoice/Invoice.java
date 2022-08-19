package com.jiajunzhang.invoicecreateor.model.invoice;

import com.jiajunzhang.invoicecreateor.model.customer.Customer;
import com.jiajunzhang.invoicecreateor.model.invoice.invoiceitems.InvoiceItems;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
    @Id
    private Long id; // serves as invoiceid
    private LocalDate date;
    private LocalDate payDate;
    @OneToOne
    private Customer customer;
    @OneToMany
    private Set<InvoiceItems> invoiceItems;
    private BigDecimal sum;

}
