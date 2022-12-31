package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ece extends AppCompatActivity {
    public Button btnfirstsem,btnsecondsem,btnthirdsem,btnforthsem,btnfifthsem,btnsixthsem,btnsevensem,btneighthsem;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece);
        btnfirstsem=(Button) findViewById(R.id.ecebtn1stsem);
        btnfirstsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ece.this,Btech1stseme.class);
                startActivity(intent);
            }
        });

        btnsecondsem=(Button) findViewById(R.id.ecebtn2ndsem);
        btnsecondsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ece.this,Btech2ndseme.class);
                startActivity(intent);
            }
        });
        btnthirdsem=(Button) findViewById(R.id.ecebtn3rdsem);
        btnthirdsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ece.this,Btech3rdseme.class);
                startActivity(intent);
            }
        });
        btnforthsem=(Button) findViewById(R.id.ecebtn4rdsem);
        btnforthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ece.this,Btech4thseme.class);
                startActivity(intent);
            }
        });
        btnfifthsem=(Button) findViewById(R.id.ecebtn5thsem);
        btnfifthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ece.this,Btech5thseme.class);
                startActivity(intent);
            }
        });

        btnsixthsem=(Button) findViewById(R.id.ecebtn6thsem);
        btnsixthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ece.this,Btech6thseme.class);
                startActivity(intent);
            }
        });
        btnsevensem=(Button) findViewById(R.id.ecebtn7thsem);
        btnsevensem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ece.this,Btech7thseme.class);
                startActivity(intent);

            }
        });
        btneighthsem=(Button) findViewById(R.id.ecebtn8thsem);
        btneighthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ece.this,Btech8thseme.class);
                startActivity(intent);
            }
        });
    }
}