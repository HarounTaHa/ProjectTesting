package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.details;

import com.example.projecttestingforsmartdevice.models.Product;

public class DetailsActivityPresenter implements DetailsActivityPresenterInterface{

    private DetailsActivityViewInterface viewInterface;

    public DetailsActivityPresenter(DetailsActivityViewInterface viewInterface){
        this.viewInterface=viewInterface;
    }

    @Override
    public void setFavorite(Product product) {

    }

    @Override
    public void setCart(Product product) {

    }

    @Override
    public void setText(String count, int maxlength, String result) {

    }
}
