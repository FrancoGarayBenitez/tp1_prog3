
package A;

import java.util.ArrayList;

public class Control {
    private int id;
    private String denominacion;
    private boolean esObligatorio;
    private ArrayList<Expediente> listExpedientes = new ArrayList<>();
    private EstadoControl estadoControl;

    public Control() {
    }

    public Control(int id, String denominacion, boolean esObligatorio, EstadoControl estadoControl) {
        this.id = id;
        this.denominacion = denominacion;
        this.esObligatorio = esObligatorio;
        this.estadoControl = estadoControl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public boolean esObligatorio() {
        return esObligatorio;
    }

    public void setEsObligatorio(boolean esObligatorio) {
        this.esObligatorio = esObligatorio;
    }

    public ArrayList<Expediente> getListExpedientes() {
        return listExpedientes;
    }

    public void setListExpedientes(ArrayList<Expediente> listExpedientes) {
        this.listExpedientes = listExpedientes;
    }

    public EstadoControl getEstadoControl() {
        return estadoControl;
    }

    public void setEstadoControl(EstadoControl estadoControl) {
        this.estadoControl = estadoControl;
    }
    
    
}
