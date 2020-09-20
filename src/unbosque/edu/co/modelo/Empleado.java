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
	 * <b>post</b>
	 * Ser llamado desde la clase Controller 
	 * <b>post</b>PostCondiciones: Ser la clase padre de EmpleadoFijo y EmpleadoComision</h4> 
	 */
	public Empleado() {
		System.out.println("Estamos en empleados");
	}

}
