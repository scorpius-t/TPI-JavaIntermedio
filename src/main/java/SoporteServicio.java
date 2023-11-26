import java.time.LocalDate;
import java.util.Scanner;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) //define private a todos los atributos
public class SoporteServicio {
	int idSoporte;
	String codSoporte;
	String tipoSoporte;//hard soft etc
	String desSoporte;
	final LocalDate altaSoporte=LocalDate.now();
	String tmpRespSoporte;
	String complejidadSoporte;
	String estadoSoporte;//activo / inactivo
		
public static SoporteServicio altaSoporte(){
	
	///AGREGAR VALIDACION DE INGRESO DE DATOS COMO EN EMPLEADOS
	

	System.out.println("*****INGRESE LOS SIGUIENTES DATOS DEL SOPORTE/SERVICIO*****");
    System.out.println("**************RESPETANDO LAS INDICACIONES**************");
	System.out.println("CODIGO (10 caract max): ");
	String codSoporte = GestorIncidencia.scanner.nextLine();
	System.out.println("TIPO SOFT/HARD: ");
	String tipo = GestorIncidencia.scanner.nextLine();
	System.out.println("DESCRIPCION: ");
	String descripcion = GestorIncidencia.scanner.nextLine();
	System.out.println("COMPLEJIDAD ALTA/MEDIA/BAJA: ");
	String complejidad = GestorIncidencia.scanner.nextLine();
	System.out.println("TIEMPO DE RESOLUCION en horas: ");
	String tiempoReso = GestorIncidencia.scanner.nextLine();
	System.out.println("ESTADO DISPONIBLE/NO DISPONIBLE: ");
	String estado = GestorIncidencia.scanner.nextLine();
	
	//-----------ESTA LINEA HAY QUE ELIMINAR, SOLO ESTÁ PARA CONTROL EN DESARROLLO
	SoporteServicio sop1 = new SoporteServicio(1,codSoporte,tipo,descripcion,tiempoReso,complejidad,estado);
		
	//System.out.println(sop1.toString());


	return sop1;
}

}