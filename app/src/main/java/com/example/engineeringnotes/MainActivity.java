package com.example.engineeringnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button notes;
    Button setre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notes=(Button) findViewById(R.id.notes);
        notes.setOnClickListener(this);
        setre=(Button) findViewById(R.id.setremainder);
        setre.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int id=view.getId();

        if (id==R.id.notes)
        {
            Intent intent=new Intent(this,notes.class) ;
            startActivity(intent);
        }
        else if(id==R.id.setremainder)
        {

        }

    }
}
