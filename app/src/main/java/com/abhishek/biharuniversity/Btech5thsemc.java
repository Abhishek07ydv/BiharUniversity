package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech5thsemc extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech5thsemc);

        syllbus=(Button)findViewById(R.id.btn5thsemsyllbuscivil) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech5thsemc.this,syllbus5thsemc.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn5thsemprevquescivil);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech5thsemc.this,prequestion5thsemc.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn5thsemnotescivil);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech5thsemc.this,notes5thsemc.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn5thsemorganizcivil);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech5thsemc.this,organiser5thsemc.class);
                startActivity(intent);
            }
        });
    }
}