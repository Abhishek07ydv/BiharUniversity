package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech2ndsemmec extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech2ndsemmec);

        syllbus=(Button)findViewById(R.id.btn2ndsemsyllbusmec) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech2ndsemmec.this,syllbus2ndsemmec.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn2ndsemprevquesmec);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech2ndsemmec.this,prequestion2ndsemmec.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn2ndsemnotemec);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech2ndsemmec.this,notes2ndsemmec.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn2ndsemorganizmec);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech2ndsemmec.this,organiser2ndsemmec.class);
                startActivity(intent);
            }
        });
    }
}