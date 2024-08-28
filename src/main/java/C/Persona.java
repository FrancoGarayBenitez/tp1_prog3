/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Persona {
    private String nombre;
    private String tipoDocumento;
    private long nroDocumento;
    private int telefono;
    private String email;
    private String celular;
    private ArrayList<Actividad> actividads;
    private Sector sectores;

    @Override
    public String toString() {
        return "Persona{" + 
                "\nnombre=" + nombre + 
                "\ntipoDocumento=" + tipoDocumento + 
                "\nnroDocumento=" + nroDocumento +
                "\ntelefono=" + telefono +
                "\nemail=" + email + 
                "\ncelular=" + celular + '}';
    }
    public void mostrarActividades(){
        for (Actividad actividad : actividads) {
            System.out.println("--------------------------------");
            System.out.println(actividad);
            
        }
    }

    public Persona() {
    }

    public Persona(String nombre, String tipoDocumento, long nroDocumento, int telefono, String email, String celular, Sector sectores) {
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.telefono = telefono;
        this.email = email;
        this.celular = celular;
        this.sectores = sectores;
        this.actividads = new ArrayList<>();
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public long getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(long nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public ArrayList<Actividad> getActividads() {
        return actividads;
    }

    public void setActividads(ArrayList<Actividad> actividads) {
        this.actividads = actividads;
    }
     public void addActividads(Actividad actividads) {
        this.actividads.add(actividads);
    }


    public Sector getSectores() {
        return sectores;
    }

    public void setSectores(Sector sectores) {
        this.sectores = sectores;
    }
    public double totalPuntosAsignados(){
        double totalPuntosAsignados=0;
        for (Actividad actividad : actividads) {
            totalPuntosAsignados+= actividad.getTipoActividad().getPuntosASignados();
        }
        return totalPuntosAsignados;
    }
    
    public double totalPuntosAsignados (int codigo){
        double totalPuntosAsignados = 0;
        
        for (Actividad actividad : actividads) {
            if (codigo== actividad.getTipoActividad().getCodigo()) {
                totalPuntosAsignados += actividad.getTipoActividad().getPuntosASignados();
            }
        }
        return totalPuntosAsignados;
    }
    public double totalPuntosAsignados (int codigo, int anio){
        double totalPuntosAsignados = 0;
        for (Actividad actividad : actividads) {
            if (codigo== actividad.getTipoActividad().getCodigo()&&anio==actividad.getFechaFin().getYear()) {
                totalPuntosAsignados += actividad.getTipoActividad().getPuntosASignados();
            }
        }
        return totalPuntosAsignados;
    }
    public boolean verificarCodigo(int codigo){
        for (Actividad actividad : actividads) {
               if (codigo== actividad.getTipoActividad().getCodigo()) {
                return true;
            }
        }
        return false;
    }
    public boolean verificarActividad(int anio){
        for (Actividad actividad : actividads) {
               if (anio== actividad.getFechaFin().getYear()) {
                return true;
            }
        }
        return false;
    }
    
    public boolean verificarCodigoyanio(int codigo, int anio){
        for (Actividad actividad : actividads) {
               if (codigo== actividad.getTipoActividad().getCodigo()) {
                   verificarActividad(anio);
                return true;
            }
        }
        return false;
    }
    
    
}
