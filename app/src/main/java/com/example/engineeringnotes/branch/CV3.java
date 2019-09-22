package com.example.engineeringnotes.branch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.engineeringnotes.R;
import com.example.engineeringnotes.helper;
import com.example.engineeringnotes.sub3.ASURVEY;
import com.example.engineeringnotes.sub3.ENVIRO1;
import com.example.engineeringnotes.sub3.FLUID2;
import com.example.engineeringnotes.sub3.GEO;
import com.example.engineeringnotes.sub3.STRDEDRAW;
import com.example.engineeringnotes.sub3.THEORT1;
import com.example.engineeringnotes.sub3.THEORY2;
import com.example.engineeringnotes.sub3.TRANSENGG;
import com.example.engineeringnotes.sub3.WATER;
import com.example.engineeringnotes.subject.ceal;
import com.example.engineeringnotes.subject.cn;
import com.example.engineeringnotes.subject.daaoa;
import com.example.engineeringnotes.subject.ds;
import com.example.engineeringnotes.subject.is;
import com.example.engineeringnotes.subject.ism;
import com.example.engineeringnotes.subject.nlp;
import com.example.engineeringnotes.subject.py;
import com.example.engineeringnotes.subject.se;
import com.example.engineeringnotes.subject.softcomp;

public class CV3  extends AppCompatActivity {
    private static final String TAG = "IT3";
    private String listview_array[]={"TRASPORTATION ENGG","ADVANCE SURVEYING","FLUID MECH.-2","STRUCTUR DESIGN AND DROWING-1(RCC)",

            "THEORY OF STRUCTURE-1","THEORY OF STRUCTURE-2","WATER RESOURCES & IRRIGATION ENGG","ENVIRONMETAL ENGG-1","GEO TECH ENGG-1"
    };
    ListView myList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv3);

        myList = (ListView) findViewById(R.id.listView);
        myList.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listview_array));

        helper.getListViewSize(myList);
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0)
                {

                    Log.i(TAG,"chla re cjhla0");
                    Intent intent=new Intent(CV3.this, TRANSENGG.class);
                    startActivity(intent);

                }
                else if (i==1)
                {
                    Intent intent=new Intent(getApplicationContext(), ASURVEY.class);
                    startActivity(intent);
                }
                else if (i==2)
                {
                    Intent intent=new Intent(getApplicationContext(), FLUID2.class);
                    startActivity(intent);
                }
                else if (i==3)
                {
                    Intent intent=new Intent(getApplicationContext(), STRDEDRAW.class);
                    startActivity(intent);
                }
                else if (i==4)
                {
                    Intent intent=new Intent(getApplicationContext(), THEORT1.class);
                    startActivity(intent);
                }
                else if (i==5)
                {
                    Intent intent=new Intent(getApplicationContext(), THEORY2.class);
                    startActivity(intent);
                }
                else if (i==6)
                {
                    Intent intent=new Intent(getApplicationContext(), WATER.class);
                    startActivity(intent);
                }
                else if (i==7)
                {
                    Intent intent=new Intent(getApplicationContext(), ENVIRO1.class);
                    startActivity(intent);
                }
                else if (i==8)
                {
                    Intent intent=new Intent(getApplicationContext(), GEO.class);
                    startActivity(intent);
                }

            }
        });
    }
}
