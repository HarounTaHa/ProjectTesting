package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.home;


import com.example.projecttestingforsmartdevice.models.Product;

import java.util.List;

public interface HomeActivityPresenterInterface {

    void setListitembyCategory(String category, List<Product> products);
    void setListitemitemFeaturedWithLimit(String category, List<Product> products, int limimt);
    void setListitemitemBestSellWithLimit(String category, List<Product> products, int limimt);

}
