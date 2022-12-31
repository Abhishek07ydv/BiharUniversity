package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech3rdsemmec extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech3rdsemmec);

        syllbus=(Button)findViewById(R.id.btn3rdsemsyllbusmec) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech3rdsemmec.this,syllbus3rdsemmec.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn3rdsemprevquesmec);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech3rdsemmec.this,prequestion3rdsemmec.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn3rdsemnotemec);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech3rdsemmec.this,notes3rdsemmec.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn3rdsemorganizmec);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech3rdsemmec.this,organiser3rdsemmec.class);
                startActivity(intent);
            }
        });
    }
}