package com.deliver.Ecom.Repository;

import com.deliver.Ecom.Entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class CustomerRepository {
    private HashMap<Integer, Customer> customerMap =  new HashMap<>();

    //Add a customer
    public Customer addCustomer(Customer customer){
        customerMap.put(customer.getId(), customer);
        return customer;
    }

    public Customer deleteCustomer(Customer customer){
        customerMap.remove(customer.getId());
        return customer;
    }

    public Customer getCustomer(int id){
        return customerMap.get(id);
    }
}
