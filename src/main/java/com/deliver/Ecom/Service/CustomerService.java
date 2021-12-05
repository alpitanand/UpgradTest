package com.deliver.Ecom.Service;

import com.deliver.Ecom.Entity.Customer;
import com.deliver.Ecom.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer){
        return customerRepository.addCustomer(customer);
    }

    public Customer deleteCustomer(Customer customer){
        return customerRepository.deleteCustomer(customer);
    }

    public Customer getCustomer(int id){
        return customerRepository.getCustomer(id);
    }

}
