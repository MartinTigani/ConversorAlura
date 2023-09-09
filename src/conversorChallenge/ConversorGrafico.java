package conversorChallenge;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ConversorGrafico extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem opcion1;
	private JMenuItem opcion2;
	private JMenuItem opcion3;
	
	public ConversorGrafico(){
		setSize(300,200);
		setTitle("Conversor");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(400, 200);
		
		JPanel panel= new JPanel();
		mostrarMenu();
		panel.add(menuBar);
		add(panel);
		setVisible(true);
	}
	
	
	public void mostrarMenu() {
		
		menuBar = new JMenuBar();
		menu = new JMenu("Elija una opcion valida: ");
		opcion1 =new JMenuItem("Conversor de monedas");
		opcion2 =new JMenuItem("Conversor de medidas");
		opcion3 =new JMenuItem("salir");
		
		menu.add(opcion1);
		menu.add(opcion2);
		menu.add(opcion3);
		menuBar.add(menu);
		opcion1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ConversorDeMonedas converMoneda= new ConversorDeMonedas();
				converMoneda.setVisible(true);
			}
		});
		
		opcion2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ConversorMedida converMedida=new ConversorMedida();
				converMedida.setVisible(true);
				
				//converMedida.mostrarMenu();
			
				
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
