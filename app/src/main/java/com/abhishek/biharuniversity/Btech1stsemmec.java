package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech1stsemmec extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech1stsemmec);

        syllbus=(Button)findViewById(R.id.btn1stsemsyllbusmec) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech1stsemmec.this,syllbus1stsemmec.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn1stsemprevquesmec);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech1stsemmec.this,prequestion1stsemmec.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn1stsemnotemec);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech1stsemmec.this,notes1stsemmec.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn1stsemorganizmec);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech1stsemmec.this,organiser1stsemmec.class);
                startActivity(intent);
            }
        });
    }
}