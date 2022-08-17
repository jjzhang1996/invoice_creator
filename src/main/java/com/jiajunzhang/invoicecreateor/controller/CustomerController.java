package com.jiajunzhang.invoicecreateor.controller;

import com.jiajunzhang.invoicecreateor.model.customer.Customer;
import com.jiajunzhang.invoicecreateor.model.customer.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private CustomerService customerService;
    @GetMapping("/all")
    public List<Customer> getAllCustomers(){
        return customerService.findAll();
    }
    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }

//    @PutMapping
//    public Customer
}
