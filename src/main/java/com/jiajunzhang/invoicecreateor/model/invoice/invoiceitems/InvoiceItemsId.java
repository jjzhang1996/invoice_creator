package com.jiajunzhang.invoicecreateor.model.invoice.invoiceitems;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class InvoiceItemsId implements Serializable {
    private long invoiceId;
    private long itemId;
}
