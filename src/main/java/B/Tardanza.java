
package B;

import java.util.Date;

public class Tardanza {
    private long id;
    private String tipo ;
    private Date fecha;
    private int hora;
    private int minuto;
    private Empleado empleado;
    

    @Override
    public String toString() {
        return "Tardanza{" + "id= " + id + ", tipo= " + tipo + ", fecha= " + fecha.getDate()+"/"+fecha.getMonth()+"/"+fecha.getYear()+ ", hora= " + hora + ", minuto= " + minuto + '}';
    }
    

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Tardanza(long id, String tipo, Date fecha, int hora, int minuto, Empleado empleado) {
        this.id = id;
        this.tipo = tipo;
        this.fecha = fecha;
        this.hora = hora;
        this.minuto = minuto;
        this.empleado = empleado;
    }
  

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public Tardanza() {
    }
}
