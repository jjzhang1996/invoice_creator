package com.jiajunzhang.invoicecreateor.model.customer.address;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    private Long id;
    private String line1;
    private String line2;
    private String city;
    private String districtCode; // as string just in case
    private String country;


}
