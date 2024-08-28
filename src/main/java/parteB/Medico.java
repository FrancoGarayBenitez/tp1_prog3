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
public class Medico extends Persona {
    public int idMedico;
    public int Matricula;
    public long Celular;
    public ArrayList<Especialidad> especialidades = new ArrayList<>();
    public ArrayList<Turno> turnos = new ArrayList<>();

    public Medico(int idMedico, int Matricula, long Celular, int idPersona, String Nombre, String Apellido, long Dni, Domicilio domicilio) {
        super(idPersona, Nombre, Apellido, Dni, domicilio);
        this.idMedico = idMedico;
        this.Matricula = Matricula;
        this.Celular = Celular;
    }

    public Medico() {
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public long getCelular() {
        return Celular;
    }

    public void setCelular(long Celular) {
        this.Celular = Celular;
    }

    public ArrayList<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void addEspecialidades(Especialidad especialidades) {
        this.especialidades.add(especialidades);
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
