package org.yeuristic.hanabismartnote;

import android.app.Application;
import android.content.Context;

/**
 * Created by ye on 10/16/2016.
 */

public class HanabiSmartNoteApplication extends Application {

    public static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;
    }
}
