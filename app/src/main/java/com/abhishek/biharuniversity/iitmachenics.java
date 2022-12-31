package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class iitmachenics extends AppCompatActivity {
    public Button btnfirstsem,btnsecondsem,btnthirdsem,btnforthsem,btnfifthsem,btnsixthsem,btnsevensem,btneighthsem;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iitmachenics);
        btnfirstsem=(Button) findViewById(R.id.iitmechbtn1stsem);
        btnfirstsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitmachenics.this,iitsyllabusmech1stsem.class);
                startActivity(intent);
            }
        });

        btnsecondsem=(Button) findViewById(R.id.iitmechbtn2ndsem);
        btnsecondsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitmachenics.this,iitsyllabusmech2ndsem.class);
                startActivity(intent);
            }
        });
        btnthirdsem=(Button) findViewById(R.id.iitmechbtn3rdsem);
        btnthirdsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitmachenics.this,iitsyllabusmech3rdsem.class);
                startActivity(intent);
            }
        });
        btnforthsem=(Button) findViewById(R.id.iitmechbtn4thsem);
        btnforthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitmachenics.this,iitsyllabusmech4thsem.class);
                startActivity(intent);
            }
        });
        btnfifthsem=(Button) findViewById(R.id.iitmechbtn5thsem);
        btnfifthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitmachenics.this,iitsyllabusmech5thsem.class);
                startActivity(intent);
            }
        });

        btnsixthsem=(Button) findViewById(R.id.iitmechbtn6thsem);
        btnsixthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitmachenics.this,iitsyllabusmech6thsem.class);
                startActivity(intent);
            }
        });

        btnsevensem=(Button) findViewById(R.id.iitmechbtn7thsem);
        btnsevensem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitmachenics.this,iitsyllabusmech7thsem.class);
                startActivity(intent);
            }
        });
        btneighthsem=(Button) findViewById(R.id.iitmechbtn8thsem);
        btneighthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitmachenics.this,iitsyllabusmech8thsem.class);
                startActivity(intent);
            }
        });
    }
}