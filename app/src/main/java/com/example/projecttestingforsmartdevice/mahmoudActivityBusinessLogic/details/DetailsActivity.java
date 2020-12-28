package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.details;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.projecttestingforsmartdevice.R;
import com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.home.HomeActivity;
import com.example.projecttestingforsmartdevice.models.Product;

public class DetailsActivity extends AppCompatActivity implements DetailsActivityViewInterface{
    Product product;
    ImageView details_img,add;
    TextView details_name,details_price,details_category,details_details,cartnoti;
    Button details_buy;
    DetailsActivityPresenter mainActivityPresenter;
    int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        product=(Product)getIntent().getSerializableExtra("product");
        details_img =findViewById(R.id.details_img);
        details_name =findViewById(R.id.details_name);
        details_price =findViewById(R.id.details_price);
        details_category =findViewById(R.id.details_category);
        details_details =findViewById(R.id.details_details);
        details_buy =findViewById(R.id.details_buy);
        add=findViewById(R.id.add);
        cartnoti=findViewById(R.id.cartnoti);
        mainActivityPresenter=new DetailsActivityPresenter(this);

        cartnoti.setText(HomeActivity.CartProduct.size()+"");

        //
        final int size=HomeActivity.CartProduct.size();
        if (size<9){
            cartnoti.setText(size+"");
        }else{
            cartnoti.setText("9+");
        }

        Glide.with(getApplicationContext())
                .load(product.getProductImageUrl())
                .into(details_img);

        details_name.setText(product.getProductName());
        details_price.setText(product.getProductPrice()+"");
        details_category.setText(product.getProductCategory());
        details_details.setText(product.getProductDescription());



        details_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                index++;
                cartnoti.setText((size+index)+"");
                mainActivityPresenter.setCart(product);
            }
        });



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                mainActivityPresenter.setFavorite(product);
            }
        });


        cartnoti.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() != 0)
                    mainActivityPresenter.setText(s.toString(),10,"9+");
            }

        });
    }

    @Override
    public void updateFavorite(Product product) {
        HomeActivity.FavoriteProduct.add(product);
        Toast.makeText(getApplicationContext(),"Success Add",Toast.LENGTH_LONG).show();
    }

    @Override
    public void updateCart(Product product) {
        HomeActivity.CartProduct.add(product);
        Toast.makeText(getApplicationContext(),"Success Add",Toast.LENGTH_LONG).show();
    }

    @Override
    public void updateText(String text) {
        cartnoti.setText(text+"");
    }
}