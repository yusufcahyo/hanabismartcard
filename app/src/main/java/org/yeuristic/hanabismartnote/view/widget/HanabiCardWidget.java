package org.yeuristic.hanabismartnote.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import org.yeuristic.hanabismartnote.R;

/**
 * Created by ye on 10/16/2016.
 */

public class HanabiCardWidget extends RelativeLayout {
    public HanabiCardWidget(Context context) {
        this(context, null);
    }

    public HanabiCardWidget(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HanabiCardWidget(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.widget_hanabi_card, this);
    }

    @Override
    protected void onFinishInflate() {

    }
}
