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
		verificarMontoCliente(montoClientes, numeroClientes);
	}
	
	private String conversion (String numeroClientes, String parametroMontoClientes) {
		int clientes = Integer.parseInt(numeroClientes);
		int montoClientes = Integer.parseInt(parametroMontoClientes);
		int calculo = claseEmpleadoComision.clientesCaptados(clientes, montoClientes);
		String conversionString = Integer.toString(calculo);
		
		claseVista.panelEmpleadoComision(conversionString);
		return conversionString;
	}
	
	private boolean verificarMontoCliente (String parametroMontoC, String numeroClientes) {
		boolean montoPermitido = false;
		int clientes = Integer.parseInt(numeroClientes);
		int monto = Integer.parseInt(parametroMontoC);
		String mensajeErroneo = "";
		
		if (monto >= 500000 && monto <= 2000000) {
			montoPermitido = true;
		} else {
			if (clientes == 0) {
				montoPermitido = true;
			} else {
				mensajeErroneo = "El rango del precio del cliente debe ser mayor que 500000 y menor que 2000000";
				montoPermitido = false;
				claseVista.errorMontoClienteEmpleadoComision(mensajeErroneo);
			}
		}
		
		
		
		if (montoPermitido == true) {
			conversion(numeroClientes, parametroMontoC);
		}
		
		return montoPermitido;
	}
	
	

}
