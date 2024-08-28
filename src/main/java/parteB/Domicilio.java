/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parteB;

/**
 *
 * @author Tonga
 */
public class Domicilio {
    public int idDomicilio;
    public String Localidad;
    public String Calle;
    public int  Numero;
    public Persona persona;

    public Domicilio(int idDomicilio, String Localidad, String Calle, int Numero, Persona persona) {
        this.idDomicilio = idDomicilio;
        this.Localidad = Localidad;
        this.Calle = Calle;
        this.Numero = Numero;
        this.persona = persona;
    }

    public Domicilio() {
    }

    public int getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(int idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    
}
