package io.shopcart.shop.domain;

public class Product {
    private int id;
    private static int idInc = 0;
    private String name;
    private String description;
    public Price price;

    public Product(String name, String description, Price price) {
        this.name = name;
        this.description = description;
        this.price = price;
        id = idInc++;
    }

    public Product() {}



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
