/**En esta clase se pretende hacer las operacion para calcular el salario del
 * Ingeniero Junior por nivel que ha alcanzado y el porcentaje definido
 */
package unbosque.edu.co.modelo;
/**
 * @author rodas
 *
 */
 public class IngenieroJunior extends EmpleadoFijo{

	 
	/**
	 * 
	 */
	public IngenieroJunior() {
		 
	}
	
	@Override
	/**
	 * <b>
	 * 1. Tener implementada una interfaz (InterfaceEmpleadoFijo) que tenga el metodo porcentaje adicional<br>
	 * 2. Desde la clase en la cual se va a crear el objeto es necesario enviar los parametros de anios<br>
	 * </b>
	 * @param int anios , para hacer calculo de porcentaje Adicional
	 */
	public void porcentajeAdicional(int anios) {
	}
	public int nivelUno() {
		
		return SUELDO;
	}

	/**
	 * el metodo de nivel dos y tres (nivelDosTres) se le incrementa un 5% al sueldo
	 */
	public int nivelDosTres(){
		int sueldoNivelMedio = (int) ((SUELDO*0.05)+SUELDO);
		
		return sueldoNivelMedio;
	}
	/**
	 * el metodo de nivel dos y tres (nivelDosTres) se le incrementa un 8% al sueldo
	 */
	public int nivelCuatroCinco(){
		int sueldoNivelAlto = (int) ((SUELDO*0.08)+SUELDO);
		
		return sueldoNivelAlto;
	}
	
	
	
	
}
