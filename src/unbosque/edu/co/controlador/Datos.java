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
	ArrayList<ArrayList<String>> senior;
	ArrayList<ArrayList<String>> comision;
	
	/**
	 * Datos basicos y personales del trabajador
	 * 
	 */
	ArrayList<String> datosTrabajador;
	


	/**
	 * Metodo constructor de datos
	 * <h4>Post condiciones: </h4>Ejecutar la clase
	 */
	public Datos() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Guarda informacion de los empleados en array list.
	 * <pre>Enviar como parametro arraylist y tipoempleado</pre>
	 * <h4>Post condiciones: </h4>Guardar la informacion segun el tipo de empleado
	 * 
	 * @param datosTrabajador arraylist con informacion del trabajador
	 * @param tipoEmpleado entero que 1 = junior, 2= senior, 3=comision
	 */
	public void setDatosTrabajador(ArrayList<String> datosTrabajador, int tipoEmpleado) {
		this.datosTrabajador = datosTrabajador;
		
		if (tipoEmpleado == 1) {
			junior.add(datosTrabajador);
		}
		if (tipoEmpleado == 2) {
			senior.add(datosTrabajador);		
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