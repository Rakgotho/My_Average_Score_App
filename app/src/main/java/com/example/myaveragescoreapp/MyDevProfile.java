package com.example.myaveragescoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MyDevProfile extends AppCompatActivity {

    ListView list;
    TextView text;
    Button back;

    final int[] contact = {R.drawable.user, R.drawable.phone, R.drawable.mail, R.drawable.twitter, R.drawable.linkedin};
    final String[] contactDetails = {"Abram Rakgotho","0824553214","215031393@mycput.ac.za","@Rakgotho", "AbramK Rakgotho"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dev_profile);

        list = (ListView) findViewById(R.id.listView);
        text = (TextView) findViewById(R.id.detail);
        text.setPaintFlags(text.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        back = (Button) findViewById(R.id.home);
        MyAdapter adap = new MyAdapter(MyDevProfile.this, contactDetails,contact);
        list.setAdapter(adap);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent  = new Intent(MyDevProfile.this, menuscreen.class);
                startActivity(intent);
            }
        });
    }
}