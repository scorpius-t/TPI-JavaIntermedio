import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)

public class Cliente {

	 int idCliente;
	 String cuitCliente;
	 String razonSocial;
	 String nomCliente;
	 String apeCliente;
	 String direCliente;
	 String    celCliente;
	 String mailCliente;
	 final LocalDate altaCliente = LocalDate.now();
	 String contratos;
	
public static Cliente altaCliente() {
	System.out.println("\n*****INGRESE LOS SIGUIENTES DATOS DEL CLIENTE*****");
    System.out.println("***********RESPETANDO LAS INDICACIONES*************");

		System.out.println("CUIT: ");
		String cuit = GestorIncidencia.scanner.nextLine();
		System.out.println("RAZON SOCIAL: ");
		String razonS = GestorIncidencia.scanner.nextLine();
		System.out.println("NOMBRE: ");
		String nom = GestorIncidencia.scanner.nextLine();
		System.out.println("APELLIDO: ");
		String ape = GestorIncidencia.scanner.nextLine();
		System.out.println("DIRECCION: ");
		String dire = GestorIncidencia.scanner.nextLine();
		System.out.println("CELULAR: ");
		String cel = GestorIncidencia.scanner.nextLine();
		System.out.println("MAIL: ");
		String mail = GestorIncidencia.scanner.nextLine();
		System.out.println();
		System.out.println("CONTRATO (CODIGO DEL SOPORTE): ");
		String contrato = GestorIncidencia.scanner.nextLine();
			
		Cliente cliente1 = new Cliente(1,cuit,razonS,nom,ape,dire,cel,mail,contrato);
			
		//System.out.println(cliente1.toString());


		return cliente1;
		}

}
