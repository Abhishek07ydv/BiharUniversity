package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllbus7thsemeee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllbus7thsemeee);
        PDFView pdfView=findViewById(R.id.pdfeee7);
        pdfView.fromAsset("eee7.pdf").load();
    }
}