import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class GestorIncidencia {
	private static final ScannerServicio scannerServicio=new ScannerServicio();
	public static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		String opcionMenu="";

		while (!opcionMenu.equalsIgnoreCase("9")) {
			opcionMenu = scannerServicio.menuPrincipal();
			switch (opcionMenu) {
				case "1":
					AltaEmpleado();
					break;
				case "2":
					AltaSoporte();
					break;
				case "3":
					AltaCliente();
					break;
				case "4":
					AltaTecnico();
					break;
				case "5":
					AltaIncidente();
					break;
				case "6":
					ListarEmpleado();
					break;
				case "9":
					break;
				default:
					System.out.println("La opcion ingresada no existe");
			}
		}
		System.out.println("Saliendo...");
		try {
			Thread.sleep(2000);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("FIN");


	}

	private static void AltaEmpleado(){
		try {

			ConexionDB.conexionDB();

			//**hacer un menu con opciones para: ABM cliente -- Repotar  Incidente--listar técnicos - salir

			//*******Instancia un empleado nvo
			Empleado emp1 = Empleado.altaEmpleado();
			ConexionDB.altaEmpleadoDB(emp1);



		}
		catch(Exception obj) {

			System.out.println("Error en ABM de la base de datos MAIN");
			System.out.println(obj.fillInStackTrace());
		}
	}
	private static void AltaSoporte(){
		try {

			ConexionDB.conexionDB();



			//*******Instancia un soporte nvo
			SoporteServicio sop1 = SoporteServicio.altaSoporte();
			ConexionDB.altaSoporteDB(sop1);


		}
		catch(Exception obj) {

			System.out.println("Error en ABM de la base de datos MAIN");
			System.out.println(obj.fillInStackTrace());
		}
	}
	private static void AltaCliente(){
		try {

			ConexionDB.conexionDB();



			//*******Instancia un cliente nvo
			//lista de los soportes para que el cliente elija
			ConexionDB.listarSoporte();

			Cliente cli1 = Cliente.altaCliente();
			ConexionDB.altaClienteDB(cli1);



		}
		catch(Exception obj) {

			System.out.println("Error en ABM de la base de datos MAIN");
			System.out.println(obj.fillInStackTrace());
		}
	}

	private static void AltaTecnico(){
		try {

			ConexionDB.conexionDB();



			//*******BUSCA EMPELADO POR CUIT
			//ConexionDB.buscarEmpleado();

			Tecnico tec1 = Tecnico.altaTecnico();
			ConexionDB.altaTecnicoDB(tec1);



		}
		catch(Exception obj) {

			System.out.println("Error en ABM de la base de datos MAIN");
			System.out.println(obj.fillInStackTrace());
		}
	}
	private static void AltaIncidente(){
		try {

			ConexionDB.conexionDB();


			//*******Instancia un incidente nvo
			Incidente inc1 = Incidente.altaIncidente();
			ConexionDB.altaIncidenteDB(inc1);

		}
		catch(Exception obj) {

			System.out.println("Error en ABM de la base de datos MAIN");
			System.out.println(obj.fillInStackTrace());
		}
	}
	private static void ListarEmpleado(){
		try {

			ConexionDB.conexionDB();


			ConexionDB.listarEmpleado();



		}
		catch(Exception obj) {

			System.out.println("Error en ABM de la base de datos MAIN");
			System.out.println(obj.fillInStackTrace());
		}
	}


}
