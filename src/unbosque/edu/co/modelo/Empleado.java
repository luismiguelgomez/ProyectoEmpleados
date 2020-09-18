package unbosque.edu.co.modelo;

import unbosque.edu.co.controlador.Datos;

/**
 * 
 * @author gomez
 *
 */
public class Empleado {

	//Atributos
	protected int cedula;
	protected String nombre;
	protected String apellido;
	protected boolean genero;
	protected String correoElectronico;
	protected  String direccionDomiciliaria;
	protected int anioIngreso;
	Datos d = new Datos();
	
	/**
	 * Metodo constructor de empleado
	 * <pre>Ser llamado desde la clase Controller </pre>
	 * <h4>PostCondiciones: Ser la clase padre de EmpleadoFijo y EmpleadoComision</h4> 
	 */
	public Empleado() {
		System.out.println("Estamos en empleados");
	}

}
