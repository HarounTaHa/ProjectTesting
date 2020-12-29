package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.projecttestingforsmartdevice.R;

public class HarounActivity1 extends AppCompatActivity {
    TextView textView;
    Button button;
    Button buttonProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.haroun_design_activity1);
        textView=findViewById(R.id.textView_haroun);
        button=findViewById(R.id.btn_signUp);
        buttonProfile=findViewById(R.id.btnProfile);
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
    }
}
