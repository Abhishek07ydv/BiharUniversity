package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech4thseme extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech4thseme);

        syllbus=(Button)findViewById(R.id.btn4thsemsyllbusece) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thseme.this,syllbus4thseme.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn4thsemprevquesece);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thseme.this,prequestion4thseme.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn4thsemnotesece);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thseme.this,notes4thseme.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn4thsemorganizece);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thseme.this,organiser4thseme.class);
                startActivity(intent);
            }
        });
    }
}