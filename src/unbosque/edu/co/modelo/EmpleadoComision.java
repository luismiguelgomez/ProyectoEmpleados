package unbosque.edu.co.modelo;

/**
 * 
 * @author gomez
 *
 */
public class EmpleadoComision extends Empleado implements InterfaceEmpleadoComision{

	//Atributos
	
	/**
	 * <b>pre condiciones: ser llamado desde otra clase</b>
	 */
	public EmpleadoComision() {
	}
	
	/**
	 * Da el salario del empleado por comision
	 * <b>Pre condiciones: Enviar como parametro un numero entero</b>
	 * <b>Post condiciones: Calcular el salario de un empleado por comision</b>
	 * @param numeroClientes es el numero de clientes que tuvo el empleado por comision
	 * @return El salario del empleado por comision
	 */
	public int clientesCaptados (int numeroClientes, int montoCliente) {
		int salarioEmpleadoComision =  numeroClientes * montoCliente;
		
		if (salarioEmpleadoComision < 1100000) {
			salarioEmpleadoComision = salarioEmpleadoComision + SUELDO;
		} else {
			salarioEmpleadoComision = SUELDO;
		}
		
		return salarioEmpleadoComision;
	}

}
