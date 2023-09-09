package conversorChallenge;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ConversorDeMonedas extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem opcion1;
	private JMenuItem opcion2;
	private JMenuItem opcion3;
	private JMenuItem opcion4;
	private JMenuItem opcion5;
	private JMenuItem opcion6;
	private JMenuItem opcion7;
	private int cantidad;
	
	public ConversorDeMonedas() {
		setSize(300,200);
		setTitle("Conversor de Monedas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(400, 200);
		JPanel panel=new JPanel();
		try {
			cantidad =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de monedas que desea convertir"));
		}catch(Exception e) {
			JOptionPane.showMessageDialog(panel, "Valor no valido, solo se aceptan caracteres decimales");
		}
		mostrarMenu();
		this.add(panel);
		panel.add(menuBar);
		this.setVisible(true);
		
		
	}
	
	public void mostrarMenu() {
		menuBar=new JMenuBar();
		menu=new JMenu("Elija el tipo de cambio que desea");
		opcion1=new JMenuItem("1) De pesos argentinos a dolar estado unidense"); 
		opcion2=new JMenuItem("2) De dolar estado unidense a pesos argentinos"); 
		opcion3=new JMenuItem("3) De pesos argentinos a euros"); 
		opcion4=new JMenuItem("4) De euros a pesos argentinos"); 
		opcion5=new JMenuItem("5) De olar estado unidense a euros"); 
		opcion6=new JMenuItem("6) De euros a dolar estado unidense"); 
		opcion7=new JMenuItem("7) Usted ah decidido salir del convertidor de monedas");
		
		menu.add(opcion1);
		menu.add(opcion2);
		menu.add(opcion3);
		menu.add(opcion4);
		menu.add(opcion5);
		menu.add(opcion6);
		menu.add(opcion7);
		menuBar.add(menu);
		opcion1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double resultado= cantidad * 0.0036;
				JOptionPane.showMessageDialog(null, "El resultado de la conversion de pesos a dolar es : " + resultado);
				
			}
		});
		
		opcion2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double resultado= cantidad * 279.32;
				JOptionPane.showMessageDialog(null, "El resultado de la conversion de dolar a pesos es : " + resultado);
			}
		});
		
		opcion3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double resultado= cantidad * 0.0033;
				JOptionPane.showMessageDialog(null, "El resultado de la conversion de pesos a euros es : " + resultado);
			}
		});

		opcion4.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				double resultado= cantidad * 307.58;
				JOptionPane.showMessageDialog(null, "El resultado de la conversion de euros a pesos es : " + resultado);
			}
		});

		opcion5.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				double resultado= cantidad * 0.91;
				JOptionPane.showMessageDialog(null, "El resultado de la conversion de dolar a euros es : " + resultado);
			}
		});

		opcion6.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				double resultado= cantidad * 1.1;
				JOptionPane.showMessageDialog(null, "El resultado de la conversion de  es : " + resultado);
			}
		});

		opcion7.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Usted ah salido del conversor con exito");
				System.exit(0);
			}
		});
	}
}
