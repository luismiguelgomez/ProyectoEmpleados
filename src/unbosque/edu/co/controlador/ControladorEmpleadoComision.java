package unbosque.edu.co.controlador;

import unbosque.edu.co.modelo.EmpleadoComision;

/**
 * @author gomez
 *
 */
public class ControladorEmpleadoComision {

	EmpleadoComision claseEmpleadoComision = new EmpleadoComision();
	
	/**
	 * ControladorEmpleadoComision
	 */
	public ControladorEmpleadoComision() {
	}
	
	/**
	 * <b>precondiciones: Enviar dos String por parametro, pero estos deben ser numeros</b>
	 * <b>Pos condiciones: Devolver el valor que gana el empleado por comision</b>
	 * @param numeroClientes numero de clientes
	 * @param parametroMontoClientes monto por clientes
	 * @return String con el dinero ganado por el empleado por comision
	 */
	public String conversion (String numeroClientes, String parametroMontoClientes) {
		int clientes = Integer.parseInt(numeroClientes);
		int montoClientes = Integer.parseInt(parametroMontoClientes);
		int calculo = claseEmpleadoComision.clientesCaptados(clientes, montoClientes);
		String conversionString = Integer.toString(calculo);
		
		return conversionString;
	}
	
	/**
	 * <b>Precondiciones: Dos string que se puedan convertir a enteros</b>
	 * <b>Poscondiciones: Retornar un boolean si tiene o no eol monto que se requiere</b>
	 * @param parametroMontoC es el monto por cliente
	 * @param numeroClientes es e numero de clientes
	 * @return boolean que verifica si el monto esta en el rango de precios
	 */
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
