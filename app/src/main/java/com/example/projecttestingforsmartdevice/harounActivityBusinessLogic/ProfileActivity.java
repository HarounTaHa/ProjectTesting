package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.projecttestingforsmartdevice.R;
import com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.profileActivity.ProfileActivityPresenter;
import com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.profileActivity.ProfileActivityViewInterface;
import com.example.projecttestingforsmartdevice.models.User;

public class ProfileActivity extends AppCompatActivity implements ProfileActivityViewInterface {
    ProfileActivityPresenter profileActivityPresenter;
//   from intent or bundle or any
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.haroun_activity_profile);
        profileActivityPresenter =new ProfileActivityPresenter(this);
        user = new User("harountaha@outlook.sa","haroun","Gaza Strip","M");

    }

    @Override
    public void displayDetailsUser(User user) {

    }
}
