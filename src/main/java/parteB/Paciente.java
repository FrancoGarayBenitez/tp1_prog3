/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parteB;

import java.util.ArrayList;

/**
 *
 * @author Tonga
 */
public class Paciente extends Persona {
    public int idPaciente;
    public int nroSocio;    
    public HistoriaClinica historiaClinica;
    public ArrayList<Turno> turnos = new ArrayList<>();

    public Paciente(int idPaciente, int nroSocio, HistoriaClinica historiaClinica, int idPersona, String Nombre, String Apellido, long Dni, Domicilio domicilio) {
        super(idPersona, Nombre, Apellido, Dni, domicilio);
        this.idPaciente = idPaciente;
        this.nroSocio = nroSocio;
        this.historiaClinica = historiaClinica;
    }

    public Paciente() {
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getNroSocio() {
        return nroSocio;
    }

    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void addTurnos(Turno turnos) {
        this.turnos.add(turnos);
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public long getDni() {
        return Dni;
    }

    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
    
    
}
