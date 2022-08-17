package com.jiajunzhang.invoicecreateor.model.invoice.invoiceitems;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "invoice_items")
public class InvoiceItems {
    @Id
    private int quantity;
//    @EmbeddedId
//    private InvoiceItemsId invoiceItemsId;
    private BigDecimal total;
}
