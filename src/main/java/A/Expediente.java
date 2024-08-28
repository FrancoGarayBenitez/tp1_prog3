
package A;

import java.util.ArrayList;
import java.util.List;

public class Expediente {
    private int id;
    private String letra;
    private int numero;
    private String descripcion, tipo, ambito;
    private ArrayList<Control> listControles;
    
    // Relación así mismo, un expediente puede tener un padre, si no lo tiene
    // es debido a que es el expediente raíz; asi mismo también puede tener hijos.
    private Expediente expedientePadre;
    private List<Expediente> expedientesHijos;
    
     

    public Expediente getExpedientePadre() {
        return expedientePadre;
    }

    public Expediente() {
   
    }
        
    public Expediente(int id, String letra, int numero, String descripcion, String tipo, String ambito) {
        this.id = id;
        this.letra = letra;
        this.numero = numero;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.ambito = ambito;
        this.listControles = new ArrayList<>();
        this.expedientesHijos = new ArrayList<>();
    }

    public void setExpedientePadre(Expediente expedientePadre) {
        this.expedientePadre = expedientePadre;
    }

    public List<Expediente> getExpedientesHijos() {
        return expedientesHijos;
    }

    public void setExpedientesHijos(List<Expediente> expedientesHijos) {
        this.expedientesHijos = expedientesHijos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public ArrayList<Control> getListControles() {
        return listControles;
    }

    public void setListControles(ArrayList<Control> listControles) {
        this.listControles = listControles;
    }
    
    public void addControles(Control control){
        this.listControles.add(control);
    }
    
    public void addExpedientesHijos(Expediente expHijo){
        this.expedientesHijos.add(expHijo);
    }
    
    // A.1
    public String getCaratulaExpediente(){
        return getNumero() + " - " + getLetra() + " - " + getDescripcion();
    }
    
    // A.2
    public List<String> getControlesObligatorios(){
        List<String> controlesObligatorios = new ArrayList<>();
        
        if(this.getListControles() != null){
            for(Control control: this.getListControles()){
                if(control.esObligatorio()){
                    controlesObligatorios.add(control.getDenominacion());
                }
            }
        }
        return controlesObligatorios;
    }
    
    // A.3
    public boolean getEstadoControles(){
        if(this.getListControles() != null){
            for(Control control: this.getListControles()){
                if(control.esObligatorio() && !control.getEstadoControl().isAprobado()){
                    return false;
                }
            }
        }
        return true;
    }
    
    // A.4
    // Métodos para recorrer el árbol de expedientes con recursión
    public List<Expediente> listaExpedientes(){
        List<Expediente> listaRecursiva = new ArrayList<Expediente>();
        // Llamado a método recursivo para verificar si tiene hijos y así recorrerlos.
        listaExpedienteRecursion(this, listaRecursiva);
        
        // La lista tendrá el recorrido completo de todos los hijos del nodo desde
        // nos encontremos
        return listaRecursiva;
    }
    
    public void listaExpedienteRecursion(Expediente ex, List<Expediente> lista){
        lista.add(ex);    
        // Verifica si el expediente tiene hijos, si los tiene los recorre y así
        // sucesivamente hasta llegar al que no tenga hijos.
        if(ex.getExpedientesHijos() != null){
            for(Expediente exHijo: ex.getExpedientesHijos()){
                listaExpedienteRecursion(exHijo, lista);
            }
        }
    }
    
    
}
