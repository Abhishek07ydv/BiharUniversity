package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class iiteee extends AppCompatActivity {
    public Button btnfirstsem,btnsecondsem,btnthirdsem,btnforthsem,btnfifthsem,btnsixthsem,btnsevensem,btneighthsem;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iiteee);
        btnfirstsem=(Button) findViewById(R.id.iiteeebtn1stsem);
        btnfirstsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iiteee.this,iitsyllabuseee1stsem.class);
                startActivity(intent);
            }
        });

        btnsecondsem=(Button) findViewById(R.id.iiteeebtn2ndsem);
        btnsecondsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iiteee.this,iitsyllabuseee2ndsem.class);
                startActivity(intent);
            }
        });
        btnthirdsem=(Button) findViewById(R.id.iiteeebtn3rdsem);
        btnthirdsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iiteee.this,iitsyllabuseee3rdsem.class);
                startActivity(intent);
            }
        });
        btnforthsem=(Button) findViewById(R.id.iiteeebtn4thsem);
        btnforthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iiteee.this,iitsyllabuseee4thsem.class);
                startActivity(intent);
            }
        });
        btnfifthsem=(Button) findViewById(R.id.iiteeebtn5thsem);
        btnfifthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iiteee.this,iitsyllabuseee5thsem.class);
                startActivity(intent);
            }
        });

        btnsixthsem=(Button) findViewById(R.id.iiteeebtn6thsem);
        btnsixthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iiteee.this,iitsyllabuseee6thsem.class);
                startActivity(intent);
            }
        });

        btnsevensem=(Button) findViewById(R.id.iiteeebtn7thsem);
        btnsevensem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iiteee.this,iitsyllabuseee7thsem.class);
                startActivity(intent);
            }
        });
        btneighthsem=(Button) findViewById(R.id.iiteeebtn8thsem);
        btneighthsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iiteee.this,iitsyllabuseee8thsem.class);
                startActivity(intent);
            }
        });
    }
}