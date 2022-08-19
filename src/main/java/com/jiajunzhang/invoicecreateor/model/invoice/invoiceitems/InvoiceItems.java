package com.jiajunzhang.invoicecreateor.model.invoice.invoiceitems;


import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "invoice_item")
@Table(name = "invoice_item")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceItems {
    private int quantity;
    @EmbeddedId
    private InvoiceItemsId invoiceItemsId;
    private BigDecimal total;
}
