package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.projecttestingforsmartdevice.R;

public class HarounActivity1 extends AppCompatActivity {
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.haroun_design_activity1);
        textView=findViewById(R.id.textView_haroun);
        button=findViewById(R.id.button_toast);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        FavoritesActivity.class));
            }
        });
    }
}
