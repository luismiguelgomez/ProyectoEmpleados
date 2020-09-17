package unbosque.edu.co.vista;

/**
/**
 * Esta clase define objetos que contienen las 
 * @see <a href = "http://www.aprenderaprogramar.com" /> aprenderaprogramar.com – Didáctica en programación </a>
 * @author ING-MARLON
 *
 */

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import javafx.scene.control.ComboBox;

public class View {
	
	//atributos
	JFrame ventana;
	
	//presentacion
	JPanel presentacion;
	JButton iniciar;
	JLabel fondoP;
	ImageIcon imagenF,imagenB;
	
	//menu
	JPanel menu;
    JButton botones[];
    JLabel fondoM;
    ImageIcon imagenM,imagenBs;
 
    
    //informacion empleado
    
    JPanel informacionE;
	JLabel fondoI;
	ImageIcon imagenI;
	JTextField nombre,apellido,cedula,correo,telefono,direccion;
	JRadioButton masculino,femenino;
	JButton botonE;
	JComboBox<String> genero;
	
	public View() {
		// TODO Auto-generated constructor stub
		
		//ventana
		
		ventana = new JFrame("");
		ventana.setSize(1184, 666);
		ventana.setLayout(null);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Presentacion
		
		presentacion = new JPanel();
		presentacion.setLayout(null);
		presentacion.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
		presentacion.setVisible(true);
		ventana.add(presentacion,-1);
		
		//fondo de presentacion
		
		fondoP = new JLabel();
		fondoP.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
		imagenF = new ImageIcon("src/unbosque/edu/co/vista/imagenes/imagenF.jpg");
		imagenF = new ImageIcon(imagenF.getImage().getScaledInstance(ventana.getWidth(), ventana.getHeight(), Image.SCALE_DEFAULT));
		fondoP.setIcon(imagenF);
		fondoP.setVisible(true);
		presentacion.add(fondoP,0);
		
		//Boton de inicio
		
		iniciar = new JButton();
		iniciar.setBounds(ventana.getWidth()-700, 335, 215,38 );
		imagenB= new ImageIcon("src/unbosque/edu/co/vista/imagenes/botonI.png");
		imagenB= new ImageIcon(imagenB.getImage().getScaledInstance(300, 50, Image.SCALE_DEFAULT));
		iniciar.setIcon(imagenB);
		iniciar.setOpaque(false);
		iniciar.setBackground(new Color(0,0,0,0));
		iniciar.setBorder(null);;
		iniciar.setVisible(true);
		presentacion.add(iniciar,0);
		
		
		//cantidad de botones en menu
		
		botones  = new JButton[4]; 
		for(int i= 0;i< botones.length; i++) {
			botones[i]=new JButton();
			
		}
		
		
		
		//accion del mouse 
		
		iniciar.addMouseListener(new MouseAdapter() {
			
			public void mousePressed (MouseEvent e) {
				System.out.println("iniciar");
				menu();
				eventoMenu();
				eventoInformacion();
			}
		});
		
		
		
		
		
		
		ventana.add(presentacion);
		
		
		ventana.setVisible(true);
		
	}//cierre del constructor
	
	
	public void menu() {
		
		 /**
	     *  
	     */
		
	//Presentacion menu
		
		presentacion.setVisible(false);
		menu = new JPanel();
		menu.setLayout(null);
		menu.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
		menu.setVisible(true);
		
		//fondo de presentacion menu
		
		fondoM = new JLabel();
		fondoM.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
		imagenM = new ImageIcon("src/unbosque/edu/co/vista/imagenes/imagenM.jpg");
		imagenM = new ImageIcon(imagenM.getImage().getScaledInstance(ventana.getWidth(), ventana.getHeight(), Image.SCALE_DEFAULT));
		fondoM.setIcon(imagenM);
		fondoM.setVisible(true);
		menu.add(fondoM,0);
		
		
		//nombro los botones
		
		imagenBs= new ImageIcon("src/unbosque/edu/co/vista/imagenes/informacionE.png");
		imagenBs= new ImageIcon(imagenBs.getImage().getScaledInstance(315, 70, Image.SCALE_DEFAULT));
		botones[0].setIcon(imagenBs);
		
		imagenBs= new ImageIcon("src/unbosque/edu/co/vista/imagenes/empleadoF.png");
		imagenBs= new ImageIcon(imagenBs.getImage().getScaledInstance(315, 70, Image.SCALE_DEFAULT));
		botones[1].setIcon(imagenBs);
		
		imagenBs= new ImageIcon("src/unbosque/edu/co/vista/imagenes/empleadoC.png");
		imagenBs= new ImageIcon(imagenBs.getImage().getScaledInstance(315, 70, Image.SCALE_DEFAULT));
		botones[2].setIcon(imagenBs);
		
		imagenBs= new ImageIcon("src/unbosque/edu/co/vista/imagenes/salir.png");
		imagenBs= new ImageIcon(imagenBs.getImage().getScaledInstance(350, 70, Image.SCALE_DEFAULT));
		botones[3].setIcon(imagenBs);
		
		for (int i = 0; i < botones.length; i++) {
			botones[i].setBounds(ventana.getWidth()-(250+50),(i+1)*70, 250,45);//
			botones[i].setOpaque(false);
			botones[i].setBackground(new Color(0,0,0,0));
			botones[i].setBorder(null);
			botones[i].setVisible(true);
	

			menu.add(botones[i],0);
		}
		ventana.add(menu);
		
	}// cierre del metodo menu
	
