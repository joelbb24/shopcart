package io.shopcart.shop.domain;

public class Price {
    private int productId;
    private int price;
    private int discountPercentage;

    Product product = new Product();

    public Price (int productId, int price, int discountPercentage) {
        this.productId = product.getId();
        this.price = price;
        this.discountPercentage = discountPercentage;
    }

    public Price() {};

//    public int getPriceId() {
//        return priceId;
//    }
//
//    public void setPriceId(int priceId) {
//        this.priceId = priceId;
//    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
