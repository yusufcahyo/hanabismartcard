package org.yeuristic.hanabismartnote.view.page;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by ye on 10/16/2016.
 */

public abstract class BasePage implements Page{

    private Context mContext;
    private View mRootView;

    public BasePage(Context context) {
        mContext = context;
        mRootView = LayoutInflater.from(context).inflate(getLayoutRes(), null);
    }

    protected abstract @LayoutRes int getLayoutRes();
    public final View getView() {
        return mRootView;
    }
}
