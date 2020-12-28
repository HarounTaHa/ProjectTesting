package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.home;

import com.example.projecttestingforsmartdevice.models.Product;

import java.util.List;

public class HomeActivityPresenter implements HomeActivityPresenterInterface {
    private HomeActivityViewInterface viewInterface;

    public HomeActivityPresenter(HomeActivityViewInterface viewInterface){
        this.viewInterface=viewInterface;
    }

    @Override
    public void setListitembyCategory(String category, List<Product> products) {

    }

    @Override
    public void setListitemitemFeaturedWithLimit(String category, List<Product> products, int limimt) {


    }

    @Override
    public void setListitemitemBestSellWithLimit(String category, List<Product> products, int limimt) {

    }
}
