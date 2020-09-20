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
	public int porcentajeAdicional(int anios, int sueldoAcomulado) {
		int sueldo = 0;
		if (anios < 2) {
			sueldo = SUELDO;
		} else if(anios > 1 && anios < 4) {
			sueldo = (int) (sueldoAcomulado * 0.05);
		} else if(anios > 3 && anios < 8) {
			sueldo = (int) (sueldoAcomulado * 0.10);
		}  else if(anios > 6 && anios < 16) {
			sueldo = (int) (sueldoAcomulado * 0.15);
		} else if(anios > 15) {
			sueldo = (int) (sueldoAcomulado * 0.20);
		}
		
		return sueldo;
		
	}
	public int nivelUno() {
		
		return SUELDO;
	}

	/**
	 * el metodo de nivel dos y tres (nivelDosTres) se le incrementa un 5% al sueldo
	 * @param pAnios que es equiavalente alos años que lleva en la empresa
	 * @return sueldo
	 */
	public int nivelDosTres(int pAnios){
		int sueldoNivelMedio = (int) ((SUELDO*0.05)+SUELDO);
		
		if (pAnios > 1) {
			sueldoNivelMedio = sueldoNivelMedio + porcentajeAdicional(pAnios, sueldoNivelMedio);
		}
		
		return sueldoNivelMedio;
	}
	/**
	 * el metodo de nivel dos y tres (nivelDosTres) se le incrementa un 8% al sueldo
	 * @param pAnios que es equiavalente alos años que lleva en la empresa
	 * @return sueldo
	 */
	public int nivelCuatroCinco(int pAnios){
		int sueldoNivelAlto = (int) ((SUELDO*0.08)+SUELDO);
		
		if (pAnios > 1) {
			sueldoNivelAlto = sueldoNivelAlto + porcentajeAdicional(pAnios, sueldoNivelAlto);
		}
		
		return sueldoNivelAlto;
	}
	
	
}
