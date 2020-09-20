package unbosque.edu.co.modelo;

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
	
	/**
	 * Metodo constructor de empleado
	 * <b>precondiciones: Ser llamado desde la clase Controller</b>
	 * <b>PostCondiciones: Ser la clase padre de EmpleadoFijo y EmpleadoComision</b> 
	 */
	public Empleado() {
	}

}
