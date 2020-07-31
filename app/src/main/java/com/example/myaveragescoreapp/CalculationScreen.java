package com.example.myaveragescoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculationScreen extends AppCompatActivity {

    TextView text;
    TextView text2;
    Button buton1;
    Button buton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation_screen);


        text2 = (TextView)findViewById(R.id.title);
        buton1 = (Button) findViewById(R.id.rotate);
        buton2 = (Button) findViewById(R.id.cal);
        text2.setPaintFlags(text2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalculationScreen.this, menuscreen.class);
                startActivity(intent);
            }
        });
        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalculationScreen.this, MyCalulate.class);
                startActivity(intent);
            }
        });

    }
}