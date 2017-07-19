package com.example.cyy.viewproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.cyy.viewproject.event_dispatch.EventDispatchActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_dispatch_event = (Button) findViewById(R.id.btn_dispatch_event);
        btn_dispatch_event.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_dispatch_event:
                Intent intent = new Intent(this, EventDispatchActivity.class);
                startActivity(intent);
                break;
        }
    }
}
