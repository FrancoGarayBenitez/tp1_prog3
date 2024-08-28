
package D;

public class Habitacion {
    private long id;
    private String nombre;
    private long metrosCuadrados;
    private Vivienda vivienda;

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }

    public Habitacion() {
    }

    public Habitacion(long id, String nombre, long metrosCuadrados, Vivienda vivienda) {
        this.id = id;
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
        this.vivienda = vivienda;
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

    public long getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(long metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    
}
