package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.projecttestingforsmartdevice.R;
import com.example.projecttestingforsmartdevice.models.Address;

public class HarounActivity1 extends AppCompatActivity {
    TextView textView;
    Button button;
    Button buttonFavorites;
    Button buttonProfile;
    Button buttonAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.haroun_design_activity1);
        textView=findViewById(R.id.textView_haroun);
        button=findViewById(R.id.btn_signUp);
        buttonProfile=findViewById(R.id.btnProfile);
        buttonFavorites=findViewById(R.id.btn_favorites);
        buttonAddress=findViewById(R.id.btn_address);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        SignUpActivity.class));
            }
        });
        buttonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        ProfileActivity.class));
            }
        });
        buttonFavorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        FavoritesActivity.class));
            }
        });
        buttonAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        AddressActivity.class));
            }
        });
    }
}
