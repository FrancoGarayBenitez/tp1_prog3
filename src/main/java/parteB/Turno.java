/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parteB;

import java.util.Date;

/**
 *
 * @author Tonga
 */
public class Turno {
    public int idTurno;
    public Date Fecha;
    public int Hora;
    public int Minutos;
    public Medico medico;
    public Paciente paciente;

    public Turno(int idTurno, Date Fecha, int Hora, int Minutos, Medico medico, Paciente paciente) {
        this.idTurno = idTurno;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Minutos = Minutos;
        this.medico = medico;
        this.paciente = paciente;
    }

    public Turno() {
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public int getHora() {
        return Hora;
    }

    public void setHora(int Hora) {
        this.Hora = Hora;
    }

    public int getMinutos() {
        return Minutos;
    }

    public void setMinutos(int Minutos) {
        this.Minutos = Minutos;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
}
