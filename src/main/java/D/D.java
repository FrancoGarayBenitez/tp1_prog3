
package D;

public class D {

    public static void main(String[] args) {
        Barrio barrio = new Barrio(284731, "Springfield", "Construction S.A");
        
        Vivienda viv1 = new Vivienda(1, "Calle A", 1010, 70, barrio);
        Vivienda viv2 = new Vivienda(2, "Calle B", 1020, 100, barrio);
        Vivienda viv3 = new Vivienda(3, "Calle C", 1030, 50, barrio);

        barrio.addViviendas(viv1);
        barrio.addViviendas(viv2);
        barrio.addViviendas(viv3);
        
        viv1.addHabitaciones(new Habitacion(1, "A", 10, viv1));
        viv1.addHabitaciones(new Habitacion(2, "B", 15, viv1));
        viv2.addHabitaciones(new Habitacion(3, "C", 20, viv2));
        viv2.addHabitaciones(new Habitacion(4, "D", 20, viv2));
        viv2.addHabitaciones(new Habitacion(5, "E", 30, viv2));
        viv3.addHabitaciones(new Habitacion(6, "F", 30, viv3));
        viv3.addHabitaciones(new Habitacion(7, "G", 10, viv3));
        
        // Probando métodos
        System.out.println("Superficie total del terreno del barrio: " + barrio.getSuperficieTotalTerreno() + " m2");

        try {
            System.out.println("Superficie metros cuadrados de vivienda: " + viv2.getMetrosCuadradosCubiertos() + " m2");
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("Superficie total cubierta: " + barrio.getSuperficieTotalCubierta() + " m2");
        } catch (MyException ex) {
            System.out.println("Una de las viviendas tiene la cantidad de metros cuadrados inválida.");
        }

        
        
        
        
        
    }
    
}
