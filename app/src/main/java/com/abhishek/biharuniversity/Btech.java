package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech extends AppCompatActivity {
    public Button btnfirstsem,btnsecondsem,btnthirdsem,btnforthsem,btnfifthsem,btnsixthsem,btnsevensem,btneighthsem;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech);
        btnfirstsem=(Button) findViewById(R.id.btn1stsem);
        btnfirstsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech.this,Btech1stsem.class);
                startActivity(intent);
            }
        });

        btnsecondsem=(Button) findViewById(R.id.btn2ndsem);
        btnsecondsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech.this,Btech2ndsem.class);
                startActivity(intent);
            }
        });
        btnthirdsem=(Button) findViewById(R.id.btn3rdsem);
        btnthirdsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech.this,Btech3rdsem.class);
                startActivity(intent);
            }
        });
        btnforthsem=(Button) findViewById(R.id.btn4rdsem);
        btnforthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech.this,Btech4thsem.class);
                startActivity(intent);
            }
        });
        btnfifthsem=(Button) findViewById(R.id.btn5thsem);
        btnfifthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech.this,Btech5thsem.class);
                startActivity(intent);
            }
        });

        btnsixthsem=(Button) findViewById(R.id.btn6thsem);
        btnsixthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech.this,Btech6thsem.class);
                startActivity(intent);
            }
        });

        btnsevensem=(Button) findViewById(R.id.btn7thsem);
        btnsevensem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech.this,Btech7thsem.class);
                startActivity(intent);
            }
        });
        btneighthsem=(Button) findViewById(R.id.btn8thsem);
        btneighthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech.this,Btech8thsem.class);
                startActivity(intent);
            }
        });










    }
}