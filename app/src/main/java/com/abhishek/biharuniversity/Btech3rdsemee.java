package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech3rdsemee extends AppCompatActivity {
    public Button syllbus,previquestion,notes,organizer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech3rdsemee);
        syllbus=(Button) findViewById(R.id.btn3rdsemsyllbusee);
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech3rdsemee.this,syllabus3rdsemee.class);
                startActivity(intent);
            }
        });
        previquestion=(Button) findViewById(R.id.btn3rdsemprevquesee);
        previquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech3rdsemee.this,previquestion3rdsemee.class);
                startActivity(intent);



            }
        });
        notes=(Button) findViewById(R.id.btn3rdsemnoteee);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech3rdsemee.this,notes3rdsemee.class);
                startActivity(intent);
            }
        });

        organizer=(Button) findViewById(R.id.btn3rdsemorganizee);
        organizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech3rdsemee.this,organiser3rdsemee.class);
                startActivity(intent);
            }
        });


    }
}
