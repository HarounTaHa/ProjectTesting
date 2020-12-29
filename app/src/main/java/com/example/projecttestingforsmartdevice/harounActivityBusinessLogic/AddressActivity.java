package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.projecttestingforsmartdevice.R;
import com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.currentLocation.AddressActivityPresenter;
import com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.currentLocation.MockGoogleMapAPIInterface;

public class AddressActivity extends AppCompatActivity implements MockGoogleMapAPIInterface {
    AddressActivityPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.haroun_activity_address);
        presenter=new AddressActivityPresenter(this);
    }

    @Override
    public String getLocation(String lat, String lon) {
            return null;
    }
}
