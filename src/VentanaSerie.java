

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;

public class VentanaSerie extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtIteraciones;
	private JTextArea varSerie;

	public static void main(String[] args) {
		VentanaSerie frame = new VentanaSerie();
		frame.setVisible(true);
	}

	public VentanaSerie() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 595);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Arial", Font.BOLD, 14));
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(268, 324, 123, 48);
		contentPane.add(btnSalir);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(300, 31, 167, 38);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);
		
		JLabel lblNumero1 = new JLabel("Numero inicial 1");
		lblNumero1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNumero1.setBounds(183, 30, 107, 39);
		contentPane.add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("Numero inicial 2");
		lblNumero2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNumero2.setBounds(183, 101, 107, 39);
		contentPane.add(lblNumero2);
		
		txtNumero2 = new JTextField();
		txtNumero2.setColumns(10);
		txtNumero2.setBounds(300, 102, 167, 38);
		contentPane.add(txtNumero2);
		
		JLabel lblIteraciones = new JLabel("Iteraciones");
		lblIteraciones.setFont(new Font("Arial", Font.BOLD, 12));
		lblIteraciones.setBounds(183, 182, 107, 39);
		contentPane.add(lblIteraciones);
		
		txtIteraciones = new JTextField();
		txtIteraciones.setColumns(10);
		txtIteraciones.setBounds(300, 183, 167, 38);
		contentPane.add(txtIteraciones);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String varNumero1S = txtNumero1.getText(); 
				String varNumero2S = txtNumero2.getText();
				String varIteraS = txtIteraciones.getText();
				String cadena = "";
				
				int varNumero1I = Integer.parseInt(varNumero1S);
				int varNumero2I = Integer.parseInt(varNumero2S);
				int varIteraI = Integer.parseInt(varIteraS);
				int suma = 0;
				
				cadena = cadena + varNumero1S + varNumero2S;
				
				for (int x = 0; x<=varIteraI; x++) {
					suma = varNumero1I + varNumero2I;
					 
					varNumero1I = varNumero2I;
					varNumero2I = suma;
					
					//System.out.println(suma);
					cadena = cadena + " " + suma;
				}
				
				varSerie.setText(cadena);
				
			}
		});
		btnGenerar.setFont(new Font("Arial", Font.BOLD, 14));
		btnGenerar.setBounds(268, 398, 123, 48);
		contentPane.add(btnGenerar);
		
		varSerie = new JTextArea();
		varSerie.setBounds(183, 247, 284, 48);
		contentPane.add(varSerie);
		
		
	}
}
