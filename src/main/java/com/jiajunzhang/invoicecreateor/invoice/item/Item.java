package com.jiajunzhang.invoicecreateor.invoice.item;

import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Embeddable
@NoArgsConstructor
public class Item implements Serializable {
    @Id
    private Long id;
    private String name;
    private BigDecimal netto;
    private BigDecimal brutto; // calc brutto from netto and taxPercentage
    private BigDecimal tax;
    private double taxPercentage;

    public Item(String name, BigDecimal netto, BigDecimal brutto, double taxPercentage) {
        this.name = name;
        this.netto = netto;
        this.brutto = brutto;
        this.taxPercentage = taxPercentage;
    }
    // future updates maybe include instock ?

}
