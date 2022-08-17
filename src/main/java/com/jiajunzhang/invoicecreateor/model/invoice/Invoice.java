package com.jiajunzhang.invoicecreateor.model.invoice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Invoice {
    @Id
    private Long id; // serves as invoiceid
    private LocalDate date;
    private LocalDate payDate;
//    @OneToOne
//    private Customer customer;
//    @OneToMany
//    private Set<InvoiceItems> invoiceItems;
    private BigDecimal sum;

}
