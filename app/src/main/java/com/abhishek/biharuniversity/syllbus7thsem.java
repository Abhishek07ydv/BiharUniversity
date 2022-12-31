package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllbus7thsem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllbus7thsem);
        PDFView pdfView=findViewById(R.id.pdfsyllabus7thsemcse);
        pdfView.fromAsset("csesemester7th.pdf").load();
    }
}