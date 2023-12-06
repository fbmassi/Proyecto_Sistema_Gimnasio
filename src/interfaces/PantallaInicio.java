package interfaces;
import controladores.*;
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
    
    private SoporteTécnico soporteTécnico;
    
    public void setST(SoporteTécnico soporteTécnico){
        this.soporteTécnico = soporteTécnico;
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
        UsernameUsuario = new javax.swing.JTextField();
        contraseñaUsuario = new javax.swing.JTextField();
        ingresarUsuario = new javax.swing.JButton();
        personalDeSoporteTécnico = new javax.swing.JLabel();
        contraseñaST = new javax.swing.JTextField();
        ingresarSoporteTecnico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloPrincipal.setFont(new java.awt.Font("Arial Hebrew Scholar", 0, 36)); // NOI18N
        tituloPrincipal.setText("GIMNASIOS SUPERLTON");

        administradores.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        administradores.setText("Administradores");

        correoElectronicoAdmin.setText("Username...");
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

        UsernameUsuario.setText("Username...");
        UsernameUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameUsuarioActionPerformed(evt);
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
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(personalDeSoporteTécnico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contraseñaST, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(ingresarAdministradores, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(usuario))
                            .addComponent(UsernameUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(ingresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(correoElectronicoAdmin)
                                .addComponent(administradores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(contraseñaAdmin))))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(ingresarSoporteTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(UsernameUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(personalDeSoporteTécnico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseñaST, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ingresarSoporteTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void correoElectronicoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoElectronicoAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoElectronicoAdminActionPerformed

    private void contraseñaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaAdminActionPerformed

    private void UsernameUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameUsuarioActionPerformed

    private void contraseñaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaUsuarioActionPerformed

    private void contraseñaSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaSTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaSTActionPerformed

    private void ingresarSoporteTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarSoporteTecnicoActionPerformed
        String contraseña = contraseñaST.getText();
        contraseñaST.setText("");
        PanelDeControlST panelCst = new PanelDeControlST();
        IngresoErroneo ingresoErroneo = new IngresoErroneo();
        if (this.soporteTécnico.iniciarSesion(contraseña)) {
            panelCst.setST(soporteTécnico);
            panelCst.setVisible(true);
            panelCst.setLocationRelativeTo(null);
        } else{
            ingresoErroneo.setVisible(true);
            ingresoErroneo.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_ingresarSoporteTecnicoActionPerformed

    private void ingresarAdministradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarAdministradoresActionPerformed
        String username = correoElectronicoAdmin.getText();
        String contraseña = contraseñaAdmin.getText();
        correoElectronicoAdmin.setText("");
        contraseñaAdmin.setText("");
    }//GEN-LAST:event_ingresarAdministradoresActionPerformed

    private void ingresarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarUsuarioActionPerformed
        String username = UsernameUsuario.getText().toUpperCase();
        String contraseña = contraseñaUsuario.getText().toUpperCase();
        PanelDeControlCliente panelCliente = new PanelDeControlCliente();
        IngresoErroneo ingresoErroneo = new IngresoErroneo();
        boolean existe_socio = false;
        for (Socio socio : soporteTécnico.getClientes()) {
            if (username.equals(socio.getUsername()) && socio.iniciarSesion(contraseña)) {
                panelCliente.setVisible(true);
                panelCliente.setLocationRelativeTo(null);
                panelCliente.setCliente(socio);
                existe_socio = true;
            }
        }
        if (!existe_socio) {
            ingresoErroneo.setVisible(true);
            ingresoErroneo.setLocationRelativeTo(null);
        }
        UsernameUsuario.setText("");
        contraseñaUsuario.setText("");
    }//GEN-LAST:event_ingresarUsuarioActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UsernameUsuario;
    private javax.swing.JLabel administradores;
    private javax.swing.JTextField contraseñaAdmin;
    private javax.swing.JTextField contraseñaST;
    private javax.swing.JTextField contraseñaUsuario;
    private javax.swing.JTextField correoElectronicoAdmin;
    private javax.swing.JButton ingresarAdministradores;
    private javax.swing.JButton ingresarSoporteTecnico;
    private javax.swing.JButton ingresarUsuario;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel personalDeSoporteTécnico;
    private javax.swing.JLabel tituloPrincipal;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
