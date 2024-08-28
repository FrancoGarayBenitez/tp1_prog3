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
public class Sector {
    private int numero;
    private String denominacion;
    private String tipo;
    private ArrayList<Persona> personas = new ArrayList<>();
    private ArrayList<Sector> sectors = new ArrayList<>();

    @Override
    public String toString() {
        return "Sector{" + "numero=" + numero + ", denominacion=" + denominacion + ", tipo=" + tipo + '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
    public void addPersonas(Persona personas) {
        this.personas.add(personas);
    }

    public ArrayList<Sector> getSectors() {
        return sectors;
    }

    public void setSectors(ArrayList<Sector> sectors) {
        this.sectors = sectors;
    }
     public void addSectors(Sector sectors) {
        this.sectors.add(sectors);
    }

    public Sector(int numero, String denominacion, String tipo) {
        this.numero = numero;
        this.denominacion = denominacion;
        this.tipo = tipo;
    }

    public Sector() {
    }
   
     public ArrayList<Sector> obtenerTotalSubsectores(){
        ArrayList<Sector> listaRecursiva =new ArrayList<>();
        listaSectorsRecursion(this, listaRecursiva);
        return listaRecursiva;
    }
     
    public void listaSectorsRecursion (Sector ex, ArrayList<Sector> lista){
        lista.add(ex);
        if(ex.getSectors() != null){
            for (Sector sector : ex.getSectors()) {
                listaSectorsRecursion(sector, lista);
            }
        }
    }
}
