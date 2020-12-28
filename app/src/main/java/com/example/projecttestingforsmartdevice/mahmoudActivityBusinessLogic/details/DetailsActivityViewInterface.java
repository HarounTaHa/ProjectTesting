package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.details;


import com.example.projecttestingforsmartdevice.models.Product;

public interface DetailsActivityViewInterface {
    void updateFavorite(Product product);
    void updateCart(Product product);
    void updateText(String text);
}
