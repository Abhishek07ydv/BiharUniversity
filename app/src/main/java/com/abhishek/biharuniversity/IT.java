package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IT extends AppCompatActivity {
    public Button btnfirstsem,btnsecondsem,btnthirdsem,btnforthsem,btnfifthsem,btnsixthsem,btnsevensem,btneighthsem;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);
        btnfirstsem=(Button) findViewById(R.id.itbtn1stsem);
        btnfirstsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IT.this,syllabus1stsemit.class);
                startActivity(intent);
            }
        });

        btnsecondsem=(Button) findViewById(R.id.itbtn2ndsem);
        btnsecondsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IT.this,syllabus2ndsemit.class);
                startActivity(intent);
            }
        });
        btnthirdsem=(Button) findViewById(R.id.itbtn3rdsem);
        btnthirdsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IT.this,syllabus3rdsemit.class);
                startActivity(intent);
            }
        });
        btnforthsem=(Button) findViewById(R.id.itbtn4rdsem);
        btnforthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IT.this,syllabus4thsemit.class);
                startActivity(intent);
            }
        });
        btnfifthsem=(Button) findViewById(R.id.itbtn5thsem);
        btnfifthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IT.this,syllabus5thsemit.class);
                startActivity(intent);
            }
        });

        btnsixthsem=(Button) findViewById(R.id.itbtn6thsem);
        btnsixthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IT.this,syllabus6thsemit.class);
                startActivity(intent);
            }
        });
        btnsevensem=(Button) findViewById(R.id.itbtn7thsem);
        btnsevensem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IT.this,syllabus7thsemit.class);
                startActivity(intent);

            }
        });
        btneighthsem=(Button) findViewById(R.id.itbtn8thsem);
        btneighthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IT.this,syllabus8thsemit.class);
                startActivity(intent);
            }
        });
    }
}