/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C;

import java.util.ArrayList;

/**
 *
 * @author Luciano
 */
public class TipoActividad {
    private int codigo;
    private String denominacion;
    private double puntosASignados;
    private ArrayList<Actividad> actividad = new ArrayList<>();

    @Override
    public String toString() {
        return "TipoActividad{" + "codigo=" + codigo + ", denominacion=" + denominacion + ", puntosASignados=" + puntosASignados + '}';
    }
   

    public ArrayList<Actividad> getActividad() {
        return actividad;
    }

    public void setActividad(ArrayList<Actividad> actividad) {
        this.actividad = actividad;
    }
    
       public void addActividad(Actividad actividad) {
        this.actividad.add(actividad);
    }
    public TipoActividad() {
    }

    public TipoActividad(int codigo, String denominacion, double puntosASignados) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.puntosASignados = puntosASignados;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public double getPuntosASignados() {
        return puntosASignados;
    }

    public void setPuntosASignados(double puntosASignados) {
        this.puntosASignados = puntosASignados;
    }
    
}
