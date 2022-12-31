package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech2ndseme extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech2ndseme);

        syllbus=(Button)findViewById(R.id.btn2ndsemsyllbusece) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech2ndseme.this,syllbus2ndseme.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn2ndsemprevquesece);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech2ndseme.this,prequestion2ndseme.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn2ndsemnotesece);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech2ndseme.this,notes2ndseme.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn2ndsemorganizece);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech2ndseme.this,organiser2ndseme.class);
                startActivity(intent);
            }
        });
    }
}