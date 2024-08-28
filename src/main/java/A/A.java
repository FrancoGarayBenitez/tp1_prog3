
package A;

public class A {

    public static void main(String[] args) {
        
        Expediente exp1 = new Expediente(1, "A", 231410, "Registros Hospital Central", 
                "Médico", "Salud");
        
        Expediente exp2 = new Expediente(2, "B", 960412, "Historia clínica", "Paciente", "Salud");
        
        Expediente exp3 = new Expediente(3, "C", 784213, "Tratamiento médicos", "Médico", "Salud");
        
        Expediente exp4 = new Expediente(4, "D",256634, "Consultas y revisiones", 
                "Médico", "Salud");
        
        Expediente exp5 = new Expediente(5, "E", 574412, "Historia clínica de Homero Simpson",
                "Paciente", "Salud");
        
        Expediente exp6 = new Expediente(6, "F", 863211, "Tratamiento para enfermedades respiratorias", 
                "Médico","Salud");
        
        Expediente exp7 = new Expediente(7, "G", 964300, "Tratamiento Neumonía", "Médico", "Salud");
        
        // Agregar expedientes hijos al nodo raíz
        exp1.addExpedientesHijos(exp2);
        exp1.addExpedientesHijos(exp3);
        exp1.addExpedientesHijos(exp4);
        
        // Agregar hijos a los hijos
        exp2.addExpedientesHijos(exp5);
        exp3.addExpedientesHijos(exp6);
        exp6.addExpedientesHijos(exp7);
        
        // Setear padre a cada hijo
        exp2.setExpedientePadre(exp1);
        exp3.setExpedientePadre(exp1);
        exp4.setExpedientePadre(exp1);
        exp5.setExpedientePadre(exp2);
        exp6.setExpedientePadre(exp3);
        exp7.setExpedientePadre(exp6);
        
        // Setear Control y EstadoControl
        exp1.addControles(new Control(1, "control1", true, new EstadoControl(4135, true)));
        exp1.addControles(new Control(2, "control2", true, new EstadoControl(2377, false)));
        exp1.addControles(new Control(3, "control3", true, new EstadoControl(8844, true)));
        exp1.addControles(new Control(4, "control4", false, new EstadoControl(9975, true)));
        exp1.addControles(new Control(5, "control5", true, new EstadoControl(4091, true)));
        
        // Probando métodos
        System.out.println("Datos del expediente: ");
        System.out.println(exp1.getCaratulaExpediente());
        
        System.out.println("Controles obligatorios: ");
        for(String controlOblig: exp1.getControlesObligatorios()){
            System.out.println(controlOblig);
        }
        
        System.out.println("Estado controles: " + exp1.getEstadoControles());
        
        System.out.println("Expedientes asociados: ");
        for(Expediente expAsociado: exp1.listaExpedientes()){
            System.out.println(expAsociado.getCaratulaExpediente());
        }
        
    }
}
