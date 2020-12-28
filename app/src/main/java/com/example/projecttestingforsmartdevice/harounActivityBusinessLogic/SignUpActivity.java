package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.projecttestingforsmartdevice.R;
import com.example.projecttestingforsmartdevice.basilActivityBusinessLogic.BasilActivity1;
import com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.signUpActivity.SignUpActivityPresenter;
import com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.signUpActivity.SignUpActivityViewInterface;
import com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.home.HomeActivity;
import com.example.projecttestingforsmartdevice.models.User;

import java.util.ArrayList;
import java.util.List;

public class SignUpActivity extends AppCompatActivity implements SignUpActivityViewInterface {
    EditText name_rg , email_rg ,pass_rg ;
    Button buttonRegister,buttonLogin;
    SignUpActivityPresenter signUpActivityPresenter;
    List<User> users;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.haroun_activity_sign_up);
        name_rg=findViewById(R.id.name_editText_rg);
        email_rg=findViewById(R.id.email_editText_rg);
        pass_rg=findViewById(R.id.pass_rg_ed);

//        ---------
        user=new User();
//        -------
        signUpActivityPresenter=new SignUpActivityPresenter(this);
//        -------
        users=new ArrayList<>();
//        -------
        buttonRegister=findViewById(R.id.button_rg);
        buttonLogin=findViewById(R.id.button_rg_login);
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=email_rg.getText().toString().trim();
                String pass=pass_rg.getText().toString().trim();
                String name=name_rg.getText().toString();
         boolean isSuccessAddUser= signUpActivityPresenter.emailAndPasswordValidator(user,email,pass,name);

            if (!isSuccessAddUser){
                Toast.makeText(SignUpActivity.this, "Login Fail", Toast.LENGTH_SHORT).show();
            }
            if (isSuccessAddUser){
                startActivity(new Intent(getApplicationContext(),
                        HomeActivity.class));
            }

             }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), BasilActivity1.class));
            }
        });
    }

    @Override
    public void addUser(User user) {
//        create user
            users.add(user);
    }
}
