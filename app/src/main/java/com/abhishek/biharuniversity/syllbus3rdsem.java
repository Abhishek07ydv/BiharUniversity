package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllbus3rdsem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllbus3rdsem);
        PDFView pdfView=findViewById(R.id.pdfviewcse3rdsemsyllabus);
        pdfView.fromAsset("CSE3rdsemsyllabus.pdf").load();
    }
}