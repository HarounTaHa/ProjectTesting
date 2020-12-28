package com.example.projecttestingforsmartdevice.mahmoud;


import com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.addAddress.AddAddressActivityPresenter;
import com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.addAddress.AddAddressActivityViewInterface;
import com.example.projecttestingforsmartdevice.models.Address;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AddAddressActivityPresenterTest {

    AddAddressActivityPresenter mainActivityPresenter;
    @Mock
    AddAddressActivityViewInterface mainActivityViewInterface;


    @Before
    public void setup() {
        mainActivityPresenter=new AddAddressActivityPresenter(mainActivityViewInterface);
    }



    @Test
    public void validationAddress() {

        //when
        mainActivityPresenter.validationAddress("G1","G2","G3","12");

        //then
        Mockito.verify(mainActivityViewInterface).updateValidationAddress("G1","G2","G3","12");

    }

    @Test
    public void addAddress() {

        Address address=new Address("G1","G2","G3","G4");
        //when
        mainActivityPresenter.setAddress(address);

        //then
        Mockito.verify(mainActivityViewInterface).updateAddress(address);

    }


}