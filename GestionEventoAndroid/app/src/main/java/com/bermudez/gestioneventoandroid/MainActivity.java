package com.bermudez.gestioneventoandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.bermudez.gestioneventoandroid.controller.Store;
import com.bermudez.gestioneventoandroid.fragments.AsistenciaFragment;
import com.bermudez.gestioneventoandroid.models.Evento;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

public class MainActivity extends AppCompatActivity  {

    Button btnTest;
    ImageView imgUser;
    LocalDateTime fechaInit;
    Date fechaFin;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgUser = findViewById(R.drawable.user);
        Store.lstEventos.clear();
        btnTest=findViewById(R.id.btnTest);
        loadFragment(new AsistenciaFragment());


    }

    @Override
    protected void onResume() {
        super.onResume();
        Evento ev = new Evento("Mangafest", imgUser, LocalDateTime.of(2022, Month.MAY, 23, 20, 01),LocalDateTime.of(2022, Month.AUGUST, 23, 20, 01));
        Store.lstEventos.add(ev);

    }

    private void loadFragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragmentContainerView, fragment);
        ft.commit();
    }



}