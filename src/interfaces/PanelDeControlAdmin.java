/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import controladores.*;

/**
 *
 * @author francobmassi
 */
public class PanelDeControlAdmin extends javax.swing.JFrame {
    
    private SoporteTécnico soporteTécnico;
    private Administrador admin;
            
    public void setST(SoporteTécnico soporteTécnico){
        this.soporteTécnico = soporteTécnico;
    }
    
    public void setAdmin(Administrador admin){
        this.admin = admin;
    }
    
    
    /**
     * Creates new form PanelDeControlAdmin
     */
    public PanelDeControlAdmin() {
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

        jPanel1 = new javax.swing.JPanel();
        botonAgendarClaseASede = new javax.swing.JButton();
        botonGestionarClientes = new javax.swing.JButton();
        botonAdministrarAltaDeClientes = new javax.swing.JButton();
        botonGestionarArticulos = new javax.swing.JButton();
        botonMonitoriearGrabaciones = new javax.swing.JButton();
        botonVolverAtras = new javax.swing.JButton();
        botonCambiarEstadoDeClase = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonAgendarClaseASede.setText("AGENDAR CLASES A SEDES");
        botonAgendarClaseASede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgendarClaseASedeActionPerformed(evt);
            }
        });

        botonGestionarClientes.setText("AGREGAR ARTICULOS A SEDE");
        botonGestionarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGestionarClientesActionPerformed(evt);
            }
        });

        botonAdministrarAltaDeClientes.setText("ADMINISTRAR ALTA DE CLIENTES");
        botonAdministrarAltaDeClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdministrarAltaDeClientesActionPerformed(evt);
            }
        });

        botonGestionarArticulos.setText("GESTIONAR ARTICULOS");
        botonGestionarArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGestionarArticulosActionPerformed(evt);
            }
        });

        botonMonitoriearGrabaciones.setText("MONITOREAR GRABACIONES");
        botonMonitoriearGrabaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMonitoriearGrabacionesActionPerformed(evt);
            }
        });

        botonVolverAtras.setText("VOLVER ATRÁS");
        botonVolverAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverAtrasActionPerformed(evt);
            }
        });

        botonCambiarEstadoDeClase.setText("CAMBIAR ESTADO DE CLASE");
        botonCambiarEstadoDeClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarEstadoDeClaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAgendarClaseASede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAdministrarAltaDeClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(botonGestionarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(botonGestionarArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(botonMonitoriearGrabaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(botonVolverAtras, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(botonCambiarEstadoDeClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAgendarClaseASede, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonCambiarEstadoDeClase, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonGestionarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAdministrarAltaDeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonGestionarArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonMonitoriearGrabaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(botonVolverAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCambiarEstadoDeClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarEstadoDeClaseActionPerformed
        VerSedes verSedes = new VerSedes();
        verSedes.setST(soporteTécnico);
        verSedes.setVisible(true);
        verSedes.setLocationRelativeTo(null);
    }//GEN-LAST:event_botonCambiarEstadoDeClaseActionPerformed

    private void botonVolverAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverAtrasActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botonVolverAtrasActionPerformed

    private void botonMonitoriearGrabacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMonitoriearGrabacionesActionPerformed
        CreacionDeArticulos crearArticulos = new CreacionDeArticulos();
        crearArticulos.setST(soporteTécnico);
        crearArticulos.setVisible(true);
        crearArticulos.setLocationRelativeTo(null);
    }//GEN-LAST:event_botonMonitoriearGrabacionesActionPerformed

    private void botonGestionarArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGestionarArticulosActionPerformed
        AsignarSedes asignarSedes = new AsignarSedes();
        asignarSedes.setST(soporteTécnico);
        asignarSedes.setVisible(true);
        asignarSedes.setLocationRelativeTo(null);
    }//GEN-LAST:event_botonGestionarArticulosActionPerformed

    private void botonAdministrarAltaDeClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdministrarAltaDeClientesActionPerformed
        AdminstrarAltaDeClientes administracionDeAlta = new AdminstrarAltaDeClientes();
        administracionDeAlta.setST(soporteTécnico);
        administracionDeAlta.setVisible(true);
        administracionDeAlta.setAdmin(admin);
        administracionDeAlta.setLocationRelativeTo(null);
    }//GEN-LAST:event_botonAdministrarAltaDeClientesActionPerformed

    private void botonGestionarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGestionarClientesActionPerformed
        GestionDeClientes gestionDeClientes = new GestionDeClientes();
        gestionDeClientes.setST(soporteTécnico);
        gestionDeClientes.setVisible(true);
        gestionDeClientes.setLocationRelativeTo(null);
    }//GEN-LAST:event_botonGestionarClientesActionPerformed

    private void botonAgendarClaseASedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgendarClaseASedeActionPerformed
        AgendarClasesASedes agendarClaASed = new AgendarClasesASedes();
        agendarClaASed.setST(soporteTécnico);
        agendarClaASed.setAdmin(admin);
        agendarClaASed.setVisible(true);
        agendarClaASed.setLocationRelativeTo(null);
    }//GEN-LAST:event_botonAgendarClaseASedeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdministrarAltaDeClientes;
    private javax.swing.JButton botonAgendarClaseASede;
    private javax.swing.JButton botonCambiarEstadoDeClase;
    private javax.swing.JButton botonGestionarArticulos;
    private javax.swing.JButton botonGestionarClientes;
    private javax.swing.JButton botonMonitoriearGrabaciones;
    private javax.swing.JButton botonVolverAtras;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
