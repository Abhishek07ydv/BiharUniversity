package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech5thsemee extends AppCompatActivity {
    public Button syllbus,previquestion,notes,organizer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech5thsemee);
        syllbus=(Button) findViewById(R.id.btn5thsemsyllbusee);
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech5thsemee.this,syllabus5thsemee.class);
                startActivity(intent);
            }
        });
        previquestion=(Button) findViewById(R.id.btn5thsemprevquesee);
        previquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech5thsemee.this,previquestion5thsemee.class);
                startActivity(intent);



            }
        });
        notes=(Button) findViewById(R.id.btn5thsemnoteee);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech5thsemee.this,notes5thsemee.class);
                startActivity(intent);
            }
        });

        organizer=(Button) findViewById(R.id.btn5thsemorganizee);
        organizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech5thsemee.this,organiser5thsemee.class);
                startActivity(intent);
            }
        });


    }
}
