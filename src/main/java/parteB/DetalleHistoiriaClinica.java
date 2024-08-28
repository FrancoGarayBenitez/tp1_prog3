/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parteB;

import java.util.Date;

/**
 *
 * @author Tonga
 */
public class DetalleHistoiriaClinica {
    public int idDetalleHC;
    public Date FechaAtencion;
    public String Sintomas;
    public String Diagnostico;
    public String Observaciones;
    public HistoriaClinica historiaClinica;

    public DetalleHistoiriaClinica(int idDetalleHC, Date FechaAtencion, String Sintomas, String Diagnostico, String Observaciones, HistoriaClinica historiaClinica) {
        this.idDetalleHC = idDetalleHC;
        this.FechaAtencion = FechaAtencion;
        this.Sintomas = Sintomas;
        this.Diagnostico = Diagnostico;
        this.Observaciones = Observaciones;
        this.historiaClinica = historiaClinica;
    }

    public DetalleHistoiriaClinica() {
    }

    public int getIdDetalleHC() {
        return idDetalleHC;
    }

    public void setIdDetalleHC(int idDetalleHC) {
        this.idDetalleHC = idDetalleHC;
    }

    public Date getFechaAtencion() {
        return FechaAtencion;
    }

    public void setFechaAtencion(Date FechaAtencion) {
        this.FechaAtencion = FechaAtencion;
    }

    public String getSintomas() {
        return Sintomas;
    }

    public void setSintomas(String Sintomas) {
        this.Sintomas = Sintomas;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
    
    
    
}
