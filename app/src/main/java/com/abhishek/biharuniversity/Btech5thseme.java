package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech5thseme extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech5thseme);

        syllbus=(Button)findViewById(R.id.btn5thsemsyllbusece) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech5thseme.this,syllbus5thseme.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn5thsemprevquesece);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech5thseme.this,prequestion5thseme.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn5thsemnotesece);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech5thseme.this,notes5thseme.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn5thsemorganizece);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech5thseme.this,organiser5thseme.class);
                startActivity(intent);
            }
        });
    }
}