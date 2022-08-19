package com.jiajunzhang.invoicecreateor.model.item;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Table(name = "article")
@Entity(name = "article")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item implements Serializable {
    @Id
    private Long id;
    private String name;
    private BigDecimal netto;
    private BigDecimal brutto; // calc brutto from netto and taxPercentage
    private BigDecimal tax;
    private double taxPercentage;

}
