package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech1stsemeee extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech1stsemeee);

        syllbus=(Button)findViewById(R.id.btn1stsemsyllbuseee) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech1stsemeee.this,syllbus1stsemeee.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn1stsemprevqueseee);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech1stsemeee.this,prequestion1stsemeee.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn1stsemnoteeee);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech1stsemeee.this,notes1stsemeee.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn1stsemorganizeee);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech1stsemeee.this,organiser1stsemeee.class);
                startActivity(intent);
            }
        });
    }
}