import java.time.LocalDate;
import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tecnico {
	
	private int idTecnico;
	private String cuitEmpleado;
	private String codSoporte;
	private String tituloTecnico;
	private String dispoTecnico;//disponibilidad del tecnico, hs turno , etc
	private final LocalDate altaTecnico = LocalDate.now();
	private String estadoTecnico;

public static Tecnico altaTecnico(){

		System.out.println();
		boolean valida= true;
		String cuitEmp="";
		
		System.out.println("*****INGRESE LOS SIGUIENTES DATOS DEL TECNICO*****");
	    System.out.println("***********RESPETANDO LAS INDICACIONES*************");		

		while (valida) {
			System.out.println("CUIT de OPERADOR: ");
			cuitEmp = GestorIncidencia.scanner.nextLine();
		
			boolean existeEmpleado= ConexionDB.validarCuitEmpleado(cuitEmp);
			if (!existeEmpleado) {
				System.out.println("El OPERADOR no está dado de alta");
			    valida = true;
		       }
			else
				valida = false;
		}
		
		System.out.println("CODIGO deL Soporte/Servicio (10 caract. max.): ");
		String codSopo = GestorIncidencia.scanner.nextLine();
		System.out.println("TITULO/PROFESION/OFICIO: ");
		String titulo = GestorIncidencia.scanner.nextLine();
		System.out.println("DISPONIBILIDAD 	horaria (FULL TIME/PART TIME): ");
		String disponibilidad = GestorIncidencia.scanner.nextLine();
		System.out.println("ESTADO activo/inactivo: ");
		String estado = GestorIncidencia.scanner.nextLine();
		
		
		Tecnico tec1 = new Tecnico(1,cuitEmp,codSopo,titulo,disponibilidad,estado);
			
		//System.out.println(tec1.toString());

		return tec1;
	 	
	 }	
	
	
}
