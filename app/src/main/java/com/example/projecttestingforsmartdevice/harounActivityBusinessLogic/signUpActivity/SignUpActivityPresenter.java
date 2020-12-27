package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.signUpActivity;

import com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.favoritesActivity.FavoritesActivityViewInterface;

public class SignUpActivityPresenter implements SignUpActivityPresenterInterface {

    private  final  String regex=  "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
            "\\@" +
            "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
            "(" +
            "\\." +
            "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
            ")+";

    protected SignUpActivityViewInterface signUpActivityViewInterface;

    public SignUpActivityPresenter(SignUpActivityViewInterface signUpActivityViewInterface) {
        this.signUpActivityViewInterface = signUpActivityViewInterface;
    }

    @Override
    public boolean emailAndPasswordValidator(String email,String pass,String name) {
        return false;
    }

}
