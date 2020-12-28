package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.signUpActivity;

import com.example.projecttestingforsmartdevice.models.User;

public interface SignUpActivityPresenterInterface {
     boolean emailAndPasswordValidator(User user, String email, String pass, String name);
}
