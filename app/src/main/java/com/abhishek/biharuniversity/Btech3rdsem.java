package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech3rdsem extends AppCompatActivity {

    public Button syllbus,previousques,notes,organiser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech3rdsem);
        syllbus=(Button) findViewById(R.id.btn3rdsemsyllbus);
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech3rdsem.this,syllbus3rdsem.class);
                startActivity(intent);
            }
        });
        previousques=(Button) findViewById(R.id.btn3rdsempreviques);
        previousques.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Btech3rdsem.this, previousquestion3rdsem.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn3rdsemnotes);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Btech3rdsem.this, notes3rdsem.class);
                startActivity(intent);
            }
        });
        organiser=(Button) findViewById(R.id.btn3rdsemorganiser);
        organiser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Btech3rdsem.this, organiser3rdsem.class);
                startActivity(intent);
            }
        });



    }
}