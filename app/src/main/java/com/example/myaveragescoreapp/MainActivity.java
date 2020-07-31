package com.example.myaveragescoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text;
    TextView text2;
    EditText editText;
    Button button;
    String visitor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textView);
        text2 = (TextView) findViewById(R.id.text2);
        editText = (EditText) findViewById(R.id.name);
        button = (Button) findViewById(R.id.next);




        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                String visitor;
                Intent intent = new Intent(MainActivity.this, menuscreen.class);
                startActivity(intent);


            }

        });
    }
}