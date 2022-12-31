package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class civil extends AppCompatActivity {
    public Button btnfirstsem,btnsecondsem,btnthirdsem,btnforthsem,btnfifthsem,btnsixthsem,btnsevensem,btneighthsem;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);
        btnfirstsem=(Button) findViewById(R.id.civilbtn1stsem);
        btnfirstsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(civil.this,Btech1stsemc.class);
                startActivity(intent);
            }
        });

        btnsecondsem=(Button) findViewById(R.id.civilbtn2ndsem);
        btnsecondsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(civil.this,Btech2ndsemc.class);
                startActivity(intent);
            }
        });
        btnthirdsem=(Button) findViewById(R.id.civilbtn3rdsem);
        btnthirdsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(civil.this,Btech3rdsemc.class);
                startActivity(intent);
            }
        });
        btnforthsem=(Button) findViewById(R.id.civilbtn4thsem);
        btnforthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(civil.this,Btech4thsemc.class);
                startActivity(intent);
            }
        });
        btnfifthsem=(Button) findViewById(R.id.civilbtn5thsem);
        btnfifthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(civil.this,Btech5thsemc.class);
                startActivity(intent);
            }
        });

        btnsixthsem=(Button) findViewById(R.id.civilbtn6thsem);
        btnsixthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(civil.this,Btech6thsemc.class);
                startActivity(intent);
            }
        });

        btnsevensem=(Button) findViewById(R.id.civilbtn7thsem);
        btnsevensem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(civil.this,Btech7thsemc.class);
                startActivity(intent);
            }
        });
        btneighthsem=(Button) findViewById(R.id.civilbtn8thsem);
        btneighthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(civil.this,Btech8thsemc.class);
                startActivity(intent);
            }
        });
    }
}