package com.example.projecttestingforsmartdevice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestBasilMethod {


    public Boolean isEmailAddress(String email) {
        boolean stricterFilter = true;
        String stricterFilterString = "[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}";
        String laxString = ".+@.+\\.[A-Za-z]{2}[A-Za-z]*";
        String emailRegex = stricterFilter ? stricterFilterString : laxString;
        Pattern p = Pattern.compile(emailRegex);
        Matcher regMatcher = p.matcher(email);
        return regMatcher.matches();
    }
}
