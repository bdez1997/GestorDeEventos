package com.bermudez.gestioneventoandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bermudez.gestioneventoandroid.controller.AsistenciaList;
import com.bermudez.gestioneventoandroid.fragments.AsistenciaFragment;

public class MainActivity extends AppCompatActivity  {

    Button btnTest;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnTest=findViewById(R.id.btnTest);

        btnTest.setOnClickListener(r ->{
            this.abrirAsistencia();
        });
    }

    private void abrirAsistencia(){
        Intent intent = new Intent(this, AsistenciaList.class);
        startActivity(intent);
    }



}