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
public class CambioDeEstadoClase extends javax.swing.JFrame {
    
    private SoporteTécnico soporteTécnico;
    private Administrador admin;
            
    public void setST(SoporteTécnico soporteTécnico){
        this.soporteTécnico = soporteTécnico;
    }
    
    public void setAdmin(Administrador admin){
        this.admin = admin;
    }
    
    /**
     * Creates new form CambioDeEstadoClase
     */
    public CambioDeEstadoClase() {
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
        botonCambiarEstado = new javax.swing.JButton();
        botonVolverAtras = new javax.swing.JButton();
        botonVerClases = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sede = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        disciplina = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        hora = new javax.swing.JTextField();
        resultadosDeBusqueda = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nuevo_estado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonCambiarEstado.setText("CAMBIAR ESTADO");
        botonCambiarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarEstadoActionPerformed(evt);
            }
        });

        botonVolverAtras.setText("VOLVER ATRÁS");
        botonVolverAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverAtrasActionPerformed(evt);
            }
        });

        botonVerClases.setText("MOSTRAR CLASES PARA ADMINISTRAR");
        botonVerClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerClasesActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel4.setText("VER CLASES DISPONIBLES");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel6.setText("INGRESE LA UBICACION DE LA SEDE");

        sede.setText("Sede...");
        sede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sedeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel7.setText("INGRESE LA DISCIPLINA DE LA CLASE");

        disciplina.setText("Disciplina...");
        disciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disciplinaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel8.setText("INGRESE EL DÍA DE LA CLASE");

        dia.setText("Día...");
        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel5.setText("CAMBIAR ESTADO DE CLASE");

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel9.setText("INGRESE EL HORARIO DE LA CLASE");

        hora.setText("Hora...");
        hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel10.setText("INGRESE EL NUEVO ESTADO DE LA CLASE");

        nuevo_estado.setText("Nuevo Estado... (AGENDADA, CONFIRMADA O FINALIZADA)");
        nuevo_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo_estadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(356, 356, 356))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(sede, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(disciplina, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hora, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(1059, 1059, 1059))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(resultadosDeBusqueda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                            .addComponent(botonVolverAtras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonVerClases, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                            .addComponent(botonCambiarEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel4))
                            .addComponent(nuevo_estado)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultadosDeBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonVerClases, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sede, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nuevo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCambiarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonVolverAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCambiarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarEstadoActionPerformed
        String ubicacion = sede.getText().toUpperCase();
        String disc = disciplina.getText().toUpperCase();
        String day = dia.getText().toUpperCase();
        String horario = hora.getText();
        String estado = nuevo_estado.getText().toUpperCase();
        try {
            if (!estado.equals("AGENDADA") && !estado.equals("FINALIZADA") && !estado.equals("CONFIRMADA")) {
                IngresoErroneo ingresoErroneo = new IngresoErroneo();
                ingresoErroneo.setVisible(true);
                ingresoErroneo.setLocationRelativeTo(null);
            } else {
                int hourInt = Integer.parseInt(horario);
                boolean inscripcion_exitosa = false;
                for (Clase clase: admin.getClases()) {
                    if (!clase.getEstado().equals("FINALIZADA") && clase.getSede().getUbicacion().equals(ubicacion)
                        && clase.getDisciplina().getTipo().equals(disc) && clase.getDia().equals(day)
                        && clase.getHorario()==hourInt) {
                        admin.transicionarEstadoClase(ubicacion, disc, day, horario, estado);
                        inscripcion_exitosa = true;
                    }
                }
                if (!inscripcion_exitosa){
                    IngresoErroneo ingresoErroneo = new IngresoErroneo();
                    ingresoErroneo.setVisible(true);
                    ingresoErroneo.setLocationRelativeTo(null);
                }
            }
        } catch (NumberFormatException e){
            IngresoErroneo ingresoErroneo = new IngresoErroneo();
            ingresoErroneo.setVisible(true);
            ingresoErroneo.setLocationRelativeTo(null);
        }
        sede.setText("");
        disciplina.setText("");
        dia.setText("");
        hora.setText("");
        nuevo_estado.setText("");
    }//GEN-LAST:event_botonCambiarEstadoActionPerformed

    private void botonVolverAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverAtrasActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botonVolverAtrasActionPerformed

    private void botonVerClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerClasesActionPerformed
        resultadosDeBusqueda.setText(admin.visualizarClases());
    }//GEN-LAST:event_botonVerClasesActionPerformed

    private void sedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sedeActionPerformed

    private void disciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disciplinaActionPerformed

    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaActionPerformed

    private void horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaActionPerformed

    }//GEN-LAST:event_horaActionPerformed

    private void nuevo_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo_estadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCambiarEstado;
    private javax.swing.JButton botonVerClases;
    private javax.swing.JButton botonVolverAtras;
    private javax.swing.JTextField dia;
    private javax.swing.JTextField disciplina;
    private javax.swing.JTextField hora;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nuevo_estado;
    private javax.swing.JLabel resultadosDeBusqueda;
    private javax.swing.JTextField sede;
    // End of variables declaration//GEN-END:variables
}
