package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllbus2ndsem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllbus2ndsem);
        PDFView pdfView=findViewById(R.id.pdfsyllabus2ndsemcse);
        pdfView.fromAsset("csesemester2nd.pdf").load();
    }
}