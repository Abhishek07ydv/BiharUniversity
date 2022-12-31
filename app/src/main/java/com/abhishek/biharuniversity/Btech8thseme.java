package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech8thseme extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech8thseme);

        syllbus=(Button)findViewById(R.id.btn8thsemsyllbusece) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech8thseme.this,syllbus8thseme.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn8thsemprevquesece);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech8thseme.this,prequestion8thseme.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn8thsemnotesece);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech8thseme.this,notes8thseme.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn8thsemorganizece);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech8thseme.this,organiser8thseme.class);
                startActivity(intent);
            }
        });
    }
}