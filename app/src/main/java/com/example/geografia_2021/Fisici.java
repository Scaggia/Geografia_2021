package com.example.geografia_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Fisici extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fisici);

        PDFView pdfView = findViewById(R.id.aspettiFisiciPDF);
        pdfView. fromAsset("fisici.pdf").load();

    }

}