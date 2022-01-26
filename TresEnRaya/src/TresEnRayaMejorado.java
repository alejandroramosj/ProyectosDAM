import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
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

public class TresEnRayaMejorado {

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setTitle("Ventana principal2");

		frame.add(new Principal());

		frame.setBounds(300, 300, 475, 300);

		frame.setResizable(false);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);

	}

}

class Principal extends JPanel {
	Central central = new Central();

	public Principal() {
		setLayout(new BorderLayout());

		add(new head(), BorderLayout.NORTH);

		add(central, BorderLayout.CENTER);

		add(new footer(), BorderLayout.SOUTH);

	}

	class head extends JPanel {
		public head() {
			setLayout(new FlowLayout(FlowLayout.CENTER));

			JLabel titulo = new JLabel("Bienvenido al Tres En Raya");

			titulo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

			titulo.setBorder(new EmptyBorder(10, 5, 10, 15));

			add(titulo);

			JButton oneVsOne = new JButton("1 vs 1");

			add(oneVsOne);

			oneVsOne.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					central.generarCasillas(true);

				}
			});

			JButton oneVsPC = new JButton("1 vs PC");

			add(oneVsPC);

			oneVsPC.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					central.generarCasillas(false);
				}
			});

		}

	}

	class Central extends JPanel {
		JButton casillas[][] = new JButton[3][3];
		private boolean turno;

		public Central() {
			setLayout(new GridLayout(3, 3));
		}

		private void generarCasillas(boolean modo) {
			central.removeAll();
			this.turno = true;

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					casillas[i][j] = new JButton();
					central.add(casillas[i][j]);
					casillas[i][j].updateUI();

					if (modo == true) {
						casillas[i][j].addActionListener(new eventoCasillasOneVsOne());

					} else if (modo == false) {
						casillas[i][j].addActionListener(new eventoCasillasPC());
					}

				}
			}

		}

		class eventoCasillasOneVsOne implements ActionListener {
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
								if (turno != true) {
									JOptionPane.showMessageDialog(null, "¡¡¡HA GANADO EL JUGADOR 1!!!");
								} else {
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

		class eventoCasillasPC implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < casillas.length; i++) {
					for (int j = 0; j < casillas[0].length; j++) {
						if (e.getSource() == casillas[i][j]) {

							cambiarCasilla(casillas[i][j], new ImageIcon("jugador1.png"));
							turno = true;
							if (comprobarTresEnRaya() == true) {
								if (turno == true) {
									JOptionPane.showMessageDialog(null, "¡¡¡HA GANADO EL JUGADOR 1!!!");
								}
								break;
							} else if (juegoEmpatado() == true) {
								pintarEmpateTablero();
								JOptionPane.showMessageDialog(null, "EMPATE");
								break;
							}

							jugador2Aletorio();
							turno = false;

							if (comprobarTresEnRaya() == true) {
								if (turno == false) {
									JOptionPane.showMessageDialog(null, "¡¡¡HA GANADO EL JUGADOR 2!!!");
								}
								break;
							} else if (juegoEmpatado() == true) {
								pintarEmpateTablero();
								JOptionPane.showMessageDialog(null, "EMPATE");
								break;
							}

						}
					}
				}

			}

		}

		public void jugador2Aletorio() {
			boolean salir;
			do {
				salir = false;

				int fila = (int) (Math.random() * 3);
				int columna = (int) (Math.random() * 3);

				if (casillas[fila][columna].isEnabled() == true) {
					cambiarCasilla(casillas[fila][columna], new ImageIcon("jugador2.png"));

				} else {
					salir = true;
				}

			} while (salir != false);
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

			// Comprobacion verticales
			for (int i = 0; i < casillas.length; i++) {

				if (casillas[0][i].isEnabled() == false && casillas[1][i].isEnabled() == false
						&& casillas[2][i].isEnabled() == false) {

					if (casillas[0][i].getIcon().toString().equals(casillas[1][i].getIcon().toString())
							&& casillas[0][i].getIcon().toString().equals(casillas[2][i].getIcon().toString())) {

						pintarGanador(casillas[0][i], casillas[1][i], casillas[2][i]);
						
						return true;
					}
				}

				if (casillas[i][0].isEnabled() == false && casillas[i][1].isEnabled() == false
						&& casillas[i][2].isEnabled() == false) {
					if (casillas[i][0].getIcon().toString().equals(casillas[i][1].getIcon().toString())
							&& casillas[i][0].getIcon().toString().equals(casillas[i][2].getIcon().toString())) {

						pintarGanador(casillas[i][0], casillas[i][1], casillas[i][2]);

						return true;
					}
				}
			}

			if (casillas[0][0].isEnabled() == false && casillas[1][1].isEnabled() == false
					&& casillas[2][2].isEnabled() == false) {
				if (casillas[0][0].getIcon().toString().equals(casillas[1][1].getIcon().toString())
						&& casillas[0][0].getIcon().toString().equals(casillas[2][2].getIcon().toString())) {

					pintarGanador(casillas[0][0], casillas[1][1], casillas[2][2]);
					return true;
				}
			}

			if (casillas[0][2].isEnabled() == false && casillas[1][1].isEnabled() == false
					&& casillas[2][0].isEnabled() == false) {
				if (casillas[0][2].getIcon().toString().equals(casillas[1][1].getIcon().toString())
						&& casillas[0][2].getIcon().toString().equals(casillas[2][0].getIcon().toString())) {

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
