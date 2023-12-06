/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import controladores.*;
import sistema.*;

/**
 *
 * @author francobmassi
 */
public class GestionDeClientes extends javax.swing.JFrame {
    
    private SoporteTécnico soporteTécnico;
    
    public void setST(SoporteTécnico soporteTécnico){
        this.soporteTécnico = soporteTécnico;
    }
    
    /**
     * Creates new form GestionDeUsuarios
     */
    public GestionDeClientes() {
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

        PanelVerClientes = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        resultadosDeBusqueda = new javax.swing.JLabel();
        mostrarClientes = new javax.swing.JButton();
        PanelAdministracionDeClientes = new javax.swing.JPanel();
        newUserName = new javax.swing.JTextField();
        newSuscriptionLevel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        crearUsuario = new javax.swing.JButton();
        deleteUsername = new javax.swing.JTextField();
        eliminarUsuario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        botonVolverAtras = new javax.swing.JButton();
        newPassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel2.setText("CLIENTES EXISTENTES");

        mostrarClientes.setText("MOSTRAR CLIENTES EXISTENTES");
        mostrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelVerClientesLayout = new javax.swing.GroupLayout(PanelVerClientes);
        PanelVerClientes.setLayout(PanelVerClientesLayout);
        PanelVerClientesLayout.setHorizontalGroup(
            PanelVerClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVerClientesLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(PanelVerClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelVerClientesLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelVerClientesLayout.createSequentialGroup()
                        .addComponent(mostrarClientes)
                        .addGap(157, 157, 157))))
            .addGroup(PanelVerClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelVerClientesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(resultadosDeBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PanelVerClientesLayout.setVerticalGroup(
            PanelVerClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVerClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(mostrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(PanelVerClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelVerClientesLayout.createSequentialGroup()
                    .addContainerGap(50, Short.MAX_VALUE)
                    .addComponent(resultadosDeBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(53, Short.MAX_VALUE)))
        );

        newUserName.setText("Ingrese el username del nuevo cliente...");
        newUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserNameActionPerformed(evt);
            }
        });

        newSuscriptionLevel.setText("Ingrese el nivel de suscripcion del nuevo cliente (SOLO BLACK, GOLD O PLATINUM)...");
        newSuscriptionLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newSuscriptionLevelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel1.setText("CREAR NUEVO CLIENTE");

        crearUsuario.setText("CREAR USUARIO");
        crearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUsuarioActionPerformed(evt);
            }
        });

        deleteUsername.setText("Ingrese el username del cliente que desea eliminar...");
        deleteUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUsernameActionPerformed(evt);
            }
        });

        eliminarUsuario.setText("ELIMINAR USUARIO");
        eliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel3.setText("ELIMINAR CLIENTE");

        botonVolverAtras.setText("VOLVER ATRÁS");
        botonVolverAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverAtrasActionPerformed(evt);
            }
        });

        newPassword.setText("Ingrese la contraseña del nuevo cliente...");
        newPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAdministracionDeClientesLayout = new javax.swing.GroupLayout(PanelAdministracionDeClientes);
        PanelAdministracionDeClientes.setLayout(PanelAdministracionDeClientesLayout);
        PanelAdministracionDeClientesLayout.setHorizontalGroup(
            PanelAdministracionDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonVolverAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelAdministracionDeClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAdministracionDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newUserName)
                    .addComponent(deleteUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newPassword)
                    .addComponent(newSuscriptionLevel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAdministracionDeClientesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(68, 68, 68))
            .addGroup(PanelAdministracionDeClientesLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelAdministracionDeClientesLayout.createSequentialGroup()
                .addGroup(PanelAdministracionDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAdministracionDeClientesLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(crearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAdministracionDeClientesLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(eliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelAdministracionDeClientesLayout.setVerticalGroup(
            PanelAdministracionDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAdministracionDeClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newSuscriptionLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(crearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVolverAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAdministracionDeClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelVerClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(289, Short.MAX_VALUE)
                .addComponent(PanelAdministracionDeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(PanelVerClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 425, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newUserNameActionPerformed

    private void newSuscriptionLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newSuscriptionLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newSuscriptionLevelActionPerformed

    private void crearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioActionPerformed
        String username = newUserName.getText();
        String contraseña = newPassword.getText();
        String nivel_suscripcion = newSuscriptionLevel.getText().toUpperCase();
        boolean existe_username = false;
        for (Administrador admin: soporteTécnico.getAdministradores()){
            if (admin.getUsername().equals(username.toUpperCase())){
                existe_username = true;
            }
        }
        if (!existe_username) {
            soporteTécnico.crearCliente(username, contraseña, nivel_suscripcion);
        } else {
            ExisteUsuario usuarioExiste = new ExisteUsuario();
            usuarioExiste.setVisible(true);
            usuarioExiste.setLocationRelativeTo(null);
        }
        newUserName.setText("");
        newSuscriptionLevel.setText("");
        newPassword.setText("");
        
    }//GEN-LAST:event_crearUsuarioActionPerformed

    private void deleteUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteUsernameActionPerformed

    private void eliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarUsuarioActionPerformed
        String username = deleteUsername.getText();
        soporteTécnico.darDeBajaUsuarios(username);
        deleteUsername.setText("");
    }//GEN-LAST:event_eliminarUsuarioActionPerformed

    private void mostrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarClientesActionPerformed
        String devolver = "";
        for (Socio socio: soporteTécnico.getClientes()) {
            devolver += "<p>CLIENTE : " + socio.getUsername() +".</p>";
        }
        resultadosDeBusqueda.setText(strHTML(devolver));
    }//GEN-LAST:event_mostrarClientesActionPerformed

    private void botonVolverAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverAtrasActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botonVolverAtrasActionPerformed

    private void newPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPasswordActionPerformed

    public String strHTML(String texto) {
        return "<html>" + texto + "</html>";
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAdministracionDeClientes;
    private javax.swing.JPanel PanelVerClientes;
    private javax.swing.JButton botonVolverAtras;
    private javax.swing.JButton crearUsuario;
    private javax.swing.JTextField deleteUsername;
    private javax.swing.JButton eliminarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton mostrarClientes;
    private javax.swing.JTextField newPassword;
    private javax.swing.JTextField newSuscriptionLevel;
    private javax.swing.JTextField newUserName;
    private javax.swing.JLabel resultadosDeBusqueda;
    // End of variables declaration//GEN-END:variables
}
