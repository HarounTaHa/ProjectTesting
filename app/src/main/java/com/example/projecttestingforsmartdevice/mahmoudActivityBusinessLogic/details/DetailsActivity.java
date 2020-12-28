package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.details;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.projecttestingforsmartdevice.R;
import com.example.projecttestingforsmartdevice.models.Product;

public class DetailsActivity extends AppCompatActivity implements DetailsActivityViewInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
    }

    @Override
    public void updateFavorite(Product product) {

    }

    @Override
    public void updateCart(Product product) {

    }

    @Override
    public void updateText(String text) {

    }
}