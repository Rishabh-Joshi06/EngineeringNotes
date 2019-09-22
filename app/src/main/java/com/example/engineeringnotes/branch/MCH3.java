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
import com.example.engineeringnotes.sub3.COMAIDE;
import com.example.engineeringnotes.sub3.DEPTELE;
import com.example.engineeringnotes.sub3.FEMLAB;
import com.example.engineeringnotes.sub3.HEATMASS;
import com.example.engineeringnotes.sub3.ICEN;
import com.example.engineeringnotes.sub3.METALCUT;
import com.example.engineeringnotes.sub3.OPENELE;
import com.example.engineeringnotes.sub3.OPERMANAGE;
import com.example.engineeringnotes.sub3.POWERPE;
import com.example.engineeringnotes.sub3.VIBRATION;
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

public class MCH3 extends AppCompatActivity {
    private static final String TAG = "IT3";
    private String listview_array[]={"IC ENGINES","MECHANICAL VIBRATION","DEPARTMENTAL ELECTIVE","OPEN ELECTIVE",
            "FEM/CFD LAB","PYTHONE",
            "OPERATION MANAGEMENT","POWER PLANT ENGG","METAL CUTTING AND MACHINES","HEAT AND MASS TRANSFER","COPMPUTER AIDED ENGG"
            ,"EVALUATION OF INTERNSHIP-2","INTERNSHIP-3","MINOR PROJECT-1 "
            };
    ListView myList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mch3);

        myList = (ListView) findViewById(R.id.listView);
        myList.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listview_array));

        helper.getListViewSize(myList);
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0)
                {

                    Log.i(TAG,"chla re cjhla0");
                    Intent intent=new Intent(MCH3.this, ICEN.class);
                    startActivity(intent);

                }
                else if (i==1)
                {
                    Intent intent=new Intent(getApplicationContext(), VIBRATION.class);
                    startActivity(intent);
                }
                else if (i==2)
                {
                    Intent intent=new Intent(getApplicationContext(), DEPTELE.class);
                    startActivity(intent);
                }
                else if (i==3)
                {
                    Intent intent=new Intent(getApplicationContext(), OPENELE.class);
                    startActivity(intent);
                }
                else if (i==4)
                {
                    Intent intent=new Intent(getApplicationContext(), FEMLAB.class);
                    startActivity(intent);
                }
                else if (i==5)
                {
                    Intent intent=new Intent(getApplicationContext(), py.class);
                    startActivity(intent);
                }
                else if (i==6)
                {
                    Intent intent=new Intent(getApplicationContext(), OPERMANAGE.class);
                    startActivity(intent);
                }
                else if (i==7)
                {
                    Intent intent=new Intent(getApplicationContext(), POWERPE.class);
                    startActivity(intent);
                }
                else if (i==8)
                {
                    Intent intent=new Intent(getApplicationContext(), METALCUT.class);
                    startActivity(intent);
                }
                else if (i==9)
                {
                    Intent intent=new Intent(view.getContext(), HEATMASS.class);
                    startActivity(intent);
                    Log.i(TAG,"chl gya re bappa");
                }
                else if (i==10)
                {
                    Intent intent=new Intent(view.getContext(), COMAIDE.class);
                    startActivity(intent);
                    Log.i(TAG,"chl gya re bappa");
                }

            }
        });
    }
}
