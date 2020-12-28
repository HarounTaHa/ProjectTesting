package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.search;


import com.example.projecttestingforsmartdevice.models.Product;

import java.util.List;

public interface SearchActivityPresenterInterface {

    void setQueryText(String text, List<Product> filteredList);
    void setFilter(String orderby, List<Product> filteredList);
}
