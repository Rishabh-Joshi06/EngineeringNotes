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
import com.example.engineeringnotes.sub3.ANTENNA;
import com.example.engineeringnotes.sub3.CELLULAR;
import com.example.engineeringnotes.sub3.COMMNW;
import com.example.engineeringnotes.sub3.DIGICOMM;
import com.example.engineeringnotes.sub3.DIGITALS;
import com.example.engineeringnotes.sub3.INDUSTELE;
import com.example.engineeringnotes.sub3.MICROPC;
import com.example.engineeringnotes.sub3.SWLAB3;
import com.example.engineeringnotes.sub3.SWLAB4;
import com.example.engineeringnotes.sub3.VLSC;
import com.example.engineeringnotes.sub3.VOICE;
import com.example.engineeringnotes.subCV2.CONTROLS;
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

public class EC3 extends AppCompatActivity {
    private static final String TAG = "IT3";
    private String listview_array[]={"INDUSTRIAL ELECTRONICS ","CELLULAR MOBILE COMMUNICATION","DIGITAL SIGNAL PROCESSING"
            ,"ANTENNA & WAVE PROPAGATION",
            "VLSI CIRCUITS & SYSTEM ","SOFTWARE LAB 4","VOICE DATA COMMUNICATION ","CONTROLSYSTEM","DIGITAL COMMUNICATION ",
            "MICROPROCESSORS & MICROCONTROLLERS","COMM. NETWORK AND TRANSMISSION LINES ","SOFTWARE LAB-3"};
    ListView myList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ec3);

        myList = (ListView) findViewById(R.id.listView);
        myList.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listview_array));

        helper.getListViewSize(myList);
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0)
                {

                    Log.i(TAG,"chla re cjhla0");
                    Intent intent=new Intent(EC3.this, INDUSTELE.class);
                    startActivity(intent);

                }
                else if (i==1)
                {
                    Intent intent=new Intent(getApplicationContext(), CELLULAR.class);
                    startActivity(intent);
                }
                else if (i==2)
                {
                    Intent intent=new Intent(getApplicationContext(), DIGITALS.class);
                    startActivity(intent);
                }
                else if (i==3)
                {
                    Intent intent=new Intent(getApplicationContext(), ANTENNA.class);
                    startActivity(intent);
                }
                else if (i==4)
                {
                    Intent intent=new Intent(getApplicationContext(), VLSC.class);
                    startActivity(intent);
                }
                else if (i==5)
                {
                    Intent intent=new Intent(getApplicationContext(), SWLAB4.class);
                    startActivity(intent);
                }
                else if (i==6)
                {
                    Intent intent=new Intent(getApplicationContext(), VOICE.class);
                    startActivity(intent);
                }
                else if (i==7)
                {
                    Intent intent=new Intent(getApplicationContext(), CONTROLS.class);
                    startActivity(intent);
                }
                else if (i==8)
                {
                    Intent intent=new Intent(getApplicationContext(), DIGICOMM.class);
                    startActivity(intent);
                }
                else if (i==9)
                {
                    Intent intent=new Intent(view.getContext(), MICROPC.class);
                    startActivity(intent);
                    Log.i(TAG,"chl gya re bappa");
                }
                else if (i==10)
                {
                    Intent intent=new Intent(getApplicationContext(), COMMNW.class);
                    startActivity(intent);
                }
                else if (i==9)
                {
                    Intent intent=new Intent(view.getContext(), SWLAB3.class);
                    startActivity(intent);
                    Log.i(TAG,"chl gya re bappa");
                }

            }
        });
    }
}