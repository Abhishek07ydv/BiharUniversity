package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllbus2ndsemc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllbus2ndsemc);
        PDFView pdfView=findViewById(R.id.pdfcivil2);
        pdfView.fromAsset("civil2.pdf").load();
    }
}