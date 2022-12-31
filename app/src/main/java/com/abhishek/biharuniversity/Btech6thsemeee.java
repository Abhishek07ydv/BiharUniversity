package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech6thsemeee extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech6thsemeee);

        syllbus=(Button)findViewById(R.id.btn6thsemsyllbuseee) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech6thsemeee.this,syllbus6thsemeee.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn6thsemprevqueseee);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech6thsemeee.this,prequestion6thsemeee.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn6thsemnoteseee);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech6thsemeee.this,notes6thsemeee.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn6thsemorganizeee);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech6thsemeee.this,organiser6thsemeee.class);
                startActivity(intent);
            }
        });
    }
}