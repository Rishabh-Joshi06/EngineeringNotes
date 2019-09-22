package com.example.engineeringnotes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.engineeringnotes.branch.AU1;
import com.example.engineeringnotes.branch.AU2;
import com.example.engineeringnotes.branch.AU3;
import com.example.engineeringnotes.branch.AU4;
import com.example.engineeringnotes.branch.CS1;
import com.example.engineeringnotes.branch.CS2;
import com.example.engineeringnotes.branch.CS3;
import com.example.engineeringnotes.branch.CS4;
import com.example.engineeringnotes.branch.CV1;
import com.example.engineeringnotes.branch.CV2;
import com.example.engineeringnotes.branch.CV3;
import com.example.engineeringnotes.branch.CV4;
import com.example.engineeringnotes.branch.EC1;
import com.example.engineeringnotes.branch.EC2;
import com.example.engineeringnotes.branch.EC3;
import com.example.engineeringnotes.branch.EC4;
import com.example.engineeringnotes.branch.IT1;
import com.example.engineeringnotes.branch.IT2;
import com.example.engineeringnotes.branch.IT3;
import com.example.engineeringnotes.branch.IT4;
import com.example.engineeringnotes.branch.MCH1;
import com.example.engineeringnotes.branch.MCH2;
import com.example.engineeringnotes.branch.MCH3;
import com.example.engineeringnotes.branch.MCH4;

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
        // FOR 1ST YEAR
       if (pos1==1 && pos2==0)
       {
           Intent intent=new Intent(getApplicationContext(), IT1.class);
           startActivity(intent);
       }

        if (pos1==0 && pos2==0)
        {
            Intent intent=new Intent(getApplicationContext(), CS1.class);
            startActivity(intent);
        }
        if (pos1==2 && pos2==0)
        {
            Intent intent=new Intent(getApplicationContext(), CV1.class);
            startActivity(intent);
        }
        if (pos1==3 && pos2==0)
        {
            Intent intent=new Intent(getApplicationContext(), MCH1.class);
            startActivity(intent);
        }


        if (pos1==4 && pos2==0)
        {
            Intent intent=new Intent(getApplicationContext(), AU1.class);
            startActivity(intent);
        }
        if (pos1==5 && pos2==0)
        {
            Intent intent=new Intent(getApplicationContext(), EC1.class);
            startActivity(intent);
        }

        // FOR 2nd YEAR
        if (pos1==0 && pos2==1)
        {
            Intent intent=new Intent(getApplicationContext(), CS2.class);
            startActivity(intent);
        }

        if (pos1==1 && pos2==1)
        {
            Intent intent=new Intent(getApplicationContext(), IT2.class);
            startActivity(intent);
        }
        if (pos1==2 && pos2==1)
        {
            Intent intent=new Intent(getApplicationContext(), CV2.class);
            startActivity(intent);
        }
        if (pos1==3 && pos2==1)
        {
            Intent intent=new Intent(getApplicationContext(), MCH2.class);
            startActivity(intent);
        }
        if (pos1==4 && pos2==1)
        {
            Intent intent=new Intent(getApplicationContext(), AU2.class);
            startActivity(intent);
        }
        if (pos1==5 && pos2==1)
        {
            Intent intent=new Intent(getApplicationContext(), EC2.class);
            startActivity(intent);
        }


        //FOR 3RD YEAR
        if (pos1==1 && pos2==2)
        {
            Intent intent=new Intent(getApplicationContext(), IT3.class);
            startActivity(intent);
        }
        if (pos1==0 && pos2==2)
        {
            Intent intent=new Intent(getApplicationContext(), CS3.class);
            startActivity(intent);
        }
        if (pos1==2 && pos2==2)
        {
            Intent intent=new Intent(getApplicationContext(), CV3.class);
            startActivity(intent);
        }
        if (pos1==3 && pos2==2)
        {
            Intent intent=new Intent(getApplicationContext(), MCH3.class);
            startActivity(intent);
        }
        if (pos1==4 && pos2==2)
        {
            Intent intent=new Intent(getApplicationContext(), AU3.class);
            startActivity(intent);
        }
        if (pos1==5 && pos2==2)
        {
            Intent intent=new Intent(getApplicationContext(), EC3.class);
            startActivity(intent);
        }

        // FOR 4TH YEAR
        if (pos1==0 && pos2==3)
        {
            Intent intent=new Intent(getApplicationContext(), CS4.class);
            startActivity(intent);
        }

        if (pos1==1 && pos2==3)
        {
            Intent intent=new Intent(getApplicationContext(), IT4.class);
            startActivity(intent);
        }
        if (pos1==2 && pos2==3)
        {
            Intent intent=new Intent(getApplicationContext(), CV4.class);
            startActivity(intent);
        }
        if (pos1==3 && pos2==3)
        {
            Intent intent=new Intent(getApplicationContext(), MCH4.class);
            startActivity(intent);
        }
        if (pos1==4 && pos2==3)
        {
            Intent intent=new Intent(getApplicationContext(), AU4.class);
            startActivity(intent);
        }
        if (pos1==5 && pos2==3)
        {
            Intent intent=new Intent(getApplicationContext(), EC4.class);
            startActivity(intent);
        }




    }

}