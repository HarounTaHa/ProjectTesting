package com.example.projecttestingforsmartdevice.hamzaActivityBusinessLogic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projecttestingforsmartdevice.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HamzaActivity2 extends AppCompatActivity {

    Button btn_add_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cart cart1 = new Cart(R.drawable.bt_uisquare, "Shirt", "Next", "$64.00", R.drawable.bt_uisquare, R.drawable.bt_uisquare, R.drawable.bt_uisquare);
        Cart cart2 = new Cart(R.drawable.bt_uisquare, "Women t- shirt", "Lotto.LID", "$34.00", R.drawable.bt_uisquare, R.drawable.bt_uisquare, R.drawable.bt_uisquare);
        Cart cart3 = new Cart(R.drawable.bt_uisquare, "Female t- shirt", "Bate", "$49.00", R.drawable.bt_uisquare, R.drawable.bt_uisquare, R.drawable.bt_uisquare);
        Cart cart4 = new Cart(R.drawable.bt_uisquare, "Shirt", "Next", "$64.00", R.drawable.bt_uisquare, R.drawable.bt_uisquare, R.drawable.bt_uisquare);
        Cart cart5 = new Cart(R.drawable.bt_uisquare, "Women t- shirt", "Lotto.LID", "$34.00", R.drawable.bt_uisquare, R.drawable.bt_uisquare, R.drawable.bt_uisquare);
        Cart cart6 = new Cart(R.drawable.bt_uisquare, "Female t- shirt", "Bate", "$49.00", R.drawable.bt_uisquare, R.drawable.bt_uisquare, R.drawable.bt_uisquare);

        List<Cart> cartList = new ArrayList<>();
        cartList.add(cart1);
        cartList.add(cart2);
        cartList.add(cart3);
        cartList.add(cart4);
        cartList.add(cart5);
        cartList.add(cart6);


//        btn_add_address = findViewById(R.id.bt_uisquare);
//        btn_add_address.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(getApplicationContext(), NavigationDrawer.class));
//            }
//        });

    }


//    @Override
//    public void setPlusCount(int indexLength, int maxLength) {
//
//    }
//
//    @Override
//    public void setMinusCount(int indexLength, int maxLength) {
//
//    }
}