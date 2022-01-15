package com.bermudez.gestioneventoandroid.controller;

import android.annotation.SuppressLint;
import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bermudez.gestioneventoandroid.R;

public class AsistenciaAdapter extends RecyclerView.Adapter<AsistenciaAdapter.ViewHolder>
        implements View.OnClickListener {
    LayoutInflater inflater;
    Context context;
    private View.OnClickListener listener;

    public AsistenciaAdapter(Context context) {

        this.inflater = LayoutInflater.from(context);
        this.context = context;
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onClick(View v) {
        if (listener != null) {
            listener.onClick(v);
        }
    }
    @NonNull
    @Override
    public AsistenciaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.fragment_asistencia, parent, false);
        view.setOnClickListener((View.OnClickListener) this);

        return new ViewHolder(view);
    }
    public int getItemCount() {
        return AsistenciaList.lstAsistenciaEvento.size();
    }

    @SuppressLint("ResourceType")
    public void onBindViewHolder(@NonNull AsistenciaAdapter.ViewHolder holder, int position) {
        String strNombreAsistencia = AsistenciaList.lstAsistenciaEvento.get(position).getsNombreEvento();
        int imgAsistenciaEvento=AsistenciaList.lstAsistenciaEvento.get(position).getImagen().getId();

        holder.txtNombreAsistencia.setText(strNombreAsistencia);
        holder.imgAsistencia.setImageResource(imgAsistenciaEvento);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtNombreAsistencia;
        ImageView imgAsistencia;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNombreAsistencia=itemView.findViewById(R.id.txtNombreAsistencia);
            imgAsistencia=(ImageView)itemView.findViewById(R.id.imgAsistencia);
        }
    }
}