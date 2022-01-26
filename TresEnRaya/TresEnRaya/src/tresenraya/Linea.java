package tresenraya;

/**
 * Clase que describe una linea de 3 casillas del tablero del TresEnRaya
 */
public class Linea {

  private Casilla c1;
  private Casilla c2;
  private Casilla c3;

  public Linea() {
  }

  public Linea(Casilla c1, Casilla c2, Casilla c3) {
    this.c1 = c1;
    this.c2 = c2;
    this.c3 = c3;
  }

  public boolean contieneCasilla(Casilla c) {
    return (c.getFila() == c1.getFila() && c.getColumna() == c1.getColumna()) || (c.getFila() == c2.getFila() && c.getColumna() == c2.getColumna()) || (c.getFila() == c3.getFila() && c.getColumna() == c3.getColumna());
  }

  public boolean hayGanador() {
    return ((c1.getPropiedad() != Casilla.NADIE)
            && (c1.getPropiedad() == c2.getPropiedad())
            && (c1.getPropiedad() == c3.getPropiedad()));
  }

  public int getGanador() {
    return c1.getPropiedad();
  }

}
