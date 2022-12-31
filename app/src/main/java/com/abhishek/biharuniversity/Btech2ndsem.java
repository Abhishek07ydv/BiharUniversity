package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech2ndsem extends AppCompatActivity {

    public Button syllbus,previousques,notes,organiser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech2ndsem);
        syllbus=(Button) findViewById(R.id.btn2ndsemsyllbus);
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech2ndsem.this,syllbus2ndsem.class);
                startActivity(intent);
            }
        });
        previousques=(Button) findViewById(R.id.btn2ndsempreviques);
        previousques.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Btech2ndsem.this, previquestion2ndsem.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn2ndsemnotes);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Btech2ndsem.this, notes2ndsem.class);
                startActivity(intent);
            }
        });
        organiser=(Button) findViewById(R.id.btn2ndsemorganiser);
        organiser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Btech2ndsem.this, organizer2ndsem.class);
                startActivity(intent);
            }
        });



    }
}