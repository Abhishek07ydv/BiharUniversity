package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech1stsem extends AppCompatActivity {
    public Button syllbus;
    Button previquestion;
    Button notes;
    Button organizer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech1stsem);
        syllbus=(Button) findViewById(R.id.btnsyllbus);
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech1stsem.this,syllbus.class);
                startActivity(intent);
            }
        });
                previquestion=(Button) findViewById(R.id.btnprevques);
                previquestion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Btech1stsem.this,previquestion.class);
                        startActivity(intent);



            }
        });
        notes=(Button) findViewById(R.id.btnnote);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech1stsem.this,nots.class);
                startActivity(intent);
            }
        });

        organizer=(Button) findViewById(R.id.btnorganiz);
        organizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech1stsem.this,organiser.class);
                startActivity(intent);
            }
        });


    }
}
