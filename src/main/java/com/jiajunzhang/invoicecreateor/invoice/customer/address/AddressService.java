package com.jiajunzhang.invoicecreateor.invoice.customer.address;

import com.jiajunzhang.invoicecreateor.invoice.customer.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddressService {
    private final AddressRepository addressRepository;
    // CRUD functionality should all be here
    public Address findAddress(Customer customer){
        return null;
    };

}
