package org.yeuristic.hanabismartnote.controller.module;

import org.yeuristic.hanabismartnote.HanabiSmartNoteApplication;
import org.yeuristic.hanabismartnote.view.page.MainPage;
import org.yeuristic.hanabismartnote.view.page.implementation.MainPageImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ye on 10/16/2016.
 */

@Module
public class MainModule {
    @Provides
    @Singleton
    MainPage providesMainPage() {
        return new MainPageImpl(HanabiSmartNoteApplication.sContext);
    }

}
