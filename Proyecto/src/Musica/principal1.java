package Musica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class principal1 {

	private JFrame frame;
	private JTextField txtId;
	private JTextField txtAlbum;
	private JTextField txtArtista;
	private JTextField txtGenero;
	
	Lista_Doble listadoble=new Lista_Doble();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal1 window = new principal1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public principal1() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 787, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Opciones");
		lblNewLabel.setBounds(59, 11, 160, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnInsertarAdelante = new JButton("Insertar nodo adelante");
		btnInsertarAdelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Musica nuevo=new Musica();
				
				nuevo.setId(txtId.getText());
				nuevo.setAlbum(txtAlbum.getText());
				nuevo.setArtista(txtArtista.getText());
				nuevo.setGenero(txtGenero.getText());
				
				listadoble.insertarAdelante(nuevo);	
				JOptionPane.showMessageDialog(null, "Informacion insertada adelante!");
				



			}
		});
		btnInsertarAdelante.setBounds(39, 47, 193, 23);
		frame.getContentPane().add(btnInsertarAdelante);
		
		JButton btnInsertarAtras = new JButton("Insertar nodo atras");
		btnInsertarAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Musica nuevo=new Musica();
				
				nuevo.setId(txtId.getText());
				nuevo.setAlbum(txtAlbum.getText());
				nuevo.setArtista(txtArtista.getText());
				nuevo.setGenero(txtGenero.getText());
				
				listadoble.insertarFinal(nuevo);	
				JOptionPane.showMessageDialog(null, "Informacion insertada atras!");
				


				
			}
		});
		btnInsertarAtras.setBounds(39, 81, 193, 23);
		frame.getContentPane().add(btnInsertarAtras);
		
		JButton btnEliminarPrimer = new JButton("Eliminar primer nodo");
		btnEliminarPrimer.setBounds(39, 115, 193, 23);
		frame.getContentPane().add(btnEliminarPrimer);
		
		JButton btnEliminarUltimo = new JButton("Eliminar ultimo nodo");
		btnEliminarUltimo.setBounds(39, 149, 193, 23);
		frame.getContentPane().add(btnEliminarUltimo);
		
		JButton btnRecorridoAdelante = new JButton("Recorrido hacia delante");
		btnRecorridoAdelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResul.setText(listadoble.mostrasrInicioaFin().toString());
			}
			
		});
		
			
		
		btnRecorridoAdelante.setBounds(39, 183, 193, 23);
		frame.getContentPane().add(btnRecorridoAdelante);
		
		JButton btnRecorridoAtras = new JButton("Recorrido hacia atras");
		btnRecorridoAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRecorridoAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnRecorridoAtras.setBounds(39, 217, 193, 23);
		frame.getContentPane().add(btnRecorridoAtras);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setBounds(138, 396, 94, 23);
		frame.getContentPane().add(btnSalir);
		
		txtId = new JTextField();
		txtId.setBounds(334, 40, 301, 37);
		frame.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		JLabel lblInserteElTipo = new JLabel("Inserte ID Cancion");
		lblInserteElTipo.setBounds(381, 11, 193, 14);
		frame.getContentPane().add(lblInserteElTipo);
		
		JLabel lblNewLabel_1 = new JLabel("Album De La Cancion");
		lblNewLabel_1.setBounds(381, 85, 182, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtAlbum = new JTextField();
		txtAlbum.setBounds(334, 116, 301, 37);
		frame.getContentPane().add(txtAlbum);
		txtAlbum.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre Del Artista");
		lblNewLabel_2.setBounds(381, 175, 182, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtArtista = new JTextField();
		txtArtista.setBounds(334, 199, 301, 37);
		frame.getContentPane().add(txtArtista);
		txtArtista.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Genero De La Cancion");
		lblNewLabel_3.setBounds(381, 255, 193, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtGenero = new JTextField();
		txtGenero.setBounds(328, 280, 307, 37);
		frame.getContentPane().add(txtGenero);
		txtGenero.setColumns(10);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtId.setText("");
				txtAlbum.setText("");
				txtArtista.setText("");
				txtGenero.setText("");
			}
		});
		btnLimpiar.setBounds(39, 396, 89, 23);
		frame.getContentPane().add(btnLimpiar);
	}
}
