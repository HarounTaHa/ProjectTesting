package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.favoritesActivity;

import com.example.projecttestingforsmartdevice.models.Product;

import java.util.List;

public class FavoritesActivityPresenter implements FavoritesActivityPresenterInterface {




    private FavoritesActivityViewInterface viewInterFace;


    public FavoritesActivityPresenter(FavoritesActivityViewInterface viewInterFace) {
        this.viewInterFace = viewInterFace;
    }



    @Override
    public int getCountListOfProducts(List<Product> p) {
        return 0;
    }
}
