package com.example.engineeringnotes.branch;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.engineeringnotes.R;
import com.example.engineeringnotes.helper;
import com.example.engineeringnotes.subcs2.CGRAPHIC;
import com.example.engineeringnotes.subcs2.COMARCHI;
import com.example.engineeringnotes.subcs2.DACOM;
import com.example.engineeringnotes.subcs2.DBMS;
import com.example.engineeringnotes.subcs2.DCMATH;
import com.example.engineeringnotes.subcs2.DIGITALE;
import com.example.engineeringnotes.subcs2.DSTR;
import com.example.engineeringnotes.subcs2.MATH3;
import com.example.engineeringnotes.subcs2.MICRO;
import com.example.engineeringnotes.subcs2.OOPS;
import com.example.engineeringnotes.subcs2.OS;
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

public class CS2 extends AppCompatActivity {
    private static final String TAG = "IT3";
    private String listview_array[]={"DISCRETE MATHEMATICS","DATA STRUCTURE","COMPUTER ARCHITECTURE & ORGANIZATION",
            "OBJECT ORIENTED TECCHNOLOGY","MICRO PROCESSOR & INTERFACING","DIGITAL ELECTRONICS",
     "ENGINEERING MATHEMATICS-3 ","COMPUTER GRAPHICS & MULTIMEDIA","DATA COMMUNICATION","DBMS","OPERATING SYSTEMS"};
    ListView myList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs2);

        myList = (ListView) findViewById(R.id.listView);
        myList.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listview_array));

        helper.getListViewSize(myList);
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0)
                {

                    Log.i(TAG,"chla re cjhla0");
                    Intent intent=new Intent(CS2.this, DCMATH.class);
                    startActivity(intent);

                }
                else if (i==1)
                {
                    Intent intent=new Intent(getApplicationContext(), DSTR.class);
                    startActivity(intent);
                }
                else if (i==2)
                {
                    Intent intent=new Intent(getApplicationContext(), COMARCHI.class);
                    startActivity(intent);
                }
                else if (i==3)
                {
                    Intent intent=new Intent(getApplicationContext(), OOPS.class);
                    startActivity(intent);
                }
                else if (i==4)
                {
                    Intent intent=new Intent(getApplicationContext(), MICRO.class);
                    startActivity(intent);
                }
                else if (i==5)
                {
                    Intent intent=new Intent(getApplicationContext(), DIGITALE.class);
                    startActivity(intent);
                }
                else if (i==6)
                {
                    Intent intent=new Intent(getApplicationContext(), MATH3.class);
                    startActivity(intent);
                }
                else if (i==7)
                {
                    Intent intent=new Intent(getApplicationContext(), CGRAPHIC.class);
                    startActivity(intent);
                }
                else if (i==8)
                {
                    Intent intent=new Intent(getApplicationContext(), DACOM.class);
                    startActivity(intent);
                }


                else if (i==9)
                {
                    Intent intent=new Intent(view.getContext(), DBMS.class);
                    startActivity(intent);
                    Log.i(TAG,"chl gya re bappa");
                }
                else if (i==10)
                {
                    Intent intent=new Intent(getApplicationContext(), OS.class);
                    startActivity(intent);
                }

            }
        });
    }
}
