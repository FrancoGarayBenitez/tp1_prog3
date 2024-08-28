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
public class Especialidad {
    public int idEspecialidad;
    public String Denominacion;
    public ArrayList<Medico> medicos = new ArrayList<>();

    public Especialidad(int idEspecialidad, String Denominacion) {
        this.idEspecialidad = idEspecialidad;
        this.Denominacion = Denominacion;
    }

    public Especialidad() {
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getDenominacion() {
        return Denominacion;
    }

    public void setDenominacion(String Denominacion) {
        this.Denominacion = Denominacion;
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public void addMedicos(Medico medicos) {
        this.medicos.add(medicos);
    }
    
    
    
}
