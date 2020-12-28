package com.example.projecttestingforsmartdevice.basilActivityBusinessLogic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.projecttestingforsmartdevice.R;

public class BasilActivity1 extends AppCompatActivity {
    private Object Thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basil_design_activity1);
        Thread thread = new Thread(){
            @Override
            public void run() {
                try {

                    sleep(4000);

                    Intent intent = new Intent(BasilActivity1.this , BasilActivity2.class);
                    startActivity(intent);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}
