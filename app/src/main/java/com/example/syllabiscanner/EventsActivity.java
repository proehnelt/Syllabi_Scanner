package com.example.syllabiscanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EventsActivity extends MainActivity {

    Button eventsBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        eventsBack = (Button) findViewById(R.id.eventsBack);
        eventsBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(EventsActivity.this, MainActivity.class);
                EventsActivity.this.startActivity(myIntent);
            }
        });
    }
}