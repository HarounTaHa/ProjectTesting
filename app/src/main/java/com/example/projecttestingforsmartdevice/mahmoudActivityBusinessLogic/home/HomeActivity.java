package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.projecttestingforsmartdevice.R;
import com.example.projecttestingforsmartdevice.models.Product;

import java.util.List;

public class HomeActivity extends AppCompatActivity implements HomeActivityViewInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        //Test1
    }

    @Override
    public void updateListitembyCategory(List<Product> productsbyCategory) {

    }

    @Override
    public void updateListitemFeaturedWithLimit(List<Product> productsbyCategory) {

    }

    @Override
    public void updateListitemBestSellWithLimit(List<Product> productsbyCategory) {

    }
}
