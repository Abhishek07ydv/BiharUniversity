package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllbus6thsem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllbus6thsem);
        PDFView pdfView=findViewById(R.id.pdfsyllabus6thsemcse);
        pdfView.fromAsset("csesemester6th.pdf").load();
    }
}