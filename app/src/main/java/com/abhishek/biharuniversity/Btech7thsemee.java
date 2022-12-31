package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech7thsemee extends AppCompatActivity {
    public Button syllbus,previquestion,notes,organizer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech7thsemee);
        syllbus=(Button) findViewById(R.id.btn7thsemsyllbusee);
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech7thsemee.this,syllabus7thsemee.class);
                startActivity(intent);
            }
        });
        previquestion=(Button) findViewById(R.id.btn7thsemprevquesee);
        previquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech7thsemee.this,previquestion7thsemee.class);
                startActivity(intent);



            }
        });
        notes=(Button) findViewById(R.id.btn7thsemnoteee);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech7thsemee.this,notes7thsemee.class);
                startActivity(intent);
            }
        });

        organizer=(Button) findViewById(R.id.btn7thsemorganizee);
        organizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech7thsemee.this,organiser7thsemee.class);
                startActivity(intent);
            }
        });


    }
}
