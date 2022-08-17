package com.jiajunzhang.invoicecreateor.model.customer.address;

import com.jiajunzhang.invoicecreateor.model.customer.Customer;
import com.jiajunzhang.invoicecreateor.repository.AddressRepository;
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
