package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech4thsemc extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech4thsemc);

        syllbus=(Button)findViewById(R.id.btn4thsemsyllbuscivil) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thsemc.this,syllbus4thsemc.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn4thsemprevquescivil);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thsemc.this,prequestion4thsemc.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn4thsemnotescivil);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thsemc.this,notes4thsemc.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn4thsemorganizcivil);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech4thsemc.this,organiser4thsemc.class);
                startActivity(intent);
            }
        });
    }
}