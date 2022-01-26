import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
public class TresEnRaya {

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setTitle("Ventana principal1");

		frame.add(new LaminaPrincipal());

		frame.setBounds(300, 300, 450, 300);

		frame.setResizable(false);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);

	}

}

class LaminaPrincipal extends JPanel {
	center center = new center();

	public LaminaPrincipal() {
		setLayout(new BorderLayout());

		add(new head(), BorderLayout.NORTH);

		add(center, BorderLayout.CENTER);

		add(new footer(), BorderLayout.SOUTH);

	}

	class head extends JPanel {
		public head() {
			setLayout(new FlowLayout(FlowLayout.CENTER));

			JLabel titulo = new JLabel("Bienvenido al Tres En Raya");

			titulo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

			titulo.setBorder(new EmptyBorder(10, 5, 10, 15));

			add(titulo);

			JButton comenzar = new JButton("Comenzar");

			add(comenzar);

			comenzar.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					center.generarCasillas();

				}
			});
		}

	}
	
	//Clase lamina del centro
	class center extends JPanel {
		JButton casillas[][] = new JButton[3][3];
		private boolean turno;
		
		public center() {
			setLayout(new GridLayout(3, 3));
		}

		private void generarCasillas() {
			center.removeAll();
			this.turno = true;

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					casillas[i][j] = new JButton();
					center.add(casillas[i][j]);
					casillas[i][j].addActionListener(new eventoCasillas());
				}
			}
			revalidate();
			repaint();
//			updateUI();

		}
		
		//Action Listener del array de botones
		class eventoCasillas implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < casillas.length; i++) {
					for (int j = 0; j < casillas[0].length; j++) {
						if (e.getSource() == casillas[i][j]) {
							if (turno == true) {

								cambiarCasilla(casillas[i][j], new ImageIcon("jugador1.png"));
								turno = false;

							} else {
								cambiarCasilla(casillas[i][j], new ImageIcon("jugador2.png"));
								turno = true;
							}

							if (comprobarTresEnRaya() == true) {
								if(turno != true) {
									JOptionPane.showMessageDialog(null, "¡¡¡HA GANADO EL JUGADOR 1!!!");
								}else {
									JOptionPane.showMessageDialog(null, "¡¡¡HA GANADO EL JUGADOR 2!!!");
								}
								
							} else if (juegoEmpatado() == true) {
								pintarEmpateTablero();
								JOptionPane.showMessageDialog(null, "EMPATE");

							}

						}
					}
				}

			}

		}

		// Metodo que cambia de icono y desabilita el boton
		public void cambiarCasilla(JButton casilla, ImageIcon imagen) {
			casilla.setIcon(imagen);
			casilla.setEnabled(false);
			casilla.setDisabledIcon(imagen);
		}

		// Este metodo determina si estan todas las casillas ocupadas
		public boolean juegoEmpatado() {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (casillas[i][j].isEnabled() == true) {
						return false;
					}
				}
			}

			return true;
		}

		// Este metodo pinta el tablero cuando es empate
		public void pintarEmpateTablero() {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					casillas[i][j].setBackground(Color.RED);
				}
			}

		}

		// Este metodo comprueba si se cumple un tres en raya
		public boolean comprobarTresEnRaya() {

			
			for (int i = 0; i < casillas.length; i++) {
				
				if (casillas[0][i].isEnabled() == false && casillas[1][i].isEnabled() == false && casillas[2][i].isEnabled() == false) {
					
					if (casillas[0][i].getIcon().toString().equals(casillas[1][i].getIcon().toString()) && casillas[0][i].getIcon().toString().equals(casillas[2][i].getIcon().toString())) {
						
						pintarGanador(casillas[0][i], casillas[1][i], casillas[2][i]);
						
						return true;
					}
				}else if (casillas[i][0].isEnabled() == false && casillas[i][1].isEnabled() == false && casillas[i][2].isEnabled() == false) {
					if (casillas[i][0].getIcon().toString().equals(casillas[i][1].getIcon().toString()) && casillas[i][0].getIcon().toString().equals(casillas[i][2].getIcon().toString())) {
						
						pintarGanador(casillas[i][0], casillas[i][1], casillas[i][2]);
						
						return true;
					}
				}
				
			}
				
				if (casillas[0][0].isEnabled() == false && casillas[1][1].isEnabled() == false && casillas[2][2].isEnabled() == false) {
					if (casillas[0][0].getIcon().toString().equals(casillas[1][1].getIcon().toString()) && casillas[0][0].getIcon().toString().equals(casillas[2][2].getIcon().toString())) {
						
						pintarGanador(casillas[0][0], casillas[1][1], casillas[2][2]);
						return true;
					}
				}
				
				if (casillas[0][2].isEnabled() == false && casillas[1][1].isEnabled() == false && casillas[2][0].isEnabled() == false) {
					if (casillas[0][2].getIcon().toString().equals(casillas[1][1].getIcon().toString()) && casillas[0][2].getIcon().toString().equals(casillas[2][0].getIcon().toString())) {
						
						pintarGanador(casillas[0][2], casillas[1][1], casillas[2][0]);
						
						return true;
					}
				}
				
			
			
			return false;

		}
		
		// Este metodo pinta de color verde las casillas ganadoras y desactiva las demas
		public void pintarGanador(JButton casilla1, JButton casilla2, JButton casilla3) {
			casilla1.setBackground(Color.GREEN);
			casilla2.setBackground(Color.GREEN);
			casilla3.setBackground(Color.GREEN);
			
			for (int i = 0; i < casillas.length; i++) {
				for (int j = 0; j < casillas.length; j++) {
					casillas[i][j].setEnabled(false);
				}
			}
		}

		
	}
	
	//Clase para el footer
	class footer extends JPanel {
		public footer() {
			setLayout(new FlowLayout(FlowLayout.LEFT));

			setBackground(Color.BLACK);

			JLabel nombre = new JLabel("Autor: Alejandro Ramos Jimenez");

			nombre.setFont(new Font("Arial", Font.ITALIC, 12));

			nombre.setForeground(Color.WHITE);

			add(nombre);
		}
	}
}
