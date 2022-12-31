package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech7thsem extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech7thsem);
        syllbus=(Button) findViewById(R.id.btn7thsemsyllbus);
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech7thsem.this,syllbus7thsem.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn7thsempreviques);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech7thsem.this,prequestion7thsem.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn7thsemnotes);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech7thsem.this,notes7thsem.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn7thsemorganiser);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech7thsem.this,organiser7thsem.class);
                startActivity(intent);
            }
        });
    }
}