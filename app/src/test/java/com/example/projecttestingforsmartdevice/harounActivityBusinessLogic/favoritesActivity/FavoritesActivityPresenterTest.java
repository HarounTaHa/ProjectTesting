package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.favoritesActivity;

import com.example.projecttestingforsmartdevice.models.Product;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

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
        //given
            list.add(new Product());
        //when
        int countOfList = favoritesActivityPresenter.getCountListOfProducts(list);
        //then
        Mockito.verify(favoritesActivityViewInterface).updateCountListOfProducts(list);
    }
}