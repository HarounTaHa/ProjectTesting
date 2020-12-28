package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.signUpActivity;

import com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.favoritesActivity.FavoritesActivityViewInterface;
import com.example.projecttestingforsmartdevice.models.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public boolean emailAndPasswordValidator(User user,String email,String pass,String name) {
        // implementation
        Pattern pattern=Pattern.compile(regex);
           Matcher matcher = pattern.matcher(email);
           if(matcher.matches()){
               if(pass.length()>6)
                   user.setUserName(name);
                   user.setUserEmail(email);
                   user.setPassword(pass);
                   signUpActivityViewInterface.addUser(user);
                   return true ;
           }
           return  false;
    }

}
