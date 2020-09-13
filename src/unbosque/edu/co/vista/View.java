/**
 * 
 */
package unbosque.edu.co.vista;

/**
 * @author ING-MARLON
 *
 */

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View {
	
	//atributos
	JFrame ventana;
	
	//presentacion
	JPanel presentacion;
	JButton iniciar;
	JLabel fondoP;
	ImageIcon imagenF;
	ImageIcon imagenB;
	
	//menu
	JPanel menu;
    JButton botones[];
    JLabel fondoM;
    ImageIcon imagenM;
    ImageIcon imagenBs;
	
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
		imagenF = new ImageIcon("src/view/imagenF.png");
		imagenF = new ImageIcon(imagenF.getImage().getScaledInstance(ventana.getWidth(), ventana.getHeight(), Image.SCALE_DEFAULT));
		fondoP.setIcon(imagenF);
		fondoP.setVisible(true);
		presentacion.add(fondoP,0);
		
		//Boton 
		
		iniciar = new JButton("Iniciar");
		iniciar.setBounds(ventana.getWidth()-700, 335, 215,38 );
		imagenB= new ImageIcon("src/view/botonI.png");
		imagenB= new ImageIcon(imagenB.getImage().getScaledInstance(300, 50, Image.SCALE_DEFAULT));
		iniciar.setIcon(imagenB);
		iniciar.setOpaque(false);
		iniciar.setBackground(new Color(0,0,0,0));
		iniciar.setBorder(null);;
		iniciar.setVisible(true);
		presentacion.add(iniciar,0);
		
		
		//menu
		
		botones  = new JButton[5]; //cantidad de botones
		for(int i= 0;i< botones.length; i++) {
			botones[i]=new JButton();
			
		}
		
		
		
		iniciar.addMouseListener(new MouseAdapter() {
			
			public void mousePressed (MouseEvent e) {
				
				System.out.println("iniciar");
			
			}
		});
		
		
		ventana.add(presentacion);
		
		
		ventana.setVisible(true);
		
	}//fin del constructor
	
	
	public void menu() {
		
	//Presentacion
		
		presentacion.setVisible(false);
		menu = new JPanel();
		menu.setLayout(null);
		menu.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
		menu.setVisible(true);
		
		//fondo de presentacion
		
		fondoM = new JLabel();
		fondoM.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
		imagenM = new ImageIcon("src/view/imagenF.png");
		imagenM = new ImageIcon(imagenM.getImage().getScaledInstance(ventana.getWidth(), ventana.getHeight(), Image.SCALE_DEFAULT));
		fondoM.setIcon(imagenM);
		fondoM.setVisible(true);
		menu.add(fondoM,0);
		
	}// final del menu
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

