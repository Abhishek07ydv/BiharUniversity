package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech8thsem extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech8thsem);
        syllbus=(Button) findViewById(R.id.btn8thsemsyllbus);
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech8thsem.this,syllbus8thsem.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn8thsempreviques);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech8thsem.this,prequestion8thsem.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn8thsemnotes);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech8thsem.this,notes8thsem.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn8thsemorganiser);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech8thsem.this,organiser8thsem.class);
                startActivity(intent);
            }
        });
    }
}