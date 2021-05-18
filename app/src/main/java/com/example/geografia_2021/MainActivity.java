package com.example.geografia_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void apriItaliano(View v){

        //Intent per aprire una nuova activity che conterrà gli aspetti storici in pdf

        Intent i =new Intent(this,Italiano.class);
        // Creo un oggetto di tipo Internet (cioè una nuova activity, basata su questa stessa Activity
        // e chiamata SettingsActivity.class)
        startActivity(i);
        //visualizza l'activity richiamato

    }

    public void apriInglese(View v){

        //Intent per aprire una nuova activity che conterrà gli aspetti storici in pdf

        Intent i =new Intent(this,Inglese.class);
        // Creo un oggetto di tipo Internet (cioè una nuova activity, basata su questa stessa Activity
        // e chiamata SettingsActivity.class)
        startActivity(i);
        //visualizza l'activity richiamato

    }







}