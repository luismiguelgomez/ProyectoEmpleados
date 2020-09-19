package unbosque.edu.co.controlador;

import unbosque.edu.co.modelo.EmpleadoComision;
import unbosque.edu.co.vista.View;

/**
 * @author gomez
 *
 */
public class ControladorEmpleadoComision {

	EmpleadoComision claseEmpleadoComision = new EmpleadoComision();
	
	public ControladorEmpleadoComision() {
	}
	
	public String conversion (String numeroClientes, String parametroMontoClientes) {
		int clientes = Integer.parseInt(numeroClientes);
		int montoClientes = Integer.parseInt(parametroMontoClientes);
		int calculo = claseEmpleadoComision.clientesCaptados(clientes, montoClientes);
		String conversionString = Integer.toString(calculo);
		
		return conversionString;
	}
	
	public boolean verificarMontoCliente (String parametroMontoC, String numeroClientes) {
		boolean montoPermitido = false;
		int clientes = Integer.parseInt(parametroMontoC);
		int monto = Integer.parseInt(numeroClientes);
		
		if (monto >= 500000 && monto <= 2000000) {
			montoPermitido = true;
		} else {
			if (clientes == 0) {
				montoPermitido = true;
			}
		}
		
		return montoPermitido;
	}
	
	

}
