package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllbus4thsemmec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllbus4thsemmec);
        PDFView pdfView=findViewById(R.id.pdfmech4);
        pdfView.fromAsset("mech4.pdf").load();
    }
}