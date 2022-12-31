package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech7thsemc extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech7thsemc);

        syllbus=(Button)findViewById(R.id.btn7thsemsyllbuscivil) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech7thsemc.this,syllbus7thsemc.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn7thsemprevquescivil);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech7thsemc.this,prequestion7thsemc.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn7thsemnotescivil);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech7thsemc.this,notes7thsemc.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn7thsemorganizcivil);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech7thsemc.this,organiser7thsemc.class);
                startActivity(intent);
            }
        });
    }
}