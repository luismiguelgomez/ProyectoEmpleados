package unbosque.edu.co.modelo;

public interface InterfaceEmpleadoFijo {

	/**
	 * Constante del sueldo para los empleados fijos
	 */
	final int SUELDO = 3500000;
	/**
	 * 
	 * @param anios necesario para hacer el calculo de porcentaje adicional
	 */
	int porcentajeAdicional (int anios, int sueldoAcomulado);
	
}
