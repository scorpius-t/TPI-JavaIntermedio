import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ScannerServicio {
    public static boolean checkCUIL(String texto){  // Ejemplo de validar con regex
        String patronreg="([0-9]{2})(-)([0-9]{8})(-)[0-9]";
        Pattern pattern=Pattern.compile(patronreg);
        Matcher matcher=pattern.matcher(texto);
        return matcher.find();
    }

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
