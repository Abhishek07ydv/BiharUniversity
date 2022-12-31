package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech8thsemeee extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech8thsemeee);

        syllbus=(Button)findViewById(R.id.btn8thsemsyllbuseee) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech8thsemeee.this,syllbus8thsemeee.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn8thsemprevqueseee);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech8thsemeee.this,prequestion8thsemeee.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn8thsemnoteseee);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech8thsemeee.this,notes8thsemeee.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn8thsemorganizeee);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech8thsemeee.this,organiser8thsemeee.class);
                startActivity(intent);
            }
        });
    }
}