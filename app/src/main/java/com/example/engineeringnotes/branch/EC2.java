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
import com.example.engineeringnotes.subCV2.ANACIR;
import com.example.engineeringnotes.subCV2.ANALOGC;
import com.example.engineeringnotes.subCV2.CONTROLS;
import com.example.engineeringnotes.subCV2.ECE;
import com.example.engineeringnotes.subCV2.ELECDEVICE;
import com.example.engineeringnotes.subCV2.NWSYSTEM;
import com.example.engineeringnotes.subCV2.SIGNAL;
import com.example.engineeringnotes.subCV2.SIMULATION;
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

public class EC2 extends AppCompatActivity {
    private static final String TAG = "EC2";
    private String listview_array[]={"MATHEMATICS-3","SIGNAL AND SYSTEMS","ANALOG COMMUNICATION",
            "CONTROL SYSTEM","ANALOG CIRCUITS","SIMULATION LAB",
            "ECE", "ELECTRONIC DEVICES"
            ,"NETWORK ANALYSIS"};
    ListView myList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ec2);

        myList = (ListView) findViewById(R.id.listView);
        myList.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listview_array));

        helper.getListViewSize(myList);
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0)
                {

                    Log.i(TAG,"chla re cjhla0");
                    Intent intent=new Intent(EC2.this, MATH3.class);
                    startActivity(intent);

                }
                else if (i==1)
                {
                    Intent intent=new Intent(getApplicationContext(), SIGNAL.class);
                    startActivity(intent);
                }
                else if (i==2)
                {
                    Intent intent=new Intent(getApplicationContext(), ANALOGC.class);
                    startActivity(intent);
                }
                else if (i==3)
                {
                    Intent intent=new Intent(getApplicationContext(), CONTROLS.class);
                    startActivity(intent);
                }
                else if (i==4)
                {
                    Intent intent=new Intent(getApplicationContext(), ANACIR.class);
                    startActivity(intent);
                }
                else if (i==5)
                {
                    Intent intent=new Intent(getApplicationContext(), SIMULATION.class);
                    startActivity(intent);
                }
                else if (i==6)
                {
                    Intent intent=new Intent(getApplicationContext(), ECE.class);
                    startActivity(intent);
                }
                else if (i==7)
                {
                    Intent intent=new Intent(getApplicationContext(), ELECDEVICE.class);
                    startActivity(intent);
                }
                else if (i==8)
                {
                    Intent intent=new Intent(getApplicationContext(), NWSYSTEM.class);
                    startActivity(intent);
                }

            }
        });
    }
}
