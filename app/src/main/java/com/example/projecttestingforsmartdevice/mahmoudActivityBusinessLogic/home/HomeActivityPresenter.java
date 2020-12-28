package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.home;

import com.example.projecttestingforsmartdevice.models.Product;

import java.util.ArrayList;
import java.util.List;

public class HomeActivityPresenter implements HomeActivityPresenterInterface {
    private HomeActivityViewInterface viewInterface;

    public HomeActivityPresenter(HomeActivityViewInterface viewInterface){
        this.viewInterface=viewInterface;
    }

    @Override
    public void setListitembyCategory(String category, List<Product> products) {
        List<Product> productsbyCategory=new ArrayList<>();
        for (int i=0;i<products.size();i++){
            if (products.get(i).getProductCategory().equals(category)){
                productsbyCategory.add(products.get(i));
                System.out.println(products.get(i).getProductCategory());
            }
            if (i==products.size()-1){
                viewInterface.updateListitembyCategory(productsbyCategory);
            }
        }
    }

    @Override
    public void setListitemitemFeaturedWithLimit(String category, List<Product> products, int limimt) {
        List<Product> productsbyCategory=new ArrayList<>();
        for (int i=0;i<products.size();i++){

            if (products.get(i).getProductCategory().equals(category)){
                productsbyCategory.add(products.get(i));
                System.out.println(products.get(i).getProductCategory());
            }

            if (i==products.size()-1){
                List<Product> second = new ArrayList<Product>(productsbyCategory.subList(0, limimt));
                System.out.println(second.size());
                if (second.size()==limimt){
                    viewInterface.updateListitemFeaturedWithLimit(second);
                }
            }
        }
    }

    @Override
    public void setListitemitemBestSellWithLimit(String category, List<Product> products, int limimt) {
        List<Product> productsbyCategory=new ArrayList<>();
        for (int i=0;i<products.size();i++){

            if (products.get(i).getProductCategory().equals(category)){
                productsbyCategory.add(products.get(i));
                System.out.println(products.get(i).getProductCategory());
            }

            if (i==products.size()-1){
                List<Product> second = new ArrayList<Product>(productsbyCategory.subList(0, limimt));
                System.out.println(second.size());
                if (second.size() == limimt){
                    viewInterface.updateListitemBestSellWithLimit(second);
                }
            }
        }
    }
}
