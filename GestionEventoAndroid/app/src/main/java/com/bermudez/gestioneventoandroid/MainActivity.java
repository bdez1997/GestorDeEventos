package com.bermudez.gestioneventoandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import com.bermudez.gestioneventoandroid.controller.Store;
import com.bermudez.gestioneventoandroid.fragments.AsistenciaFragment;
import com.bermudez.gestioneventoandroid.models.Evento;
import com.google.android.material.navigation.NavigationView;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

<<<<<<< HEAD
    Button btnTest;
    ImageView imgUser;
    LocalDateTime fechaInit;
    Date fechaFin;
=======
    DrawerLayout drawerLayout;
>>>>>>> main

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
        imgUser = findViewById(R.drawable.user);
        Store.lstEventos.clear();
        btnTest=findViewById(R.id.btnTest);
        loadFragment(new AsistenciaFragment());
=======
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NavigationView navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);
>>>>>>> main

        drawerLayout = findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                0,0);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();

    }

    private void openFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

<<<<<<< HEAD
    @Override
    protected void onResume() {
        super.onResume();
        Evento ev = new Evento("Mangafest", imgUser, LocalDateTime.of(2022, Month.MAY, 23, 20, 01),LocalDateTime.of(2022, Month.AUGUST, 23, 20, 01));
        Store.lstEventos.add(ev);

    }
=======
    private void showData(){
        Store.asistenciaLst.add(new Evento("Mangafest"));
        Store.asistenciaLst.add(new Evento("Ficzone"));
>>>>>>> main

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);

        switch(item.getItemId()) {
            //case R.id.opUsuario: openFragment(new AsistenciaFragment()); break;
            case R.id.opHistorial:
                openFragment(new AsistenciaFragment());
                break;
            case R.id.salir:
                salir();
                break;
        }
        return false;
    }


    private void salir() {
        finish();
    }

}