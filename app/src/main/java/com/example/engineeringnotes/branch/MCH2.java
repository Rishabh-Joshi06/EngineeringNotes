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
import com.example.engineeringnotes.sub1.MANUF;
import com.example.engineeringnotes.subCV2.CONSTECH;
import com.example.engineeringnotes.subCV2.ENERGYE;
import com.example.engineeringnotes.subCV2.FLUIDMECHANICS;
import com.example.engineeringnotes.subCV2.INSTRUMENT;
import com.example.engineeringnotes.subCV2.MACHENICS;
import com.example.engineeringnotes.subCV2.MANUTECH;
import com.example.engineeringnotes.subCV2.MATERIALTECH;
import com.example.engineeringnotes.subCV2.STRENTH;
import com.example.engineeringnotes.subCV2.SWLAB;
import com.example.engineeringnotes.subCV2.THEMODYNAMICS;
import com.example.engineeringnotes.subCV2.THERMALLAB;
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

public class MCH2  extends AppCompatActivity {
    private static final String TAG = "IT3";
    private String listview_array[]={"MATHEMATICS-3","STRENTH OF MATERIAL ","MANUFACTURING PROCESS","INSTRUMENTATION & CONTROL",
            "THEORY OF MACHINES", "FLUID MECHANICS"
            ,"MANUFACTURING TECHNOLOGY","ENERGY & ENVIRONMENTAL ENGINEERING","CONSTRUCTION TECHNOLOGY",
          "SOFTWARE LAB","THERMODYNAMICS"," MATERIALS TECHNOLOGY","THERMAL ENGG LAB"};
    ListView myList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mch2);

        myList = (ListView) findViewById(R.id.listView);
        myList.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listview_array));

        helper.getListViewSize(myList);
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0)
                {

                    Log.i(TAG,"chla re cjhla0");
                    Intent intent=new Intent(MCH2.this, MATH3.class);
                    startActivity(intent);

                }
                else if (i==1)
                {
                    Intent intent=new Intent(getApplicationContext(), STRENTH.class);
                    startActivity(intent);
                }
                else if (i==2)
                {
                    Intent intent=new Intent(getApplicationContext(), MANUF.class);
                    startActivity(intent);
                }
                else if (i==3)
                {
                    Intent intent=new Intent(getApplicationContext(), INSTRUMENT.class);
                    startActivity(intent);
                }
                else if (i==4)
                {
                    Intent intent=new Intent(getApplicationContext(), MACHENICS.class);
                    startActivity(intent);
                }
                else if (i==5)
                {
                    Intent intent=new Intent(getApplicationContext(), FLUIDMECHANICS.class);
                    startActivity(intent);
                }
                else if (i==6)
                {
                    Intent intent=new Intent(getApplicationContext(), MANUTECH.class);
                    startActivity(intent);
                }
                else if (i==7)
                {
                    Intent intent=new Intent(getApplicationContext(), ENERGYE.class);
                    startActivity(intent);
                }
                else if (i==8)
                {
                    Intent intent=new Intent(getApplicationContext(), CONSTECH.class);
                    startActivity(intent);
                }
                else if (i==9)
                {
                    Intent intent=new Intent(view.getContext(), SWLAB.class);
                    startActivity(intent);
                    Log.i(TAG,"chl gya re bappa");
                }
                else if (i==10)
                {
                    Intent intent=new Intent(getApplicationContext(), THEMODYNAMICS.class);
                    startActivity(intent);
                }
                else if (i==11)
                {
                    Intent intent=new Intent(getApplicationContext(), MATERIALTECH.class);
                    startActivity(intent);
                }
                else if (i==12)
                {
                    Intent intent=new Intent(view.getContext(), THERMALLAB.class);
                    startActivity(intent);
                    Log.i(TAG,"chl gya re bappa");
                }


            }
        });
    }
}