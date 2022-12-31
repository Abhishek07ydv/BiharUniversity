package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bpharma extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bpharma);
        btn1=(Button) findViewById(R.id.bpharmabtn1stsem);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bpharma.this,syllabus1stsembpharma.class);
                startActivity(intent);
            }
        });
        btn2=(Button) findViewById(R.id.bpharmabtn2ndsem);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bpharma.this,syllabus2ndsembpharma.class);
                startActivity(intent);
            }
        });
        btn3=(Button) findViewById(R.id.bpharmabtn3rdsem);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bpharma.this,syllabus3rdsembpharma.class);
                startActivity(intent);
            }
        });
        btn4=(Button) findViewById(R.id.bpharmabtn4rdsem);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bpharma.this,syllabus4thsembpharma.class);
                startActivity(intent);
            }
        });
        btn5=(Button) findViewById(R.id.bpharmabtn5thsem);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bpharma.this,syllabus5thsembpharma.class);
                startActivity(intent);
            }
        });
        btn6=(Button) findViewById(R.id.bpharmabtn6thsem);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bpharma.this,syllabus6thsembpharma.class);
                startActivity(intent);
            }
        });
        btn7=(Button) findViewById(R.id.bpharmabtn7thsem);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bpharma.this,syllabus7thsembpharma.class);
                startActivity(intent);
            }
        });
        btn8=(Button) findViewById(R.id.bpharmabtn8thsem);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bpharma.this,syllabus8thsembpharma.class);
                startActivity(intent);
            }
        });
        btn9=(Button) findViewById(R.id.bpharmabtnelect);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bpharma.this,syllabuselectbpharma.class);
                startActivity(intent);
            }
        });
    }
}