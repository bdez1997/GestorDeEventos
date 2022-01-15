package com.bermudez.gestioneventoandroid.models;

import android.net.Uri;
import android.widget.ImageView;

import java.net.URI;
import java.util.Date;
import java.util.Objects;

public class Evento {

    private String sNombreEvento;
    private int idEvento;
    private Date fechaInit;
    private Date fechaFin;
    private Date HoraInit;
    private Date HoraFin;
    private int aforo;
    private String descripcion;
    private ImageView imagen;
    private int idUbicacion;



    public Evento(Uri imagen){
        setImagen(imagen);
    }
    public Evento(int idEvento,String sNombreEvento, Date fechaInit, Date fechaFin, Date horaInit, Date horaFin, int aforo,
                  String descripcion, Uri imagen, int idUbicacion) {

        setIdEvento(idEvento);
        setsNombreEvento(sNombreEvento);
        setFechaInit(fechaInit);
        setFechaFin(fechaFin);
        setHoraInit(horaInit);
        setHoraFin(horaFin);
        setAforo(aforo);
        setDescripcion(descripcion);
        setImagen(imagen);
        setIdEvento(idUbicacion);
    }

    public String getsNombreEvento() {
        return sNombreEvento;
    }

    public void setsNombreEvento(String sNombreEvento) {
        this.sNombreEvento = sNombreEvento;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        if (Integer.toString(idEvento).length() <= 16) {
            this.idEvento = idEvento;
        }
    }

    public Date getFechaInit() {
        return fechaInit;
    }

    public void setFechaInit(Date fechaInit) {
        this.fechaInit = fechaInit;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getHoraInit() {
        return HoraInit;
    }

    public void setHoraInit(Date horaInit) {
        HoraInit = horaInit;
    }

    public Date getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(Date horaFin) {
        HoraFin = horaFin;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        if (Integer.toString(aforo).length() <= 10) {
            this.aforo = aforo;
        }
    }

    public void getDescripcion(String description) {
        if (descripcion.length() <= 250) {
            this.descripcion = descripcion;
        }
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ImageView getImagen() {
        return imagen;
    }

    public void setImagen(Uri imagen) {
        this.imagen.setImageURI(imagen);
    }

    public int getidUbicacion() {
        return idUbicacion;
    }

    public void setidUbicacion(int idUbicacion) {
        if (Integer.toString(idUbicacion).length() <= 10) {
            this.idUbicacion = idUbicacion;
        }
    }

    public int hashCode() {
        return Objects.hash(idEvento);
    }

    public boolean equals(Object obj) {

        boolean boEquals = false;
        Evento oEvento = (Evento)obj;
        if(oEvento.getIdEvento()!=0 &&this.getIdEvento()!=0
                && this.getIdEvento()==oEvento.idEvento) {

            boEquals=true;
        }

        return boEquals;
    }

    @Override
    public String toString() {

        String sResultado;

        sResultado = getIdEvento() + "\n";
        sResultado = getFechaInit() + "\n";
        sResultado = getFechaFin() + "\n";
        sResultado = getHoraInit() + "\n";
        sResultado = getHoraFin() + "\n";
        sResultado = getAforo() + "\n";
        sResultado = getImagen() + "\n";
        sResultado = getidUbicacion() + "\n";
        sResultado = getIdEvento() + "\n";
        sResultado = getidUbicacion() + "\n";
        return sResultado;
    }

}
