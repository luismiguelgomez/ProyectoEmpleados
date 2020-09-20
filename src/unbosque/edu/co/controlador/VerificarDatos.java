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
	 * Metodo constructor de VerificarDatos
	 */
	public VerificarDatos() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * <b>Precondiciones: enviar string</b>
	 * <b>PosCondiciones: devovler boolean que por medio de este se pede saber si es correocto el correo</b>
	 * @param parametroCorreo correo
	 * @return boolean que verifica el correo
	 */
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
	
	/**
	 * <b>Precondiciones: String de nombre</b>
	 * <b>PosCondiciones: Mostrar error si tiene un nombre nulo</b>
	 * @param pNombre string de nombre
	 * @return String con texto de error o vacio
	 */
	public String validarNombre (String pNombre) {
		String nombreValido = ""; 


		if(pNombre.equals("")) {
			nombreValido = "No puede tener un nombre nulo";
		}
		
		return nombreValido;
	}

	/**
	 * <b>Precondiciones: String </b>
	 * <b>PosCondiciones: Mostrar error si tiene el dato como nulo</b>
	 * @param pApellido string de apellido
	 * @return String con texto de error
	 */
	public String validarApellido (String pApellido) {
		String apellidoValido = ""; 

		if(pApellido.equals("")) {
			apellidoValido = "No puede tener un apellido nulo";
		}
		
		return apellidoValido;
	}
	
	/**
	 * <b>Precondiciones: String </b>
	 * <b>PosCondiciones: Mostrar error si tiene el dato como nulo</b>
	 * @param pCC String de CC
	 * @return String con error o vacio
	 */
	public String validarCedula (String pCC) {
		String cedulaPermitida = "";
		
		if(pCC.equals("")) {
			cedulaPermitida = "No puede tener una CC nula";
		}
		
		return cedulaPermitida;
	}
	
	/**
	 * <b>Precondiciones: String </b>
	 * <b>PosCondiciones: Mostrar error si tiene el dato como nulo</b>
	 * @param pDireccion String de direccion
	 * @return String con error o vacio
	 */
	public String validarDireccion (String pDireccion) {
		String direccionValido = ""; 


		if(pDireccion.equals("")) {
			direccionValido = "No puede tener un direccion nula";
		}
		
		return direccionValido;
	}
	
	/**
	 * <b>Precondiciones: String </b>
	 * <b>PosCondiciones: Mostrar error si tiene el dato como nulo</b>
	 * @param ptelefono string e telefono
	 * @return retorna String con error o vacio
	 */
	public String validarTelefono (String ptelefono) {
		String telefonoValidar = "";
		
		if (ptelefono.equals("")) {
			telefonoValidar = "Por favor vuelva a verificar su numero de telefono";
		}
		
		return telefonoValidar;
	}

}
