package org.yeuristic.hanabismartnote.controller.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.yeuristic.hanabismartnote.controller.component.DaggerMainComponent;
import org.yeuristic.hanabismartnote.controller.component.MainComponent;
import org.yeuristic.hanabismartnote.view.page.MainPage;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private final MainComponent mMainComponent;

    @Inject
    MainPage mMainPage;

    public MainActivity() {
        mMainComponent = DaggerMainComponent.builder().build();
        mMainComponent.inject(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(mMainPage.getView());
    }
}
