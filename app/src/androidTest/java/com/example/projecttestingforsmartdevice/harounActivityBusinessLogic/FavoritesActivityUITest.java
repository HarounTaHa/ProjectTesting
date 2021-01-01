package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic;

import com.example.projecttestingforsmartdevice.R;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.rule.ActivityTestRule;
import androidx.recyclerview.widget.RecyclerView;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class FavoritesActivityUITest {

    RecyclerView recyclerView;
    int itemPosition;

    @Rule
    public ActivityTestRule<FavoritesActivity> mainActivityActivityTestRule=new ActivityTestRule<>(FavoritesActivity.class);

    @Before
    public void setUp() throws Exception {
        recyclerView=mainActivityActivityTestRule.getActivity().findViewById(R.id.recyclerGridLayout);
        itemPosition=recyclerView.getAdapter().getItemCount();
    }
    @Test
    public void testRecyclerScroll() {
        onView(withId(R.id.recyclerGridLayout)).perform(RecyclerViewActions.scrollToPosition(itemPosition-1));

    }
}