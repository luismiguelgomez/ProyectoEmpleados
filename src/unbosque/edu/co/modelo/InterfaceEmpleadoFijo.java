package unbosque.edu.co.modelo;

public interface InterfaceEmpleadoFijo {

	/**
	 * Constante del sueldo para los empleados fijos
	 */
	final int SUELDO = 3500000;
	/**
	 * 
	 * @param anios necesario para hacer el calculo de porcentaje adicional
	 * @param sueldoAcomulado Es el sueldo que ira por parametro y se utilizara para seguir haciendo la suma
	 * @return entero que es equivalente al sueldo
	 */
	int porcentajeAdicional (int anios, int sueldoAcomulado);
	
}
