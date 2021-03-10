package com.example.syllabiscanner;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;


public class MainActivity extends Activity {
    Button b_upload;
    Button b_courses;
    Button b_events;
    Button b_cal;

   // CourseList courses = new CourseList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_upload = (Button) findViewById(R.id.b_upload);
        b_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, UploadActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        b_courses = (Button) findViewById(R.id.b_courses);
        b_courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, CourseActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        b_events = (Button) findViewById(R.id.b_events);
        b_events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, EventsActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        b_cal = (Button) findViewById(R.id.b_cal);
        b_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, CalendarActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
    }




}