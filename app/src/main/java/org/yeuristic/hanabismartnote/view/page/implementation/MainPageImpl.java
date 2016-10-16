package org.yeuristic.hanabismartnote.view.page.implementation;

import android.content.Context;
import android.support.annotation.LayoutRes;

import org.yeuristic.hanabismartnote.R;
import org.yeuristic.hanabismartnote.view.page.BasePage;
import org.yeuristic.hanabismartnote.view.page.MainPage;

/**
 * Created by ye on 10/16/2016.
 */

public class MainPageImpl extends BasePage implements MainPage {

    public MainPageImpl(Context context) {
        super(context);
    }

    @Override
    protected @LayoutRes int getLayoutRes() {
        return R.layout.activity_main;
    }
}
