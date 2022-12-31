package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllbus4thsem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllbus4thsem);
        PDFView pdfView=findViewById(R.id.pdfsyllabus4thsemcse);
        pdfView.fromAsset("csesemester4th.pdf").load();
    }
}