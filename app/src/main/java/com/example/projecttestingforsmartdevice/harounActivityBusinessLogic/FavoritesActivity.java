package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.GridLayout;

import com.example.projecttestingforsmartdevice.R;
import com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.favoritesActivity.FavoritesActivityPresenter;
import com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.favoritesActivity.FavoritesActivityViewInterface;
import com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.favoritesActivity.adapter.RecyclerFavoritesAdapter;
import com.example.projecttestingforsmartdevice.models.Product;

import java.util.ArrayList;
import java.util.List;

public class FavoritesActivity extends AppCompatActivity implements FavoritesActivityViewInterface {
   private RecyclerView recyclerView;
   RecyclerFavoritesAdapter recyclerFavoritesAdapter;
  private FavoritesActivityPresenter favoritesActivityPresenter;
  // should be to static
   private List<Product> listOfProducts;
   int  sizeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.haroun_activity_favorites);
        favoritesActivityPresenter=new FavoritesActivityPresenter(this);
        listOfProducts=addProducts(listOfProducts);
        recyclerView= findViewById(R.id.recyclerGridLayout);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        sizeList=favoritesActivityPresenter.getCountListOfProducts(listOfProducts);
        Log.e("eeeeeeeee",""+sizeList);

    }

//    if listOfProducts > 0 this test case is true
    @Override
    public void updateCountListOfProducts(int count) {
        recyclerFavoritesAdapter=new RecyclerFavoritesAdapter(listOfProducts);
        recyclerView.setAdapter(recyclerFavoritesAdapter);
    }

//    this method just to test create products
    protected List<Product> addProducts(List<Product> listOfProducts){
          listOfProducts=new ArrayList<>();
        listOfProducts.add(new Product("Jacket", "Man", "https://image.freepik.com/free-photo/front-view-sick-man-coughing-while-wearing-medical-mask_23-2148445122.jpg", "Product Description", 250));
        listOfProducts.add(new Product("Jacket", "Man", "https://image.freepik.com/free-photo/front-view-sick-man-coughing-while-wearing-medical-mask_23-2148445122.jpg", "Product Description", 250));
        listOfProducts.add(new Product("Jacket", "Man", "https://image.freepik.com/free-photo/front-view-sick-man-coughing-while-wearing-medical-mask_23-2148445122.jpg", "Product Description", 250));
        listOfProducts.add(new Product("Jacket", "Man", "https://image.freepik.com/free-photo/front-view-sick-man-coughing-while-wearing-medical-mask_23-2148445122.jpg", "Product Description", 250));

        return listOfProducts;
    }
}
