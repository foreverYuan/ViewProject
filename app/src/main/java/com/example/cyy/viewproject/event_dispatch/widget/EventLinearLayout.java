package com.example.cyy.viewproject.event_dispatch.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.example.cyy.viewproject.tools.Utils;

/**
 * Created by cyy on 2017/7/19.
 */

public class EventLinearLayout extends LinearLayout {
    public EventLinearLayout(Context context) {
        super(context);
    }

    public EventLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 分发事件
     * @param ev
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(Utils.EVENT_TAG, "EventLinearLayout -----> " + Utils.actionToStr(ev.getAction()) + " -----> dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    /**
     * 拦截事件
     * @param ev
     * @return
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e(Utils.EVENT_TAG, "EventLinearLayout -----> " + Utils.actionToStr(ev.getAction()) + " -----> onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
    }

    /**
     * 处理事件
     * @param event
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(Utils.EVENT_TAG, "EventLinearLayout -----> " + Utils.actionToStr(event.getAction()) + " -----> onTouchEvent");
        return true;
    }
}
