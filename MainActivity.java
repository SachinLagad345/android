package com.example.clicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView first,fiWay,second,seWay,third,thWay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = findViewById(R.id.tvFirst);
        fiWay = findViewById(R.id.tvFiWay);
        second = findViewById(R.id.tvSecond);
       seWay = findViewById(R.id.tvSeWay);
        third = findViewById(R.id.tvThird);
        thWay = findViewById(R.id.tvThWay);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Chaitanya laughing Ha Ha Ha ", Toast.LENGTH_SHORT).show();
            }
        });

        fiWay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Sachin laughing By Krishnas mercy", Toast.LENGTH_SHORT).show();
            }
        });

        second.setOnClickListener(this);
        seWay.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch(view.getId())
        {
            case R.id.tvSecond:
                Toast.makeText(this, "Using interface onclick and switch case", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvSeWay:
                Toast.makeText(this, "Passed view and in case getId of view", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void Third(View view) {
        Toast.makeText(this, "Using onclick in xml and making mmethod", Toast.LENGTH_SHORT).show();
    }

    public void ThWay(View view) {
        Toast.makeText(this, "Toast called in method", Toast.LENGTH_SHORT).show();
    }
}