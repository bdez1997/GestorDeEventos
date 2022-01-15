package com.bermudez.gestioneventoandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import com.bermudez.gestioneventoandroid.Fragments.AsistenciaFragment;
import com.bermudez.gestioneventoandroid.models.Evento;

public class MainActivity extends AppCompatActivity {

    Button btnTest;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTest=findViewById(R.id.btnTest);

        btnTest.setOnClickListener(e->{
            Intent i = new Intent(this, AsistenciaFragment.class);
        });

        
    }
}