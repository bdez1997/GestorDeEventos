package com.bermudez.gestioneventoandroid.controller;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bermudez.gestioneventoandroid.R;

public class EventosAdapter extends RecyclerView.Adapter<EventosAdapter.ViewHolder> implements View.OnClickListener {

    LayoutInflater inflater;
    Context context;
    private View.OnClickListener listener;

    public EventosAdapter(Context context){
        this.context=context;
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    public void onClick(View v){
        if(listener != null){
            listener.onClick(v);
        }
    }

    @NonNull
    @Override
    public EventosAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_eventos_adapter, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventosAdapter.ViewHolder holder, int position) {
    
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView lblNombreEvento;
        TextView lblFechaInit;
        TextView lblFechaFin;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lblNombreEvento = itemView.findViewById(R.id.lblNombreEvento);
            lblFechaInit = itemView.findViewById(R.id.lblFechaInit);
            lblFechaFin = itemView.findViewById(R.id.lblFechaFin);
        }
    }
}