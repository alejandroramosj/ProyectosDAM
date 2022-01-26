package tresenraya;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Clase que describe una casilla del tablero del TresEnRaya
 */
public class Casilla extends JButton {

  private int fila;
  private int columna;
  private int propiedad;

  // Campos estáticos para describir la propiedad de la casilla
  public static final int NADIE = 0;
  public static final int JUGADOR1 = 1;
  public static final int JUGADOR2 = 2;

  public Casilla(int fila, int columna) {
//    this.setFont(new Font("Dialog", Font.BOLD, 20));
    this.fila = fila;
    this.columna = columna;
    this.propiedad = Casilla.NADIE;
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

  public boolean setPropiedadJugador1() {
    return this.propiedad == Casilla.JUGADOR1;
  }

  public boolean setPropiedadJugador2() {
    return this.propiedad == Casilla.JUGADOR2;
  }

  public boolean setPropiedadNadie() {
    return this.propiedad == Casilla.NADIE;
  }

  public int getPropiedad() {
    return this.propiedad;
  }

  public void setPropiedad(int propiedad) throws Exception {

    switch (propiedad) {
      case Casilla.NADIE:
        this.propiedad = Casilla.NADIE;
        break;

      case Casilla.JUGADOR1:
        this.propiedad = Casilla.JUGADOR1;
        try {
          Image img = ImageIO.read(getClass().getResource("imagenes/jugador1.png"));
          Image newimg = img.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
          this.setIcon(new ImageIcon(newimg));
        }
        catch (IOException ex) {
          System.out.println(ex);
        }
        break;

      case Casilla.JUGADOR2:
        this.propiedad = Casilla.JUGADOR2;
        try {
          Image img = ImageIO.read(getClass().getResource("imagenes/jugador2.png"));
          Image newimg = img.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
          this.setIcon(new ImageIcon(newimg));
        }
        catch (IOException ex) {
          System.out.println(ex);
        }
        break;

      default:
        throw new Exception("Parámetro no válido");
    }
  }
}
