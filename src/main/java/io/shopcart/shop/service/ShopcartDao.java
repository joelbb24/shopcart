package io.shopcart.shop.service;

import io.shopcart.shop.domain.Price;
import io.shopcart.shop.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ShopcartDao {
    List<Product> productList = new ArrayList<>();
    Price p = new Price();

    public void addProduct(String name, int price) {

        productList.add(new Product(name, "", new Price(p.setPrice(price))));

    }
}
