package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech1stseme extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech1stseme);

        syllbus=(Button)findViewById(R.id.btn1stsemsyllbusece) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech1stseme.this,syllbus1stseme.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn1stsempreviousece);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech1stseme.this,prequestion1stseme.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn1stsemnotesece);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech1stseme.this,notes1stseme.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn1stsemorganizece);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech1stseme.this,organiser1stseme.class);
                startActivity(intent);
            }
        });
    }
}