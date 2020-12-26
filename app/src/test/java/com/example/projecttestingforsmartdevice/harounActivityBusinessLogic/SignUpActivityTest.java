package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic;

import com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.signUpActivity.Validator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SignUpActivityTest {
    Validator validator;
    String inputEmail;
    String inputPassword;
    @Before
    public void setUp() throws Exception {
        validator=new Validator();
        System.out.println("Before method");
        inputEmail="harountaha@outlook.sa";
        inputPassword="harOun@56";
    }

    @Test
    public void testEmailIsValid() {
      boolean isValidEmail=validator.emailValidator(inputEmail);
      assertEquals(true,isValidEmail);
    }

    @Test
    public void passWordIsValid() {
        boolean isValidPassword=validator.passwordValidator(inputPassword);
        assertEquals(true,isValidPassword);
    }

    @After
    public void tearDown() throws Exception {
        validator=null;
        inputEmail=null;
        inputPassword=null;
    }
}