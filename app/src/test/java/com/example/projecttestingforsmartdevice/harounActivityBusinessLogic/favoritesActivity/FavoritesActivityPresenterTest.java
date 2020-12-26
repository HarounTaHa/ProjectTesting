package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.favoritesActivity;

import com.example.projecttestingforsmartdevice.models.Product;

import junit.framework.TestCase;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FavoritesActivityPresenterTest  {
    FavoritesActivityPresenter favoritesActivityPresenter;
    List<Product> list;
    @Mock
    FavoritesActivityViewInterface favoritesActivityViewInterface;


    @Before
    public void setUp() throws Exception {
        favoritesActivityPresenter=new FavoritesActivityPresenter(favoritesActivityViewInterface);
        list=new ArrayList<>();
    }

    @Test
    public void testUpdateCountOfListProduct() {
        //zero item fail test
        System.out.println(""+list.size());
        //given
        list.add(new Product());
        //when
        int countOfList = favoritesActivityPresenter.getCountListOfProducts(list);
        System.out.println(countOfList);
        // get count is 1 product
        //then
        //verify method getCountListOfProducts is call updateCountListOfProducts in class FavoritesActivityPresenter
        // test pass
        Mockito.verify(favoritesActivityViewInterface).updateCountListOfProducts(countOfList);


    }
}