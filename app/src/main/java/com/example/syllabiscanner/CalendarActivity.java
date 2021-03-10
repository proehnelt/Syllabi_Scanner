package com.example.syllabiscanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalendarActivity extends MainActivity {

    Button calBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);

        calBack = (Button) findViewById(R.id.calBack);
        calBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(CalendarActivity.this, MainActivity.class);
                CalendarActivity.this.startActivity(myIntent);
            }
        });
    }
}