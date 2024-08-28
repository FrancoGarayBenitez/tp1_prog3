
package B;

import java.util.ArrayList;

public class Empleado {

    private String nombre;
    private long cuit;
    private String domiciolio;
    private String email;
    private ArrayList<Asistencia> asistencias = new ArrayList<>();
    private ArrayList<Tardanza> tardanzas = new ArrayList<>();
    private RegimenHorario regimenHorario;

    @Override
    public String toString() {
        return "Empleado{"
                + "\nnombre=" + nombre
                + "\ncuit=" + cuit
                + "\ndomiciolio=" + domiciolio
                + "\nemail=" + email
                + "\nregimenHorario=" + regimenHorario + '}';
    }

    public Empleado(String nombre, long cuit, String domiciolio, String email, RegimenHorario regimenHorario) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.domiciolio = domiciolio;
        this.email = email;
        this.regimenHorario = regimenHorario;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public String getDomiciolio() {
        return domiciolio;
    }

    public void setDomiciolio(String domiciolio) {
        this.domiciolio = domiciolio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Asistencia> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(ArrayList<Asistencia> asistencias) {
        this.asistencias = asistencias;
    }

    public void addAsistencias(Asistencia asistencias) {
        this.asistencias.add(asistencias);
    }

    public ArrayList<Tardanza> getTardanzas() {
        return tardanzas;
    }

    public void setTardanzas(ArrayList<Tardanza> tardanzas) {
        this.tardanzas = tardanzas;
    }

    public void addTardanzas(Tardanza tardanzas) {
        this.tardanzas.add(tardanzas);
    }

    public RegimenHorario getRegimenHorario() {
        return regimenHorario;
    }

    public void setRegimenHorario(RegimenHorario regimenHorario) {
        this.regimenHorario = regimenHorario;
    }

    public ArrayList<Asistencia> getAsistenciaXMesXAnio(int mes, int anio) {
        ArrayList<Asistencia> asistenciasArrayList = new ArrayList<>();
        for (Asistencia asistencia : this.asistencias) {
            if (asistencia.getFecha().getMonth() == mes && asistencia.getFecha().getYear() == anio) {
                asistenciasArrayList.add(asistencia);
            }
        }
        return asistenciasArrayList;
    }
    
    public ArrayList<Tardanza> getDiasConTardanza(int mes, int anio) {
        ArrayList<Tardanza> tardanzasArrayList = new ArrayList<>();
        for (Asistencia asistencia : getAsistenciaXMesXAnio(mes, anio)) {
            if (regimenHorario.getHoraIngreso() == asistencia.getHora() && regimenHorario.getMinutoIngreso() < asistencia.getMinuto() - 15) {
                tardanzasArrayList.add(new Tardanza(asistencia.getId(), asistencia.getTipo(), asistencia.getFecha(), asistencia.getHora(), asistencia.getMinuto(), this));
            } else if (regimenHorario.getHoraIngreso() < asistencia.getHora()) {
                tardanzasArrayList.add(new Tardanza(asistencia.getId(), asistencia.getTipo(), asistencia.getFecha(), asistencia.getHora(), asistencia.getMinuto(), this));

            }
        }
        return tardanzasArrayList;
    }
}
