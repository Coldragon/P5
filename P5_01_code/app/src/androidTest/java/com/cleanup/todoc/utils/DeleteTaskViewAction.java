package com.cleanup.todoc.utils;

import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;

import android.view.View;

import com.cleanup.todoc.R;

import org.hamcrest.Matcher;

public class DeleteTaskViewAction implements ViewAction {
    @Override
    public Matcher<View> getConstraints() {
        return null;
    }

    @Override
    public String getDescription() {
        return "Click on specific button";
    }

    @Override
    public void perform(UiController uiController, View view) {
        View button = view.findViewById(R.id.img_delete);
        button.performClick();
    }
}