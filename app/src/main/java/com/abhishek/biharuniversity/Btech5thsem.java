package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech5thsem extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech5thsem);
        syllbus=(Button) findViewById(R.id.btn5thsemsyllbus);
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech5thsem.this,syllbus5thsem.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn5thsempreviques);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech5thsem.this,prequestion5thsem.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn5thsemnotes);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech5thsem.this,notes5thsem.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn5thsemorganiser);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech5thsem.this,organiser5thsem.class);
                startActivity(intent);
            }
        });
    }
}