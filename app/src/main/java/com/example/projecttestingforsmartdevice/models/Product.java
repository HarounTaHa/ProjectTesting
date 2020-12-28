package com.example.projecttestingforsmartdevice.models;

import java.io.Serializable;

public class Product implements Serializable {
    String productName;
    String productCategory;
    String productImageUrl;
    String productDescription;
    int productPrice;

    public Product() {

    }

    public Product(String productName, String productCategory, String productImageUrl, String productDescription, int productPrice) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productImageUrl = productImageUrl;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
}
