import java.util.Scanner;

public class ScannerServicio {

    public String menuPrincipal(){
        System.out.println("Gestor de incidencias");
        System.out.println("-------------------------------\n\n\n");
        System.out.println("Seleccione una opción:");
        System.out.println("1- Empleado - Alta.");
        System.out.println("2- Soporte - Alta.");
        System.out.println("3- Cliente - Alta.");
        System.out.println("4- Tecnico - Alta.");
        System.out.println("5- Incidente - Alta.");
        System.out.println(" ");
        System.out.println("9- Salir.");
        System.out.println("Opción>:");



        String opcion  = GestorIncidencia.scanner.nextLine();


        return opcion;
    }
}
