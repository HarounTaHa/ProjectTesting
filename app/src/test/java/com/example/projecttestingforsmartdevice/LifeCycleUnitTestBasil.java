package com.example.projecttestingforsmartdevice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LifeCycleUnitTestBasil {

    private TestBasilMethod tested;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("@BeforeClass");
    }

    @Test
    public void testEmail() {
        boolean result = tested.isEmailAddress("basil@gmail.com");
        System.out.println("@testEmail" + "|" + result);
        assertEquals(true, result);
    }

    @Before
    public void beforeMethod() {
        tested = new TestBasilMethod();
        System.out.println("@Before");
    }

    @After
    public void afterMethod() {
        System.out.println("@After");
    }

    @AfterClass
    public static void afterClassMethod() {
        System.out.println("@AfterClass");
    }

}