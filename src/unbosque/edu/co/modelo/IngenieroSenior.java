/**
 * 
 */
package unbosque.edu.co.modelo;

/**
 * @author gomez
 *
 */
public class IngenieroSenior extends EmpleadoFijo{

	/**
	 * 
	 */
	public IngenieroSenior() {
		
	}

	@Override
	/**
	 * <b>
	 * 1. Tener implementada una interfaz (InterfaceEmpleadoFijo) que tenga el metodo porcentaje adicional<br>
	 * 2. Desde la clase en la cual se va a crear el objeto es necesario enviar los parametros de anios<br>
	 * </b>
	 * @param int anios , para hacer calculo de porcentaje Adicional
	 */
	public int porcentajeAdicional(int anios, int sueldoAcomulado) {
		int sueldo = 0;
		if (anios < 2) {
			sueldo = SUELDO;
		} else if(anios > 1 && anios < 4) {
			sueldo = sueldoAcomulado + (int) (sueldoAcomulado * 0.05);
		} else if(anios > 3 && anios < 8) {
			sueldo = sueldoAcomulado + (int) (sueldoAcomulado * 0.10);
		}  else if(anios > 6 && anios < 16) {
			sueldo = sueldoAcomulado + (int) (sueldoAcomulado * 0.15);
		} else if(anios > 15) {
			sueldo = sueldoAcomulado + (int) (sueldoAcomulado * 0.20);
		}
		
		return sueldo;
		
	}
	public int nivelUno() {
		
		return SUELDO;
	}
	
	/**
	 * <b>Precondiciones: Enviar dos numeros enteros</b>
	 * <b>poscondiciones: entregar salario</b>
	 * @param anios numero anios
 	 * @param pVentas numero ventas
	 * @return int con el sueldo ya con los porfentajes correspondientes
	 */
	public int numeroVentas (int anios, int pVentas) {
		int sueldo = 0;
		if (pVentas > 0 && pVentas < 5 ) {
			sueldo = (int) (SUELDO * 0.10);
			porcentajeAdicional(anios, sueldo);
		}
		
		if (pVentas > 5 && pVentas < 11) {
			sueldo = (int) (SUELDO * 0.15);
			porcentajeAdicional(anios, sueldo);
		}
		
		if (pVentas > 9 && pVentas < 21) {
			sueldo = (int) (SUELDO * 0.20);
			porcentajeAdicional(anios, sueldo);
		}
		
		if (pVentas > 21) {
			sueldo = (int) (SUELDO * 0.30);
			porcentajeAdicional(anios, sueldo);
		}

		return sueldo;
	}

}
