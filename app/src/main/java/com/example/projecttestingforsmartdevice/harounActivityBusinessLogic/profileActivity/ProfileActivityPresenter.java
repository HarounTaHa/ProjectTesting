package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.profileActivity;

import com.example.projecttestingforsmartdevice.models.User;

public class ProfileActivityPresenter implements ProfileActivityPresenterInterface{

    ProfileActivityViewInterface profileActivityViewInterface;

    public ProfileActivityPresenter(ProfileActivityViewInterface profileActivityViewInterface) {
        this.profileActivityViewInterface = profileActivityViewInterface;
    }

    @Override
    public void getUser(User user) {
        if(user!=null){
            profileActivityViewInterface.displayDetailsUser(user);
        }

    }
}
