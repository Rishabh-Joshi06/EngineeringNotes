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
import com.example.engineeringnotes.sub3.AUTDESIGN;
import com.example.engineeringnotes.sub3.AUTELENICS;
import com.example.engineeringnotes.sub3.AUTOMOTIVE;
import com.example.engineeringnotes.sub3.ENTER;
import com.example.engineeringnotes.sub3.LMV;
import com.example.engineeringnotes.sub3.METROLOGY;
import com.example.engineeringnotes.sub3.OPERRE;
import com.example.engineeringnotes.sub3.TOAL;
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

public class AU3 extends AppCompatActivity {
    private static final String TAG = "IT3";
    private String listview_array[]={"ENTREPRENEURSHIP AND MANAGEMENT CONCEPT","OPERATING REASERCH AND SUPPLY",
            "METROLOGY MEASUREMENT & CONTROL",
            "MACHINE COMPONENT DESIGN",
            "AUTOMOTIVE TRANSMISSION ","LMV DRIVING PRACTICE","TOTAL QUALITY MANAGEMENT AND SQC",
            "AUTOMOTIVE ELECTRICAL AND ELECTRONICS","AUTOMOTIVE DESIGN AND ASSEMBLY DRAWING"};
    ListView myList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_au3);

        myList = (ListView) findViewById(R.id.listView);
        myList.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listview_array));

        helper.getListViewSize(myList);
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0)
                {

                    Log.i(TAG,"chla re cjhla0");
                    Intent intent=new Intent(AU3.this, ENTER.class);
                    startActivity(intent);

                }
                else if (i==1)
                {
                    Intent intent=new Intent(getApplicationContext(), OPERRE.class);
                    startActivity(intent);
                }
                else if (i==2)
                {
                    Intent intent=new Intent(getApplicationContext(), METROLOGY.class);
                    startActivity(intent);
                }
                else if (i==3)
                {
                    Intent intent=new Intent(getApplicationContext(), AUTOMOTIVE.class);
                    startActivity(intent);
                }
                else if (i==4)
                {
                    Intent intent=new Intent(getApplicationContext(), LMV.class);
                    startActivity(intent);
                }
                else if (i==5)
                {
                    Intent intent=new Intent(getApplicationContext(), TOAL.class);
                    startActivity(intent);
                }
                else if (i==6)
                {
                    Intent intent=new Intent(getApplicationContext(), AUTELENICS.class);
                    startActivity(intent);
                }
                else if (i==7)
                {
                    Intent intent=new Intent(getApplicationContext(), AUTDESIGN.class);
                    startActivity(intent);
                }


            }
        });
    }
}
