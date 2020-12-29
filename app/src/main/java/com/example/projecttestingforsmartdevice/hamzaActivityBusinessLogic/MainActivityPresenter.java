package com.example.projecttestingforsmartdevice.hamzaActivityBusinessLogic;

public class MainActivityPresenter implements MainActivityPresenterInterface{

    private MainActivityViewInterface view;

    protected MainActivityPresenter(MainActivityViewInterface mainActivityViewInterface){
        this.view = mainActivityViewInterface;
    }


    @Override
    public void setPlusCount(int indexLength, int maxLength) {
        int count = Integer.valueOf(maxLength-indexLength);
        view.updatePlusCount(count);
    }

    @Override
    public void setMinusCount(int indexLength, int maxLength) {
        int count = Integer.valueOf(maxLength=indexLength);
        view.updateMinusCount(count);
    }
}
