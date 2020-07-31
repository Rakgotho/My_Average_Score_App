package com.example.myaveragescoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class menuscreen extends AppCompatActivity {
    TextView text;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menusreen);

        text = (TextView) findViewById(R.id.textView);
        btn1 = (Button) findViewById(R.id.home);
        btn2 = (Button) findViewById(R.id.calculation);
        btn3 = (Button) findViewById(R.id.about);
        btn4 = (Button) findViewById(R.id.profile);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuscreen.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuscreen.this, MyDevProfile.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  tent = new Intent(menuscreen.this, AboutMe.class);
                startActivity(tent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(menuscreen.this, CalculationScreen.class);
                startActivity(intent);
            }
        });

    }
}