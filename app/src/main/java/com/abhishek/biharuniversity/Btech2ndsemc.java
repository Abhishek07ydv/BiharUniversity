package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech2ndsemc extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech2ndsemc);

        syllbus=(Button)findViewById(R.id.btn2ndsemsyllbuscivil) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech2ndsemc.this,syllbus2ndsemc.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn2ndsemprevquescivil);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech2ndsemc.this,prequestion2ndsemc.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn2ndsemnotescivil);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech2ndsemc.this,notes2ndsemc.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn2ndsemorganizcivil);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech2ndsemc.this,organiser2ndsemc.class);
                startActivity(intent);
            }
        });
    }
}