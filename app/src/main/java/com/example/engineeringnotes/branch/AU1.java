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
import com.example.engineeringnotes.sub1.BCAE;
import com.example.engineeringnotes.sub1.BCVE;
import com.example.engineeringnotes.sub1.BEEE;
import com.example.engineeringnotes.sub1.BME;
import com.example.engineeringnotes.sub1.CHEMY;
import com.example.engineeringnotes.sub1.CP1;
import com.example.engineeringnotes.sub1.DPRES;
import com.example.engineeringnotes.sub1.EGRAPH;
import com.example.engineeringnotes.sub1.ENVIRONMENT;
import com.example.engineeringnotes.sub1.HST;
import com.example.engineeringnotes.sub1.MANUF;
import com.example.engineeringnotes.sub1.MATH1;
import com.example.engineeringnotes.sub1.MATH2;
import com.example.engineeringnotes.sub1.PHYS;
import com.example.engineeringnotes.sub1.SKILL;
import com.example.engineeringnotes.sub1.WORKS;
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

public class AU1   extends AppCompatActivity {
    private static final String TAG = "IT3";
    private String listview_array[]={"ENGINEERING MATHEMATICS-1","ENGINEERING MATHEMATICS-2","ENGINEERING CHEMISTRY"
            ,"ENGINEERING PHYSICS","BASIC CIVIL ENGINEERING",
            "ENGINEERING GRAPHICS ","BASIC MECHANICAL ENGINEERING","BASIC ELECTRICAL AND ELECTRONICS ENGINEERING",
            "BASIC COMPUTER ENGINEERING",
            "COMPUTER PROGRAMMING IN C","DOCUMENTATION AND PRESENTATION","ENGINEERING WORKSHOP","HISTORY OF SCIENCE AND TECHNOLOGY",
            "ENVIRONMENTAL SCIENCE","COMMUNICATION SKILLS","MANUFACTURING PRACTICES"};
    ListView myList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_au1);

        myList = (ListView) findViewById(R.id.listView);
        myList.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listview_array));

        helper.getListViewSize(myList);
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0)
                {

                    Log.i(TAG,"chla re cjhla0");
                    Intent intent=new Intent(AU1.this, MATH1.class);
                    startActivity(intent);

                }
                else if (i==1)
                {
                    Intent intent=new Intent(getApplicationContext(), MATH2.class);
                    startActivity(intent);
                }
                else if (i==2)
                {
                    Intent intent=new Intent(getApplicationContext(), CHEMY.class);
                    startActivity(intent);
                }
                else if (i==3)
                {
                    Intent intent=new Intent(getApplicationContext(), PHYS.class);
                    startActivity(intent);
                }
                else if (i==4)
                {
                    Intent intent=new Intent(getApplicationContext(), BCVE.class);
                    startActivity(intent);
                }
                else if (i==5)
                {
                    Intent intent=new Intent(getApplicationContext(), EGRAPH.class);
                    startActivity(intent);
                }
                else if (i==6)
                {
                    Intent intent=new Intent(getApplicationContext(), BME.class);
                    startActivity(intent);
                }
                else if (i==7)
                {
                    Intent intent=new Intent(getApplicationContext(), BEEE.class);
                    startActivity(intent);
                }
                else if (i==8)
                {
                    Intent intent=new Intent(getApplicationContext(), BCAE.class);
                    startActivity(intent);
                }
                else if (i==9)
                {
                    Intent intent=new Intent(view.getContext(), CP1.class);
                    startActivity(intent);


                }

                else if (i==10)
                {
                    Intent intent=new Intent(getApplicationContext(), DPRES.class);
                    startActivity(intent);
                }
                else if (i==11)
                {
                    Intent intent=new Intent(view.getContext(), WORKS.class);
                    startActivity(intent);


                }
                else if (i==12)
                {
                    Intent intent=new Intent(getApplicationContext(), HST.class);
                    startActivity(intent);
                }

                else if (i==13)
                {
                    Intent intent=new Intent(view.getContext(), ENVIRONMENT.class);
                    startActivity(intent);

                    Log.i(TAG,"chl gya re bappa");
                }
                else if (i==14)
                {
                    Intent intent=new Intent(view.getContext(), SKILL.class);
                    startActivity(intent);


                }
                else if (i==15)
                {
                    Intent intent=new Intent(getApplicationContext(), MANUF.class);
                    startActivity(intent);
                }

            }
        });
    }
}