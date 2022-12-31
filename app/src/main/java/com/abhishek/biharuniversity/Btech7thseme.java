package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech7thseme extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech7thseme);

        syllbus=(Button)findViewById(R.id.btn7thsemsyllbusece) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech7thseme.this,syllbus7thseme.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn7thsemprevquesece);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech7thseme.this,prequestion7thseme.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn7thsemnotesece);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech7thseme.this,notes7thseme.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn7thsemorganizece);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech7thseme.this,organiser7thseme.class);
                startActivity(intent);
            }
        });
    }
}