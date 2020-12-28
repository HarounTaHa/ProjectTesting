package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.addAddress;


import com.example.projecttestingforsmartdevice.models.Address;

public interface AddAddressActivityViewInterface {
    void updateAddress(Address address);
    void updateValidationAddress(String name, String addressLane, String city, String postalCode);
}
