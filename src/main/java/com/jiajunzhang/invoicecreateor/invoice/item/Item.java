package com.jiajunzhang.invoicecreateor.invoice.item;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table
@NoArgsConstructor
public class Item {
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
