package disenhoGrafico;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField moneOrigen;
	private JTextField montoAConvertir;
	private JTextField moneDestino;
	JButton btnConvertir;
	private JLabel lblNewLabel_3;
	private JLabel lblMX;
	private JLabel lblUSD;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	
	String mOrigen;
	int monedaO;
	String mDestino;
	int monedaD;
	double monto;
	private int clave;

	
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
		
		iniciarComponentes();
		
		setTitle("Alura Reto 2 - Conversor");
		setLocationRelativeTo(null);
		setResizable(false);		
	}

	private void iniciarComponentes() {
		setBounds(100, 100, 313, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Convertir de:");
		lblNewLabel.setBounds(54, 205, 87, 14);
		contentPane.add(lblNewLabel);
		
		moneOrigen = new JTextField();
		moneOrigen.setBounds(141, 201, 102, 22);
		contentPane.add(moneOrigen);
		
		JLabel lblNewLabel_1 = new JLabel("Monto:");
		lblNewLabel_1.setBounds(84, 271, 38, 14);
		contentPane.add(lblNewLabel_1);
		
		moneDestino = new JTextField();
		moneDestino.setBounds(142, 234, 101, 22);
		contentPane.add(moneDestino);
		
		btnConvertir = new JButton("Convertir");
		btnConvertir.setBounds(99, 305, 89, 23);
		btnConvertir.addActionListener(this);
		contentPane.add(btnConvertir);
		
		JLabel lblNewLabel_2 = new JLabel("A:");
		lblNewLabel_2.setBounds(105, 238, 17, 14);
		contentPane.add(lblNewLabel_2);
		
		montoAConvertir = new JTextField();
		montoAConvertir.setBounds(142, 267, 102, 22);
		contentPane.add(montoAConvertir);
		
		lblNewLabel_3 = new JLabel("Claves de Monedas:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(54, 11, 169, 14);
		contentPane.add(lblNewLabel_3);
		
		lblMX = new JLabel("Pesos (MX)");
		lblMX.setBounds(84, 36, 68, 22);
		contentPane.add(lblMX);
		
		lblUSD = new JLabel("Dólares (USD)");
		lblUSD.setBounds(84, 65, 87, 14);
		contentPane.add(lblUSD);
		
		lblNewLabel_6 = new JLabel("Euros (EUR)");
		lblNewLabel_6.setBounds(84, 90, 104, 14);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Libras Esterlinas (GBP)");
		lblNewLabel_7.setBounds(84, 115, 139, 14);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Yen Japonés (JPY)");
		lblNewLabel_8.setBounds(84, 140, 119, 14);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Won Surcoreano (KRW)");
		lblNewLabel_9.setBounds(84, 165, 139, 14);
		contentPane.add(lblNewLabel_9);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnConvertir == e.getSource()) {
			mOrigen = moneOrigen.getText();
			mOrigen = mOrigen.toUpperCase();
			mDestino = moneDestino.getText();
			mDestino = mDestino.toUpperCase();
			
			try{monto = Double.parseDouble(montoAConvertir.getText());
			} catch (Exception excepcion) {
				System.out.println("Ingrese valores numéricos");
                System.out.println(excepcion.getMessage()); 
                excepcion.printStackTrace();
			}
			
			asignarClaveNumerica();
			int clave = getClave();
			switch(clave) {
			case 1:
				Convertir(.059);
				break;
			case 2:
				Convertir(.054);
				break;
			case 3:
				Convertir(.047);
				break;
			case 4:
				Convertir(8.33);
				break;
			case 5:
				Convertir(76.40);
				break;
			case 6:
				Convertir(16.77);
				break;
			case 7:
				Convertir(18.38);
				break;
			case 8:
				Convertir(21.48);
				break;
			case 9:
				Convertir(.12);
				break;
			case 10:
				Convertir(.013);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Sólo se puede convertir de MX a otras monedas y viceversa. Ingrese datos válidos");
				break;
				}
			
			
			}
		}
	
	
	public void asignarClaveNumerica() {
		
		if (mOrigen.equals("MX") && mDestino.equals("USD")){ 
			setClave(1);
			}
		if (mOrigen.equals("MX") && mDestino.equals("EUR")){ 
			setClave(2);
			}
		if (mOrigen.equals("MX") && mDestino.equals("GBP")){ 
			setClave(3);
			}
		if (mOrigen.equals("MX") && mDestino.equals("JPY")){ 
			setClave(4);
			}
		if (mOrigen.equals("MX") && mDestino.equals("KRW")){ 
			setClave(5);
			}
		
		if (mOrigen.equals("USD") && mDestino.equals("MX")){ 
			setClave(6);
			}
		if (mOrigen.equals("EUR") && mDestino.equals("MX")){ 
			setClave(7);
			}
		if (mOrigen.equals("GBP") && mDestino.equals("MX")){ 
			setClave(8);
			}
		if (mOrigen.equals("JPY") && mDestino.equals("MX")){ 
			setClave(9);
			}
		if (mOrigen.equals("KRW") && mDestino.equals("MX")){ 
			setClave(10);
			}
		
		}
	
		
	private void Convertir(double proporcion){
		monto *= proporcion;
		JOptionPane.showMessageDialog(null, monto);
		System.out.println(monto);
		
	}
	
	public void setClave(int clave) {
		this.clave = clave;
	}
	public int getClave() {
		return clave;
	}
}
