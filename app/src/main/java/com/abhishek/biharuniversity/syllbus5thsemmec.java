package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllbus5thsemmec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllbus5thsemmec);
        PDFView pdfView=findViewById(R.id.pdfmech5);
        pdfView.fromAsset("mech5.pdf").load();
    }
}