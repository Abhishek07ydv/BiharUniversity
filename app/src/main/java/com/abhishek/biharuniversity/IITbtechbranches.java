package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IITbtechbranches extends AppCompatActivity {
    Button cse,civil,ece,eee,mechenics ,ee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iitbtechbranches);
        cse=(Button) findViewById(R.id.btniitcse);
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IITbtechbranches.this,iitcse.class);
                startActivity(intent);
            }
        });

        civil=(Button) findViewById(R.id.btniitcivil);
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IITbtechbranches.this,iitcivil.class);
                startActivity(intent);
            }
        });
        ece=(Button) findViewById(R.id.btniitece);
        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IITbtechbranches.this,iitece.class);
                startActivity(intent);
            }
        });

        eee=(Button) findViewById(R.id.btniiteee);
        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IITbtechbranches.this,iiteee.class);
                startActivity(intent);
            }
        });
        mechenics=(Button) findViewById(R.id.btniitmechenics);
        mechenics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IITbtechbranches.this,iitmachenics.class);
                startActivity(intent);
            }
        });
        ee=(Button) findViewById(R.id.btniitee);
        ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IITbtechbranches.this,iitee.class);
                startActivity(intent);
            }
        });
    }
}