
package Vista;

import Gestion.GestionClientes;
import Modelo.Cliente;

public class RegisterVentana extends javax.swing.JFrame {

    int x, y;
    Gestion.GestionClientes gestionClientes = new GestionClientes();
    public RegisterVentana() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btcBack = new javax.swing.JLabel();
        logoParadise = new javax.swing.JLabel();
        btcClose = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        CorreoElectronico = new javax.swing.JLabel();
        DnijTextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        Enviar = new javax.swing.JButton();
        JLabelError = new javax.swing.JLabel();
        NombrejTextField = new javax.swing.JTextField();
        CorreoElectronico1 = new javax.swing.JLabel();
        ApellidojTextField = new javax.swing.JTextField();
        CorreoElectronico2 = new javax.swing.JLabel();
        TelefonojTextField = new javax.swing.JTextField();
        CorreoElectronico3 = new javax.swing.JLabel();
        CorreoElectronico4 = new javax.swing.JLabel();
        DireccionjTextField = new javax.swing.JTextField();
        LocalidadjTextField = new javax.swing.JTextField();
        CorreoElectronico5 = new javax.swing.JLabel();
        CorreojTextField = new javax.swing.JTextField();
        CorreoElectronico6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(232, 232, 232));
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

        logoParadise.setBackground(new java.awt.Color(0, 0, 0));
        logoParadise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HotelParadiseLogoSinFondo (1).png"))); // NOI18N
        jPanel5.add(logoParadise, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 110, -1, -1));

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

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 450));

        Titulo.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        Titulo.setText("Hotel Paradise Register");
        jPanel4.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        Password.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        Password.setForeground(new java.awt.Color(153, 153, 153));
        Password.setText("Contraseña");
        jPanel4.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, 20));

        CorreoElectronico.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        CorreoElectronico.setForeground(new java.awt.Color(153, 153, 153));
        CorreoElectronico.setText("DNI");
        jPanel4.add(CorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, 20));

        DnijTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        DnijTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DnijTextFieldActionPerformed(evt);
            }
        });
        jPanel4.add(DnijTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 270, 20));

        PasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel4.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 270, 20));

        Enviar.setBackground(new java.awt.Color(0, 204, 204));
        Enviar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Enviar.setForeground(new java.awt.Color(51, 51, 51));
        Enviar.setText("ENTRAR");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });
        jPanel4.add(Enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, 30));

        JLabelError.setFont(new java.awt.Font("Source Code Pro Semibold", 0, 8)); // NOI18N
        jPanel4.add(JLabelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 260, 20));

        NombrejTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        NombrejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombrejTextFieldActionPerformed(evt);
            }
        });
        jPanel4.add(NombrejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 270, 20));

        CorreoElectronico1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        CorreoElectronico1.setForeground(new java.awt.Color(153, 153, 153));
        CorreoElectronico1.setText("Nombre");
        jPanel4.add(CorreoElectronico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, 20));

        ApellidojTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        ApellidojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidojTextFieldActionPerformed(evt);
            }
        });
        jPanel4.add(ApellidojTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 270, 20));

        CorreoElectronico2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        CorreoElectronico2.setForeground(new java.awt.Color(153, 153, 153));
        CorreoElectronico2.setText("Apellido");
        jPanel4.add(CorreoElectronico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, 20));

        TelefonojTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        TelefonojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonojTextFieldActionPerformed(evt);
            }
        });
        jPanel4.add(TelefonojTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 270, 20));

        CorreoElectronico3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        CorreoElectronico3.setForeground(new java.awt.Color(153, 153, 153));
        CorreoElectronico3.setText("Numero de telefono");
        jPanel4.add(CorreoElectronico3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, 20));

        CorreoElectronico4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        CorreoElectronico4.setForeground(new java.awt.Color(153, 153, 153));
        CorreoElectronico4.setText("Direccion");
        jPanel4.add(CorreoElectronico4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, 20));

        DireccionjTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        DireccionjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionjTextFieldActionPerformed(evt);
            }
        });
        jPanel4.add(DireccionjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 270, 20));

        LocalidadjTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        LocalidadjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalidadjTextFieldActionPerformed(evt);
            }
        });
        jPanel4.add(LocalidadjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 270, 20));

        CorreoElectronico5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        CorreoElectronico5.setForeground(new java.awt.Color(153, 153, 153));
        CorreoElectronico5.setText("Localidad");
        jPanel4.add(CorreoElectronico5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, 20));

        CorreojTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        CorreojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreojTextFieldActionPerformed(evt);
            }
        });
        jPanel4.add(CorreojTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 270, 20));

        CorreoElectronico6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        CorreoElectronico6.setForeground(new java.awt.Color(153, 153, 153));
        CorreoElectronico6.setText("Correo Electronico");
        jPanel4.add(CorreoElectronico6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, 20));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        JLabelError.setText("");

        if (DnijTextField.getText().toString().isEmpty() || PasswordField.getPassword().length == 0 || NombrejTextField.toString().isEmpty()
                || ApellidojTextField.toString().isEmpty() || TelefonojTextField.toString().isEmpty() || CorreojTextField.toString().isEmpty()
                || DireccionjTextField.toString().isEmpty() || LocalidadjTextField.toString().isEmpty()) {
            JLabelError.setText("Debes rellenar todos los campos");
        } else {
            String Dni = DnijTextField.getText();
            String Nombre = NombrejTextField.getText();
            String Apellido = ApellidojTextField.getText();
            String NumeroTelefono = TelefonojTextField.getText();
            String Direccion = DireccionjTextField.getText();
            String Localidad = LocalidadjTextField.getText();
            String correoElectronico = CorreojTextField.getText();
            String password = String.valueOf(PasswordField.getPassword());
            
            
            
            
            
            boolean validacion = gestionClientes.validarCampos(Nombre, Dni, Apellido, NumeroTelefono, Direccion, Localidad, correoElectronico, password);
            boolean validacionRepetidos = gestionClientes.validarCamposRepetido(Dni, correoElectronico);
            
            if (validacion == true && validacionRepetidos == true) {
                Cliente nuevoCliente = new Cliente(Dni, Nombre, Apellido, Integer.parseInt(NumeroTelefono), Direccion, Localidad, correoElectronico, password);
                
                gestionClientes.InsertarCliente(nuevoCliente);
                dispose();
                new LoginVentana().setVisible(true);
                
            } else if (validacion == false) {
                JLabelError.setText("Campos no validos");

            } else if (validacionRepetidos == false) {
                JLabelError.setText("Dni o correo electronico repetidos");
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

    private void DnijTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DnijTextFieldActionPerformed
    }//GEN-LAST:event_DnijTextFieldActionPerformed

    private void btcBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcBackMouseClicked
        dispose();
        new LoginVentana().setVisible(true);

    }//GEN-LAST:event_btcBackMouseClicked

    private void btcCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btcCloseMouseClicked

    private void NombrejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombrejTextFieldActionPerformed
    }//GEN-LAST:event_NombrejTextFieldActionPerformed

    private void ApellidojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidojTextFieldActionPerformed
    }//GEN-LAST:event_ApellidojTextFieldActionPerformed

    private void TelefonojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonojTextFieldActionPerformed
    }//GEN-LAST:event_TelefonojTextFieldActionPerformed

    private void DireccionjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionjTextFieldActionPerformed
    }//GEN-LAST:event_DireccionjTextFieldActionPerformed

    private void LocalidadjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocalidadjTextFieldActionPerformed
    }//GEN-LAST:event_LocalidadjTextFieldActionPerformed

    private void CorreojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreojTextFieldActionPerformed
    }//GEN-LAST:event_CorreojTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new RegisterVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidojTextField;
    private javax.swing.JLabel CorreoElectronico;
    private javax.swing.JLabel CorreoElectronico1;
    private javax.swing.JLabel CorreoElectronico2;
    private javax.swing.JLabel CorreoElectronico3;
    private javax.swing.JLabel CorreoElectronico4;
    private javax.swing.JLabel CorreoElectronico5;
    private javax.swing.JLabel CorreoElectronico6;
    private javax.swing.JTextField CorreojTextField;
    private javax.swing.JTextField DireccionjTextField;
    private javax.swing.JTextField DnijTextField;
    private javax.swing.JButton Enviar;
    private javax.swing.JLabel JLabelError;
    private javax.swing.JTextField LocalidadjTextField;
    private javax.swing.JTextField NombrejTextField;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField TelefonojTextField;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel btcBack;
    private javax.swing.JLabel btcClose;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel logoParadise;
    // End of variables declaration//GEN-END:variables
}
