package io.shopcart.shop.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> items = new ArrayList<>();
    private long cartTotal;
    private long cartDiscount;
    private long checkoutPrice;

    public Cart(List<Product> items, long cartTotal, long cartDiscount, long checkoutPrice) {
        this.items = items;
        this.cartTotal = cartTotal;
        this.cartDiscount = cartDiscount;
        this.checkoutPrice = checkoutPrice;
    }
}
