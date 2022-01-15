package com.bermudez.gestioneventoandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.bermudez.gestioneventoandroid.fragments.AsistenciaFragment;

public class MainActivity extends AppCompatActivity  {

    Button btnTest;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTest=findViewById(R.id.btnTest);

        btnTest.setOnClickListener(e->{
            Intent i = new Intent(this, AsistenciaFragment.class);
            startActivity(i);
        });

        
    }
}