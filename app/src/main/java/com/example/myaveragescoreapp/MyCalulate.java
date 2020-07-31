package com.example.myaveragescoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyCalulate extends AppCompatActivity {

    Button maths, art, sciences, life_orientaton, back;
    EditText num1;
    EditText num2;
    TextView results;
    float results_num;
    int number1, number2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_calulate);

        num1 = (EditText)findViewById(R.id.num1);
        num2  = (EditText)findViewById(R.id.num2);
        results = (TextView)findViewById(R.id.results);
        maths = (Button)findViewById(R.id.maths);
        art = (Button)findViewById(R.id.art);
        sciences = (Button) findViewById(R.id.sciences);
        life_orientaton = (Button) findViewById(R.id.life_orientation);
        back  = (Button)findViewById(R.id.hm);

        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                number1  = Integer.parseInt(num1.getText().toString());
                number2  = Integer.parseInt(num2.getText().toString());

                results_num = number1/number2;
                results.setText(String.valueOf(results_num));

            }
        });
        art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                number1  = Integer.parseInt(num1.getText().toString());
                number2  = Integer.parseInt(num2.getText().toString());

                results_num = number1/number2;
                results.setText(String.valueOf(results_num));

            }
        });
        sciences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                number1  = Integer.parseInt(num1.getText().toString());
                number2  = Integer.parseInt(num2.getText().toString());

                results_num = number1/number2;
                results.setText(String.valueOf(results_num));

            }
        });
        life_orientaton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1  = Integer.parseInt(num1.getText().toString());
                number2  = Integer.parseInt(num2.getText().toString());

                results_num = number1/number2;
                results.setText(String.valueOf(results_num));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyCalulate.this, menuscreen.class);
                startActivity(intent);
            }
        });








    }
}