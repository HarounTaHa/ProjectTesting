package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridLayout;

import com.example.projecttestingforsmartdevice.R;
import com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.favoritesActivity.FavoritesActivityViewInterface;
import com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.favoritesActivity.adapter.RecyclerFavoritesAdapter;
import com.example.projecttestingforsmartdevice.models.Product;

import java.util.ArrayList;
import java.util.List;

public class FavoritesActivity extends AppCompatActivity implements FavoritesActivityViewInterface {
   private RecyclerView recyclerView;
   RecyclerFavoritesAdapter recyclerFavoritesAdapter;
   private List<Product> products;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.haroun_activity_favorites);
        products=new ArrayList<>();
        recyclerView= findViewById(R.id.recyclerGridLayout);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerFavoritesAdapter=new RecyclerFavoritesAdapter(products);
        recyclerView.setAdapter(recyclerFavoritesAdapter);

    }


    @Override
    public List<Product> updateCountListOfProducts(List<Product> p) {
        return null;
    }
}
