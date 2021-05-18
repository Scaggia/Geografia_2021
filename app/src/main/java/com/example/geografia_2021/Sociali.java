package com.example.geografia_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Sociali extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sociali);

        PDFView pdfView = findViewById(R.id.aspettiSocialiPDF);
        pdfView. fromAsset("sociali.pdf").load();
    }
}