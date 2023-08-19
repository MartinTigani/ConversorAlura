package conversorChallenge;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ConversorMedida extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem opcion1;
	private JMenuItem opcion2;
	private JMenuItem opcion3;
	private int cantidad;
	
	public ConversorMedida() {
		setSize(300,200);
		setTitle("Conversor de medidas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(400, 200);
		
		JPanel panel= new JPanel();
		cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida que deseas convertir "));
		
		mostrarMenu();
		panel.add(menuBar);
		this.add(panel);
		this.setVisible(true);
	}
	
	public void mostrarMenu() {
		menuBar = new JMenuBar();
		menu = new JMenu("Elija una opcion valida: ");
		opcion1 =new JMenuItem("1) Centimetros a metros");
		opcion2 =new JMenuItem("2) Metros a centimetros");
		opcion3 =new JMenuItem("3) Salir");
		
		menu.add(opcion1);
		menu.add(opcion2);
		menu.add(opcion3);
		menuBar.add(menu);
		opcion1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double resultado= cantidad * 0.01;
				JOptionPane.showMessageDialog(null, "El valor convertido de centimetros a metros es : " + resultado+"m");
				System.exit(0);
			}
			
		});
		
		opcion2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double resultado=cantidad*100;
				JOptionPane.showMessageDialog(null,"El valor convertido de metros  centrimetros es : " + resultado+"cm");
				System.exit(0);
			}
		});
		
		opcion3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Decidiste salir del conversor ");
				System.exit(0);
			}
		});
	}
	
}
/*
public class ConversorMedida {
	public static void main(String[] args) {
		//ConversorGrafico ventana1=new ConversorGrafico();
		
		muestra menu 							showimputdialog
		pregunta que numero quiere convertir	showimputdialog
		muestra menu moneda						showimputdialog
		muestra resultado 						showmessagedialog
		si ingresa distinto de numero exception	showmessagedialog
		quiere continuar si o no				showconfirmdialog
		si presiona no o cancelar				showmessagedialog fin
		
	}
}
	*/