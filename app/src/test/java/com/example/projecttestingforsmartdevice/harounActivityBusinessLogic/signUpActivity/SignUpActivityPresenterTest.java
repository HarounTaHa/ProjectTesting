package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.signUpActivity;

import com.example.projecttestingforsmartdevice.models.User;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SignUpActivityPresenterTest {
    SignUpActivityPresenter signUpActivityPresenter;
    String inputEmail;
    String inputPassword;
    String inputName;
    User user;
    @Mock
    SignUpActivityViewInterface signUpActivityViewInterface;


    @Before
    public void setUp() throws Exception {
        inputEmail = "harountaha@outlook.sa";
        inputPassword = "harOun@56";
        inputName="haroun";
        signUpActivityPresenter = new SignUpActivityPresenter(signUpActivityViewInterface);
        user = new User();
    }

    @Test
    public void testEmailAndPasswordIsValid() {
     // given
        user.setUserEmail(inputEmail);
        user.setPassword(inputPassword);
        user.setUserName(inputName);
     // when
        signUpActivityPresenter.emailAndPasswordValidator(user,user.getUserEmail(),user.getPassword(),user.getUserName());

     // then
        Mockito.verify(signUpActivityViewInterface).addUser(user);

    }

}