package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.search;

import com.example.projecttestingforsmartdevice.models.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SearchActivityPresenter implements SearchActivityPresenterInterface{

    private SearchActivityViewInterface viewInterface;

    public SearchActivityPresenter(SearchActivityViewInterface viewInterface){
        this.viewInterface=viewInterface;
    }

    @Override
    public void setQueryText(String text, List<Product> filteredList) {
        List<Product> newfilteredList = new ArrayList<>();
        for (Product item : filteredList) {
            if (item.getProductName().toLowerCase().contains(text.toLowerCase())) {
                newfilteredList.add(item);
            }
        }
        viewInterface.updateSearchList(newfilteredList);
    }

    @Override
    public void setFilter(String orderby, List<Product> filteredList) {

        if (orderby.equals("Descending")){
            Collections.sort(filteredList, new Comparator<Product>() {
                @Override
                public int compare(Product lhs, Product rhs) {
                    return Integer.valueOf(rhs.getProductPrice()).compareTo(lhs.getProductPrice());
                }
            });
            viewInterface.updateFilterList(filteredList);
        }else if (orderby.equals("Ascending")){
            Collections.sort(filteredList, new Comparator<Product>(){
                @Override
                public int compare(Product lhs, Product rhs) {
                    return Integer.valueOf(lhs.getProductPrice()).compareTo(rhs.getProductPrice());
                }
            });
            viewInterface.updateFilterList(filteredList);
        }
    }
}
