package com.jiajunzhang.invoicecreateor.invoice.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
    private CustomerRepository customerRepository;

    public Customer findByName(String name){
        return customerRepository.findByName(name).orElseThrow(() -> new IllegalArgumentException("User not found"));
    }
    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    public String updateCustomer(Customer customer){
        return "";
    }
}
