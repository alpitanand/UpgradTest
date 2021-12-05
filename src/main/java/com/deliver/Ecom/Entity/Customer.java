package com.deliver.Ecom.Entity;

import lombok.Data;

import java.util.List;

@Data
public class Customer {
    private String address;
    private String email;
    private int id;
    private String name;
    private List<Orders> ordersList;

}
