package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class iitee extends AppCompatActivity {
    public Button btnfirstsem,btnsecondsem,btnthirdsem,btnforthsem,btnfifthsem,btnsixthsem,btnsevensem,btneighthsem;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iitee);
        btnfirstsem=(Button) findViewById(R.id.iiteebtn1stsem);
        btnfirstsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitee.this,iitsyllabusee1stsem.class);
                startActivity(intent);
            }
        });

        btnsecondsem=(Button) findViewById(R.id.iiteebtn2ndsem);
        btnsecondsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitee.this,iitsyllabusee2ndsem.class);
                startActivity(intent);
            }
        });
        btnthirdsem=(Button) findViewById(R.id.iiteebtn3rdsem);
        btnthirdsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitee.this,iitsyllabusee3rdsem.class);
                startActivity(intent);
            }
        });
        btnforthsem=(Button) findViewById(R.id.iiteebtn4thsem);
        btnforthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitee.this,iitsyllabusee4thsem.class);
                startActivity(intent);
            }
        });
        btnfifthsem=(Button) findViewById(R.id.iiteebtn5thsem);
        btnfifthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitee.this,iitsyllabusee5thsem.class);
                startActivity(intent);
            }
        });

        btnsixthsem=(Button) findViewById(R.id.iiteebtn6thsem);
        btnsixthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitee.this,iitsyllabusee6thsem.class);
                startActivity(intent);
            }
        });

        btnsevensem=(Button) findViewById(R.id.iiteebtn7thsem);
        btnsevensem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitee.this,iitsyllabusee7thsem.class);
                startActivity(intent);
            }
        });
        btneighthsem=(Button) findViewById(R.id.iiteebtn8thsem);
        btneighthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitee.this,iitsyllabusee8thsem.class);
                startActivity(intent);
            }
        });
    }
}