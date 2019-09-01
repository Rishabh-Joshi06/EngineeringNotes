package com.example.engineeringnotes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class IT3 extends AppCompatActivity {
    private String listview_array[]={"computer networks","design and analysis of algorithm","software engineering","cyber ethics and law",
            "ism","nlp","soft computing","information security","data science","python"};
    ListView myList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it3);

        myList = (ListView) findViewById(R.id.listView);
        myList.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listview_array));
        helper.getListViewSize(myList);

    }
}