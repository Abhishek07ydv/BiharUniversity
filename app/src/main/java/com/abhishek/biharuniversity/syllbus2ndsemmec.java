package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllbus2ndsemmec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllbus2ndsemmec);
        PDFView pdfView=findViewById(R.id.pdfmech2);
        pdfView.fromAsset("mech2.pdf").load();
    }
}