package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.currentLocation;

public class AddressActivityPresenter implements AddressActivityPresenterInterface {

    MockGoogleMapAPIInterface googleMapApiInterface;

    public AddressActivityPresenter(MockGoogleMapAPIInterface googleMapApiInterface) {
        this.googleMapApiInterface = googleMapApiInterface;
    }

    @Override
    public String getAddressUser(String x, String y) {
        if(x.length()>0&&y.length()>0) {
            googleMapApiInterface.getLocation(x, y);
            return "Shewrapara, Mirpur, Dhaka-1216\n" +
                    "House no: 938\n" +
                    "Road no: 9";
        }
        return null;
    }
}
