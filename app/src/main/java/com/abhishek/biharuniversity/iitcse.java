package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class iitcse extends AppCompatActivity {
    public Button btnfirstsem,btnsecondsem,btnthirdsem,btnforthsem,btnfifthsem,btnsixthsem,btnsevensem,btneighthsem;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iitcse);
        btnfirstsem=(Button) findViewById(R.id.iitcsebtn1stsem);
        btnfirstsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitcse.this,iitsyllabuscse1stsem.class);
                startActivity(intent);
            }
        });

        btnsecondsem=(Button) findViewById(R.id.iitcsebtn2ndsem);
        btnsecondsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitcse.this,iitsyllabuscse2ndsem.class);
                startActivity(intent);
            }
        });
        btnthirdsem=(Button) findViewById(R.id.iitcsebtn3rdsem);
        btnthirdsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitcse.this,iitsyllabuscse3rdsem.class);
                startActivity(intent);
            }
        });
        btnforthsem=(Button) findViewById(R.id.iitcsebtn4thsem);
        btnforthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitcse.this,iitsyllabuscse4thsem.class);
                startActivity(intent);
            }
        });
        btnfifthsem=(Button) findViewById(R.id.iitcsebtn5thsem);
        btnfifthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitcse.this,iitsyllabuscse5thsem.class);
                startActivity(intent);
            }
        });

        btnsixthsem=(Button) findViewById(R.id.iitcsebtn6thsem);
        btnsixthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitcse.this,iitsyllabuscse6thsem.class);
                startActivity(intent);
            }
        });

        btnsevensem=(Button) findViewById(R.id.iitcsebtn7thsem);
        btnsevensem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitcse.this,iitsyllabuscse7thsem.class);
                startActivity(intent);
            }
        });
        btneighthsem=(Button) findViewById(R.id.iitcsebtn8thsem);
        btneighthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iitcse.this,iitsyllabuscse8thsem.class);
                startActivity(intent);
            }
        });
    }
}