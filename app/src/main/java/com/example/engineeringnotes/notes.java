package com.example.engineeringnotes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.engineeringnotes.branch.IT1;
import com.example.engineeringnotes.branch.IT3;

public class notes extends AppCompatActivity {
    private static final String TAG = "notes";
    String text1,text2;
    Button sbmit;
    int pos1,pos2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        final Spinner myspinner=(Spinner) findViewById(R.id.spinner);
        myspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                text1=myspinner.getSelectedItem().toString();
               pos1= myspinner.getSelectedItemPosition();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter<String> myadapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,getResources()
                .getStringArray(R.array.branch));
        myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(myadapter);

        final Spinner myspinner1=(Spinner) findViewById(R.id.spinner1);
        myspinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
               text2=myspinner1.getSelectedItem().toString();
               pos2=myspinner1.getSelectedItemPosition();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sbmit=(Button) findViewById(R.id.sbmit);



        ArrayAdapter<String> myadapter1= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,getResources()
                .getStringArray(R.array.year));
        myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner1.setAdapter(myadapter1);

        sbmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spinnerAction();
            }
        });
    }

    private void spinnerAction()
    {
       if (pos1==1 && pos2==0)
       {
           Intent intent=new Intent(getApplicationContext(), IT1.class);
           startActivity(intent);
       }
        if (pos1==1 && pos2==2)
        {
            Intent intent=new Intent(getApplicationContext(), IT3.class);
            startActivity(intent);
        }


    }

}