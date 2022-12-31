package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech6thsemmec extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech6thsemmec);

        syllbus=(Button)findViewById(R.id.btn6thsemsyllbusmec) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech6thsemmec.this,syllbus6thsemmec.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn6thsemprevquesmec);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech6thsemmec.this,prequestion6thsemmec.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn6thsemnotemec);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech6thsemmec.this,notes6thsemmec.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn6thsemorganizmec);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech6thsemmec.this,organiser6thsemmec.class);
                startActivity(intent);
            }
        });
    }
}