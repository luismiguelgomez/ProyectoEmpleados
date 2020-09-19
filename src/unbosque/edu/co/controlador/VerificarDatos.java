/**
 * 
 */
package unbosque.edu.co.controlador;

import unbosque.edu.co.vista.View;

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
	
	
	public String validarNombre (String pNombre) {
		String nombreValido = ""; 


		if(pNombre.equals("")) {
			nombreValido = "No puede tener un nombre nulo";
		}
		
		return nombreValido;
	}
	
	public String validarApellido (String pApellido) {
		String apellidoValido = ""; 

		if(pApellido.equals("")) {
			apellidoValido = "No puede tener un apellido nulo";
		}
		
		return apellidoValido;
	}
	
	public String validarCedula (String pCC) {
		String cedulaPermitida = "";
		
		if(pCC.equals("")) {
			cedulaPermitida = "No puede tener una CC nula";
		}
		
		return cedulaPermitida;
	}
	
	public String validarDireccion (String pDireccion) {
		String direccionValido = ""; 


		if(pDireccion.equals("")) {
			direccionValido = "No puede tener un direccion nula";
		}
		
		return direccionValido;
	}
	
	public String validarTelefono (String ptelefono) {
		String telefonoValidar = "";
		
		if (ptelefono.equals("")) {
			telefonoValidar = "Por favor vuelva a verificar su numero de telefono";
		}
		
		return telefonoValidar;
	}

}
