package com.example.syllabiscanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UploadActivity extends MainActivity {

    Button uploadBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        uploadBack = (Button) findViewById(R.id.uploadBack);
        uploadBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(UploadActivity.this, MainActivity.class);
                UploadActivity.this.startActivity(myIntent);
            }
        });
    }
}