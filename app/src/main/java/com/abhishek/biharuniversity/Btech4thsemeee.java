package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech4thsemeee extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech4thsemeee);

        syllbus=(Button)findViewById(R.id.btn4thsemsyllbuseee) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thsemeee.this,syllbus4thsemeee.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn4thsemprevqueseee);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thsemeee.this,prequestion4thsemeee.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn4thsemnoteseee);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thsemeee.this,notes4thsemeee.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn4thsemorganizeee);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thsemeee.this,organiser4thsemeee.class);
                startActivity(intent);
            }
        });
    }
}