import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * Buscaminas
 * @author Alejandro Ramos Jimenez
 * @version 1.0
 */
public class BuscaMinas {

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setTitle("Buscaminas Alejandro Ramos");

		frame.add(new LaminaPrincipal(frame));

		frame.setSize(550, 500);

		frame.setLocationRelativeTo(null);

		frame.setResizable(false);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);

	}

}
/**
 * Clase principal que extiende JPanel que contiene los demas paneles
 * @author Alejandro Ramos Jimenez
 *
 */
class LaminaPrincipal extends JPanel {
	private center center = new center();
	private JFrame frame;
	private int numeroBombas = 0;

	public LaminaPrincipal(JFrame jframe) {
		this.frame = jframe;
		
		setLayout(new BorderLayout());
		
		add(new head(), BorderLayout.NORTH);

		add(center, BorderLayout.CENTER);

		add(new footer(), BorderLayout.SOUTH);

	}
	
	/**
	 * Clase cabecera, es decir, parte superior
	 * @author Alejandro Ramos Jimenez
	 *
	 */
	class head extends JPanel {
		public head() {
			setLayout(new FlowLayout(FlowLayout.CENTER));

			JLabel titulo = new JLabel("Bienvenido al Busca Minas");

			titulo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

			titulo.setBorder(new EmptyBorder(10, 5, 10, 15));

			add(titulo);

			JComboBox<String> opciones = new JComboBox<String>();

			opciones.addItem("Principiante");
			opciones.addItem("Intermedio");
			opciones.addItem("Avanzado");

			add(opciones);

			JButton comenzar = new JButton("Comenzar");

			add(comenzar);

			comenzar.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					int opcion = opciones.getSelectedIndex();

					switch (opcion) {
					case 0 -> {
						center.generarCasillas(10, 10, 0.9);
						frame.setSize(550, 500);
						frame.setLocationRelativeTo(null);
					}
					case 1 -> {
						center.generarCasillas(15, 15, 0.8);
						frame.setSize(600, 700);
						frame.setLocationRelativeTo(null);
					}
					case 2 -> {
						center.generarCasillas(20, 20, 0.7);
						frame.setSize(700, 800);
						frame.setLocationRelativeTo(null);
					}

					}

				}
			});
		}

	}

	/**
	 * Clase de la lamina central que contiene las casillas
	 * @author Alejandro Ramos Jimenez
	 *
	 */
	class center extends JPanel {
		private Casilla casillas[][];
		private int numeroBombasTablero = 0;

		public center() {
			
		}
		
		
		/**
		 * Metodo que genera las casillas obteniendo por parametros cuantas filas y columnas tiene y cual es el porcentaje de bomba
		 * @param fila Numero de filas que contiene el tablero
		 * @param columna Numero de columnas que contiene el tablero
		 * @param porcentaje Porcentaje de bomba en cada casilla
		 */
		private void generarCasillas(int fila, int columna, double porcentaje) {
			center.removeAll();
			numeroBombasTablero = 0;
			setLayout(new GridLayout(fila, columna));

			this.casillas = new Casilla[fila][columna];

			for (int i = 0; i < fila; i++) {
				for (int j = 0; j < columna; j++) {
					Casilla casilla = new Casilla(i, j, porcentaje);
					if (casilla.getPropiedad() == Casilla.BOMBA) {
						numeroBombasTablero++;
					}
					casillas[i][j] = casilla;
					center.add(casillas[i][j]);
					casillas[i][j].addMouseListener(new MouseAdapter() {

						@Override
						public void mouseClicked(MouseEvent e) {

							// Boton izquierdo
							if (e.getButton() == MouseEvent.BUTTON1) {
								clicCasilla((Casilla) e.getSource(), MouseEvent.BUTTON1);
							}

							// Boton derecho
							if (e.getButton() == MouseEvent.BUTTON3) {
								clicCasilla((Casilla) e.getSource(), MouseEvent.BUTTON3);
							}
						}

					});
				}
			}
			numeroBombasTablero = contarBombasTablero();
			revalidate();
			repaint();
		}
		
		/**
		 * Metodo para ocasionar un evento en la casilla dependiendo del boton del raton pulsado
		 * @param casilla Casilla pulsada
		 * @param clicBoton Numero segun el boton pulsado
		 */
		private void clicCasilla(Casilla casilla, int clicBoton) {

			switch (clicBoton) {
			//Casilla pulsada con boton izquiero y condiciones a seguir
			case MouseEvent.BUTTON1:
				
				if (casilla.getPropiedad() != Casilla.GANADOOPERDIDO) {
					
					if (casilla.isHayBandera() == false) {
						
						if (casilla.getPropiedad() != Casilla.BOMBA) {
							
							descubrirCasillas(casilla.getFila(), casilla.getColumna());
						} else {
							mostrarPerdedor();
							JOptionPane.showMessageDialog(null, "Has pisado una mina. ¡Has perdido!", "PERDISTE", JOptionPane.PLAIN_MESSAGE, new ImageIcon(getClass().getResource("Imagenes/lose.png")));
						}
					}
				}

				break;

			//Casilla pulsada con boton derecho y condiciones a seguir
			case MouseEvent.BUTTON3:
				
				if (casilla.getPropiedad() != Casilla.GANADOOPERDIDO) {

					if (casilla.isHayBandera() == false) {

						if (casilla.getPropiedad() != Casilla.NUMERO) {
							
							casilla.setIcon(new ImageIcon(getClass().getResource("Imagenes/bandera.png")));
							casilla.setDisabledIcon(new ImageIcon(getClass().getResource("Imagenes/bandera.png")));
							casilla.setHayBandera(true);
						}

					} else {
						casilla.setIcon(null);
						casilla.setHayBandera(false);
					}
				}
				break;
			}
		}
		
		/**
		 * Metodo recursivo que descubre las casillas teniendo casos bases
		 * @param x Numero x en el array
		 * @param y Numero y en el array
		 */
		public void descubrirCasillas(int x, int y) {
			Casilla casilla = casillas[x][y];

			cambiarIcono(casilla, contarBombas(x, y));

			casilla.setEnabled(false);

			if (((casillas.length * casillas[0].length) - contarBombasTablero()) == contarCasillasDescubiertas()) {
				mostrarGanador();
				JOptionPane.showMessageDialog(null, "Enhorabuena. ¡Has Ganado!", "GANASTE", JOptionPane.PLAIN_MESSAGE, new ImageIcon(getClass().getResource("Imagenes/win.png")));
				return;
			}

			if (contarBombas(x, y) != 0)
				return;

			if (casilla.getPropiedad() == Casilla.BOMBA)
				return;

			if (casilla.getPropiedad() == Casilla.NUMERO)
				return;

			for (int i = Math.max(0, x - 1); i <= Math.min(casillas.length - 1, x + 1); i++)
				for (int j = Math.max(0, y - 1); j <= Math.min(casillas.length - 1, y + 1); j++) {
					Casilla casillaAdyacente = casillas[i][j];

					cambiarIcono(casillaAdyacente, contarBombas(i, j));

					if (casillaAdyacente.isEnabled() && casillaAdyacente.isHayBandera() == false) {
						descubrirCasillas(i, j);
						casillaAdyacente.setEnabled(false);
					}

				}

		}
		
		/**
		 * Metodo para cambiar el icono dependiendo del numero de bombas que contiene alrededor dicha casilla
		 * @param casilla Casilla en cuestion
		 * @param numeroBombas Numero de bombas alrededor de una bomba
		 */
		public void cambiarIcono(Casilla casilla, int numeroBombas) {
			if (casilla.getPropiedad() != Casilla.BOMBA && casilla.isHayBandera() == false) {

				if (numeroBombas > 0) {
					casilla.setIcon(new ImageIcon(getClass().getResource("Imagenes/" + numeroBombas + ".png")));
					casilla.setDisabledIcon(new ImageIcon(getClass().getResource("Imagenes/" + numeroBombas + ".png")));
					casilla.setPropiedad(Casilla.NUMERO);
				}
			}

		}
		
		/**
		 * Metodo para contar bombas alrededor de una casilla
		 * @param x Numero x en el tablero
		 * @param y Numero y en el tablero
		 * @return Numero de bombas alrededor de una casilla
		 */
		public int contarBombas(int x, int y) {
			int contadorBombas = 0;
			for (int i = x - 1; i <= x + 1; i++)
				for (int j = y - 1; j <= y + 1; j++) {
					if (i < 0 || i >= casillas.length || j < 0 || j >= casillas[i].length)
						continue;

					if (casillas[i][j].getPropiedad() == Casilla.BOMBA)
						contadorBombas++;

				}
			return contadorBombas;
		}
		
		/**
		 * Metodo para contar cuantas bombas tiene el tablero inicialmente
		 * @return Numero total de bombas en el tablero
		 */
		public int contarBombasTablero() {
			int contadorBombas = 0;
			for (int i = 0; i <= casillas.length; i++)
				for (int j = 0; j <= casillas.length; j++) {
					if (i < 0 || i >= casillas.length || j < 0 || j >= casillas[i].length)
						continue;

					if (casillas[i][j].getPropiedad() == Casilla.BOMBA)
						contadorBombas++;

				}
			return contadorBombas;
		}
		
		/**
		 * Metodo para contar cuantas casillas han sido descubiertas para las pertinentes comprobaciones
		 * @return Numero de casillas descubiertas en el tablero
		 */
		public int contarCasillasDescubiertas() {
			int contadorDescubiertas = 0;
			for (int i = 0; i <= casillas.length; i++)
				for (int j = 0; j <= casillas.length; j++) {
					if (i < 0 || i >= casillas.length || j < 0 || j >= casillas[i].length)
						continue;

					if (casillas[i][j].isEnabled() == false) {
						contadorDescubiertas++;
					}

				}
			return contadorDescubiertas;

		}
		
		/**
		 * Metodo que realiza unas acciones en el tablero al perder
		 */
		public void mostrarPerdedor() {
			for (int i = 0; i <= casillas.length; i++)
				for (int j = 0; j <= casillas.length; j++) {
					if (i < 0 || i >= casillas.length || j < 0 || j >= casillas[i].length)
						continue;
					
					
					casillas[i][j].setEnabled(false);
					if (casillas[i][j].getPropiedad() == Casilla.BOMBA) {
						casillas[i][j].setBackground(Color.RED);
						casillas[i][j].setIcon(new ImageIcon(getClass().getResource("Imagenes/mina.png")));
						casillas[i][j].setDisabledIcon(new ImageIcon(getClass().getResource("Imagenes/mina.png")));
					}
					casillas[i][j].setPropiedad(Casilla.GANADOOPERDIDO);

				}
		}
		
		/**
		 * Metodo que realiza unas acciones en el tablero al ganar
		 */
		public void mostrarGanador() {
			for (int i = 0; i <= casillas.length; i++)
				for (int j = 0; j <= casillas.length; j++) {
					if (i < 0 || i >= casillas.length || j < 0 || j >= casillas[i].length)
						continue;

					
					casillas[i][j].setEnabled(false);
					casillas[i][j].setBackground(new Color(218, 255, 221));
					
					if (casillas[i][j].isHayBandera() == false) {
						if (casillas[i][j].getPropiedad() == Casilla.BOMBA) {
							casillas[i][j].setIcon(new ImageIcon(getClass().getResource("Imagenes/mina.png")));
							casillas[i][j].setDisabledIcon(new ImageIcon(getClass().getResource("Imagenes/mina.png")));
							
						}
					}
					casillas[i][j].setPropiedad(Casilla.GANADOOPERDIDO);
					

				}
		}

	}

	/**
	 * Clase del footer, es decir, parte inferior
	 * @author Alejandro Ramos Jimenez
	 *
	 */
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
