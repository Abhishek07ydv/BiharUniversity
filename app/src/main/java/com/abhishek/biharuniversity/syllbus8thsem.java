package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllbus8thsem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllbus8thsem);
        PDFView pdfView=findViewById(R.id.pdfsyllabus8thsemcse);
        pdfView.fromAsset("csesemester8th.pdf").load();
    }
}