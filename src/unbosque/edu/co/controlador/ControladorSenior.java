/**
 * 
 */
package unbosque.edu.co.controlador;

import unbosque.edu.co.modelo.IngenieroSenior;

/**
 * @author gomez
 *
 */
public class ControladorSenior {

	IngenieroSenior claseSenior = new IngenieroSenior();
	
	public ControladorSenior() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * <b>precondiciones: dos enteros</b>
	 * <b>poscondiciones: retornar un entero ocn el valor del sueldo</b>
	 * @param pAnios anios que tiene trabajando el empleado
	 * @param pVentas numero de ventas del empleado
	 * @return un String para ser pintado en View
	 */
	public String guardarDatosIngenieroSenior (int pAnios, int pVentas) {
		claseSenior = new IngenieroSenior();
		
		int sueldo = claseSenior.numeroVentas(pAnios, pVentas);
		sueldo = sueldo + claseSenior.porcentajeAdicional(pAnios,sueldo);
		
		String devolverSueldo = Integer.toString(sueldo);
		
		return devolverSueldo;
	}
	
	
}
