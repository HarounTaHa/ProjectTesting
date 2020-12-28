package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.addAddress;

import com.example.projecttestingforsmartdevice.models.Address;

public class AddAddressActivityPresenter implements AddAddressActivityPresenterInterface{

    private AddAddressActivityViewInterface viewInterface;

    public AddAddressActivityPresenter(AddAddressActivityViewInterface viewInterface){
        this.viewInterface=viewInterface;
    }

    @Override
    public void setAddress(Address address) {
        if (address != null){
            viewInterface.updateAddress(address);
        }
    }

    @Override
    public void validationAddress(String name, String addressLane, String city, String postalCode) {
        if(!name.equals("")&&!addressLane.equals("")&&!city.equals("")&&!postalCode.equals("")){
            if (postalCode.matches(".*\\d.*")){
                System.out.println(postalCode);
                viewInterface.updateValidationAddress(name,addressLane,city,postalCode);
            }else{
                viewInterface.updateValidationAddress("","","","Not number");
            }
        }else{
            viewInterface.updateValidationAddress("","","","");
        }
    }
}
