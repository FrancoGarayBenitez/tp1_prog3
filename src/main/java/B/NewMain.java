
package B;

import java.util.Date;


public class NewMain {


    public static void main(String[] args) {
        Empleado empleado = new Empleado("Jorge Gomez", 126542154, 
                "guaymallén", "JrgGomez@gmail", 
                new RegimenHorario(2, 8, 30, 20, 0, null));
        empleado.getRegimenHorario().setEmpleado(empleado);
        empleado.addAsistencias(new Asistencia(1, "jornada", new Date(2022, 10, 15), 8, 15, empleado));
        empleado.addAsistencias(new Asistencia(2, "jornada", new Date(2022, 10, 16), 8, 40, empleado));
        empleado.addAsistencias(new Asistencia(3, "jornada", new Date(2022, 10, 17), 8, 50, empleado));
        empleado.addAsistencias(new Asistencia(4, "jornada", new Date(2022, 10, 18), 8, 54, empleado));
        empleado.addAsistencias(new Asistencia(5, "jornada", new Date(2022, 11, 1), 9, 15, empleado));
        empleado.addAsistencias(new Asistencia(6, "jornada", new Date(2022, 11, 12), 9, 5, empleado));

        int anio = 2022;
        int mes = 10;
        empleado.setTardanzas(empleado.getDiasConTardanza(mes, anio));
        System.out.println(empleado);
        System.out.println("Las asistecia del año: "+anio +" y el mes: "+ mes );
        for (Asistencia asistencia: empleado.getAsistenciaXMesXAnio(mes, anio)) {
            
            System.out.println(asistencia);
        }
        System.out.println("Y las tardanzas del empleado son: ");
        for (Tardanza tardanza : empleado.getDiasConTardanza(mes, anio)){
            System.out.println(tardanza);
        }
    }
    
}
