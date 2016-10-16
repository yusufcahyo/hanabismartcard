package org.yeuristic.hanabismartnote.controller.component;

import org.yeuristic.hanabismartnote.controller.activity.MainActivity;
import org.yeuristic.hanabismartnote.controller.module.MainModule;
import org.yeuristic.hanabismartnote.view.page.MainPage;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ye on 10/16/2016.
 */

@Singleton
@Component(modules = { MainModule.class})
public interface MainComponent {
    MainPage providesMainPage();

    void inject(MainActivity mainActivity);
}
