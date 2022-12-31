package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllbus5thsem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllbus5thsem);
        PDFView pdfView=findViewById(R.id.pdfsyllabus5thsemcse);
        pdfView.fromAsset("csesemester5th.pdf").load();
    }
}