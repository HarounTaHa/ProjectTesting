package com.example.projecttestingforsmartdevice.mahmoud;


import com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.home.HomeActivityPresenter;
import com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.home.HomeActivityViewInterface;
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
public class HomeActivityPresenterTest {
    HomeActivityPresenter mainActivityPresenter;
    List<Product>items;
    List<Product>expectedItemsCategory;
    List<Product>expectedItemsFeatured;
    List<Product>expectedItemsBestSell;

    @Mock
    HomeActivityViewInterface mainActivityViewInterface;

    @Before
    public void setup() {
        mainActivityPresenter=new HomeActivityPresenter(mainActivityViewInterface);
        items =new ArrayList();
        expectedItemsCategory=new ArrayList<>();
        expectedItemsFeatured=new ArrayList<>();
        expectedItemsBestSell=new ArrayList<>();
        Product product1=new Product("Man T-Shirt","Man","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",55);
        Product product2=new Product("Woman T-Shirt","Woman","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",100);
        Product product3=new Product("Children T-Shirt","Children","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",80);
        Product product4=new Product("Man T-Shirt","Man","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",55);
        Product product5=new Product("Woman T-Shirt","Woman","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",100);
        Product product6=new Product("Children T-Shirt","Children","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",80);
        Product product7=new Product("Man T-Shirt","Man","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",55);
        Product product8=new Product("Woman T-Shirt","Woman","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",100);
        Product product9=new Product("Children T-Shirt","Children","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",80);
        Product product10=new Product("Man T-Shirt","Man","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",70);
        Product product11=new Product("Woman T-Shirt","Woman","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",100);
        Product product12=new Product("Children T-Shirt","Children","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",80);

        Product product13=new Product("Children T-Shirt","Featured","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",80);
        Product product14=new Product("Man T-Shirt","Featured","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",70);
        Product product15=new Product("Woman T-Shirt","Featured","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",100);
        Product product16=new Product("Children T-Shirt","Featured","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",80);

        Product product17=new Product("Children T-Shirt","Bestsell","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",80);
        Product product18=new Product("Man T-Shirt","Bestsell","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",70);
        Product product19=new Product("Woman T-Shirt","Bestsell","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",100);
        Product product20=new Product("Children T-Shirt","Bestsell","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",80);


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
        items.add(product11);
        items.add(product12);
        items.add(product13);
        items.add(product14);
        items.add(product15);
        items.add(product16);
        items.add(product17);
        items.add(product18);
        items.add(product19);
        items.add(product20);


        //
        expectedItemsCategory.add(product2);
        expectedItemsCategory.add(product5);
        expectedItemsCategory.add(product8);
        expectedItemsCategory.add(product11);

        //
        expectedItemsFeatured.add(product13);
        expectedItemsFeatured.add(product14);
        expectedItemsFeatured.add(product15);
        expectedItemsFeatured.add(product16);
        //
        expectedItemsBestSell.add(product17);
        expectedItemsBestSell.add(product18);
        expectedItemsBestSell.add(product19);
        expectedItemsBestSell.add(product20);
    }


    @Test
    public void clickCategory() {
        String category="Woman";

        //when
        mainActivityPresenter.setListitembyCategory(category,items);

        //then
        Mockito.verify(mainActivityViewInterface).updateListitembyCategory(expectedItemsCategory);

    }


    @Test
    public void viewFeatured() {
        String category="Featured";
        int limit=4;
        //when

        mainActivityPresenter.setListitemitemFeaturedWithLimit(category,items,limit);

        //then
        Mockito.verify(mainActivityViewInterface).updateListitemFeaturedWithLimit(expectedItemsFeatured);

    }

    @Test
    public void viewBestSell() {
        String category="Bestsell";
        int limit=4;
        //when

        mainActivityPresenter.setListitemitemBestSellWithLimit(category,items,limit);

        //then
        Mockito.verify(mainActivityViewInterface).updateListitemBestSellWithLimit(expectedItemsBestSell);

    }



}