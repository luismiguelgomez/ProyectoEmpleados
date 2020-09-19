///**
// * En esta clase se pretende hacer las operacion para calcular el salario del
// * Ingeniero Junior por nivel que ha alcanzado y el porcentaje definido
// */
package unbosque.edu.co.modelo;
///**
// * @author rodas
// *
// */
 public class IngenieroJunior extends EmpleadoFijo{
//	/**
//	 * 
//	 */
	double nivel1 ;
	double nivel2 ;
	double nivel3 ;
	double nivel4 ;
	double nivel5 ;
//
	public IngenieroJunior() {
	//	
		nivel1 = SUELDO;
//
	}
//	@Override
//	/**
//	 * <pre>
//	 * 1. Tener implementada una interfaz (InterfaceEmpleadoFijo) que tenga el metodo porcentaje adicional<br>
//	 * 2. Desde la clase en la cual se va a crear el objeto es necesario enviar los parametros de anios<br>
//	 * </pre>
//	 * @param int anios , para hacer calculo de porcentaje Adicional
//	 */
	public void porcentajeAdicional(int anios) {
}
//
///**
// * el metodo de nivel dos y tres (nivelDosTres) se le incrementa un 5% al sueldo
// */
	public void nivelDosTres(){
		nivel2 = (SUELDO*0.05)+SUELDO;
		nivel3 = (SUELDO*0.05)+SUELDO;
	}
///**
// * el metodo de nivel dos y tres (nivelDosTres) se le incrementa un 8% al sueldo
// */
	public void nivelCuatroCinco(){
	nivel4 = (SUELDO*0.08)+SUELDO;
	nivel5 = (SUELDO*0.08)+SUELDO;
	}
	public double getNivel1() {
		return nivel1;
	}
	public void setNivel1(double nivel1) {
		this.nivel1 = nivel1;
	}
	public double getNivel2() {
		return nivel2;
	}
	public void setNivel2(double nivel2) {
		this.nivel2 = nivel2;
	}
	public double getNivel3() {
		return nivel3;
	}
	public void setNivel3(double nivel3) {
		this.nivel3 = nivel3;
	}
	public double getNivel4() {
		return nivel4;
	}
	public void setNivel4(double nivel4) {
		this.nivel4 = nivel4;
	}
	public double getNivel5() {
		return nivel5;
	}
	public void setNivel5(double nivel5) {
		this.nivel5 = nivel5;
	}
	
}
