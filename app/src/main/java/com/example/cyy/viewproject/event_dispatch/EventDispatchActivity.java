package com.example.cyy.viewproject.event_dispatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import com.example.cyy.viewproject.R;
import com.example.cyy.viewproject.event_dispatch.widget.EventButton;
import com.example.cyy.viewproject.tools.Utils;

/**
 * 事件分发
 */
public class EventDispatchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_dispatch);
        EventButton btn = (EventButton) findViewById(R.id.btn_event);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(EventDispatchActivity.this, "嘿嘿嘿", Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(Utils.EVENT_TAG, "EventDispatchActivity -----> " + Utils.actionToStr(ev.getAction()) + " -----> dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(Utils.EVENT_TAG, "EventDispatchActivity -----> " + Utils.actionToStr(event.getAction()) + " -----> onTouchEvent");
        return true;
    }
}
