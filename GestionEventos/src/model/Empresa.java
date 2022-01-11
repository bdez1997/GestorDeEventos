package model;

import java.util.Objects;

public class Empresa {

	private String sNif;
	private int iTelefono;
	private String sCorreo;

	public Empresa(String sNif, int iTelefono, String sCorreo) {

		setsNif(sNif);
		setiTelefono(iTelefono);
		setsCorreo(sCorreo);
	}

	public String getsNif() {
		return sNif;
	}

	public void setsNif(String sNif) {
		this.sNif = sNif;
	}

	public int getiTelefono() {
		return iTelefono;
	}

	public void setiTelefono(int iTelefono) {
		this.iTelefono = iTelefono;
	}

	public String getsCorreo() {
		return sCorreo;
	}

	public void setsCorreo(String sCorreo) {
		this.sCorreo = sCorreo;
	}

	public int hashCode() {
		return Objects.hash(sNif);
	}

	public boolean equals(Object obj) {
		boolean boEquals=false;
		Empresa eEmpresa=(Empresa)obj;
		if(this.getsNif().equals(eEmpresa.getsNif())) {
			boEquals=true;
		}
		return boEquals;
	}

	public String toString() {

		String sResultado;

		sResultado = "NIF: " + getsNif() + "\n";
		sResultado += "Teléfono: " + getiTelefono() + "\n";
		sResultado += "Correo: " + getsCorreo();

		return sResultado;
	}

}
