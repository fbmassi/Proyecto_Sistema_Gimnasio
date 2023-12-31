/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import controladores.Administrador;
import controladores.SoporteTécnico;
import sistema.*;

/**
 *
 * @author francobmassi
 */
public class GestionDeArticulosSede extends javax.swing.JFrame {
    
    private SoporteTécnico soporteTécnico;
    private Administrador admin;
            
    public void setST(SoporteTécnico soporteTécnico){
        this.soporteTécnico = soporteTécnico;
    }
    
    public void setAdmin(Administrador admin){
        this.admin = admin;
    }
    
    private String sedeSeleccionada  = "";
    
    /**
     * Creates new form GestionarArticulosSede
     */
    public GestionDeArticulosSede() {
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

        crearArticulos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonVolverAtras = new javax.swing.JButton();
        confirmarSede = new javax.swing.JButton();
        sumarLoteColchoneta = new javax.swing.JButton();
        sumarLoteArtPers = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        resultadosDeBusqueda = new javax.swing.JLabel();
        mostrarArticulos = new javax.swing.JButton();
        ubicacionSede = new javax.swing.JTextField();
        sumarLotePesa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel1.setText("VER ARTICULOS DE CADA SEDE");

        botonVolverAtras.setText("VOLVER ATRÁS");
        botonVolverAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverAtrasActionPerformed(evt);
            }
        });

        confirmarSede.setText("CONFIRMAR SEDE");
        confirmarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarSedeActionPerformed(evt);
            }
        });

        sumarLoteColchoneta.setText("COLCHONETA");
        sumarLoteColchoneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarLoteColchonetaActionPerformed(evt);
            }
        });

        sumarLoteArtPers.setText("ARTICULO PERSONALIZADO");
        sumarLoteArtPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarLoteArtPersActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel2.setText("SUMAR O ELIMINAR  LOTE DE ARTICULOS DE SEDE");

        resultadosDeBusqueda.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        resultadosDeBusqueda.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                resultadosDeBusquedaPropertyChange(evt);
            }
        });

        mostrarArticulos.setText("MOSTRAR ARTICULOS EXISTENTES");
        mostrarArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarArticulosActionPerformed(evt);
            }
        });

        ubicacionSede.setText("Ingrese la ubicacion de la sede...");
        ubicacionSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicacionSedeActionPerformed(evt);
            }
        });

        sumarLotePesa.setText("PESA");
        sumarLotePesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarLotePesaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel3.setText("SELECCIONAR SEDE");

        javax.swing.GroupLayout crearArticulosLayout = new javax.swing.GroupLayout(crearArticulos);
        crearArticulos.setLayout(crearArticulosLayout);
        crearArticulosLayout.setHorizontalGroup(
            crearArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearArticulosLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(crearArticulosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(crearArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmarSede, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ubicacionSede, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonVolverAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultadosDeBusqueda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrarArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sumarLoteColchoneta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sumarLoteArtPers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sumarLotePesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearArticulosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearArticulosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(158, 158, 158))
        );
        crearArticulosLayout.setVerticalGroup(
            crearArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearArticulosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ubicacionSede, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmarSede, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(sumarLotePesa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sumarLoteColchoneta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sumarLoteArtPers, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultadosDeBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrarArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonVolverAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 888, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(crearArticulos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 793, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(crearArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverAtrasActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botonVolverAtrasActionPerformed

    private void confirmarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarSedeActionPerformed
        boolean existeSede = false;
        this.sedeSeleccionada = ubicacionSede.getText();
        for (Sede sede: admin.getSedes()) {
            if (sede.getUbicacion().equals(sedeSeleccionada.toUpperCase())){
                this.sedeSeleccionada = ubicacionSede.getText().toUpperCase();
                existeSede = true;
            }
        }
        if (!existeSede) {
            IngresoErroneo ingresoErroneo = new IngresoErroneo();
            ingresoErroneo.setVisible(true);
            ingresoErroneo.setLocationRelativeTo(null);
        }
        
    }//GEN-LAST:event_confirmarSedeActionPerformed

    private void sumarLoteColchonetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarLoteColchonetaActionPerformed
        GestionNuevoLoteColchonetas gestionNuevoLoteColchonetas = new GestionNuevoLoteColchonetas();
        gestionNuevoLoteColchonetas.setST(soporteTécnico);
        gestionNuevoLoteColchonetas.setAdmin(admin);
        gestionNuevoLoteColchonetas.setSede(sedeSeleccionada);
        gestionNuevoLoteColchonetas.setVisible(true);
        gestionNuevoLoteColchonetas.setLocationRelativeTo(null);
    }//GEN-LAST:event_sumarLoteColchonetaActionPerformed

    private void sumarLoteArtPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarLoteArtPersActionPerformed
        GestionNuevoLotePersonalizados gestionNuevoLotePersonalizados = new GestionNuevoLotePersonalizados();
        gestionNuevoLotePersonalizados.setST(soporteTécnico);
        gestionNuevoLotePersonalizados.setAdmin(admin);
        gestionNuevoLotePersonalizados.setSede(sedeSeleccionada);
        gestionNuevoLotePersonalizados.setVisible(true);
        gestionNuevoLotePersonalizados.setLocationRelativeTo(null);
    }//GEN-LAST:event_sumarLoteArtPersActionPerformed

    private void mostrarArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarArticulosActionPerformed
        String setear = this.admin.mostrarArticulosSede(sedeSeleccionada);
        resultadosDeBusqueda.setText(setear);
    }//GEN-LAST:event_mostrarArticulosActionPerformed

    private void resultadosDeBusquedaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_resultadosDeBusquedaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadosDeBusquedaPropertyChange

    private void ubicacionSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicacionSedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubicacionSedeActionPerformed

    private void sumarLotePesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarLotePesaActionPerformed
        GestionNuevoLotePesas gestionNuevoLotePesas = new GestionNuevoLotePesas();
        gestionNuevoLotePesas.setST(soporteTécnico);
        gestionNuevoLotePesas.setAdmin(admin);
        gestionNuevoLotePesas.setSede(sedeSeleccionada);
        gestionNuevoLotePesas.setVisible(true);
        gestionNuevoLotePesas.setLocationRelativeTo(null);
    }//GEN-LAST:event_sumarLotePesaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonVolverAtras;
    private javax.swing.JButton confirmarSede;
    private javax.swing.JPanel crearArticulos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton mostrarArticulos;
    private javax.swing.JLabel resultadosDeBusqueda;
    private javax.swing.JButton sumarLoteArtPers;
    private javax.swing.JButton sumarLoteColchoneta;
    private javax.swing.JButton sumarLotePesa;
    private javax.swing.JTextField ubicacionSede;
    // End of variables declaration//GEN-END:variables
}
