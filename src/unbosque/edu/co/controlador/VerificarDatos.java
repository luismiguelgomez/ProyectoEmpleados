/**
 * 
 */
package unbosque.edu.co.controlador;

/**
 * @author gomez
 *
 */
public class VerificarDatos {

	/**
	 * 
	 */
	public VerificarDatos() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean verificarCorreo (String parametroCorreo) {
		
		boolean correoPermitido = false;
		 // Texto
	    String sTexto = parametroCorreo;
	    // Texto que vamos a buscar
	    String sTextoBuscado = "@unbosque.edu.co";
	    // Contador de veces que se ecuentra @unbosque.edu.co
	    int contador = 0;

	    while (sTexto.indexOf(sTextoBuscado) > -1) {
	      sTexto = sTexto.substring(sTexto.indexOf(
	        sTextoBuscado)+sTextoBuscado.length(),sTexto.length());
	      contador++; 
	    }

	    if (contador > 0) {
	    	correoPermitido = true;
	    }
	    
	    return correoPermitido;
	}

}
