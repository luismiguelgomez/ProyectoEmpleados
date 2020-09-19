package unbosque.edu.co.vista;

/**
/**

 * @author ING-MARLON
 *
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import unbosque.edu.co.controlador.ControladorEmpleadoComision;
import unbosque.edu.co.controlador.Datos;
import unbosque.edu.co.controlador.VerificarDatos;

public class View extends JFrame implements ActionListener {

	// atributos

	// presentacion inicio
	JPanel presentacion;
	JButton iniciar;
	JLabel fondoP;
	ImageIcon imagenP, imagenB;

	// menu
	JPanel menu;
	JButton botones[];
	JLabel fondoM;
	ImageIcon imagenM, imagenBs;

	// informacion empleado
	Datos classDatos;
	int tipoEmpleado;
	String[][] arregloPrueba;
	JPanel informacionE;
	JLabel fondoI, texto;
	ImageIcon imagenI;
	JTextField nombre, apellido, cedula, correo, telefono, direccion;
	JButton boton1, boton2;
	JComboBox<String> genero,tipoE;

	// empleado fijo
	JPanel empleadoF, panel1, panel2;
	JLabel fondoF, texto1;
	ImageIcon imagenF;
	JButton botonS, botonJ, botonG, botonV;
	JComboBox<String> nivel, venta, anio;

	// empleado a comision
	JPanel empleadoC;
	JLabel fondoC, texto2;
	ImageIcon imagenC;
	JButton botonV1, botonO;
	JTextField cliente, montoC;
	
	//mostrar informacion
	JPanel mostrarI;
	JLabel fondo;
	ImageIcon imagen;
	JButton botonM;
	DefaultTableModel modelo;

	ControladorEmpleadoComision controladorComision;
	VerificarDatos claseVerificarDatos;
	
	/**
	 * Mostrar interfaz gráfica con opciones para los empleados junior, senior y a comision
	 * <b>Precondiciones: Ser llamado desde otra clase</b>
	 * <b>Post condiciones: Crear la interfaz en donde deja las opciones de los tipos de empleado</b>
	 */
	public View() {
		// TODO Auto-generated constructor stub

		// ventana principal

		setSize(1184, 666);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Presentacion

		presentacion = new JPanel();
		presentacion.setLayout(null);
		presentacion.setBounds(0, 0, getWidth(), getHeight());
		presentacion.setVisible(true);
		add(presentacion, -1);

		// fondo de presentacion

		fondoP = new JLabel();
		fondoP.setBounds(0, 0, getWidth(), getHeight());
		
		imagenP = new ImageIcon("src/unbosque/edu/co/vista/imagenes/imagenF.jpg");
		imagenP = new ImageIcon(imagenP.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_DEFAULT));
		fondoP.setIcon(imagenP);
		fondoP.setVisible(true);
		presentacion.add(fondoP, 0);

		// Boton de inicio

		iniciar = new JButton();
		iniciar.setBounds(getWidth() - 700, 335, 225, 38);
		imagenB = new ImageIcon("src/unbosque/edu/co/vista/imagenes/botonI.png");
		imagenB = new ImageIcon(imagenB.getImage().getScaledInstance(300, 50, Image.SCALE_DEFAULT));
		iniciar.setIcon(imagenB);
		iniciar.setOpaque(false);
		iniciar.setBackground(new Color(0, 0, 0, 0));
		iniciar.setBorder(null);
		;
		iniciar.setVisible(true);
		presentacion.add(iniciar, 0);

		// cantidad de botones en menu

		botones = new JButton[5];
		for (int i = 0; i < botones.length; i++) {
			botones[i] = new JButton();

		}

		// accion del mouse

		iniciar.addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent e) {
				System.out.println("iniciar");
				menu();
				eventoMenu();

			}
		});

		add(presentacion);

		setVisible(true);

	}// cierre del constructor

	/**
	 * Muestra la pantalla
	 * <b>Precondiciones: Tener las imagenes en /vista/imagenes ,  es llamado desde el constructor</b>
	 * <b>Postcondiciones: Crear y organizar los botones correspondientes con su imagen</b>
	 */
	public void menu() {
		// Presentacion menu

		presentacion.setVisible(false);
		menu = new JPanel();
		menu.setLayout(null);
		menu.setBounds(0, 0, getWidth(), getHeight());
		menu.setVisible(true);

		// fondo de presentacion menu

		fondoM = new JLabel();
		fondoM.setBounds(0, 0, getWidth(), getHeight());
		imagenM = new ImageIcon("src/unbosque/edu/co/vista/imagenes/imagenM.jpg");
		imagenM = new ImageIcon(imagenM.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_DEFAULT));
		fondoM.setIcon(imagenM);
		fondoM.setVisible(true);
		menu.add(fondoM, -1);

		// nombro los botones

		imagenBs = new ImageIcon("src/unbosque/edu/co/vista/imagenes/informacionE.png");
		imagenBs = new ImageIcon(imagenBs.getImage().getScaledInstance(315, 70, Image.SCALE_DEFAULT));
		botones[0].setIcon(imagenBs);

		imagenBs = new ImageIcon("src/unbosque/edu/co/vista/imagenes/empleadoF.png");
		imagenBs = new ImageIcon(imagenBs.getImage().getScaledInstance(315, 70, Image.SCALE_DEFAULT));
		botones[1].setIcon(imagenBs);

		imagenBs = new ImageIcon("src/unbosque/edu/co/vista/imagenes/empleadoC.png");
		imagenBs = new ImageIcon(imagenBs.getImage().getScaledInstance(315, 70, Image.SCALE_DEFAULT));
		botones[2].setIcon(imagenBs);

		imagenBs = new ImageIcon("src/unbosque/edu/co/vista/imagenes/salir.png");
		imagenBs = new ImageIcon(imagenBs.getImage().getScaledInstance(350, 70, Image.SCALE_DEFAULT));
		botones[3].setIcon(imagenBs);
		
		imagenBs = new ImageIcon("src/unbosque/edu/co/vista/imagenes/salir.png");
		imagenBs = new ImageIcon(imagenBs.getImage().getScaledInstance(350, 70, Image.SCALE_DEFAULT));
		botones[4].setIcon(imagenBs);
		

		for (int i = 0; i < botones.length; i++) {
			botones[i].setBounds(getWidth() - (250 + 50), (i + 1) * 70, 250, 45);//
			botones[i].setOpaque(false);
			botones[i].setBackground(new Color(0, 0, 0, 0));
			botones[i].setBorder(null);
			botones[i].setVisible(true);

			menu.add(botones[i], 0);
		}
		add(menu, 0);

	}// cierre del metodo menu

	/**
	 * Eventos activados cuando se da un clic en el boton inicio
	 * <b>Pre condiciones: Clic a boton de "Informacion empleado", "EmpleadoFijo", "Empleado a comision", "Boton salir"</b>
	 * <b>Post condiciones: Entrar al método correspondiente segun el boton oprimido</b>
	 */
	public void eventoMenu() {

		// boton INFORMACION EMPLEADO

		botones[0].addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent e) {
				System.out.println("INFORMACION EMPLEADO");
				informacionE();

			}
		});

		// boton EMPLEADO FIJO

		botones[1].addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent e) {
				System.out.println("EMPLEADO FIJO");
				empleadoF();

			}
		});

		// boton EMPLEADO A COMISION

		botones[2].addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent e) {
				System.out.println("EMPLEADO A COMISION");
				empleadoC();
			}
		});

		// boton 
		botones[3].addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent e) {
				System.out.println("MOSTRAR INFORMACION");
				mostratI();
			}
		});
		
		botones[4].addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent e) {
				System.out.println("SALIR");
				System.exit(0);
			}
		});

	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * Registro de informacion del empleado:<br>
	 * nombre,apellido,cedula,telefono,correo,direccion,genero<br>
	 * <b>Pre condiciones: Registrar información de personas y tener la imagenM.jpg en la direccion: 
	 * ../imagenes/imagenM.jpg, boton guardar y boton volcer</b>
	 * <b>Pos condiciones: Crear y pintar el registro de información de empleados </b>
	 */
	public void informacionE() {
		// Presentacion informacion de empleado

		menu.setVisible(false);
		informacionE = new JPanel();
		informacionE.setLayout(null);
		informacionE.setBounds(0, 0, getWidth(), getHeight());
		informacionE.setVisible(true);

		// fondo de presentacion informacion de empleado
		fondoI = new JLabel();
		fondoI.setBounds(0, 0, getWidth(), getHeight());
		imagenI = new ImageIcon("src/unbosque/edu/co/vista/imagenes/imagenM.jpg");
		imagenI = new ImageIcon(imagenI.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_DEFAULT));
		fondoI.setIcon(imagenI);
		fondoI.setVisible(true);
		informacionE.add(fondoI, -1);

		texto = new JLabel("Registre su informacion.");
		texto.setFont(new Font("", Font.PLAIN, 20));
		texto.setBounds(20, 40, 300, 30);
		informacionE.add(texto, 0);

		// registra nombre

		texto = new JLabel("Nombre:");
		texto.setBounds(10, 100, 100, 30);
		informacionE.add(texto, 0);
		nombre = new JTextField();
		nombre.setBounds(100, 110, 150, 20);
		informacionE.add(nombre, 0);

		// registra apellido

		texto = new JLabel("Apellido:");
		texto.setBounds(10, 200, 100, 30);
		informacionE.add(texto, 0);
		apellido = new JTextField();
		apellido.setBounds(100, 210, 150, 20);
		informacionE.add(apellido, 0);

		// registra cedula

		texto = new JLabel("Cedula:");
		texto.setBounds(10, 300, 100, 30);
		informacionE.add(texto, 0);
		cedula = new JTextField();
		cedula.setBounds(100, 310, 150, 20);
		informacionE.add(cedula, 0);

		// registra telefono

		texto = new JLabel("Telefono:");
		texto.setBounds(10, 400, 100, 30);
		informacionE.add(texto, 0);
		telefono = new JTextField();
		telefono.setBounds(100, 410, 150, 20);
		informacionE.add(telefono, 0);

		// registra correo

		texto = new JLabel("Correo:");
		texto.setBounds(10, 500, 100, 30);
		informacionE.add(texto, 0);
		correo = new JTextField();
		correo.setBounds(100, 510, 150, 20);
		informacionE.add(correo, 0);

		// registra direccion

		texto = new JLabel("Direccion:");
		texto.setBounds(350, 100, 200, 30);
		informacionE.add(texto, 0);
		direccion = new JTextField();
		direccion.setBounds(440, 110, 150, 20);
		informacionE.add(direccion, 0);

		// registrar genero

		texto = new JLabel("Genero:");
		texto.setBounds(350, 200, 200, 30);
		informacionE.add(texto, 0);

		genero = new JComboBox<String>();
		genero.setBounds(440, 200, 200, 30);
		informacionE.add(genero, 0);
		genero.addItem("Masculino");
		genero.addItem("Femenino");
		
		texto = new JLabel("Tipo empleado:");
		texto.setBounds(350, 300, 200, 30);
		informacionE.add(texto, 0);
		
		tipoE = new JComboBox<String>();
		tipoE.setBounds(440, 300, 200, 30);	
		informacionE.add(tipoE, 0);
		tipoE.addItem("Empleado junior");
		tipoE.addItem("Empleado senior");
		tipoE.addItem("Empleado comision");

		boton1 = new JButton("Guardar informacion");
		boton1.setBounds(400, 400, 230, 60);
		imagenI = new ImageIcon("src/unbosque/edu/co/vista/imagenes/botonGuardar.png");
		imagenI = new ImageIcon(imagenI.getImage().getScaledInstance(315, 70, Image.SCALE_DEFAULT));
		boton1.setOpaque(false);
		boton1.setBackground(new Color(0, 0, 0, 0));
		boton1.setBorder(null);
		boton1.setIcon(imagenI);
		boton1.addActionListener(this);

		boton2 = new JButton("volver");
		boton2.setBounds(1020, 50, 170, 60);
		imagenI = new ImageIcon("src/unbosque/edu/co/vista/imagenes/Volver.png");
		imagenI = new ImageIcon(imagenI.getImage().getScaledInstance(270, 70, Image.SCALE_DEFAULT));
		boton2.setOpaque(false);
		boton2.setBackground(new Color(0, 0, 0, 0));
		boton2.setBorder(null);
		boton2.setIcon(imagenI);
		boton2.addActionListener(this);

		informacionE.add(boton1, 0);
		informacionE.add(boton2, 0);

		add(informacionE, 0);
	}

	/**
	 * 
	 */
	public void empleadoF() {

		// Presentacion empleado fijo

		menu.setVisible(false);
		empleadoF = new JPanel();
		empleadoF.setLayout(null);
		empleadoF.setBounds(0, 0, getWidth(), 200);

		// fondo de presentacion empleado fijo
		fondoF = new JLabel();
		fondoF.setBounds(0, 0, getWidth(), getHeight());
		imagenF = new ImageIcon("src/unbosque/edu/co/vista/imagenes/imagenM.jpg");
		imagenF = new ImageIcon(imagenF.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_DEFAULT));
		fondoF.setIcon(imagenF);

		empleadoF.add(fondoF, 0);
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(10, 200, 590, 500);
		panel1.setBackground(Color.white);
		panel1.setVisible(false);

		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(590, 200, 590, 500);
		panel2.setBackground(Color.white);
		panel2.setVisible(false);

		fondoF = new JLabel("Empleados con salario fijo");
		fondoF.setFont(new Font("", Font.PLAIN, 20));
		fondoF.setBounds(20, 40, 300, 30);
		empleadoF.add(fondoF, 0);

		botonJ = new JButton("Empleado junior");
		botonJ.setBounds(190, 100, 230, 60);
		imagenF = new ImageIcon("src/unbosque/edu/co/vista/imagenes/botonEmpleadoJ.png");
		imagenF = new ImageIcon(imagenF.getImage().getScaledInstance(315, 70, Image.SCALE_DEFAULT));
		botonJ.setOpaque(false);
		botonJ.setBackground(new Color(0, 0, 0, 0));
		botonJ.setBorder(null);
		botonJ.setIcon(imagenF);
		botonJ.addActionListener(this);

		botonS = new JButton("Empleado senior");
		botonS.setBounds(800, 100, 230, 60);
		imagenF = new ImageIcon("src/unbosque/edu/co/vista/imagenes/botonEmpleadoS.png");
		imagenF = new ImageIcon(imagenF.getImage().getScaledInstance(315, 70, Image.SCALE_DEFAULT));
		botonS.setOpaque(false);
		botonS.setBackground(new Color(0, 0, 0, 0));
		botonS.setBorder(null);
		botonS.setIcon(imagenF);
		botonS.addActionListener(this);

		botonV = new JButton("volver");
		botonV.setBounds(1030, 30, 170, 60);
		imagenF = new ImageIcon("src/unbosque/edu/co/vista/imagenes/Volver.png");
		imagenF = new ImageIcon(imagenF.getImage().getScaledInstance(270, 70, Image.SCALE_DEFAULT));
		botonV.setOpaque(false);
		botonV.setBackground(new Color(0, 0, 0, 0));
		botonV.setBorder(null);
		botonV.setIcon(imagenF);
		botonV.addActionListener(this);

		componentesJ();
		componentesS();
		empleadoF.add(botonV, 0);
		empleadoF.add(botonJ, 0);
		empleadoF.add(botonS, 0);
		add(empleadoF, 0);
		add(panel1, 0);
		add(panel2, 0);

	}

	/**
	 * Información de los empleados
	 * <b>Pre condiciones: Oprimir el boton de empleado fijo y despues empleado junir</b>
	 * <b>Post condiciones: Ingresar información y guardarla en empleado Junir</b>
	 */
	public void componentesJ() {

		texto1 = new JLabel("Ingrese su nivel:");
		texto1.setBounds(20, 70, 300, 30);

		fondoF = new JLabel("Años laborados");
		fondoF.setBounds(20, 210, 300, 30);

		nivel = new JComboBox<String>();
		nivel.setBounds(140, 70, 150, 30);
		nivel.addItem("Nivel 1");
		nivel.addItem("Nivel 2");
		nivel.addItem("Nivel 3");
		nivel.addItem("Nivel 4");
		nivel.addItem("Nivel 5");

		anio = new JComboBox<String>();
		anio.setBounds(140, 210, 150, 30);
		anio.addItem("menos de 2 años");
		anio.addItem("2 a 3 años");
		anio.addItem("4 a 7 años");
		anio.addItem("8 a 15 años");
		anio.addItem("mas de 15 años");

		botonG = new JButton("Guardar");
		botonG.setBounds(140, 280, 150, 30);
		botonG.addActionListener(this);

		panel1.add(texto1, 0);
		panel1.add(botonG, 0);
		panel1.add(fondoF, 0);
		panel1.add(anio, 0);
		panel1.add(nivel, 0);
	}

	/**
	 * Componentes de los programadores Senior
	 * <b>Precondiciones: Oprimir los botones empleado y despues empleado senior</b>
	 * <b>PosCondiciones: Guardar la información del empleado senior</b>
	 */
	public void componentesS() {

		texto1 = new JLabel("Ventas realizadas");
		texto1.setBounds(20, 70, 300, 30);

		fondoF = new JLabel("Años laborados");
		fondoF.setBounds(20, 210, 300, 30);

		venta = new JComboBox<String>();
		venta.setBounds(140, 70, 150, 30);
		venta.addItem("1 a 5");
		venta.addItem("6 a 10");
		venta.addItem("10 a 20");
		venta.addItem("21 o mas");

		anio = new JComboBox<String>();
		anio.setBounds(140, 210, 150, 30);
		anio.addItem("menos de 2 años");
		anio.addItem("2 a 3 años");
		anio.addItem("4 a 7 años");
		anio.addItem("8 a 15 años");
		anio.addItem("mas de 15 años");

		botonG = new JButton("Guardar");
		botonG.setBounds(140, 280, 150, 30);
		botonG.addActionListener(this);

		panel2.add(texto1, 0);
		panel2.add(botonG, 0);
		panel2.add(fondoF, 0);
		panel2.add(anio, 0);
		panel2.add(venta, 0);

	}

	/**
	 * Componentes de empleado a comision
	 * <b>Precondiciones: Oprimir el boton empleado comision, y tener la imagen del empleado a comision en la ruta predeterminada para imagenes</b>
	 * <b>PosCondiciones: Pintar los datos requeridos para los empleados de comision y enviar al action listener cuando se guarde</b>
	 */
	public void empleadoC() {

		// Presentacion informacion de empleado

		menu.setVisible(false);
		empleadoC = new JPanel();
		empleadoC.setLayout(null);
		empleadoC.setBounds(0, 0, getWidth(), getHeight());

		// fondo de presentacion informacion de empleado
		fondoC = new JLabel();
		fondoC.setBounds(0, 0, getWidth(), getHeight());
		imagenC = new ImageIcon("src/unbosque/edu/co/vista/imagenes/imagenM.jpg");
		imagenC = new ImageIcon(imagenC.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_DEFAULT));
		fondoC.setIcon(imagenC);
		empleadoC.add(fondoC);

		fondoC = new JLabel("Empleados con salario a comision");
		fondoC.setFont(new Font("", Font.PLAIN, 20));
		fondoC.setBounds(20, 40, 300, 30);
		empleadoC.add(fondoC, 0);

		botonV1 = new JButton("volver");
		botonV1.setBounds(1020, 50, 170, 60);
		imagenC = new ImageIcon("src/unbosque/edu/co/vista/imagenes/Volver.png");
		imagenC = new ImageIcon(imagenC.getImage().getScaledInstance(270, 70, Image.SCALE_DEFAULT));
		botonV1.setOpaque(false);
		botonV1.setBackground(new Color(0, 0, 0, 0));
		botonV1.setBorder(null);
		botonV1.setIcon(imagenC);
		botonV1.addActionListener(this);

		fondoC = new JLabel("Clientes captados:");
		fondoC.setFont(new Font("", Font.PLAIN, 20));
		fondoC.setBounds(300, 200, 300, 30);
		empleadoC.add(fondoC, 0);

		cliente = new JTextField();
		cliente.setBounds(getWidth() - 700, 200, 215, 38);
		add(cliente, 0);

		fondoC = new JLabel("Monto por cada cliente:");
		fondoC.setFont(new Font("", Font.PLAIN, 20));
		fondoC.setBounds(256, 300, 300, 30);
		empleadoC.add(fondoC, 0);

		montoC = new JTextField();
		montoC.setBounds(getWidth() - 700, 300, 215, 38);
		add(montoC, 0);

		botonO = new JButton("Salario");
		botonO.setBounds(getWidth() - 700, 400, 230, 60);
		imagenC = new ImageIcon("src/unbosque/edu/co/vista/imagenes/SalarioT.png");
		imagenC = new ImageIcon(imagenC.getImage().getScaledInstance(315, 70, Image.SCALE_DEFAULT));
		botonO.setOpaque(false);
		botonO.setBackground(new Color(0, 0, 0, 0));
		botonO.setBorder(null);
		botonO.setIcon(imagenC);
		botonO.addActionListener(this);

		empleadoC.add(botonO, 0);
		empleadoC.add(botonV1, 0);
		add(empleadoC, 0);
	}

	public void mostratI() {
		
		// Presentacion mostrar informacion

				menu.setVisible(false);
				mostrarI = new JPanel();
				mostrarI.setLayout(null);
				mostrarI.setBounds(0, 0, getWidth(), 200);

				// fondo de presentacion mostrar infromacion
				fondo = new JLabel();
				fondo.setBounds(0, 0, getWidth(), getHeight());
				imagen = new ImageIcon("src/unbosque/edu/co/vista/imagenes/imagenM.jpg");
				imagen = new ImageIcon(imagen.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_DEFAULT));
				fondo.setIcon(imagen);
				
				modelo = new DefaultTableModel();
				JTable tabla = new JTable (modelo);

	}
	
	/**
	 * ActionPerformed - Acciones que deben ser realizadas de acuerdo a boton presionado
	 * <b>Precondiciones: </b>
	 * <b>PosCondiciones: Ejecuta un JOptionPane, que muestra un mensaje los datos enviados</b>
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		// eventos de los botones de informacion de empleado
		
		// volver al menu
		if (e.getSource() == boton2) {

			informacionE.setVisible(false);
			menu.setVisible(true);
			menu();
		}
		
		// crea un panel donde muestra toda la infromacion
		if (e.getSource() == boton1) {
			claseVerificarDatos = new VerificarDatos();
			boolean correoPermitido = claseVerificarDatos.verificarCorreo(correo.getText());
			String nombrePermitido = claseVerificarDatos.validarNombre(nombre.getText());
			String apellidoPermitido = claseVerificarDatos.validarApellido(apellido.getText());
			String cc = claseVerificarDatos.validarCedula(cedula.getText());
			String direccionVerificada = claseVerificarDatos.validarDireccion(direccion.getText());
			String telefonoValidar = claseVerificarDatos.validarTelefono(telefono.getText());
			if (!nombrePermitido.equals("")) {
				errorMontoClienteEmpleadoComision(nombrePermitido);
			} else {
				if (!apellidoPermitido.equals("")) {
					errorMontoClienteEmpleadoComision(apellidoPermitido);
				} else {
					if (!cc.equals("")) {
						errorMontoClienteEmpleadoComision(cc);
					} else {
						if (!direccionVerificada.equals("")) {
							errorMontoClienteEmpleadoComision(direccionVerificada);
						} else {
							if (!telefonoValidar.equals("")) {
								errorMontoClienteEmpleadoComision(telefonoValidar);
							} else {
								if (correoPermitido == true) {
									JOptionPane.showMessageDialog(null,
											"Nombre: " + nombre.getText() +
											"\n" + "\n" + "Apellido: " + apellido.getText() + "\n" + "\n"+
											"Cedula: " + cedula.getText() + "\n" + "\n" +
											"Telefono: " + telefono.getText() + "\n"+ "\n" + 
											"Correo: " + correo.getText() + "\n" + "\n" + 
											"Direccion: " + direccion.getText()+ "\n" + "\n" + 
											"Genero: " + genero.getSelectedItem()+ "\n" + "\n" + 
											"Tipo de empleado: "+tipoE.getSelectedItem(),
											"Informacion registrada", JOptionPane.DEFAULT_OPTION);
									
									tipoEmpleado = 0;
									if (tipoE.getSelectedItem() == "Empleado junior") {
										tipoEmpleado = 1;
									} else {
										if (tipoE.getSelectedItem() == "Empleado senior") {
											tipoEmpleado = 2;
										} 
										if (tipoE.getSelectedItem() == "Empleado comision") {
											
											if (e.getSource() == boton1) {
												informacionE.setVisible(false);
												empleadoC();
												empleadoC.setVisible(true);
											}

											empleadoC();
											tipoEmpleado = 3;
											
										} 
									}
									
									arregloPrueba = new String[9][8];
									arregloPrueba[0][0]= nombre.getText();
									arregloPrueba[0][1]= apellido.getText();
									arregloPrueba[0][2]= cedula.getText();
									arregloPrueba[0][3]= telefono.getText();
									arregloPrueba[0][4]= correo.getText();
									arregloPrueba[0][5]= direccion.getText();
									arregloPrueba[0][6]= (String) genero.getSelectedItem();
								} else {
									JOptionPane.showMessageDialog(null, "Debe ingresar un correo que tenga @unbosque.edu.co");
								}
							}
						}
					}
				}
			}
			
			

		}

		// eventos de los botones de empleado fijo

		// volver a menu
		if (e.getSource() == botonV) {
			if (e.getSource() == botonV) {
				panel1.setVisible(false);
				panel2.setVisible(false);
			}
			empleadoF.setVisible(false);
			menu.setVisible(true);

			menu();
		}
		// elegir una categoria

		if (e.getSource() == botonJ) {
			panel1.setVisible(true);
			panel2.setVisible(false);
		}
		if (e.getSource() == botonS) {
			panel2.setVisible(true);
			panel1.setVisible(false);
		}
		// guardar informacion

		if (e.getSource() == botonG) {

		}
		// eventos de los botones de empleado a comision

		// vuelve al menu

		if (e.getSource() == botonV1) {
			
			if (e.getSource() == botonV1) {
				montoC.setVisible(false);
				cliente.setVisible(false);
				botonV1.setVisible(false);
			}
			empleadoC.setVisible(false);
			menu.setVisible(true);
			menu();
		}
		// Realiza una multiplicacion

		if (e.getSource() == botonO) {
			String cad1 = cliente.getText();
			String cad2 = montoC.getText();
			controladorComision = new ControladorEmpleadoComision();
			boolean gananciasEmpleadoComision = controladorComision.verificarMontoCliente(cad1, cad2);
			if (gananciasEmpleadoComision == true) {
				String valorGananciasC = controladorComision.conversion(cad1, cad2);
				panelEmpleadoComision(valorGananciasC);
				arregloPrueba[0][7]= valorGananciasC;
				classDatos = new Datos();
				classDatos.setDatosTrabajador(arregloPrueba, tipoEmpleado);
			} else {
				String mensajeErroneo = "El rango del precio del cliente debe ser mayor que 500000 y menor que 2000000";
				errorMontoClienteEmpleadoComision(mensajeErroneo);
			}
			
			
		}

	}
	//Fin action performad

	/**
	 * Saca salario del empleado
	 * <b>Precondiciones: Haber enviado por el actionperdormad los datos de los números de clientes y el precio</b>
	 * <b>PosCondiciones: Mostrar el salario de un empleado por comision
	 * @param conversionString salario del empleado
	 */
	public void panelEmpleadoComision(String conversionString) {
		JOptionPane.showMessageDialog(this, "Su salario es de: " + conversionString);
	}
	
	
	public void errorMontoClienteEmpleadoComision (String mensajeError) {
		JOptionPane.showMessageDialog(this,mensajeError);
	}
	
}
