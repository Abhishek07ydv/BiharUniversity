package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech6thseme extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech6thseme);

        syllbus=(Button)findViewById(R.id.btn6thsemsyllbusece) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech6thseme.this,syllbus6thseme.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn6thsemprevquesece);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech6thseme.this,prequestion6thseme.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn6thsemnotesece);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech6thseme.this,notes6thseme.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn6thsemorganizece);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech6thseme.this,organiser6thseme.class);
                startActivity(intent);
            }
        });
    }
}