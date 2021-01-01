package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic;

import com.example.projecttestingforsmartdevice.R;

import org.junit.Rule;
import org.junit.Test;

import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class HarounActivityButtonUITest {
    @Rule
    public ActivityTestRule<HarounActivity1> mainActivityActivityTestRule=new ActivityTestRule<>(HarounActivity1.class);

    @Test
    public void testButtonClick() {
        onView(withId(R.id.btnProfile)).perform(click());
    }
}