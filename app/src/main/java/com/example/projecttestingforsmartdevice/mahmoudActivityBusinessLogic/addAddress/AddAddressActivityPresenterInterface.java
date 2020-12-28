package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.addAddress;


import com.example.projecttestingforsmartdevice.models.Address;

public interface AddAddressActivityPresenterInterface {
    void setAddress(Address address);
    void validationAddress(String name, String addressLane, String city, String postalCode);

}
