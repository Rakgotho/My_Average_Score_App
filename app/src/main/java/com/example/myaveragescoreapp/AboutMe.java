package com.example.myaveragescoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TextView text2;
        TextView text;
        ImageView selfie;
        Button back;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        selfie = (ImageView) findViewById(R.id.self);
        selfie.setImageResource(R.drawable.myself);
        text = (TextView) findViewById(R.id.story);
        text2 = (TextView) findViewById(R.id.profile);
        back = (Button) findViewById(R.id.menu);

        text2.setPaintFlags(text2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AboutMe.this, menuscreen.class);
                startActivity(intent);

            }
        });

    }
}