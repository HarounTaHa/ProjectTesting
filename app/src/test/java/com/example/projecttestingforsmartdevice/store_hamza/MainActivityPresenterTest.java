//package com.example.store;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.runners.MockitoJUnitRunner;
//
//@RunWith(MockitoJUnitRunner.class)
//public class MainActivityPresenterTest{
//
//    MainActivityPresenter mainActivityPresenter;
//
//    @Mock
//    MainActivityViewInterface mainActivityView;
//
//    @Before
//    public void setup() throws Exception{
//        mainActivityPresenter = new MainActivityPresenter(mainActivityView);
//    }
//
//    @Test
//    public void testIfPresenterUpdatePlusCount(){
//
//        //given
//        int indexLength = 5;
//        int maxLength = 10;
//        int count = Integer.valueOf(maxLength-indexLength);
//
//        //when
//        mainActivityPresenter.setPlusCount(indexLength, maxLength);
//
//        //then
//        Mockito.verify(mainActivityView).updatePlusCount(count);
//    }
//
//    @Test
//    public void testIfPresenterUpdateMinusCount(){
//
//        //given
//        int indexLength = 5;
//        int maxLength = 10;
//        int count = Integer.valueOf(maxLength-indexLength);
//
//        //when
//        mainActivityPresenter.setMinusCount(indexLength, maxLength);
//
//        //then
//        Mockito.verify(mainActivityView).updateMinusCount(count);
//    }
//
//}
