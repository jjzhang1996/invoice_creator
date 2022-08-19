package com.jiajunzhang.invoicecreateor.model.customer;

import com.jiajunzhang.invoicecreateor.model.customer.address.Address;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity(name = "customer")
@Table(name = "customer")
@Data
public class Customer {
    // usually the id could be the uid(tax id) but for new companies that still have not gotten it
    // it is not possible to get one
    @Id
    private Long id;
    private String name; //companyname
    private String email; // for future email sending
    private String uid;
    @OneToMany
    private Set<Address> addresses;

}
