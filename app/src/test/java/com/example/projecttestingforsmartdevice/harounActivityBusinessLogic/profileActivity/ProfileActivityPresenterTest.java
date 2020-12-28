package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.profileActivity;

import com.example.projecttestingforsmartdevice.models.User;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class ProfileActivityPresenterTest extends TestCase {

    ProfileActivityPresenter profileActivityPresenter;
    User user;

    @Mock
    ProfileActivityViewInterface profileActivityViewInterface;

    @Before
    public void setUp() throws Exception {
        profileActivityPresenter=new ProfileActivityPresenter(profileActivityViewInterface);
        user=new User();
    }

    @Test
    public void testProfilePresenter() {
        //given
        //  valid data because is user in the system from before
        user.setUserEmail("harountaha@outlook.sa");
        user.setUserName("Haroun Th");
        user.setUserAddress("Gaza Strip");
        user.setGender("M");
        //when
        profileActivityPresenter.getUser(user);
        //then
        Mockito.verify(profileActivityViewInterface).displayDetailsUser(user);
    }

}