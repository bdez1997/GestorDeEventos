package model;

import java.awt.Image;
import java.util.Date;

public class Evento {
	
	private int idEvento;
	private Date fechaInit;
	private Date fechaFin;
	private Date HoraInit;
	private Date HoraFin;
	private int aforo;
	private String descripcion;
	private Image imagen;
	private int idUbicacion;
	public Evento(int idEvento, Date fechaInit, Date fechaFin, Date horaInit, Date horaFin, int aforo,
			String descripcion, Image imagen, int idUbicacion) {
		super();
		this.idEvento = idEvento;
		this.fechaInit = fechaInit;
		this.fechaFin = fechaFin;
		HoraInit = horaInit;
		HoraFin = horaFin;
		this.aforo = aforo;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.idUbicacion = idUbicacion;
	}
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		if(Integer.toString(idEvento).length()<=16) {
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
		if(Integer.toString(aforo).length()<=10) {
			this.aforo = aforo;
		}
	}
	public void getDescripcion(String description) {
		if(descripcion.length()<=250) {
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
		if(Integer.toString(idUbicacion).length()<=10) {
			this.idUbicacion = idUbicacion;
		}
	}
	@Override
	public String toString() {
		
		String sResultado;
		
		sResultado = getIdEvento()+"\n";
		sResultado = getFechaInit()+"\n";
		sResultado = getFechaFin()+"\n";
		sResultado = getHoraInit()+"\n";
		sResultado = getHoraFin()+"\n";
		sResultado = getAforo()+"\n";
		sResultado = getImagen()+"\n";
		sResultado = getidUbicacion()+"\n";
		sResultado = getIdEvento()+"\n";
		sResultado = getidUbicacion()+"\n";
		return sResultado;
	}

}
