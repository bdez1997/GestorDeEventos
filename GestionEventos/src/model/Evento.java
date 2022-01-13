package model;

import java.awt.Image;
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
	}

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		if (Integer.toString(idEvento).length() <= 16) {
			this.idEvento = idEvento;
		}
	}

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

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
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
