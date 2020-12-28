package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.addAddress;

import com.example.projecttestingforsmartdevice.models.Address;

public class AddAddressActivityPresenter implements AddAddressActivityPresenterInterface{

    private AddAddressActivityViewInterface viewInterface;

    public AddAddressActivityPresenter(AddAddressActivityViewInterface viewInterface){
        this.viewInterface=viewInterface;
    }


    @Override
    public void setAddress(Address address) {

    }

    @Override
    public void validationAddress(String name, String addressLane, String city, String postalCode) {

    }
}
