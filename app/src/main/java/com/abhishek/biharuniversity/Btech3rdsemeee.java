package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Btech3rdsemeee extends AppCompatActivity {
    Button syllbus,previousquestion,notes,org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech3rdsemeee);

        syllbus=(Button)findViewById(R.id.btn3rdsemsyllbuseee) ;
        syllbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech3rdsemeee.this,syllbus3rdsemeee.class);
                startActivity(intent);
            }
        });
        previousquestion=(Button) findViewById(R.id.btn3rdsemprevqueseee);
        previousquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech3rdsemeee.this,prequestion3rdsemeee.class);
                startActivity(intent);
            }
        });
        notes=(Button) findViewById(R.id.btn3rdsemnoteeee);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech3rdsemeee.this,notes3rdsemeee.class);
                startActivity(intent);
            }
        });
        org=(Button) findViewById(R.id.btn3rdsemorganizeee);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Btech3rdsemeee.this,organiser3rdsemeee.class);
                startActivity(intent);
            }
        });
    }
}