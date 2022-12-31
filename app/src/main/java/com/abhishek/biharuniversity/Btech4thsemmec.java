package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech4thsemmec extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech4thsemmec);

        syllbus=(Button)findViewById(R.id.btn4thsemsyllbusmec) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thsemmec.this,syllbus4thsemmec.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn4thsemprevquesmec);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thsemmec.this,prequestion4thsemmec.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn4thsemnotesmec);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thsemmec.this,notes4thsemmec.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn4thsemorganizmec);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thsemmec.this,organiser4thsemmec.class);
                startActivity(intent);
            }
        });
    }
}