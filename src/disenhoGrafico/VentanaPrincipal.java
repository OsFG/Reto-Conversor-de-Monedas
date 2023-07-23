package disenhoGrafico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 169);
		setTitle("Alura Reto 2 - Conversor");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Convertir de Pesos (MX) a:");
		lblNewLabel.setBounds(24, 26, 129, 14);
		contentPane.add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dólares (USD)", "Euros (EUR)", "Libras Esterlinas (GBP)", "Yen Japonés (JPY)", "Won Surcoreano (KRW)"}));
		comboBox.setBounds(155, 22, 204, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Convertir de:");
		lblNewLabel_1.setBounds(24, 63, 64, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Dólares (USD) a Pesos (MX)", "Euros (EUR) a Pesos (MX)", "Libras Esterlinas (GBP) a Pesos (MX)", "Yen Japonés (JPY) a Pesos (MX)", "Won Surcoreano (KRW) a Pesos (MX)"}));
		comboBox_1.setBounds(92, 59, 267, 22);
		contentPane.add(comboBox_1);
	}
}
