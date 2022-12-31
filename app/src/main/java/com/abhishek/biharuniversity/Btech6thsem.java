package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech6thsem extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech6thsem);
        syllbus=(Button) findViewById(R.id.btn6thsemsyllbus);
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech6thsem.this,syllbus6thsem.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn6thsempreviques);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech6thsem.this,prequestion6thsem.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn6thsemnotes);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech6thsem.this,notes6thsem.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn6thsemorganiser);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech6thsem.this,organiser6thsem.class);
                startActivity(intent);
            }
        });
    }
}