		public void eventoMenu() {
			
			//boton INFORMACION EMPLEADO
			
			botones[0].addMouseListener(new MouseAdapter() {
				
				public void mousePressed (MouseEvent e) {
					System.out.println("INFORMACION EMPLEADO");
					informacionE();
					
				}
			});
			
			//boton EMPLEADO FIJO 
			
		botones[1].addMouseListener(new MouseAdapter() {
					
					public void mousePressed (MouseEvent e) {
						System.out.println("EMPLEADO FIJO");
						
					}
			});
			
			//boton EMPLEADO A COMISION 
		
		botones[2].addMouseListener(new MouseAdapter() {
			
			public void mousePressed (MouseEvent e) {
				System.out.println("EMPLEADO A COMISION");
		}
	});
		
		//boton SALIR
		botones[3].addMouseListener(new MouseAdapter() {
			
			public void mousePressed (MouseEvent e) {
				System.out.println("SALIR");
				System.exit(0);
			}
		});
		
		}
		
		public void informacionE() {
			//Presentacion menu
			
			menu.setVisible(false);
			informacionE = new JPanel();
			informacionE.setLayout(null);
			informacionE.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
			informacionE.setVisible(true);
			
			//fondo de presentacion menu
			
			fondoI = new JLabel();
			fondoI.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
			fondoI.setVisible(true);
	
			
			  fondoI=new JLabel("Registre su informacion.");
		        fondoI.setBounds(20,40,300,30);
		        informacionE.add(fondoI);
		        
		        //registra nombre
		        
		        fondoI=new JLabel("Nombre:");
		        fondoI.setBounds(10,100,100,30);
		        informacionE.add(fondoI);
		        nombre=new JTextField();
		        nombre.setBounds(100,110,150,20);
		        informacionE.add(nombre);  	
			
		        //registra apellido
		        
		        fondoI=new JLabel("Apellido:");
		        fondoI.setBounds(10,200,100,30);
		        informacionE.add(fondoI);
		        apellido=new JTextField();
		        apellido.setBounds(100,210,150,20);
		        informacionE.add(apellido);  	
		        
		        //registra cedula
		        
		        fondoI=new JLabel("Cedula:");
		        fondoI.setBounds(10,300,100,30);
		        informacionE.add(fondoI);
		        cedula=new JTextField();
		        cedula.setBounds(100,310,150,20);
		        informacionE.add(cedula);  	
		        
		        //registra telefono
		        
		        fondoI=new JLabel("Telefono:");
		        fondoI.setBounds(10,400,100,30);
		        informacionE.add(fondoI);
		        telefono=new JTextField();
		        telefono.setBounds(100,410,150,20);
		        informacionE.add(telefono);  	
		        
		        //registra correo
		        
		        fondoI=new JLabel("Correo:");
		        fondoI.setBounds(10,500,100,30);
		        informacionE.add(fondoI);
		        correo=new JTextField();
		        correo.setBounds(100,510,150,20);
		        informacionE.add(correo); 
		        
		        //registra direccion
		        
		        fondoI=new JLabel("Direccion:");
		        fondoI.setBounds(350,100,200,30);
		        informacionE.add(fondoI);
		        direccion=new JTextField();
		        direccion.setBounds(440,110,150,20);
		        informacionE.add(direccion); 
		        
		  
			
		        fondoI=new JLabel("genero:");
		        fondoI.setBounds(350,200,200,30);
		        informacionE.add(fondoI);
		        
				   genero=new JComboBox<String>();
				   genero.setBounds(440,200,200,30);
			        informacionE.add(genero);
			        genero.addItem("Masculino");
			        genero.addItem("Femenino");
			   			        
			        botonE = new JButton("Guardar informacion");
			        botonE.setBounds(ventana.getWidth()-700, 335, 215,38 );
					iniciar.setVisible(true);
					informacionE.add(botonE,0);
					
					botonE = new JButton("Volver");
					botonE.setBounds(ventana.getWidth()-700, 509, 215,38);
					botonE.setVisible(true);
					informacionE.add(botonE);
			        
			        
		ventana.add(informacionE);
		}
	
		public void eventoInformacion() {
			
	botonE.addMouseListener(new MouseAdapter() {
				
				public void mousePressed (MouseEvent e) {
					System.out.println("Volver");
					menu();
				}
			});
		}
		
		  


}
	
	
	
	
	
	
	
	
	
	
	
	



