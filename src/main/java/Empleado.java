import java.time.LocalDate;
import java.util.Scanner;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Empleado {
	 int idEmpleado;
	 String cuitEmpleado;
	 String nomEmpleado;
	 String apeEmpleado;
	 String direEmpleado;
	 String celEmpleado;
	 String mailEmpleado;
	 final LocalDate altaEmpleado = LocalDate.now();
	 String areaEmpleado; 

 public static Empleado altaEmpleado(){

		System.out.println();
		boolean validaEntrada = true;
		String cuit=" ", nom=" ",ape="",dire="",cel="",mail="",area="";
		
		System.out.println("*****INGRESE LOS SIGUIENTES DATOS DEL EMPLEADO*****");
	    System.out.println("***********RESPETANDO LAS INDICACIONES*************");
		while (validaEntrada) {
		      System.out.println("Ingrese el CUIT/DNI del Empleado [XX-XXXXXXX-X]: ");
		      cuit = GestorIncidencia.scanner.nextLine();
			  boolean regex=ScannerServicio.checkCUIL(cuit);
		      if (!regex)
		       validaEntrada=true;
		      else validaEntrada=false;
		}
		validaEntrada=true;
		while (validaEntrada) {
			System.out.println("Ingrese el NOMBRE del Empleado: ");
			nom = GestorIncidencia.scanner.nextLine();
			if (nom.isEmpty())
		       validaEntrada=true;
		    else validaEntrada=false;
		}
		validaEntrada=true;
		while (validaEntrada) {
			System.out.println("Ingrese el APELLIDO del Empleado: ");
			ape = GestorIncidencia.scanner.nextLine();
			if (ape.isEmpty())
		       validaEntrada=true;
		    else validaEntrada=false;
		}
		
		validaEntrada=true;
		while (validaEntrada) {
			System.out.println("Ingrese la DIRECCION del Empleado: ");
			dire = GestorIncidencia.scanner.nextLine();
			if (dire.isEmpty())
		       validaEntrada=true;
		    else validaEntrada=false;
		}
		
		validaEntrada=true;
		while (validaEntrada) {
			System.out.println("Ingrese el CELULAR del Empleado: ");
			cel = GestorIncidencia.scanner.nextLine();
			if (cel.isEmpty())
		       validaEntrada=true;
		    else validaEntrada=false;
		}
		
		
		validaEntrada=true;
		while (validaEntrada) {
			System.out.println("Ingrese el MAIL del Empleado: ");
			mail = GestorIncidencia.scanner.nextLine();
			if (mail.isEmpty())
		       validaEntrada=true;
		    else validaEntrada=false;
		}

		validaEntrada=true;
		while (validaEntrada) {
			System.out.println("Ingrese el Area(RRHH-COMERCIAL-MATENIMIENTO-TECNICO) del Empleado: ");
			area = GestorIncidencia.scanner.nextLine();
			if (area.isEmpty())
		       validaEntrada=true;
		    else validaEntrada=false;
		}
		
		
		Empleado emp1 = new Empleado(1,cuit,nom,ape,dire,cel,mail,area);
		
		//System.out.println(emp1.toString());


		return emp1;
 	
 }

}
