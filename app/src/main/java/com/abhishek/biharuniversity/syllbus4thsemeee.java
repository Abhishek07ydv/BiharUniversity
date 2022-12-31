package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllbus4thsemeee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllbus4thsemeee);
        PDFView pdfView=findViewById(R.id.pdfeee4);
        pdfView.fromAsset("eee4.pdf").load();
    }
}