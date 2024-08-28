
package D;

import java.util.ArrayList;
import java.util.List;

public class Vivienda {
    private long id;
    private String calle;
    private int numeroCalle;
    private double superficieTerreno;
    private Barrio barrio;
    private List<Habitacion> habitaciones = new ArrayList<>();

    public Barrio getBarrio() {
        return barrio;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void addHabitaciones(Habitacion habitacion){
        this.habitaciones.add(habitacion);
    }
    
    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }

    public Vivienda() {
    }

    public Vivienda(long id, String calle, int numeroCalle, double superficieTerreno, Barrio barrio) {
        this.id = id;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.superficieTerreno = superficieTerreno;
        this.barrio = barrio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public double getSuperficieTerreno() {
        return superficieTerreno;
    }

    public void setSuperficieTerreno(double superficieTerreno) {
        this.superficieTerreno = superficieTerreno;
    }
    
    // D.2
    public double getMetrosCuadradosCubiertos() throws MyException {
        double metrosCuadrados = 0;
        for (Habitacion habitacion : this.habitaciones) {
            metrosCuadrados += habitacion.getMetrosCuadrados();
        }
        
        if(metrosCuadrados >= this.getSuperficieTerreno()){
            throw new MyException("La superficie cubierta no puede ser mayor a la superficie del terreno.");
        }
        
        return metrosCuadrados;
    }
}
