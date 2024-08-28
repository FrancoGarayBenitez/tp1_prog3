/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package C;

import java.util.Date;

/**
 *
 * @author Luciano
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //creo el objeto persona con los atributos del constructor
        Persona persona = new Persona("Luciano", "DNI", 254555, 54665464, "Luciano@gmail.com", "546546", new Sector(654, "finanzas", "C"));
        
        //comienzo agregar actividades al ArrayList de Actividades
        persona.addActividads(new Actividad(new Date(2024,12,1), new Date(2024, 12, 15), "Lectura", "descripcion", new TipoActividad(2, "denominacion", 5), persona));
        persona.addActividads(new Actividad(new Date(2024,12,1), new Date(2024, 12, 15), "Lectura", "descripcion", new TipoActividad(2, "denominacion", 4), persona));
        persona.addActividads(new Actividad(new Date(2024,5,2), new Date(2024, 7, 1), "Lectura", "descripcion", new TipoActividad(2, "denominacion", 15), persona));
        persona.addActividads(new Actividad(new Date(2024,5,1), new Date(2024, 10, 1), "Lectura", "descripcion", new TipoActividad(2, "denominacion", 65), persona));
        persona.addActividads(new Actividad(new Date(2024,2,13), new Date(2024, 12, 25), "Lectura", "descripcion", new TipoActividad(2, "denominacion", 35), persona));
        persona.addActividads(new Actividad(new Date(2024,12,3), new Date(2024, 12, 5), "Lectura", "descripcion", new TipoActividad(2, "denominacion", 45), persona));
        
        //al sector pirncipal le agrego sub sectores
        persona.getSectores().addSectors(new Sector(2, "denominacion", "tipo"));
        persona.getSectores().addSectors(new Sector(2, "denominacion", "tipo"));
        persona.getSectores().addSectors(new Sector(2, "denominacion", "tipo"));
        
        //agrego a uno de los subsectores un subsector propio
        persona.getSectores().getSectors().get(2).addSectors(new Sector(3, "denominacion3", "tipo3"));
        
        //comienzo a mostrar por pantalla toda la informacion ya cargada y compruebo si los metodos pedidos estan funcionando
        System.out.println(persona);
        System.out.println("--------------------------------");
        persona.mostrarActividades();
        System.out.println("Puntos obtenidos de las actividades: "+ persona.totalPuntosAsignados());
        System.out.println("Puntos obtenidos de las actividades por codigo("+persona.totalPuntosAsignados(persona.getActividads().get(0).getTipoActividad().getCodigo())+"): "+ persona.totalPuntosAsignados(persona.getActividads().get(0).getTipoActividad().getCodigo()));
        System.out.println("Puntos obtenidos de las actividades por codigo("+persona.totalPuntosAsignados(persona.getActividads().get(0).getTipoActividad().getCodigo())+")"+" y año("+persona.getActividads().get(0).getFechaFin().getYear()+"): "+ persona.totalPuntosAsignados(persona.getActividads().get(0).getTipoActividad().getCodigo(), persona.getActividads().get(0).getFechaFin().getYear()));

        System.out.println("Sectores---------------------------------");
        for (Sector sector : persona.getSectores().obtenerTotalSubsectores()) {
            
            System.out.println(sector);
            System.out.println("-----------------------------------------");
        }

    }
    
}
