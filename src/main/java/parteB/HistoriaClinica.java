/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parteB;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Tonga
 */
public class HistoriaClinica {
    public int idHistoriaClinica;
    public int Numero;
    public Date FechaAlta;
    public Paciente paciente;
    public ArrayList<DetalleHistoiriaClinica> detalleHistoiriaClinicas = new ArrayList<>();

    public HistoriaClinica(int idHistoriaClinica, int Numero, Date FechaAlta, Paciente paciente) {
        this.idHistoriaClinica = idHistoriaClinica;
        this.Numero = Numero;
        this.FechaAlta = FechaAlta;
        this.paciente = paciente;
    }

    public HistoriaClinica() {
    }

    public int getIdHistoriaClinica() {
        return idHistoriaClinica;
    }

    public void setIdHistoriaClinica(int idHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public Date getFechaAlta() {
        return FechaAlta;
    }

    public void setFechaAlta(Date FechaAlta) {
        this.FechaAlta = FechaAlta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public ArrayList<DetalleHistoiriaClinica> getDetalleHistoiriaClinicas() {
        return detalleHistoiriaClinicas;
    }

    public void setDetalleHistoiriaClinicas(ArrayList<DetalleHistoiriaClinica> detalleHistoiriaClinicas) {
        this.detalleHistoiriaClinicas = detalleHistoiriaClinicas;
    }
    
    
    
    
    
}
