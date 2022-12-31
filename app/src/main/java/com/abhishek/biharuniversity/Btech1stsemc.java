package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech1stsemc extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech1stsemc);

            syllbus=(Button)findViewById(R.id.btn1stsemsyllbuscivil) ;
            syllbus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Btech1stsemc.this,syllbus1stsemc.class);
                    startActivity(intent);
                }
            });
        previousquestion=(Button) findViewById(R.id.btn1stsemprevquescivil);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech1stsemc.this,prequestion1stsemc.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn1stsemnotecivil);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech1stsemc.this,notes1stsemc.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn1stsemorganizcivil);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech1stsemc.this,organiser1stsemc.class);
                startActivity(intent);
            }
        });
    }
}