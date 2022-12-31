package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech2ndsemeee extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech2ndsemeee);

        syllbus=(Button)findViewById(R.id.btn2ndsemsyllbuseee) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech2ndsemeee.this,syllbus2ndsemeee.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn2ndsemprevqueseee);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech2ndsemeee.this,prequestion2ndsemeee.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn2ndsemnoteeee);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech2ndsemeee.this,notes2ndsemeee.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn2ndsemorganizeee);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech2ndsemeee.this,organiser2ndsemeee.class);
                startActivity(intent);
            }
        });
    }
}