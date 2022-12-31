package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllbus3rdsemeee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllbus3rdsemeee);
        PDFView pdfView=findViewById(R.id.pdfeee3);
        pdfView.fromAsset("eee3.pdf").load();
    }
}