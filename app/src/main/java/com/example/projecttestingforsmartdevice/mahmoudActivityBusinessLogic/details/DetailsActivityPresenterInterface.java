package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.details;


import com.example.projecttestingforsmartdevice.models.Product;

public interface DetailsActivityPresenterInterface {

    void setFavorite(Product product);
    void setCart(Product product);
    void setText(String count, int maxlength, String result);
}
