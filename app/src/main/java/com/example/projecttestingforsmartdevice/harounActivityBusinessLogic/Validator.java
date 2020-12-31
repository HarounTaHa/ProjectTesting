package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    private  final  String regex=  "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
            "\\@" +
            "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
            "(" +
            "\\." +
            "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
            ")+";

    public boolean emailValidator(String email){
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();

    }

    public boolean passwordValidator(String pass){

        return   pass.length() >= 6;
    }



    public Date calendarDateValidator() {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        return c.getTime();
    }
}
