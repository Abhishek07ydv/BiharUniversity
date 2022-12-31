package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mbbs extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbbs);
        btn1=(Button) findViewById(R.id.btnmbbs1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Mbbs.this,syllabus1stsemmbbs.class);
                startActivity(intent);
            }
        });
        btn2=(Button) findViewById(R.id.btnmbbs2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Mbbs.this,syllabus2ndsemmbbs.class);
                startActivity(intent);
            }
        });
        btn3=(Button) findViewById(R.id.btnmbbs3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Mbbs.this,syllabus3rdsemmbbs.class);
                startActivity(intent);
            }
        });
        btn4=(Button) findViewById(R.id.btnmbbs4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Mbbs.this,syllabus4thsemmbbs.class);
                startActivity(intent);
            }
        });

    }
}