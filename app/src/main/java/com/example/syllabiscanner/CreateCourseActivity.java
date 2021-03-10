package com.example.syllabiscanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;


public class CreateCourseActivity extends CourseActivity {

    Button b_save;
    Button back;
    EditText name;
    TextView nameTitle;
    TextView pTitle;
    ToggleButton pToggle;

   // CourseActivity courseActivity = new CourseActivity();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newcourse);

        b_save = (Button) findViewById(R.id.b_save);
        b_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = (EditText) findViewById(R.id.name);
                String nameVal = name.getText().toString();

                pToggle = (ToggleButton) findViewById(R.id.pToggle);
                pToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked)
                        {
                            Course newCourse = new Course(1, nameVal, true);
                            courses.insert(newCourse);
                        }
                        else
                        {
                            Course newCourse = new Course(1, nameVal, false);
                            courses.insert(newCourse);
                        }


                    }
                });
                finish();
            }
        });


        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
/*
                name = (EditText) findViewById(R.id.name);
                String nameVal = name.getText().toString();

                pToggle = (ToggleButton) findViewById(R.id.pToggle);
                pToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked)
                        {
                            Course c = new Course(1, nameVal, true);
                        }
                        else
                        {
                            Course c = new Course(1, nameVal, false);
                        }


                    }
                });
*/