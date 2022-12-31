package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllbus3rdsemc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllbus3rdsemc);
        PDFView pdfView=findViewById(R.id.pdfcivil3);
        pdfView.fromAsset("civil3.pdf").load();
    }
}