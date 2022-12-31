package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bca extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca);
        btn1=(Button) findViewById(R.id.btnbca1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bca.this,syllabus1stsembca.class);
                startActivity(intent);
            }
        });
        btn2=(Button)findViewById(R.id.btnbca2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bca.this,syllabus2ndsembca.class);
                startActivity(intent);
            }
        });
        btn3=(Button) findViewById(R.id.btnbca3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bca.this,syllabus3rdsembca.class);
                startActivity(intent);
            }
        });
        btn4=(Button) findViewById(R.id.btnbca4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bca.this,syllabus4thsembca.class);
                startActivity(intent);
            }
        });
        btn5=(Button) findViewById(R.id.btnbca5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bca.this,syllabus5thsembca.class);
                startActivity(intent);
            }
        });
        btn6=(Button) findViewById(R.id.btnbca6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bca.this,syllabus6thsembca.class);
                startActivity(intent);
            }
        });
    }
}