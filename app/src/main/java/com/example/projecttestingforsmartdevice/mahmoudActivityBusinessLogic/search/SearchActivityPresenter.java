package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.search;

import com.example.projecttestingforsmartdevice.models.Product;

import java.util.List;

public class SearchActivityPresenter implements SearchActivityPresenterInterface{

    private SearchActivityViewInterface viewInterface;

    public SearchActivityPresenter(SearchActivityViewInterface viewInterface){
        this.viewInterface=viewInterface;
    }

    @Override
    public void setQueryText(String text, List<Product> filteredList) {

    }

    @Override
    public void setFilter(String orderby, List<Product> filteredList) {

    }
}
