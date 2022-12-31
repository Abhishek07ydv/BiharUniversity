package com.abhishek.biharuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllbus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllbus);
        PDFView pdfView=findViewById(R.id.pdfsyllabus1stsemcse);
        pdfView.fromAsset("CSESemester1st.pdf").load();
    }
}