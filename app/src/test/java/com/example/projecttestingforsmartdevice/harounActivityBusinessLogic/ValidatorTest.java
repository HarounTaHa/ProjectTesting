package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class ValidatorTest {
    Validator validator;
    String inputEmail="harountaha@outlook.sa";
    String inputPassword = "1sss456";
    Date date;
    long milliSecond;


    @Before
    public void setUp() throws Exception {
        validator  =new Validator();
        milliSecond = System.currentTimeMillis();
    }

    @Test
    public void emailValidator() {
        boolean result = validator.emailValidator(inputEmail);
        assertEquals(result,true);
    }

    @Test
    public void passwordValidator() {
        assertTrue(validator.passwordValidator(inputPassword));
    }

    @Test
    public void calendarDateValidator() {
        System.out.println("Test");
        date = validator.calendarDateValidator();
        assertEquals(milliSecond, date.getTime(), 1);
    }

    @After
    public void tearDown() throws Exception {
        validator=null;
    }
}