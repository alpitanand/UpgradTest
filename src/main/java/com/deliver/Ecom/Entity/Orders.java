package com.deliver.Ecom.Entity;

import lombok.Data;

@Data
public class Orders {
    private int orderId;
    private int price;
    private Product product;
}
