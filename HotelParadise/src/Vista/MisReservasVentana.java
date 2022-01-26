
package Vista;

import Gestion.GestionReservas;
import Modelo.Cliente;
import Modelo.Reserva;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JLabel;


public class MisReservasVentana extends javax.swing.JFrame {

    
    int x, y;
    Cliente cliente;
    ArrayList<Reserva> reservas;
    GestionReservas gestionReservas = new GestionReservas();
    
    public MisReservasVentana() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public MisReservasVentana(Cliente cliente) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cliente = cliente;
        
        JLabelCancelar1.setEnabled(false);
        JLabelCancelar2.setEnabled(false);
        JLabelCancelar3.setEnabled(false);
        
        
        
        
        reservas = gestionReservas.obtenerReservas(cliente.getDni());
        
        if (reservas.size() == 0) {
            JLabelInformacion.setText("No tienes realizada ninguna reserva");
        }else{
            
            ArrayList<JLabel> ImagenesLabel = new ArrayList<JLabel>(Arrays.asList(imagenReserva1, imagenReserva2, imagenReserva3));
            ArrayList<JLabel> JLabelTexto = new ArrayList<JLabel>(Arrays.asList(Jlabel1, JLabel2, JLabel3));
            ArrayList<JLabel> JLabelCancelar = new ArrayList<JLabel>(Arrays.asList(JLabelCancelar1, JLabelCancelar2, JLabelCancelar3));
            
            for (int i = 0; i < reservas.size(); i++) {
                String nombreHabitacion = "";
                switch (reservas.get(i).getIdHabitacion()) {
                    case 1:
                        ImagenesLabel.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HabitacionIndividual.jpg")));
                        nombreHabitacion = "Habitacion individual";
                        break;
                    case 2:
                        ImagenesLabel.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HabitacionDoble.jpg")));
                        nombreHabitacion = "Habitacion Doble";
                        break;
                    case 3:
                        ImagenesLabel.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/habitaciontwin.jpg")));
                        nombreHabitacion = "Habitacion Twin";
                        break;
                    case 4:
                        ImagenesLabel.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Suite.jpg")));
                        nombreHabitacion = "Suite";
                        break; 
                }
                JLabelTexto.get(i).setText("<html><body>" + nombreHabitacion  + "<br>Fecha Entrada: " +reservas.get(i).getFechaEntrada() +"<br>Fecha Salida: " + reservas.get(i).getFechaSalida() + "<br> Dias: " + reservas.get(i).getDias() + "<br> Precio Total: " +reservas.get(i).getPrecioTotal()+"</body></html>");
                JLabelCancelar.get(i).setText("Cancelar Reserva");
                JLabelCancelar.get(i).setEnabled(true);
            }
            
            
            
        }
        
        
        
        
        
        
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btcClose = new javax.swing.JLabel();
        logoParadise = new javax.swing.JLabel();
        btcBack = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        CerrarSesion = new javax.swing.JLabel();
        JLabelInformacion = new javax.swing.JLabel();
        JLabel3 = new javax.swing.JLabel();
        imagenReserva2 = new javax.swing.JLabel();
        imagenReserva3 = new javax.swing.JLabel();
        imagenReserva1 = new javax.swing.JLabel();
        Jlabel1 = new javax.swing.JLabel();
        JLabel2 = new javax.swing.JLabel();
        JLabelCancelar3 = new javax.swing.JLabel();
        JLabelCancelar1 = new javax.swing.JLabel();
        JLabelCancelar2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(234, 234, 234));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btcClose.setBackground(new java.awt.Color(0, 0, 0));
        btcClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_delete_32px.png"))); // NOI18N
        btcClose.setToolTipText("Exit");
        btcClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btcClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcCloseMouseClicked(evt);
            }
        });
        jPanel5.add(btcClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        logoParadise.setBackground(new java.awt.Color(0, 0, 0));
        logoParadise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HotelParadiseLogoSinFondo (1).png"))); // NOI18N
        jPanel5.add(logoParadise, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 110, 250, -1));

        btcBack.setBackground(new java.awt.Color(0, 0, 0));
        btcBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_left_32px.png"))); // NOI18N
        btcBack.setToolTipText("Back");
        btcBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btcBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcBackMouseClicked(evt);
            }
        });
        jPanel5.add(btcBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 450));

        Titulo.setFont(new java.awt.Font("Comic Sans MS", 1, 27)); // NOI18N
        Titulo.setText("Hotel Paradise Mis Reservas");
        jPanel4.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        CerrarSesion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        CerrarSesion.setForeground(new java.awt.Color(33, 150, 243));
        CerrarSesion.setText("Cerrar Sesion");
        CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseClicked(evt);
            }
        });
        jPanel4.add(CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        JLabelInformacion.setFont(new java.awt.Font("Comic Sans MS", 1, 21)); // NOI18N
        JLabelInformacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(JLabelInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 380, 70));

        JLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        JLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(JLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 190, 80));
        jPanel4.add(imagenReserva2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 200, 110));
        jPanel4.add(imagenReserva3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 200, 110));
        jPanel4.add(imagenReserva1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 200, 110));

        Jlabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        Jlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(Jlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 190, 80));

        JLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        JLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(JLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 190, 80));

        JLabelCancelar3.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        JLabelCancelar3.setForeground(new java.awt.Color(204, 0, 0));
        JLabelCancelar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelCancelar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabelCancelar3MouseClicked(evt);
            }
        });
        jPanel4.add(JLabelCancelar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 190, 30));

        JLabelCancelar1.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        JLabelCancelar1.setForeground(new java.awt.Color(204, 0, 0));
        JLabelCancelar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelCancelar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabelCancelar1MouseClicked(evt);
            }
        });
        jPanel4.add(JLabelCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 190, 30));

        JLabelCancelar2.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        JLabelCancelar2.setForeground(new java.awt.Color(204, 0, 0));
        JLabelCancelar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelCancelar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabelCancelar2MouseClicked(evt);
            }
        });
        jPanel4.add(JLabelCancelar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 190, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void btcCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btcCloseMouseClicked

    private void CerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMouseClicked
        dispose();
        new LoginVentana().setVisible(true);
    }//GEN-LAST:event_CerrarSesionMouseClicked

    private void btcBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcBackMouseClicked
        dispose();
        new IndexVentana(this.cliente).setVisible(true);

    }//GEN-LAST:event_btcBackMouseClicked

    private void JLabelCancelar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelCancelar1MouseClicked
        gestionReservas.cancelarReserva(reservas.get(0).getIdReserva());
        dispose();
        new MisReservasVentana(this.cliente).setVisible(true);
    }//GEN-LAST:event_JLabelCancelar1MouseClicked

    private void JLabelCancelar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelCancelar2MouseClicked
        gestionReservas.cancelarReserva(reservas.get(1).getIdReserva());
        dispose();
        new MisReservasVentana(this.cliente).setVisible(true);
    }//GEN-LAST:event_JLabelCancelar2MouseClicked

    private void JLabelCancelar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelCancelar3MouseClicked
        gestionReservas.cancelarReserva(reservas.get(2).getIdReserva());
        dispose();
        new MisReservasVentana(this.cliente).setVisible(true);
    }//GEN-LAST:event_JLabelCancelar3MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MisReservasVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MisReservasVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MisReservasVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MisReservasVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MisReservasVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CerrarSesion;
    private javax.swing.JLabel JLabel2;
    private javax.swing.JLabel JLabel3;
    private javax.swing.JLabel JLabelCancelar1;
    private javax.swing.JLabel JLabelCancelar2;
    private javax.swing.JLabel JLabelCancelar3;
    private javax.swing.JLabel JLabelInformacion;
    private javax.swing.JLabel Jlabel1;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel btcBack;
    private javax.swing.JLabel btcClose;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel imagenReserva1;
    private javax.swing.JLabel imagenReserva2;
    private javax.swing.JLabel imagenReserva3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel logoParadise;
    // End of variables declaration//GEN-END:variables
}
