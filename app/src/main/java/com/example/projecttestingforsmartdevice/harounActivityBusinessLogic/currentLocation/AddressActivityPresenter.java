package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.currentLocation;

public class AddressActivityPresenter implements AddressActivityPresenterInterface {

    MockGoogleMapAPIInterface googleMapApiInterface;

    public AddressActivityPresenter(MockGoogleMapAPIInterface googleMapApiInterface) {
        this.googleMapApiInterface = googleMapApiInterface;
    }

    @Override
    public String getAddressUser(String x, String y) {
        return null;
    }
}
