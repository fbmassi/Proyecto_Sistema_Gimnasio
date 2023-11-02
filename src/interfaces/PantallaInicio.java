package interfaces;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author francobmassi
 */
public class PantallaInicio extends javax.swing.JFrame {

    /**
     * Creates new form PantallaInicio
     */
    public PantallaInicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        tituloPrincipal = new javax.swing.JLabel();
        administradores = new javax.swing.JLabel();
        correoElectronicoAdmin = new javax.swing.JTextField();
        contraseñaAdmin = new javax.swing.JTextField();
        ingresarAdministradores = new javax.swing.JButton();
        usuario = new javax.swing.JLabel();
        correoElectronicoUsuario = new javax.swing.JTextField();
        contraseñaUsuario = new javax.swing.JTextField();
        ingresarUsuario = new javax.swing.JButton();
        personalDeSoporteTécnico = new javax.swing.JLabel();
        correoElectronicoST = new javax.swing.JTextField();
        contraseñaST = new javax.swing.JTextField();
        ingresarSoporteTecnico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloPrincipal.setFont(new java.awt.Font("Arial Hebrew Scholar", 0, 36)); // NOI18N
        tituloPrincipal.setText("GIMNASIOS SUPERLTON");

        administradores.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        administradores.setText("Administradores");

        correoElectronicoAdmin.setText("Correo Electrónico...");
        correoElectronicoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoElectronicoAdminActionPerformed(evt);
            }
        });

        contraseñaAdmin.setText("Contraseña...");
        contraseñaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaAdminActionPerformed(evt);
            }
        });

        ingresarAdministradores.setText("INGRESAR");
        ingresarAdministradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarAdministradoresActionPerformed(evt);
            }
        });

        usuario.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        usuario.setText("Usuarios");

        correoElectronicoUsuario.setText("Correo Electrónico...");
        correoElectronicoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoElectronicoUsuarioActionPerformed(evt);
            }
        });

        contraseñaUsuario.setText("Contraseña...");
        contraseñaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaUsuarioActionPerformed(evt);
            }
        });

        ingresarUsuario.setText("INGRESAR");
        ingresarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarUsuarioActionPerformed(evt);
            }
        });

        personalDeSoporteTécnico.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        personalDeSoporteTécnico.setText("Personal de Soporte Téctnico");

        correoElectronicoST.setText("Correo Electrónico...");
        correoElectronicoST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoElectronicoSTActionPerformed(evt);
            }
        });

        contraseñaST.setText("Contraseña...");
        contraseñaST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaSTActionPerformed(evt);
            }
        });

        ingresarSoporteTecnico.setText("INGRESAR");
        ingresarSoporteTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarSoporteTecnicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloPrincipal))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(correoElectronicoST)
                                .addComponent(personalDeSoporteTécnico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(contraseñaST, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                .addComponent(ingresarSoporteTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(ingresarAdministradores, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(usuario))
                            .addComponent(correoElectronicoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(ingresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(correoElectronicoAdmin)
                                .addComponent(administradores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(contraseñaAdmin)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloPrincipal)
                .addGap(44, 44, 44)
                .addComponent(administradores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correoElectronicoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseñaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingresarAdministradores, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correoElectronicoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(personalDeSoporteTécnico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correoElectronicoST, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contraseñaST, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ingresarSoporteTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void correoElectronicoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoElectronicoAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoElectronicoAdminActionPerformed

    private void contraseñaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaAdminActionPerformed

    private void correoElectronicoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoElectronicoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoElectronicoUsuarioActionPerformed

    private void contraseñaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaUsuarioActionPerformed

    private void correoElectronicoSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoElectronicoSTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoElectronicoSTActionPerformed

    private void contraseñaSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaSTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaSTActionPerformed

    private void ingresarSoporteTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarSoporteTecnicoActionPerformed
        String email = correoElectronicoST.getText();
        String contraseña = contraseñaST.getText();
        correoElectronicoST.setText("");
        contraseñaST.setText("");
    }//GEN-LAST:event_ingresarSoporteTecnicoActionPerformed

    private void ingresarAdministradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarAdministradoresActionPerformed
        String email = correoElectronicoAdmin.getText();
        String contraseña = contraseñaAdmin.getText();
        correoElectronicoAdmin.setText("");
        contraseñaAdmin.setText("");
    }//GEN-LAST:event_ingresarAdministradoresActionPerformed

    private void ingresarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarUsuarioActionPerformed
        String email = correoElectronicoUsuario.getText();
        String contraseña = contraseñaUsuario.getText();
        correoElectronicoUsuario.setText("");
        contraseñaUsuario.setText("");
    }//GEN-LAST:event_ingresarUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel administradores;
    private javax.swing.JTextField contraseñaAdmin;
    private javax.swing.JTextField contraseñaST;
    private javax.swing.JTextField contraseñaUsuario;
    private javax.swing.JTextField correoElectronicoAdmin;
    private javax.swing.JTextField correoElectronicoST;
    private javax.swing.JTextField correoElectronicoUsuario;
    private javax.swing.JButton ingresarAdministradores;
    private javax.swing.JButton ingresarSoporteTecnico;
    private javax.swing.JButton ingresarUsuario;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel personalDeSoporteTécnico;
    private javax.swing.JLabel tituloPrincipal;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
