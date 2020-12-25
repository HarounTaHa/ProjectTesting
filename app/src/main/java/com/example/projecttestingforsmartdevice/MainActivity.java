package com.example.projecttestingforsmartdevice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projecttestingforsmartdevice.basilActivityBusinessLogic.BasilActivity1;
import com.example.projecttestingforsmartdevice.hamzaActivityBusinessLogic.HamzaActivity1;
import com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.HarounActivity1;
import com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.MahmoudActivity1;

public class MainActivity extends AppCompatActivity {
    Button buttonToActivityHaroun;
    Button buttonToActivityHamza;
    Button buttonToActivityBasil;
    Button buttonToActivityMahmoud;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonToActivityHaroun =findViewById(R.id.buttonToActivityHaroun);
        buttonToActivityHamza =findViewById(R.id.buttonToActivityHamza);
        buttonToActivityBasil =findViewById(R.id.buttonToActivityBasil);
        buttonToActivityMahmoud =findViewById(R.id.buttonToActivityMahmoud);
//        ****************************************************************
        buttonToActivityHaroun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        HarounActivity1.class));
            }
        });
        //        ****************************************************************
        buttonToActivityHamza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        HamzaActivity1.class));
            }
        });
        //        ****************************************************************
        buttonToActivityBasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        BasilActivity1.class));
            }
        });
        //        ****************************************************************
        buttonToActivityMahmoud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        MahmoudActivity1.class));
            }
        });

    }
}
