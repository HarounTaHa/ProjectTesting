package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.addAddress;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.projecttestingforsmartdevice.R;
import com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.home.HomeActivity;
import com.example.projecttestingforsmartdevice.models.Address;

import static com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.home.HomeActivity.AddressUser;

public class AddAddressActivity extends AppCompatActivity implements AddAddressActivityViewInterface {

    TextView cartnoti;
    EditText edit_name,edit_addresslane,edit_city,edit_postalcode;
    Button add;
    AddAddressActivityPresenter mainActivityPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_address);
        edit_name=findViewById(R.id.edit_name);
        edit_addresslane=findViewById(R.id.edit_addresslane);
        edit_city=findViewById(R.id.edit_city);
        edit_postalcode=findViewById(R.id.edit_postalcode);
        add=findViewById(R.id.add);
        cartnoti=findViewById(R.id.cartnoti);

        mainActivityPresenter=new AddAddressActivityPresenter(this);
        //
        int size= HomeActivity.CartProduct.size();
        if (size<9){
            cartnoti.setText(size+"");
        }else{
            cartnoti.setText("9+");
        }

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivityPresenter.validationAddress(edit_name.getText().toString(),
                        edit_addresslane.getText().toString(),edit_city.getText().toString(),
                        edit_postalcode.getText().toString());
            }
        });

    }

    @Override
    public void updateAddress(Address address) {
        AddressUser.add(address);
        Toast.makeText(getApplicationContext(),"Success Add",Toast.LENGTH_LONG).show();
    }

    @Override
    public void updateValidationAddress(String name, String addressLane, String city, String postalCode) {
        if (postalCode.equals("")){
            Toast.makeText(getApplicationContext(),"Fill Empty fields!",Toast.LENGTH_LONG).show();
        }else if (postalCode.equals("Not number")){
            Toast.makeText(getApplicationContext(),"Postal Code Not number !",Toast.LENGTH_LONG).show();
        }else{
            Address address=new Address(name,addressLane,city,postalCode);
            mainActivityPresenter.setAddress(address);
        }
    }
}