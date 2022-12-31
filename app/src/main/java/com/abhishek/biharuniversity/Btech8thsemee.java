package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech8thsemee extends AppCompatActivity {
    public Button syllbus,previquestion,notes,organizer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech8thsemee);
        syllbus=(Button) findViewById(R.id.btn8thsemsyllbusee);
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech8thsemee.this,syllabus8thsemee.class);
                startActivity(intent);
            }
        });
        previquestion=(Button) findViewById(R.id.btn8thsemprevquesee);
        previquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech8thsemee.this,previquestion8thsemee.class);
                startActivity(intent);



            }
        });
        notes=(Button) findViewById(R.id.btn8thsemnoteee);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech8thsemee.this,notes8thsemee.class);
                startActivity(intent);
            }
        });

        organizer=(Button) findViewById(R.id.btn8thsemorganizee);
        organizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech8thsemee.this,organiser8thsemee.class);
                startActivity(intent);
            }
        });


    }
}
