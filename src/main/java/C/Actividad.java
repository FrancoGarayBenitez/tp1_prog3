/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C;

import java.util.Date;

/**
 *
 * @author Luciano
 */
public class Actividad {
    private Date fechaInicio;
    private Date fechaFin;
    private String nombre;
    private String descripcion;
    private TipoActividad tipoActividad;
    private Persona personas ;

    @Override
    public String toString() {
        return "Actividad{" + 
                "\nfechaInicio=" + devolverfecha(fechaInicio) + 
                "\nfechaFin=" + devolverfecha(fechaFin) + 
                "\nnombre=" + nombre + 
                "\ndescripcion=" + descripcion + 
                "\ntipoActividad=" + tipoActividad + '}';
    }
    public String devolverfecha(Date fecha){
        return fecha.getDate()+"/"+fecha.getMonth()+"/"+fecha.getYear();
    }
    public Actividad() {
    }

    public Actividad(Date fechaInicio, Date fechaFin, String nombre, String descripcion, TipoActividad tipoActividad, Persona personas) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoActividad = tipoActividad;
        this.personas = personas;
    }

    

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoActividad getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(TipoActividad tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public Persona getPersonas() {
        return personas;
    }

    public void setPersonas(Persona personas) {
        this.personas = personas;
    }
    
    
}
