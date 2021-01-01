package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic;

import com.example.projecttestingforsmartdevice.R;

import org.junit.Rule;
import org.junit.Test;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class HarounActivityMatcherTextUITest {
    String text="Haroun Welcome";
    @Rule
    public ActivityTestRule<HarounActivity1> mainActivityActivityTestRule=new ActivityTestRule<>(HarounActivity1.class);

    @Test
    public void textMatcherInActivity() {
        onView(withId(R.id.textView_haroun)).check(matches(withText(text)));
    }
}