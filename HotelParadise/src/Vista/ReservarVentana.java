
package Vista;

import Gestion.GestionReservas;
import Modelo.Cliente;
import Modelo.Reserva;
import java.time.LocalDate;



public class ReservarVentana extends javax.swing.JFrame {

    
    int x, y;
    Cliente cliente;
    Gestion.GestionReservas gestionReservas = new GestionReservas();
    public ReservarVentana() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public ReservarVentana(Cliente cliente) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cliente = cliente;
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
        opcion4 = new javax.swing.JRadioButton();
        opcion1 = new javax.swing.JRadioButton();
        opcion2 = new javax.swing.JRadioButton();
        opcion3 = new javax.swing.JRadioButton();
        imagenButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fechaEntrada = new javax.swing.JFormattedTextField();
        CorreoElectronico = new javax.swing.JLabel();
        JLabelError = new javax.swing.JLabel();
        fechaSalida = new javax.swing.JFormattedTextField();
        CorreoElectronico2 = new javax.swing.JLabel();
        Reservar = new javax.swing.JButton();
        precio = new javax.swing.JLabel();

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

        Titulo.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        Titulo.setText("Hotel Paradise Reserva");
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

        buttonGroup2.add(opcion4);
        opcion4.setText("Suite");
        opcion4.setOpaque(false);
        opcion4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opcion4MouseClicked(evt);
            }
        });
        jPanel4.add(opcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        buttonGroup2.add(opcion1);
        opcion1.setText("Habitacion individual");
        opcion1.setOpaque(false);
        opcion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opcion1MouseClicked(evt);
            }
        });
        opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion1ActionPerformed(evt);
            }
        });
        jPanel4.add(opcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        buttonGroup2.add(opcion2);
        opcion2.setText("Habitacion Familiar");
        opcion2.setOpaque(false);
        opcion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opcion2MouseClicked(evt);
            }
        });
        opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion2ActionPerformed(evt);
            }
        });
        jPanel4.add(opcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        buttonGroup2.add(opcion3);
        opcion3.setText("Habitacion Twin");
        opcion3.setOpaque(false);
        opcion3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opcion3MouseClicked(evt);
            }
        });
        opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion3ActionPerformed(evt);
            }
        });
        jPanel4.add(opcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));
        jPanel4.add(imagenButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 200, 110));

        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 280, 10));

        fechaEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/yyyy"))));
        fechaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaEntradaActionPerformed(evt);
            }
        });
        jPanel4.add(fechaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 130, -1));

        CorreoElectronico.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        CorreoElectronico.setForeground(new java.awt.Color(153, 153, 153));
        CorreoElectronico.setText("Fecha de entrada");
        jPanel4.add(CorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        JLabelError.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        JLabelError.setForeground(new java.awt.Color(153, 153, 153));
        JLabelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(JLabelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 310, -1));

        fechaSalida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/yyyy"))));
        fechaSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaSalidaActionPerformed(evt);
            }
        });
        jPanel4.add(fechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 140, -1));

        CorreoElectronico2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        CorreoElectronico2.setForeground(new java.awt.Color(153, 153, 153));
        CorreoElectronico2.setText("Fecha de Salida");
        jPanel4.add(CorreoElectronico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 140, -1));

        Reservar.setBackground(new java.awt.Color(0, 204, 204));
        Reservar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Reservar.setForeground(new java.awt.Color(51, 51, 51));
        Reservar.setText("RESERVAR");
        Reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservarActionPerformed(evt);
            }
        });
        jPanel4.add(Reservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        precio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        precio.setForeground(new java.awt.Color(153, 153, 153));
        precio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precio.setText("Precio");
        jPanel4.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 310, -1));

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

    private void opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion2ActionPerformed
    }//GEN-LAST:event_opcion2ActionPerformed

    private void opcion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcion1MouseClicked
        imagenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HabitacionIndividual.jpg")));
        jLabel1.setText("1 Cama individual | 1 baño | 49€/Noche");
        
        if (fechaEntrada.getText().toString().length() > 0 && fechaSalida.getText().toString().length() > 0) {
            int dias = Utilidades.Utilidades.diferenciaDeDias(fechaEntrada.getText().toString(), fechaSalida.getText().toString());
            
            if (dias <= 0) {
                JLabelError.setText("El intervalo de dias debe ser mayor que 0");
            }else{
                precio.setText("Precio " + 49*dias + "€");
                JLabelError.setText("");
            }
            
        }
    }//GEN-LAST:event_opcion1MouseClicked

    private void opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion1ActionPerformed
    }//GEN-LAST:event_opcion1ActionPerformed

    private void opcion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcion2MouseClicked
        imagenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HabitacionDoble.jpg")));
        jLabel1.setText("1 Cama Doble | 1 baño | 88€/Noche");
        
        if (fechaEntrada.getText().toString().length() > 0 && fechaSalida.getText().toString().length() > 0) {
            int dias = Utilidades.Utilidades.diferenciaDeDias(fechaEntrada.getText().toString(), fechaSalida.getText().toString());
            
            if (dias <= 0) {
                JLabelError.setText("El intervalo de dias debe ser mayor que 0");
            }else{
                precio.setText("Precio " + 88*dias + "€");
                JLabelError.setText("");
            }
            
        }
    }//GEN-LAST:event_opcion2MouseClicked

    private void opcion3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcion3MouseClicked
        imagenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/habitaciontwin.jpg")));
        jLabel1.setText("2 Cama Individuales | 1 baño | 79€/Noche");
        
        if (fechaEntrada.getText().toString().length() > 0 && fechaSalida.getText().toString().length() > 0) {
            int dias = Utilidades.Utilidades.diferenciaDeDias(fechaEntrada.getText().toString(), fechaSalida.getText().toString());
            
            if (dias <= 0) {
                JLabelError.setText("El intervalo de dias debe ser mayor que 0");
            }else{
                precio.setText("Precio " + 79*dias + "€");
                JLabelError.setText("");
            }
            
        }
    }//GEN-LAST:event_opcion3MouseClicked

    private void opcion4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcion4MouseClicked
        imagenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Suite.jpg")));
        jLabel1.setText("1 Cama Doble | 1 baño | 1 Jacuzzi | 149€/Noche");
        
        if (fechaEntrada.getText().toString().length() > 0 && fechaSalida.getText().toString().length() > 0) {
            int dias = Utilidades.Utilidades.diferenciaDeDias(fechaEntrada.getText().toString(), fechaSalida.getText().toString());
            
            if (dias <= 0) {
                JLabelError.setText("El intervalo de dias debe ser mayor que 0");
            }else{
                precio.setText("Precio " + 149*dias + "€");
                JLabelError.setText("");
            }
            
        }
    }//GEN-LAST:event_opcion4MouseClicked

    private void fechaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaEntradaActionPerformed
    }//GEN-LAST:event_fechaEntradaActionPerformed

    private void fechaSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaSalidaActionPerformed
    }//GEN-LAST:event_fechaSalidaActionPerformed

    private void ReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservarActionPerformed
        
        if (opcion1.isSelected() == false && opcion2.isSelected() == false && opcion3.isSelected() == false && opcion4.isSelected() == false) {
            JLabelError.setText("Debes selecionar una habitacion");
        }else{
            if (fechaEntrada.getText().isEmpty() || fechaSalida.getText().isEmpty()) {
                JLabelError.setText("Debes rellenar fecha de entrada y de salida");
            }else{
                String fecha_Entrada = fechaEntrada.getText();
                String fecha_Salida = fechaSalida.getText();
                int dias = Utilidades.Utilidades.diferenciaDeDias(fecha_Entrada, fecha_Salida);
                int habitacion = 0;
                int precioTotal = 0;
                if (dias <= 0) {
                    JLabelError.setText("El intervalo de dias debe ser mayor que 0");
                }else{
                    
                    if (opcion1.isSelected() == true) {
                        habitacion = 1;
                        precioTotal = dias * 49;
                    }else if (opcion2.isSelected() == true) {
                        habitacion = 2;
                        precioTotal = dias * 88;
                    }else if (opcion3.isSelected() == true) {
                        habitacion = 3;
                        precioTotal = dias * 79;
                    }else if (opcion4.isSelected() == true) {
                        habitacion = 4;
                        precioTotal = dias * 149;
                    }
                    
                    
                    
                    
                    
                    if (GestionReservas.maximoReservas(cliente.getDni()) == true) {
                        
                        Reserva reserva = new Reserva(cliente.getDni(), habitacion, fecha_Entrada, fecha_Salida, dias, precioTotal);
                        
                        gestionReservas.realizarReserva(reserva);
                        dispose();
                        new IndexVentana(this.cliente).setVisible(true);
                    }else{
                        JLabelError.setText("Maximo 3 reservas");
                    }
                    
                    

                }
            }
        }
        
        
    }//GEN-LAST:event_ReservarActionPerformed

    private void btcBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcBackMouseClicked
        dispose();
        new IndexVentana(this.cliente).setVisible(true);

    }//GEN-LAST:event_btcBackMouseClicked

    private void opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion3ActionPerformed
    }//GEN-LAST:event_opcion3ActionPerformed

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
            java.util.logging.Logger.getLogger(ReservarVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservarVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservarVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservarVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservarVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CerrarSesion;
    private javax.swing.JLabel CorreoElectronico;
    private javax.swing.JLabel CorreoElectronico2;
    private javax.swing.JLabel JLabelError;
    private javax.swing.JButton Reservar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel btcBack;
    private javax.swing.JLabel btcClose;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JFormattedTextField fechaEntrada;
    private javax.swing.JFormattedTextField fechaSalida;
    private javax.swing.JLabel imagenButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel logoParadise;
    private javax.swing.JRadioButton opcion1;
    private javax.swing.JRadioButton opcion2;
    private javax.swing.JRadioButton opcion3;
    private javax.swing.JRadioButton opcion4;
    private javax.swing.JLabel precio;
    // End of variables declaration//GEN-END:variables
}
