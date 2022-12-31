package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech5thsemeee extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech5thsemeee);

        syllbus=(Button)findViewById(R.id.btn5thsemsyllbuseee) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech5thsemeee.this,syllbus5thsemeee.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn5thsemprevqueseee);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech5thsemeee.this,prequestion5thsemeee.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn5thsemnoteseee);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech5thsemeee.this,notes5thsemeee.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn5thsemorganizeee);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech5thsemeee.this,organiser5thsemeee.class);
                startActivity(intent);
            }
        });
    }
}