/**
 * 
 */
package unbosque.edu.co.controlador;

import unbosque.edu.co.modelo.IngenieroJunior;

/**
 * @author gomez
 *
 */
public class ControladorJunior {

	IngenieroJunior claseIngenieroJunior;
	double nivel1;
	double nivel2;
	double nivel3;
	double nivel4;
	double nivel5;
	/**
	 * 
	 */
	public ControladorJunior() {
	}
	
	/**
	 * <b>Precondiciones: 2 enteros</b>
	 * <b>poscondiciones: Entregar sueldo de ingeniero junior</b>
	 * @param parametroNivel nivel de ing junior
	 * @param pAnios a�os de empleado trabajando
	 * @return String con los el valor del sueldo
	 */
	public String guardarDatosIngenieroJ(int parametroNivel, int pAnios) {
		claseIngenieroJunior = new IngenieroJunior();
		int sueldo = 0;
		if (parametroNivel == 1 ) {
			sueldo = claseIngenieroJunior.nivelUno();
		} else if(parametroNivel == 2 || parametroNivel == 3) {
			sueldo = claseIngenieroJunior.nivelDosTres(pAnios);
		} else if(parametroNivel == 4 || parametroNivel == 5) {
			sueldo = claseIngenieroJunior.nivelCuatroCinco(pAnios);
		}
		
		String devolverSueldo = Integer.toString(sueldo);
		
		return devolverSueldo;
	}

}
