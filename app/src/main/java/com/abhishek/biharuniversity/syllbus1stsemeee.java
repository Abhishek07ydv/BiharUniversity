package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllbus1stsemeee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllbus1stsemeee);
        PDFView pdfView=findViewById(R.id.pdfeee1);
        pdfView.fromAsset("eee1.pdf").load();
    }
}