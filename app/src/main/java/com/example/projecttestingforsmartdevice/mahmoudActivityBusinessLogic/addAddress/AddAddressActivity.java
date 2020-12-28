package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.addAddress;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.projecttestingforsmartdevice.R;
import com.example.projecttestingforsmartdevice.models.Address;

public class AddAddressActivity extends AppCompatActivity implements AddAddressActivityViewInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_address);
    }

    @Override
    public void updateAddress(Address address) {

    }

    @Override
    public void updateValidationAddress(String name, String addressLane, String city, String postalCode) {

    }
}