package com.bermudez.gestioneventoandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.bermudez.gestioneventoandroid.controller.Store;
import com.bermudez.gestioneventoandroid.fragments.AsistenciaFragment;
import com.bermudez.gestioneventoandroid.models.Evento;

import java.util.Date;

public class MainActivity extends AppCompatActivity  {

    Button btnTest;
    ImageView imgUser;
    Date fechaInit;
    Date fechaFin;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fechaInit = new Date("11/1/2022");
        fechaFin= new Date("20/1/2022");
        imgUser = findViewById(R.drawable.user);
        Evento ev = new Evento("Mangafest", imgUser, fechaInit,fechaFin);
        Store.lstEventos.add(ev);
        btnTest=findViewById(R.id.btnTest);
        btnTest.setOnClickListener(r ->{
            loadFragment(new AsistenciaFragment());
        });


    }


    private void loadFragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragmentContainerView, fragment);
        ft.commit();
    }



}