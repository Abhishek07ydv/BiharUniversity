package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eee extends AppCompatActivity {
    public Button btnfirstsem,btnsecondsem,btnthirdsem,btnforthsem,btnfifthsem,btnsixthsem,btnsevensem,btneighthsem;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee);
        btnfirstsem=(Button) findViewById(R.id.eeebtn1stsem);
        btnfirstsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(eee.this,Btech1stsemeee.class);
                startActivity(intent);
            }
        });

        btnsecondsem=(Button) findViewById(R.id.eeebtn2ndsem);
        btnsecondsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(eee.this,Btech2ndsemeee.class);
                startActivity(intent);
            }
        });
        btnthirdsem=(Button) findViewById(R.id.eeebtn3rdsem);
        btnthirdsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(eee.this,Btech3rdsemeee.class);
                startActivity(intent);
            }
        });
        btnforthsem=(Button) findViewById(R.id.eeebtn4rdsem);
        btnforthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(eee.this,Btech4thsemeee.class);
                startActivity(intent);
            }
        });
        btnfifthsem=(Button) findViewById(R.id.eeebtn5thsem);
        btnfifthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(eee.this,Btech5thsemeee.class);
                startActivity(intent);
            }
        });

        btnsixthsem=(Button) findViewById(R.id.eeebtn6thsem);
        btnsixthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(eee.this,Btech6thsemeee.class);
                startActivity(intent);
            }
        });
        btnsevensem=(Button) findViewById(R.id.eeebtn7thsem);
        btnsevensem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(eee.this,Btech7thsemeee.class);
                startActivity(intent);

            }
        });
        btneighthsem=(Button) findViewById(R.id.eeebtn8thsem);
        btneighthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(eee.this,Btech8thsemeee.class);
                startActivity(intent);
            }
        });
    }
}