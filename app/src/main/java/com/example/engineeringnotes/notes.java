package com.example.engineeringnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class notes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        Spinner myspinner=(Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> myadapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,getResources()
                .getStringArray(R.array.branch));
        myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(myadapter);

        Spinner myspinner1=(Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<String> myadapter1= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,getResources()
                .getStringArray(R.array.year));
        myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner1.setAdapter(myadapter1);

    }
}