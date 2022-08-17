package com.jiajunzhang.invoicecreateor.model.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    // usually the id could be the uid(tax id) but for new companies that still have not gotten it
    // it is not possible to get one
    @Id
    private Long id;
    private String name; //companyname
    private String email; // for future email sending
    private String uid;
//    @OneToMany
//    private Set<Address> addresses;

}
