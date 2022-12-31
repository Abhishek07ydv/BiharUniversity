package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech3rdsemc extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech3rdsemc);

        syllbus=(Button)findViewById(R.id.btn3rdsemsyllbuscivil) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech3rdsemc.this,syllbus3rdsemc.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn3rdsemprevquescivil);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech3rdsemc.this,prequestion3rdsemc.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn3rdsemnotecivil);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech3rdsemc.this,notes3rdsemc.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn3rdsemorganizcivil);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech3rdsemc.this,organiser3rdsemc.class);
                startActivity(intent);
            }
        });
    }
}