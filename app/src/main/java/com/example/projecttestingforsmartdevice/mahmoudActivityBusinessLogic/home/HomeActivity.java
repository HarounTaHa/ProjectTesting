package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.projecttestingforsmartdevice.R;
import com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.adapters.HomeRecyclerViewAdapter;
import com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.search.SearchActivity;
import com.example.projecttestingforsmartdevice.models.Address;
import com.example.projecttestingforsmartdevice.models.Product;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements HomeActivityViewInterface {


    public static List<Product> items=new ArrayList<>();
    public static List<Product> FavoriteProduct=new ArrayList<>();
    public static List<Product> CartProduct=new ArrayList<>();
    public static List<Address> AddressUser=new ArrayList<>();


    HomeActivityPresenter mainActivityPresenter;
    List<Product> itemsFeatured=new ArrayList<>();
    List<Product> itemsBestsell=new ArrayList<>();
    List<Product> productsbyCategory=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        setData();
        mainActivityPresenter=new HomeActivityPresenter(this);
        mainActivityPresenter.setListitemitemFeaturedWithLimit("Featured",items,4);
        mainActivityPresenter.setListitemitemBestSellWithLimit("Bestsell",items,4);



        TextView seeall_featured=findViewById(R.id.seeall_featured);
        seeall_featured.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //itemsFeatured
            }
        });

        TextView seeall_bestsell=findViewById(R.id.seeall_bestsell);

        seeall_bestsell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //itemsBestsell

            }
        });


        TextView man=findViewById(R.id.man);
        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivityPresenter.setListitembyCategory("Man",items);
            }
        });

        TextView woman=findViewById(R.id.woman);
        woman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivityPresenter.setListitembyCategory("Woman",items);

            }
        });

        TextView children=findViewById(R.id.children);
        children.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivityPresenter.setListitembyCategory("Children",items);

            }
        });


        CardView search=findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void updateListitembyCategory(List<Product> productsbyCategory) {
        if (productsbyCategory.size() >0){
            this.productsbyCategory.addAll(productsbyCategory);
            if ( this.productsbyCategory.get(0).getProductCategory().equals("Man")){
                //Intent (List & Category)
                //productsbyCategory
                //Man
            }else if(this.productsbyCategory.get(0).getProductCategory().equals("Woman")){
                //Intent (List & Category)
                //productsbyCategory
                //Woman
            }else if (this.productsbyCategory.get(0).getProductCategory().equals("Woman")){
                //Intent (List & Category)
                //productsbyCategory
                //Children
            }
        }

    }

    @Override
    public void updateListitemFeaturedWithLimit(List<Product> productsbyCategory) {
        if (productsbyCategory.size()>0){
            itemsFeatured.addAll(productsbyCategory);
            // set up the RecyclerView
            RecyclerView recyclerView = findViewById(R.id.recyclerView_featured);
            LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
            recyclerView.setLayoutManager(layoutManager);
            HomeRecyclerViewAdapter adapter = new HomeRecyclerViewAdapter(this, productsbyCategory);
            recyclerView.setAdapter(adapter);
        }
    }

    @Override
    public void updateListitemBestSellWithLimit(List<Product> productsbyCategory) {
        if (productsbyCategory.size()>0){
            itemsBestsell.addAll(productsbyCategory);
            // set up the RecyclerView
            RecyclerView recyclerView2 = findViewById(R.id.recyclerView_bestsell);
            LinearLayoutManager layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
            recyclerView2.setLayoutManager(layoutManager2);
            HomeRecyclerViewAdapter adapter2 = new HomeRecyclerViewAdapter(this, productsbyCategory);
            recyclerView2.setAdapter(adapter2);
        }
    }



    public void setData(){
        Product product1=new Product("Man T-Shirt","Man","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",55);
        Product product2=new Product("Woman T-Shirt","Woman","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",100);
        Product product3=new Product("Children T-Shirt","Children","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",80);
        Product product4=new Product("Man T-Shirt","Man","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",55);
        Product product5=new Product("Woman T-Shirt","Woman","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",100);
        Product product6=new Product("Children T-Shirt","Children","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",80);
        Product product7=new Product("Man T-Shirt","Man","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",55);
        Product product8=new Product("Woman T-Shirt","Woman","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",100);
        Product product9=new Product("Children T-Shirt","Children","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",80);
        Product product10=new Product("Man T-Shirt","Man","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",70);
        Product product11=new Product("Woman T-Shirt","Woman","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",100);
        Product product12=new Product("Children T-Shirt","Children","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",80);

        Product product13=new Product("Children T-Shirt","Featured","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",80);
        Product product14=new Product("Man T-Shirt","Featured","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",70);
        Product product15=new Product("Woman T-Shirt","Featured","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",100);
        Product product16=new Product("Children T-Shirt","Featured","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",80);

        Product product17=new Product("Children T-Shirt","Bestsell","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",80);
        Product product18=new Product("Man T-Shirt","Bestsell","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",70);
        Product product19=new Product("Woman T-Shirt","Bestsell","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",100);
        Product product20=new Product("Children T-Shirt","Bestsell","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",80);

        items.add(product1);
        items.add(product2);
        items.add(product3);
        items.add(product4);
        items.add(product5);
        items.add(product6);
        items.add(product7);
        items.add(product8);
        items.add(product9);
        items.add(product10);
        items.add(product11);
        items.add(product12);
        items.add(product13);
        items.add(product14);
        items.add(product15);
        items.add(product16);
        items.add(product17);
        items.add(product18);
        items.add(product19);
        items.add(product20);
    }
}
