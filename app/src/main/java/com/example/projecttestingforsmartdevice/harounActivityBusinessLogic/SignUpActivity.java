package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.projecttestingforsmartdevice.MainActivity;
import com.example.projecttestingforsmartdevice.R;
import com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.signUpActivity.SignUpActivityPresenter;
import com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.signUpActivity.SignUpActivityViewInterface;
import com.example.projecttestingforsmartdevice.models.User;

public class SignUpActivity extends AppCompatActivity implements SignUpActivityViewInterface {
    EditText name_rg , email_rg ,pass_rg ;
    Button buttonRegister,buttonLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.haroun_activity_sign_up);
        name_rg=findViewById(R.id.name_editText_rg);
        email_rg=findViewById(R.id.email_editText_rg);
        pass_rg=findViewById(R.id.pass_rg_ed);
        buttonRegister=findViewById(R.id.button_rg);
        buttonLogin=findViewById(R.id.button_rg_login);
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=email_rg.getText().toString().trim();
                String pass=pass_rg.getText().toString().trim();
                String name=name_rg.getText().toString();

            }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }

    @Override
    public void addUser(User user) {

    }
}
