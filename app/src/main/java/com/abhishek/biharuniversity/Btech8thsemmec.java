package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech8thsemmec extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech8thsemmec);

        syllbus=(Button)findViewById(R.id.btn8thsemsyllbusmec) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech8thsemmec.this,syllbus8thsemmec.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn8thsemprevquesmec);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech8thsemmec.this,prequestion8thsemmec.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn8thsemnotemec);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech8thsemmec.this,notes8thsemmec.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn8thsemorganizmec);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech8thsemmec.this,organiser8thsemmec.class);
                startActivity(intent);
            }
        });
    }
}