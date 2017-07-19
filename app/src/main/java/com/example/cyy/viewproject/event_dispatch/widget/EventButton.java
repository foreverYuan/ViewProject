package com.example.cyy.viewproject.event_dispatch.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;
import com.example.cyy.viewproject.tools.Utils;

/**
 * Created by cyy on 2017/7/19.
 */

public class EventButton extends TextView {

    public EventButton(Context context) {
        super(context);
    }

    public EventButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 分发事件
     * @param event
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e(Utils.EVENT_TAG, "EventButton -----> " + Utils.actionToStr(event.getAction()) + " -----> dispatchTouchEvent");
        return super.dispatchTouchEvent(event);
    }

    /**
     * 处理事件
     * @param event
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(Utils.EVENT_TAG, "EventButton -----> " + Utils.actionToStr(event.getAction()) + " -----> onTouchEvent");
        return true;
    }
}
