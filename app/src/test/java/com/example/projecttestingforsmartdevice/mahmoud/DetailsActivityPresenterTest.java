package com.example.projecttestingforsmartdevice.mahmoud;


import com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.details.DetailsActivityPresenter;
import com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.details.DetailsActivityViewInterface;
import com.example.projecttestingforsmartdevice.models.Product;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class DetailsActivityPresenterTest {

    DetailsActivityPresenter mainActivityPresenter;
    List<Product>items;
    @Mock
    DetailsActivityViewInterface mainActivityViewInterface;

    @Before
    public void setup() {
        mainActivityPresenter=new DetailsActivityPresenter(mainActivityViewInterface);
        items =new ArrayList();


        Product product1=new Product("Man T-Shirt","Man","Url","Detailes",55);
        Product product2=new Product("Woman T-Shirt","Woman","Url","Detailes",100);
        Product product3=new Product("Children T-Shirt","Children","Url","Detailes",80);
        Product product4=new Product("Man T-Shirt","Man","Url","Detailes",55);
        Product product5=new Product("Woman T-Shirt","Woman","Url","Detailes",100);
        Product product6=new Product("Children T-Shirt","Children","Url","Detailes",80);
        Product product7=new Product("Man T-Shirt","Man","Url","Detailes",55);
        Product product8=new Product("Woman T-Shirt","Woman","Url","Detailes",100);
        Product product9=new Product("Children T-Shirt","Children","Url","Detailes",80);
        Product product10=new Product("Man T-Shirt","Man","Url","Detailes",70);

        items.add(product1);
        items.add(product2);
        items.add(product3);
        items.add(product4);
        items.add(product5);
        items.add(product6);
        items.add(product7);
        items.add(product8);
        items.add(product9);
        items.add(product10);

    }

    @Test
    public void addFavorite() {

        //when
        mainActivityPresenter.setFavorite(items.get(0));

        //then
        Mockito.verify(mainActivityViewInterface).updateFavorite(items.get(0));

    }

    @Test
    public void addCart() {

        //when
        mainActivityPresenter.setCart(items.get(5));

        //then
        Mockito.verify(mainActivityViewInterface).updateCart(items.get(5));

    }

    @Test
    public void textaddCart() {
        String count="9";
        int max=9;
        String result="+9";

        //when
        mainActivityPresenter.setText(count,max,result);

        //then
        Mockito.verify(mainActivityViewInterface).updateText(result);

    }

}