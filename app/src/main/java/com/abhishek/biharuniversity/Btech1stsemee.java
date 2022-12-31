package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech1stsemee extends AppCompatActivity {
    public Button syllbus,previquestion,notes,organizer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech1stsemee);
        syllbus=(Button) findViewById(R.id.btn1stsemsyllbusee);
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech1stsemee.this,syllabus1stsemee.class);
                startActivity(intent);
            }
        });
        previquestion=(Button) findViewById(R.id.btn1stsemprevquesee);
        previquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech1stsemee.this,previquestion1stsemee.class);
                startActivity(intent);



            }
        });
        notes=(Button) findViewById(R.id.btn1stsemnoteee);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech1stsemee.this,notes1stsemee.class);
                startActivity(intent);
            }
        });

        organizer=(Button) findViewById(R.id.btn1stsemorganizee);
        organizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech1stsemee.this,organiser1stsemee.class);
                startActivity(intent);
            }
        });


    }
}
