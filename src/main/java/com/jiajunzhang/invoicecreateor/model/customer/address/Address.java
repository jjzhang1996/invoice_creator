package com.jiajunzhang.invoicecreateor.model.customer.address;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "customer_address")
@Table(name = "customer_address")
@Data
public class Address {
    @Id
    private Long id;
    private String line1;
    private String line2;
    private String city;
    private String districtCode; // as string just in case
    private String country;


}
