
package D;

import java.util.ArrayList;
import java.util.List;

public class Barrio {
    private long id;
    private String nombre;
    private String empresaConstructora;
    private List<Vivienda> viviendas = new ArrayList<>();

    public List<Vivienda> getViviendas() {
        return viviendas;
    }

    public void setViviendas(List<Vivienda> viviendas) {
        this.viviendas = viviendas;
    }

    public Barrio() {
    }

    public Barrio(long id, String nombre, String empresaConstructora) {
        this.id = id;
        this.nombre = nombre;
        this.empresaConstructora = empresaConstructora;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresaConstructora() {
        return empresaConstructora;
    }

    public void setEmpresaConstructora(String empresaConstructora) {
        this.empresaConstructora = empresaConstructora;
    }
    
    public void addViviendas(Vivienda vivienda){
        this.viviendas.add(vivienda);
    }
    
    // D.1
    public double getSuperficieTotalTerreno(){
        double superficie = 0;
        for(Vivienda vivienda: this.viviendas){
            superficie += vivienda.getSuperficieTerreno();
        }
        return superficie;
    }
    
    // D.3
    public double getSuperficieTotalCubierta() throws MyException {
        double superficieTotal = 0;
        
        for(Vivienda vivienda: this.viviendas){
            superficieTotal += vivienda.getMetrosCuadradosCubiertos();
        }
        
        return superficieTotal;
    } 
    
}
