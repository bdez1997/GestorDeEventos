package com.bermudez.gestioneventoandroid.models;

<<<<<<< HEAD
import android.media.Image;

import java.time.LocalDate;

public class Evento {

    private String nombre;
    private int idEvento;
    private LocalDate fechaInit;
    private LocalDate fechaFin;
    private LocalDate HoraInit;
    private LocalDate HoraFin;
    private int aforo;
    private String descripcion;
    private Image imagen;
    private int idUbicacion;

    public Evento(int idEvento, LocalDate fechaInit, LocalDate fechaFin, LocalDate horaInit, LocalDate horaFin, int aforo,
                  String descripcion, Image imagen, int idUbicacion,String nombre) {

        this.nombre = nombre;
        this.idEvento = idEvento;
        this.fechaInit = fechaInit;
        this.fechaFin = fechaFin;
        this.HoraInit = horaInit;
        this.HoraFin = horaFin;
        this.aforo = aforo;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.idUbicacion = idUbicacion;
    }

    public void getNombre(String nombre) {
        if (nombre.length() <= 250) {
            this.nombre = nombre;
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
=======
import android.net.Uri;
import android.widget.ImageView;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Evento {

    private String sNombreEvento;
    private int idEvento;
    private LocalDateTime fechaInit;
    private LocalDateTime fechaFin;
    private Date HoraInit;
    private Date HoraFin;
    private int aforo;
    private String descripcion;
    private ImageView imagen;
    private int idUbicacion;


    public Evento(String sNombre){
        setsNombreEvento(sNombre);
    }

    public Evento(String sNombre, ImageView imgEvento, LocalDateTime fechaInit, LocalDateTime fechaFin){
        setsNombreEvento(sNombre);
        setImagen(imgEvento);
        setFechaInit(fechaInit);
        setFechaFin(fechaFin);

    }
    public Evento(int idEvento,String sNombreEvento, LocalDateTime fechaInit, LocalDateTime fechaFin, Date horaInit, Date horaFin, int aforo,
                  String descripcion, ImageView imagen, int idUbicacion) {

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
>>>>>>> main
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        if (Integer.toString(idEvento).length() <= 16) {
            this.idEvento = idEvento;
        }
    }

<<<<<<< HEAD
    public LocalDate getFechaInit() {
        return fechaInit;
    }

    public void setFechaInit(LocalDate fechaInit) {
        this.fechaInit = fechaInit;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getHoraInit() {
        return HoraInit;
    }

    public void setHoraInit(LocalDate horaInit) {
        HoraInit = horaInit;
    }

    public LocalDate getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(LocalDate horaFin) {
=======
    public LocalDateTime getFechaInit() {
        return fechaInit;
    }

    public void setFechaInit(LocalDateTime fechaInit) {
        this.fechaInit = fechaInit;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
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
>>>>>>> main
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

<<<<<<< HEAD
    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
=======
    public ImageView getImagen() {
        return imagen;
    }

    public void setImagen(ImageView imagen) {
>>>>>>> main
        this.imagen = imagen;
    }

    public int getidUbicacion() {
        return idUbicacion;
    }

    public void setidUbicacion(int idUbicacion) {
        if (Integer.toString(idUbicacion).length() <= 10) {
            this.idUbicacion = idUbicacion;
        }
    }

<<<<<<< HEAD
=======
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

>>>>>>> main
    @Override
    public String toString() {

        String sResultado;

        sResultado = getIdEvento() + "\n";
<<<<<<< HEAD
        sResultado = getFechaInit() + "\n";
        sResultado = getFechaFin() + "\n";
        sResultado = getHoraInit() + "\n";
        sResultado = getHoraFin() + "\n";
        sResultado = getAforo() + "\n";
        sResultado = getImagen() + "\n";
        sResultado = getidUbicacion() + "\n";
        sResultado = getIdEvento() + "\n";
=======
        sResultado += getFechaInit() + "\n";
        sResultado += getFechaFin() + "\n";
        sResultado += getHoraInit() + "\n";
        sResultado += getHoraFin() + "\n";
        sResultado += getAforo() + "\n";
        sResultado += getImagen() + "\n";
        sResultado += getidUbicacion() + "\n";
        sResultado += getIdEvento() + "\n";
>>>>>>> main
        sResultado = getidUbicacion() + "\n";
        return sResultado;
    }

}
