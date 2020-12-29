package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.currentLocation;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AddressActivityPresenterTest {
    AddressActivityPresenter addressActivityPresenter;
        String latitude;
        String longitude;
    String location;
    @Mock
    MockGoogleMapAPIInterface googleMapApiInterface;
    @Before
    public void setUp() throws Exception {
        addressActivityPresenter=new AddressActivityPresenter(googleMapApiInterface);
    }

    @Test
    public void testGetLocation() {
        //  give
        latitude= "49.82380908513249";
        longitude= "-10.8544921875";
        // when
        location= addressActivityPresenter.getAddressUser(latitude,longitude);
        //then
        Mockito.verify(googleMapApiInterface).getLocation(latitude,longitude);
    }
}