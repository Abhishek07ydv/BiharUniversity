package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllbus5thsemeee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllbus5thsemeee);
        PDFView pdfView=findViewById(R.id.pdfeee5);
        pdfView.fromAsset("eee5.pdf").load();
    }
}