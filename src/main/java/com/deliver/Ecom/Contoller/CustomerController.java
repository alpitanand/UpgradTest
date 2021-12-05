package com.deliver.Ecom.Contoller;

import com.deliver.Ecom.Entity.Customer;
import com.deliver.Ecom.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/addCustomer")
    public ResponseEntity addCustomer(@RequestBody Customer customer){
        Customer customer1 = customerService.addCustomer(customer);
        return new ResponseEntity(customer1, HttpStatus.OK);
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity getCustomer(@PathVariable("id") int id){
        Customer customer = customerService.getCustomer(id);
        return new ResponseEntity(customer, HttpStatus.OK);
    }


}
