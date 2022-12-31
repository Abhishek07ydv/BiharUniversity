package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech6thsemee extends AppCompatActivity {
    public Button syllbus,previquestion,notes,organizer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech6thsemee);
        syllbus=(Button) findViewById(R.id.btn6thsemsyllbusee);
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech6thsemee.this,syllabus6thsemee.class);
                startActivity(intent);
            }
        });
        previquestion=(Button) findViewById(R.id.btn6thsemprevquesee);
        previquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech6thsemee.this,previquestion6thsemee.class);
                startActivity(intent);



            }
        });
        notes=(Button) findViewById(R.id.btn6thsemnoteee);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech6thsemee.this,notes6thsemee.class);
                startActivity(intent);
            }
        });

        organizer=(Button) findViewById(R.id.btn6thsemorganizee);
        organizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech6thsemee.this,organiser6thsemee.class);
                startActivity(intent);
            }
        });


    }
}
