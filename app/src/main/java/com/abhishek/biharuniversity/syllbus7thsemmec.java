package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllbus7thsemmec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllbus7thsemmec);
        PDFView pdfView=findViewById(R.id.pdfmech7);
        pdfView.fromAsset("mech7.pdf").load();
    }
}