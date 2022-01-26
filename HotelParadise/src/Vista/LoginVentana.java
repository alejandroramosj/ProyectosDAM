
package Vista;

import Gestion.GestionClientes;


public class LoginVentana extends javax.swing.JFrame {

  
    int x, y;
    public LoginVentana() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btcClose = new javax.swing.JLabel();
        logoParadise = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        CrearCuenta = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        CorreoElectronico = new javax.swing.JLabel();
        CorreojTextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        Enviar = new javax.swing.JButton();
        JLabelInformacion = new javax.swing.JLabel();

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
        Titulo.setText("Hotel Paradise Login");
        jPanel4.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        CrearCuenta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        CrearCuenta.setForeground(new java.awt.Color(33, 150, 243));
        CrearCuenta.setText("Crear Cuenta");
        CrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearCuentaMouseClicked(evt);
            }
        });
        jPanel4.add(CrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        Password.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        Password.setForeground(new java.awt.Color(153, 153, 153));
        Password.setText("Password");
        jPanel4.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        CorreoElectronico.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        CorreoElectronico.setForeground(new java.awt.Color(153, 153, 153));
        CorreoElectronico.setText("Correo Electronico");
        jPanel4.add(CorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        CorreojTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        CorreojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreojTextFieldActionPerformed(evt);
            }
        });
        jPanel4.add(CorreojTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 270, 30));

        PasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel4.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 270, 30));

        Enviar.setBackground(new java.awt.Color(0, 204, 204));
        Enviar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Enviar.setForeground(new java.awt.Color(51, 51, 51));
        Enviar.setText("ENTRAR");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });
        jPanel4.add(Enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        JLabelInformacion.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 12)); // NOI18N
        jPanel4.add(JLabelInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 270, 20));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        
        JLabelInformacion.setText("");
        
        if (CorreojTextField.getText().toString().isEmpty() || PasswordField.getPassword().length == 0) {
            JLabelInformacion.setText("Debes rellenar todos los campos");
        } else{
            String correoElectronico = CorreojTextField.getText().toString();
            String password = String.valueOf(PasswordField.getPassword());
            
            Gestion.GestionClientes gestionClientes = new GestionClientes();
            
            
            
            boolean validaSesion = gestionClientes.iniciarSesion(correoElectronico, password);
            
            if (validaSesion == true) {
                dispose();
                new IndexVentana(gestionClientes.getCliente()).setVisible(true);
            }else{
                JLabelInformacion.setText("El correo electronico o contraseña incorrecto");
                CorreojTextField.setText("");
                PasswordField.setText("");
            }
            
            
            
        }
    }//GEN-LAST:event_EnviarActionPerformed

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void CorreojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreojTextFieldActionPerformed
    }//GEN-LAST:event_CorreojTextFieldActionPerformed

    private void btcCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btcCloseMouseClicked

    private void CrearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearCuentaMouseClicked
        dispose();
        new RegisterVentana().setVisible(true);
    }//GEN-LAST:event_CrearCuentaMouseClicked

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(LoginVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CorreoElectronico;
    private javax.swing.JTextField CorreojTextField;
    private javax.swing.JLabel CrearCuenta;
    private javax.swing.JButton Enviar;
    private javax.swing.JLabel JLabelInformacion;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel btcClose;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel logoParadise;
    // End of variables declaration//GEN-END:variables
}
