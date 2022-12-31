package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech2ndsemee extends AppCompatActivity {
    public Button syllbus,previquestion,notes,organizer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech2ndsemee);
        syllbus=(Button) findViewById(R.id.btn2ndsemsyllbusee);
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech2ndsemee.this,syllabus2ndsemee.class);
                startActivity(intent);
            }
        });
        previquestion=(Button) findViewById(R.id.btn2ndsemprevquesee);
        previquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech2ndsemee.this,previquestion2ndsemee.class);
                startActivity(intent);



            }
        });
        notes=(Button) findViewById(R.id.btn2ndsemnoteee);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech2ndsemee.this,notes2ndsemee.class);
                startActivity(intent);
            }
        });

        organizer=(Button) findViewById(R.id.btn2ndsemorganizee);
        organizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech2ndsemee.this,organiser2ndsemee.class);
                startActivity(intent);
            }
        });


    }
}
