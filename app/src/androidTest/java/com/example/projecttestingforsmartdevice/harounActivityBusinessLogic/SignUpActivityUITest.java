package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic;

import com.example.projecttestingforsmartdevice.R;

import org.junit.Rule;
import org.junit.Test;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class SignUpActivityUITest {
    String name_rg="haroun taha";
    @Rule
    public ActivityTestRule<SignUpActivity> mainActivityActivityTestRule=new ActivityTestRule<>(SignUpActivity.class);

    @Test
    public void testTypeTextName() {
        // input text in edit text
        onView(withId(R.id.name_editText_rg)).perform(typeText(name_rg));
        //close keyboard
        Espresso.closeSoftKeyboard();
    }
}