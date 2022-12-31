package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech3rdseme extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech3rdseme);

        syllbus=(Button)findViewById(R.id.btn3rdsemsyllbusece) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech3rdseme.this,syllbus3rdseme.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn3rdsemprevquesece);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech3rdseme.this,prequestion3rdseme.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn3rdsemnotesece);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech3rdseme.this,notes3rdseme.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn3rdsemorganizece);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech3rdseme.this,organiser3rdseme.class);
                startActivity(intent);
            }
        });
    }
}