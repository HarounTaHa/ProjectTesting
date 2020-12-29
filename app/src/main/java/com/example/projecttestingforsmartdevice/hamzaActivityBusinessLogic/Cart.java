package com.example.projecttestingforsmartdevice.hamzaActivityBusinessLogic;

class Cart {
    private int cart_imageView;
    private String cart_text1;
    private String cart_text2;
    private String cart_text3;
    private int cart_plus;
    private int cart_minus;
    private int cart_delete;

    public Cart(){
    }

    public Cart(int cart_imageView, String cart_text1, String cart_text2, String cart_text3, int cart_plus, int cart_minus, int cart_delete) {
        this.cart_imageView = cart_imageView;
        this.cart_text1 = cart_text1;
        this.cart_text2 = cart_text2;
        this.cart_text3 = cart_text3;
        this.cart_plus = cart_plus;
        this.cart_minus = cart_minus;
        this.cart_delete = cart_delete;
    }

    public int getCart_imageView() {
        return cart_imageView;
    }

    public void setCart_imageView(int cart_imageView) {
        this.cart_imageView = cart_imageView;
    }

    public String getCart_text1() {
        return cart_text1;
    }

    public void setCart_text1(String cart_text1) {
        this.cart_text1 = cart_text1;
    }

    public String getCart_text2() {
        return cart_text2;
    }

    public void setCart_text2(String cart_text2) {
        this.cart_text2 = cart_text2;
    }

    public String getCart_text3() {
        return cart_text3;
    }

    public void setCart_text3(String cart_text3) {
        this.cart_text3 = cart_text3;
    }

    public int getCart_plus() {
        return cart_plus;
    }

    public void setCart_plus(int cart_plus) {
        this.cart_plus = cart_plus;
    }

    public int getCart_minus() {
        return cart_minus;
    }

    public void setCart_minus(int cart_minus) {
        this.cart_minus = cart_minus;
    }

    public int getCart_delete() {
        return cart_delete;
    }

    public void setCart_delete(int cart_delete) {
        this.cart_delete = cart_delete;
    }
}
