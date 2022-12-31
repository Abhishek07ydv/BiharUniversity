package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EE extends AppCompatActivity {
    public Button btnfirstsem,btnsecondsem,btnthirdsem,btnforthsem,btnfifthsem,btnsixthsem,btnsevensem,btneighthsem;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ee);
        btnfirstsem=(Button) findViewById(R.id.eebtn1stsem);
        btnfirstsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EE.this,Btech1stsemee.class);
                startActivity(intent);
            }
        });

        btnsecondsem=(Button) findViewById(R.id.eebtn2ndsem);
        btnsecondsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EE.this,Btech2ndsemee.class);
                startActivity(intent);
            }
        });
        btnthirdsem=(Button) findViewById(R.id.eebtn3rdsem);
        btnthirdsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EE.this,Btech3rdsemee.class);
                startActivity(intent);
            }
        });
        btnforthsem=(Button) findViewById(R.id.eebtn4thsem);
        btnforthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EE.this,Btech4thsemee.class);
                startActivity(intent);
            }
        });
        btnfifthsem=(Button) findViewById(R.id.eebtn5thsem);
        btnfifthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EE.this,Btech5thsemee.class);
                startActivity(intent);
            }
        });

        btnsixthsem=(Button) findViewById(R.id.eebtn6thsem);
        btnsixthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EE.this,Btech6thsemee.class);
                startActivity(intent);
            }
        });

        btnsevensem=(Button) findViewById(R.id.eebtn7thsem);
        btnsevensem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EE.this,Btech7thsemee.class);
                startActivity(intent);
            }
        });
        btneighthsem=(Button) findViewById(R.id.eebtn8thsem);
        btneighthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EE.this,Btech8thsemee.class);
                startActivity(intent);
            }
        });
    }
}