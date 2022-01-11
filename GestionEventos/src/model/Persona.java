package model;

import java.util.regex.Pattern;

public class Persona implements IMaxCaracteres{
    private String sDni;
    private String sNombre;
    private String sApellido;
    private String sUsername;
    private String sPassword;
    private String sCorreo;
    private String sTelefono;
    private String sRol;
    private String sInformacion; 
    

    public String getsDni() {
        return sDni;
    }

    public void setsDni(String sDni) {
        String dniRegexp = "\\d{8}[A-HJ-NP-TV-Z]";
		if (Pattern.matches(dniRegexp, sDni)) {
			this.sDni = sDni;
		}
    }

    public String getsNombre() {
        return sNombre;
    }
    public void setsNombre(String sNombre) {
        if (sNombre != null && sNombre.length() > IMINIMO && sNombre.length() < IMAXNOMBRE)  {
            this.sNombre = sNombre;
        }
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        if (sApellido != null && sApellido.length() > IMINIMO && sApellido.length() < IMAXAPELLIDOS)  {
            this.sApellido = sApellido;
        }    
    }

    public String getsUsername() {
        return sUsername;
    }

    public void setsUsername(String sUsername) {
        if (sUsername != null && sUsername.length() < IMAXUSER && sUsername.length() > IMINIMO) {
            this.sUsername = sUsername;
        }
    }

    public String getsPassword() {
        return sPassword;
    }


    public void setsPassword(String sPassword) {
        if(sPassword != null && sPassword.length() < IMAXPASS && sPassword.length() > IMINIMO){
            this.sPassword = sPassword;
        }
        this.sPassword = sPassword;
    }


    public String getsCorreo() {
        return sCorreo;
    }


    public void setsCorreo(String sCorreo) {
        String emailRegexp = "\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b";
        if (Pattern.matches(emailRegexp, sCorreo)) {
			this.sCorreo = sCorreo;
		}
        this.sCorreo = sCorreo;
    }
    public String getsTelefono() {
        return sTelefono;
    }
    public void setsTelefono(String sTelefono) {
        this.sTelefono = sTelefono;
    }
    public String getsRol() {
        return sRol;
    }
    public void setsRol(String sRol) {
        this.sRol = sRol;
    }
    public String getsInformacion() {
        return sInformacion;
    }
    public void setsInformacion(String sInformacion) {
        this.sInformacion = sInformacion;
    }
   

    
}
