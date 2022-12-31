package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllbus3rdsemmec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllbus3rdsemmec);
        PDFView pdfView=findViewById(R.id.pdfmech3);
        pdfView.fromAsset("mech3.pdf").load();
    }
}