package com.example.ringlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private CircleView mCircleView ;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // mCircleView = (CircleView) findViewById(R.id.circleView);

        // mCircleView.setCircleProperties(500,300,250);

        // mCircleView.draw();

    }
}