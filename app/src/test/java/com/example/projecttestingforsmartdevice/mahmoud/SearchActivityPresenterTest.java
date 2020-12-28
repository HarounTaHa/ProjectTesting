package com.example.projecttestingforsmartdevice.mahmoud;


import com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.search.SearchActivityPresenter;
import com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.search.SearchActivityViewInterface;
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
public class SearchActivityPresenterTest {
    SearchActivityPresenter searchActivityPresenter;
    List<Product>items;
    List<Product>expectedItemsSearch;
    List<Product>expectedItemsFilter;
    @Mock
    SearchActivityViewInterface searchActivityViewInterface;

    @Before
    public void setup() {
        searchActivityPresenter=new SearchActivityPresenter(searchActivityViewInterface);
        items =new ArrayList();
        expectedItemsSearch=new ArrayList<>();
        expectedItemsFilter=new ArrayList<>();
        Product product1=new Product("Man T-Shirt","Man","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",50);
        Product product2=new Product("Woman T-Shirt","Woman","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",200);
        Product product3=new Product("Children T-Shirt","Children","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",90);
        Product product4=new Product("Man T-Shirt","Man","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",400);
        Product product5=new Product("Woman T-Shirt","Woman","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",250);
        Product product6=new Product("Children T-Shirt","Children","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",10);
        Product product7=new Product("Man T-Shirt","Man","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",40);
        Product product8=new Product("Woman T-Shirt","Woman","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/D%C3%A9part_de_deltaplane.JPG/440px-D%C3%A9part_de_deltaplane.JPG","Detailes",1000);

        items.add(product1);
        items.add(product2);
        items.add(product3);
        items.add(product4);
        items.add(product5);
        items.add(product6);
        items.add(product7);
        items.add(product8);


        //
        expectedItemsSearch.add(product2);
        expectedItemsSearch.add(product5);
        expectedItemsSearch.add(product8);


        //
        expectedItemsFilter.add(product8);
        expectedItemsFilter.add(product4);
        expectedItemsFilter.add(product5);
        expectedItemsFilter.add(product2);
        expectedItemsFilter.add(product3);
        expectedItemsFilter.add(product1);
        expectedItemsFilter.add(product7);
        expectedItemsFilter.add(product6);

        for (Product p:expectedItemsFilter){
            System.out.println(p.getProductPrice());
        }

    }


    @Test
    public void search() {
        String text="Woman T-Shirt";

        //when
        searchActivityPresenter.setQueryText(text,items);

        //then
        Mockito.verify(searchActivityViewInterface).updateSearchList(expectedItemsSearch);

    }

    @Test
    public void filter() {
        String text="Descending";

        //when
        searchActivityPresenter.setFilter(text,items);

        //then
        Mockito.verify(searchActivityViewInterface).updateFilterList(expectedItemsFilter);

    }

}