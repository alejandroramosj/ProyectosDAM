
package Vista;

import Modelo.Cliente;




public class IndexVentana extends javax.swing.JFrame {

   
    
    int x, y;
    Cliente cliente;
    public IndexVentana() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public IndexVentana(Cliente cliente) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cliente = cliente;
        jLabel3.setText("Bienvenido " + cliente.getNombre() + " " + cliente.getApellido());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btcClose = new javax.swing.JLabel();
        logoParadise = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        CerrarSesion = new javax.swing.JLabel();
        misReservas = new javax.swing.JLabel();
        reservas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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
        jPanel5.add(btcClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        logoParadise.setBackground(new java.awt.Color(0, 0, 0));
        logoParadise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HotelParadiseLogoSinFondo (1).png"))); // NOI18N
        jPanel5.add(logoParadise, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 110, -1, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 450));

        Titulo.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        Titulo.setText("Hotel Paradise Control");
        jPanel4.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        CerrarSesion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        CerrarSesion.setForeground(new java.awt.Color(33, 150, 243));
        CerrarSesion.setText("Cerrar Sesion");
        CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseClicked(evt);
            }
        });
        jPanel4.add(CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        misReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/misreservas.png"))); // NOI18N
        misReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                misReservasMouseClicked(evt);
            }
        });
        jPanel4.add(misReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, -1));

        reservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reservar.png"))); // NOI18N
        reservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservasMouseClicked(evt);
            }
        });
        jPanel4.add(reservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 330, -1));

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

    private void reservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservasMouseClicked
        
        dispose();
        new ReservarVentana(this.cliente).setVisible(true);
    }//GEN-LAST:event_reservasMouseClicked

    private void misReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_misReservasMouseClicked
        
        dispose();
        new MisReservasVentana(this.cliente).setVisible(true);
    }//GEN-LAST:event_misReservasMouseClicked

    
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
            java.util.logging.Logger.getLogger(IndexVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndexVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndexVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndexVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new IndexVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CerrarSesion;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel btcClose;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel logoParadise;
    private javax.swing.JLabel misReservas;
    private javax.swing.JLabel reservas;
    // End of variables declaration//GEN-END:variables
}
