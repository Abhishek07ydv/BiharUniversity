package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class branches extends AppCompatActivity {
Button cse,civil,ece,eee,mechenics ,ee,it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branches);
        cse=(Button) findViewById(R.id.btncse);
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(branches.this,Btech.class);
                startActivity(intent);
            }
        });

        civil=(Button) findViewById(R.id.btncivil);
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(branches.this,civil.class);
                startActivity(intent);
            }
        });
        ece=(Button) findViewById(R.id.btnece);
        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(branches.this,ece.class);
                startActivity(intent);
            }
        });

        eee=(Button) findViewById(R.id.btneee);
        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(branches.this,eee.class);
                startActivity(intent);
            }
        });
        mechenics=(Button) findViewById(R.id.btnmechenics);
        mechenics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(branches.this,mechanics.class);
                startActivity(intent);
            }
        });
        ee=(Button) findViewById(R.id.btnee);
        ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(branches.this,EE.class);
                startActivity(intent);
            }
        });
        it=(Button) findViewById(R.id.btnit);
        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(branches.this,IT.class);
                startActivity(intent);
            }
        });
    }
}