package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mechanics extends AppCompatActivity {
    public Button btnfirstsem,btnsecondsem,btnthirdsem,btnforthsem,btnfifthsem,btnsixthsem,btnsevensem,btneighthsem;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanics);
        btnfirstsem=(Button) findViewById(R.id.mechbtn1stsem);
        btnfirstsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mechanics.this,Btech1stsemmec.class);
                startActivity(intent);
            }
        });

        btnsecondsem=(Button) findViewById(R.id.mechbtn2ndsem);
        btnsecondsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mechanics.this,Btech2ndsemmec.class);
                startActivity(intent);
            }
        });
        btnthirdsem=(Button) findViewById(R.id.mechbtn3rdsem);
        btnthirdsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mechanics.this,Btech3rdsemmec.class);
                startActivity(intent);
            }
        });
        btnforthsem=(Button) findViewById(R.id.mechbtn4rdsem);
        btnforthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mechanics.this,Btech4thsemmec.class);
                startActivity(intent);
            }
        });
        btnfifthsem=(Button) findViewById(R.id.mechbtn5thsem);
        btnfifthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mechanics.this,Btech5thsemmec.class);
                startActivity(intent);
            }
        });

        btnsixthsem=(Button) findViewById(R.id.mechbtn6thsem);
        btnsixthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mechanics.this,Btech6thsemmec.class);
                startActivity(intent);
            }
        });
        btnsevensem=(Button) findViewById(R.id.mechbtn7thsem);
        btnsevensem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mechanics.this,Btech7thsemmec.class);
                startActivity(intent);

            }
        });
        btneighthsem=(Button) findViewById(R.id.mechbtn8thsem);
        btneighthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mechanics.this,Btech8thsemmec.class);
                startActivity(intent);
            }
        });
    }
}