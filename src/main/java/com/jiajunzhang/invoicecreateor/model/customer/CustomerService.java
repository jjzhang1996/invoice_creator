package com.jiajunzhang.invoicecreateor.model.customer;

import com.jiajunzhang.invoicecreateor.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {
    private CustomerRepository customerRepository;

    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
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
