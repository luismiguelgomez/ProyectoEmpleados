package unbosque.edu.co.controlador;

import unbosque.edu.co.modelo.EmpleadoComision;
import unbosque.edu.co.vista.View;

/**
 * @author gomez
 *
 */
public class ControladorEmpleadoComision {

	EmpleadoComision claseEmpleadoComision = new EmpleadoComision();
	View claseVista = new View();
	
	public ControladorEmpleadoComision(String numeroClientes, String montoClientes) {
		conversion( numeroClientes, montoClientes);
	}

	private String conversion(String numeroClientes, String parametroMontoClientes) {
		int clientes = Integer.parseInt(numeroClientes);
		int montoClientes = Integer.parseInt(parametroMontoClientes);
		int calculo = claseEmpleadoComision.clientesCaptados(clientes, montoClientes);
		String conversionString = Integer.toString(calculo);
		
		claseVista.panelEmpleadoComision(conversionString);
		return conversionString;
	}
	
	

}
