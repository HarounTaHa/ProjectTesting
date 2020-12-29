package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.projecttestingforsmartdevice.R;
import com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.profileActivity.ProfileActivityPresenter;
import com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.profileActivity.ProfileActivityViewInterface;
import com.example.projecttestingforsmartdevice.models.User;

import org.w3c.dom.Text;

public class ProfileActivity extends AppCompatActivity implements ProfileActivityViewInterface {
    ProfileActivityPresenter profileActivityPresenter;
//   from intent or bundle or any
    User user;
    TextView textViewNameUser;
    TextView textViewEmailUser;
    TextView textViewAddressUser;
    TextView textViewGenderUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.haroun_activity_profile);
        textViewNameUser=findViewById(R.id.textView_nameUser);
        textViewEmailUser=findViewById(R.id.textView_emailUser);
        textViewAddressUser=findViewById(R.id.textView_addressUser);
        textViewGenderUser=findViewById(R.id.textView_genderUser);
//        -------------------------
        profileActivityPresenter =new ProfileActivityPresenter(this);
        user = new User("harountaha@outlook.sa","haroun","Gaza Strip","M");
        profileActivityPresenter.getUser(user);


    }

    @Override
    public void displayDetailsUser(User user) {
        textViewNameUser.setText(user.getUserName());
        textViewEmailUser.setText(user.getUserEmail());
        textViewGenderUser.setText(user.getGender());
        textViewAddressUser.setText(user.getUserAddress());
    }
}
