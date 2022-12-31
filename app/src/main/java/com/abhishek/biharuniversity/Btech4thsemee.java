package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech4thsemee extends AppCompatActivity {
    public Button syllbus,previquestion,notes,organizer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech4thsemee);
        syllbus=(Button) findViewById(R.id.btn4thsemsyllbusee);
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thsemee.this,syllabus4thsemee.class);
                startActivity(intent);
            }
        });
        previquestion=(Button) findViewById(R.id.btn4thsemprevquesee);
        previquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thsemee.this,previquestion4thsemee.class);
                startActivity(intent);



            }
        });
        notes=(Button) findViewById(R.id.btn4thsemnoteee);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thsemee.this,notes4thsemee.class);
                startActivity(intent);
            }
        });

        organizer=(Button) findViewById(R.id.btn4thsemorganizee);
        organizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thsemee.this,organiser4thsemee.class);
                startActivity(intent);
            }
        });


    }
}
