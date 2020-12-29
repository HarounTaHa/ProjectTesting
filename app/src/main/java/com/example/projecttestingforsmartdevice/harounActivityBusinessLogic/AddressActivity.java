package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.projecttestingforsmartdevice.R;
import com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.currentLocation.AddressActivityPresenter;
import com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.currentLocation.MockGoogleMapAPIInterface;

public class AddressActivity extends AppCompatActivity implements MockGoogleMapAPIInterface {
    AddressActivityPresenter presenter;
    String latitude= "49.82380908513249";
    String longitude= "-10.8544921875";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.haroun_activity_address);
        textView=findViewById(R.id.textView_addressUser);
        presenter=new AddressActivityPresenter(this);
       String addressUser = presenter.getAddressUser(latitude,longitude);
       if(addressUser!=null){
        textView.setText(addressUser);
       }
    }

    @Override
    public String getLocation(String lat, String lon) {
            return null;
    }
}
