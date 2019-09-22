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
import com.example.engineeringnotes.subCV2.BUILD;
import com.example.engineeringnotes.subCV2.CONSMAT;
import com.example.engineeringnotes.subCV2.CONSTECH;
import com.example.engineeringnotes.subCV2.ENERGYE;
import com.example.engineeringnotes.subCV2.GEOLOGY;
import com.example.engineeringnotes.subCV2.SHISTRYA;
import com.example.engineeringnotes.subCV2.STRANA1;
import com.example.engineeringnotes.subCV2.STRENTH;
import com.example.engineeringnotes.subCV2.SURVEY;
import com.example.engineeringnotes.subCV2.SWLAB;
import com.example.engineeringnotes.subCV2.TRANSEGG1;
import com.example.engineeringnotes.subcs2.MATH3;
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

public class CV2 extends AppCompatActivity {
    private static final String TAG = "IT3";
    private String listview_array[]={"MATHEMATICS-3","CONSTRUCTION MATERIALS","SURVEYING","BUILDING PLANNING & ARCHITECTURE",
            "STRENTH OF MATERIAL ","STUDY OF HISTORICAL & ANCIENT CIVIL ENGINEERING PRACTICES",
            "ENERGY & ENVIRONMENTAL ENGINEERING","CONSTRUCTION TECHNOLOGY","STRUCTURAL ANALYSIS-1","TRANSPORTATION ENGINEERING-1",
            "ENGINEERING GEOLOGY & REMOTE SENSING","SOFTWARE LAB(OUTO CAD)"};
    ListView myList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv2);

        myList = (ListView) findViewById(R.id.listView);
        myList.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listview_array));

        helper.getListViewSize(myList);
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0)
                {

                    Log.i(TAG,"chla re cjhla0");
                    Intent intent=new Intent(CV2.this, MATH3.class);
                    startActivity(intent);

                }
                else if (i==1)
                {
                    Intent intent=new Intent(getApplicationContext(), CONSMAT.class);
                    startActivity(intent);
                }
                else if (i==2)
                {
                    Intent intent=new Intent(getApplicationContext(), SURVEY.class);
                    startActivity(intent);
                }
                else if (i==3)
                {
                    Intent intent=new Intent(getApplicationContext(), BUILD.class);
                    startActivity(intent);
                }
                else if (i==4)
                {
                    Intent intent=new Intent(getApplicationContext(), STRENTH.class);
                    startActivity(intent);
                }
                else if (i==5)
                {
                    Intent intent=new Intent(getApplicationContext(), SHISTRYA.class);
                    startActivity(intent);
                }
                else if (i==6)
                {
                    Intent intent=new Intent(getApplicationContext(), ENERGYE.class);
                    startActivity(intent);
                }
                else if (i==7)
                {
                    Intent intent=new Intent(getApplicationContext(), CONSTECH.class);
                    startActivity(intent);
                }
                else if (i==8)
                {
                    Intent intent=new Intent(getApplicationContext(), STRANA1.class);
                    startActivity(intent);
                }
                else if (i==9)
                {
                    Intent intent=new Intent(view.getContext(), TRANSEGG1.class);
                    startActivity(intent);
                    Log.i(TAG,"chl gya re bappa");
                }

                else if (i==10)
                {
                    Intent intent=new Intent(getApplicationContext(), GEOLOGY.class);
                    startActivity(intent);
                }
                else if (i==11)
                {
                    Intent intent=new Intent(view.getContext(), SWLAB.class);
                    startActivity(intent);
                    Log.i(TAG,"chl gya re bappa");
                }

            }
        });
    }
}
