import javax.swing.JButton;

/**
 * Clase casilla
 * @author Alejandro Ramos Jiménez
 * @version 1.0
 *
 */
public class Casilla extends JButton {
	
	//Atributos de clase
	private int fila;
	private int columna;
	private int propiedad;
	private boolean hayBandera;
	
	//Campos estaticos para describir la propiedad de la casilla
	public static final int NADIE = 0;
	public static final int BOMBA = 1;
	public static final int NUMERO = 2;
	public static final int GANADOOPERDIDO = 3;
	
	
	 
	
	/**
	 * Constructor para crear un objeto casilla
	 * @param fila Numero de fila de la casilla
	 * @param columna Numero de columna de la casilla
	 * @param porcentaje Porcentaje de bomba de una casilla
	 */
	public Casilla(int fila, int columna, double porcentaje) {
		this.fila = fila;
		this.columna = columna;
		this.hayBandera = false;
		
		double random = Math.random();
		
		if (random > porcentaje) {
			this.propiedad = Casilla.BOMBA;
			
		}else {
			this.propiedad = Casilla.NADIE;
		}
		
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public void setPropiedad(int propiedad) {
		this.propiedad = propiedad;
	}

	public int getPropiedad() {
		return this.propiedad;
	}

	public boolean isHayBandera() {
		return hayBandera;
	}

	public void setHayBandera(boolean hayBandera) {
		this.hayBandera = hayBandera;
	}
	
	

	
}
