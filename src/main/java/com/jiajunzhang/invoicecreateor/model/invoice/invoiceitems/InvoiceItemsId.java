package com.jiajunzhang.invoicecreateor.model.invoice.invoiceitems;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class InvoiceItemsId implements Serializable {
    private long invoiceId;
    private long itemId;
}
