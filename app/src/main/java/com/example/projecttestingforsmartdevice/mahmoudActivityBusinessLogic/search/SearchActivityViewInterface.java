package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.search;


import com.example.projecttestingforsmartdevice.models.Product;

import java.util.List;

public interface SearchActivityViewInterface {
    void updateSearchList(List<Product> filteredList);
    void updateFilterList(List<Product> filteredList);

}
