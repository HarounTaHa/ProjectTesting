package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.details;

import com.example.projecttestingforsmartdevice.models.Product;

public class DetailsActivityPresenter implements DetailsActivityPresenterInterface{

    private DetailsActivityViewInterface viewInterface;

    public DetailsActivityPresenter(DetailsActivityViewInterface viewInterface){
        this.viewInterface=viewInterface;
    }

    @Override
    public void setFavorite(Product product) {
        if (product != null){
            viewInterface.updateFavorite(product);
        }
    }

    @Override
    public void setCart(Product product) {
        if (product != null){
            viewInterface.updateCart(product);
        }
    }

    @Override
    public void setText(String count, int max,String result) {
        if (!count.equals(result)){
            if (Integer.valueOf(count) >= max){
                viewInterface.updateText(result);
            }
        }
    }
}
