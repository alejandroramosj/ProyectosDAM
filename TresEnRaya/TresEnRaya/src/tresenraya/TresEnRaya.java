package tresenraya;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TresEnRaya extends JFrame {

  public TresEnRaya() {
    initComponents();
  }

  public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        new TresEnRaya().setVisible(true);
      }
    });
  }

  private void initComponents() {
    setTitle("Tres en Raya");
    setBounds(300, 300, 450, 300);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanelPrincipal jPanelPrincipal = new JPanelPrincipal();
    add(jPanelPrincipal);
    setVisible(true);
  }

  class JPanelPrincipal extends JPanel {

    private JLabel jLabelTitulo = new JLabel("Bienvenido al Tres En Raya");
    private JButton jbComenzar = new JButton("Comenzar");
    private Casilla[][] matrizCasillas;
    private ArrayList<Linea> arrayLineas = new ArrayList<Linea>();
    private JPanel panelTablero = null;
    private JPanel panelCabecera = new JPanel();
    private JPanel panelFooter = new JPanel();
    private int turno = Casilla.JUGADOR1;
    private int casillasPulsadas = 0;

    public JPanelPrincipal() {
      setLayout(new BorderLayout());
      configurarCabecera();
      configurarFooter();
    }

    /**
     * Configura la cabecera
     */
    private void configurarCabecera() {

      jLabelTitulo.setBorder(new EmptyBorder(10, 0, 10, 40));
      jLabelTitulo.setFont(new Font("Arial", Font.BOLD, 20));

      panelCabecera.add(jLabelTitulo);
      panelCabecera.add(jbComenzar);

      add(panelCabecera, BorderLayout.NORTH);

      jbComenzar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          // Si ya está configurado el tablero, lo eliminamos y limpiamos el array de líneas
          if (panelTablero != null) {
            remove(panelTablero);
            arrayLineas.clear();
            casillasPulsadas = 0;
          }
          panelTablero = new JPanel();
          turno = Casilla.JUGADOR1;
          configurarTablero();
          panelTablero.revalidate();
          panelTablero.repaint();
        }
      });
    }

    /**
     * Configura el footer
     */
    private void configurarFooter() {
      panelFooter.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));
      panelFooter.setBackground(Color.BLACK);
      JLabel jLabelFooter = new JLabel("Autor: Isaac Expósito López");
      jLabelFooter.setFont(new Font("Arial", Font.ITALIC, 12));
      jLabelFooter.setForeground(Color.WHITE);
      panelFooter.add(jLabelFooter);
      add(panelFooter, BorderLayout.SOUTH);
    }

    /**
     * Configura el tablero de 3x3 casillas e inicializa arrayLineas
     */
    private void configurarTablero() {
      panelTablero.setLayout(new GridLayout(3, 3));
      matrizCasillas = new Casilla[3][3];

      // Creamos el array de objetos Casilla
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {

          Casilla casilla = new Casilla(i, j);
          matrizCasillas[i][j] = casilla;
          panelTablero.add(casilla);
          matrizCasillas[i][j].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
              if (MouseEvent.BUTTON1 == e.getButton()) {
                try {
                  clicCasilla((Casilla) e.getSource());
                }
                catch (Exception ex) {
                  Logger.getLogger(TresEnRaya.class.getName()).log(Level.SEVERE, null, ex);
                }
              }
            }
          });
        }
      }
      add(panelTablero, BorderLayout.CENTER);
      setArrayLineas();
    }

    /**
     * Clic en una casilla. Solo debe funcionar si la casilla no es de nadie aún
     */
    private void clicCasilla(Casilla c) throws Exception {
      // Si la casilla ya tiene propietario no hacemos nada
      if (c.setPropiedadNadie() && c.isEnabled()) {
        c.setPropiedad(turno);
        casillasPulsadas++;
        if (!hayGanador(c)) {
          cambiarTurno();
          if (casillasPulsadas == 9) {
            JOptionPane.showMessageDialog(null, "El juego ha acabado en empate");
          }
        }
      }
      c.setEnabled(false);
    }

    /**
     * Recorre arrayLineas y busca entre las líneas que contienen la casilla pulsada si hay alguna
     * línea ganadora. Si hay una línea ganador, muestra un mensaje y deshabilita el t
     *
     * @return true si hay ganador; false en caso contrario
     */
    private boolean hayGanador(Casilla c) {

      for (Linea linea : arrayLineas) {
        if (linea.contieneCasilla(c) && linea.hayGanador()) {
          if (linea.getGanador() == Casilla.JUGADOR1) {
            JOptionPane.showMessageDialog(null, "Jugador 1 ha ganado");
          }
          else {
            JOptionPane.showMessageDialog(null, "Jugador 2 ha ganado");
          }
          deshabilitarTodasCasillas();
          return true;
        }
      }
      return false;
    }

    /**
     * Deshabilita todas las casillas al final de un juego
     */
    private void deshabilitarTodasCasillas() {
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          matrizCasillas[i][j].setEnabled(false);
        }
      }
    }

    /**
     * Alterna el turno de juego
     */
    private void cambiarTurno() {
      if (turno == Casilla.JUGADOR1) {
        turno = Casilla.JUGADOR2;
      }
      else {
        turno = Casilla.JUGADOR1;
      }
    }

    /**
     * Setea arrayLineas con las 8 líneas que pueden componer un ganador
     */
    private void setArrayLineas() {
      /*
       * Para que haya un ganador las siguientes combinaciones de casillas deben tener el mismo
       * propietario: Jugador1 o Jugador2. Siendo [Fila,Columna], las combinaciones son:
       * - 3 en raya horizontales:
       *   [0,0] - [0,1] - [0,2]
       *   [1,0] - [1,1] - [1,2]
       *   [2,0] - [2,1] - [2,2]
       */
      arrayLineas.add(new Linea(matrizCasillas[0][0], matrizCasillas[0][1], matrizCasillas[0][2]));
      arrayLineas.add(new Linea(matrizCasillas[1][0], matrizCasillas[1][1], matrizCasillas[1][2]));
      arrayLineas.add(new Linea(matrizCasillas[2][0], matrizCasillas[2][1], matrizCasillas[2][2]));
      /*
       * - 3 en raya verticales:
       *   [0,0] - [1,0] - [2,0]
       *   [0,1] - [1,1] - [2,1]
       *   [0,2] - [1,2] - [2,2]
       */
      arrayLineas.add(new Linea(matrizCasillas[0][0], matrizCasillas[1][0], matrizCasillas[2][0]));
      arrayLineas.add(new Linea(matrizCasillas[0][1], matrizCasillas[1][1], matrizCasillas[2][1]));
      arrayLineas.add(new Linea(matrizCasillas[0][2], matrizCasillas[1][2], matrizCasillas[2][2]));
      /*
       * - 2 en raya diagonales:
       *   [0,0] - [1,1] - [2,2]
       *   [2,0] - [1,1] - [0,2]
       */
      arrayLineas.add(new Linea(matrizCasillas[0][0], matrizCasillas[1][1], matrizCasillas[2][2]));
      arrayLineas.add(new Linea(matrizCasillas[2][0], matrizCasillas[1][1], matrizCasillas[0][2]));
    }
  }
}
