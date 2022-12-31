package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech4thsem extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech4thsem);
        syllbus=(Button) findViewById(R.id.btn4thsemsyllbus);
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thsem.this,syllbus4thsem.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn4thsempreviques);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thsem.this,prequestion4thsem.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn4thsemnotes);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thsem.this,notes4thsem.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn4thsemorganiser);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thsem.this,organiser4thsem.class);
                startActivity(intent);
            }
        });
    }
}