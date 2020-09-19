/**
 * 
 */
package unbosque.edu.co.controlador;

import unbosque.edu.co.vista.View;

import unbosque.edu.co.modelo.Empleado;

/**
 * @author gomez
 *
 */
public class Controller {

	/**
	 * <b>precondiciones: Es llamado desde AppMain</b>
	 * <b>PostCondiciones: Ejecutar la clase Empleado</b>
	 * 
	 */
	public Controller() {
		Empleado claseEmpleado = new Empleado();
		View v = new View();
	}

}
