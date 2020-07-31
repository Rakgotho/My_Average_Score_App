package com.example.myaveragescoreapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MyAdapter extends ArrayAdapter<String> {

    String[] contactDetails;
    int[] contacts;
    Context context;
    public MyAdapter( Context context, String[] contactDetails, int[] contacts)
    {
        super(context, R.layout.list_view);
        this.contactDetails = contactDetails;
        this.contacts = contacts;
        this.context = context;

    }

    @Override
    public int getCount()
    {
        return contactDetails.length;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent)
    {
        ImageView image_view;
        TextView text_view;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.list_view, parent,false);
        image_view = (ImageView) convertView.findViewById(R.id.imageView);
        text_view = (TextView) convertView.findViewById(R.id.textView);

        image_view.setImageResource(contacts[position]);
        text_view.setText(contactDetails[position]);


        return convertView;
    }
}
