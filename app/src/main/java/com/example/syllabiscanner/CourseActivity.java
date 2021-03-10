package com.example.syllabiscanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.syllabiscanner.MainActivity;
import com.example.syllabiscanner.R;

public class CourseActivity extends MainActivity{

    Button coursesBack;
    Button create;
    TextView cList;
    Button edit;
    Button prior;
    Button delete;
    CourseList courses = new CourseList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        coursesBack = (Button) findViewById(R.id.coursesBack);
        coursesBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(CourseActivity.this, MainActivity.class);
                CourseActivity.this.startActivity(myIntent);
            }
        });

        create = (Button) findViewById(R.id.create);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(CourseActivity.this, CreateCourseActivity.class);
                CourseActivity.this.startActivity(myIntent);
            }
        });


       // CourseList c1 = new CourseList();
        cList = (TextView) findViewById(R.id.cList);

       // for (int i = c.getSize() - 1; i >= 0; i--)
       // {
        if (courses.getSize() > 0)
        {
            cList.setText(courses.getName(0));
        }

       // }
    }
}
