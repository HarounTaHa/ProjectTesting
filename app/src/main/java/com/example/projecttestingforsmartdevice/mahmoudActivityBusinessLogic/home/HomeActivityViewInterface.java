package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.home;


import com.example.projecttestingforsmartdevice.models.Product;

import java.util.List;

public interface HomeActivityViewInterface {
    void updateListitembyCategory(List<Product> productsbyCategory);
    void updateListitemFeaturedWithLimit(List<Product> productsbyCategory);
    void updateListitemBestSellWithLimit(List<Product> productsbyCategory);


}
