/**
 * 
 */
package unbosque.edu.co.controlador;

import java.util.ArrayList;

/**
 * @author gomez
 *
 */
public class Datos {

	ArrayList<ArrayList<String>> junior;
	private String [][] senior = new String[9][];
	ArrayList<ArrayList<String>> comision;
	
	/**
	 * Datos basicos y personales del trabajador
	 * 
	 */
	ArrayList<String> datosTrabajador;
	


	/**
	 * Metodo constructor de datos
	 * <b>Post condiciones: Ejecutar la clase<b>
	 */
	public Datos() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Guarda informacion de los empleados en array list.
	 * <b>Precondiciones:Enviar como parametro arraylist y tipoempleado</b>
	 * <b>Post condiciones: Guardar la informacion segun el tipo de empleado</b>
	 * 
	 * @param datosTrabajador arraylist con informacion del trabajador
	 * @param tipoEmpleado entero que 1 = junior, 2= senior, 3=comision
	 */
	public void setDatosTrabajador(String [][] parametrosTrabajador, int tipoEmpleado) {
		
		
		if (tipoEmpleado == 1) {
			junior.add(datosTrabajador);
		}
		if (tipoEmpleado == 2) {
			senior = parametrosTrabajador;
		}
		if (tipoEmpleado == 3) {
			comision.add(datosTrabajador);
		}
		
	}

	/**
	 * Envia la información cuando sea utilizado
	 * <pre>Ser llamado desde otra clase</pre>
	 * <h4>Post condiciones: </h4>Enviar información cuando se utilice
	 * @return un arraylist con los datos de un trabajador
	 */
	public ArrayList<String> getDatosTrabajador() {
		return datosTrabajador;
	}
	

}