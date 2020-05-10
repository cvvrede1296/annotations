package com.rastadrian.aaintegration;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Main Activity Test Suite.
 * Created on 1/9/16.
 *
 * @author Adrian Pena
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mActivity;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
        // Injecting the Instrumentation instance is required
        // for your test to run with AndroidJUnitRunner.
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
        mActivity = getActivity();
    }

    @Test
    public void onHideButtonClick_descriptionTextShouldBeInvisible() throws Exception {
        TextView descriptionText = (TextView) mActivity.findViewById(R.id.tv_description);

        //at first the description is visible
        assertEquals(View.VISIBLE, descriptionText.getVisibility());
        //click the hide button
        onView(withId(R.id.btn_hide)).perform(click());
        //the description is not visible anymore.
        assertEquals(View.INVISIBLE, descriptionText.getVisibility());
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }
}