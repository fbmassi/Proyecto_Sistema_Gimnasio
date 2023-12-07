/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import controladores.Administrador;
import controladores.Socio;
import controladores.SoporteTécnico;

/**
 *
 * @author francobmassi
 */
public class AdminstrarAltaDeClientes extends javax.swing.JFrame {
    
    private SoporteTécnico soporteTécnico;
    private Administrador admin;
    private String altaUsuario;
    private String nivelSiscripcionUsuario;
    
    public void setST(SoporteTécnico soporteTécnico){
        this.soporteTécnico = soporteTécnico;
    }
    
    public void setAdmin(Administrador admin){
        this.admin = admin;
    }
    
    public String strHTML(String texto) {
        return "<html>" + texto + "</html>";
    }
    
    /**
     * Creates new form AdminstrarAltaDeClientes
     */
    public AdminstrarAltaDeClientes() {
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

        PanelAsignasionDeSedes = new javax.swing.JPanel();
        clienteUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        mostrarClientes = new javax.swing.JButton();
        cambiarAlta = new javax.swing.JButton();
        alta = new javax.swing.JButton();
        baja = new javax.swing.JButton();
        resultadosDeBusqueda = new javax.swing.JLabel();
        botonVolverAtras = new javax.swing.JButton();
        cambiarNivelDeSuscripcion = new javax.swing.JButton();
        platinum = new javax.swing.JButton();
        black = new javax.swing.JButton();
        gold = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        clienteUsername.setText("Ingrese el username cliente...");
        clienteUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteUsernameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel1.setText("ADMINSTRAR ALTA DE CLIENTES");

        mostrarClientes.setText("MOSTRAR CLIENTES");
        mostrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarClientesActionPerformed(evt);
            }
        });

        cambiarAlta.setText("CAMBIAR ALTA");
        cambiarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarAltaActionPerformed(evt);
            }
        });

        alta.setText("ALTA");
        alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaActionPerformed(evt);
            }
        });

        baja.setText("BAJA");
        baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaActionPerformed(evt);
            }
        });

        botonVolverAtras.setText("VOLVER ATRÁS");
        botonVolverAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverAtrasActionPerformed(evt);
            }
        });

        cambiarNivelDeSuscripcion.setText("CAMBIAR NIVEL DE SUSCRIPCION");
        cambiarNivelDeSuscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarNivelDeSuscripcionActionPerformed(evt);
            }
        });

        platinum.setText("PLATINUM");
        platinum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platinumActionPerformed(evt);
            }
        });

        black.setText("BLACK");
        black.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackActionPerformed(evt);
            }
        });

        gold.setText("GOLD");
        gold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAsignasionDeSedesLayout = new javax.swing.GroupLayout(PanelAsignasionDeSedes);
        PanelAsignasionDeSedes.setLayout(PanelAsignasionDeSedesLayout);
        PanelAsignasionDeSedesLayout.setHorizontalGroup(
            PanelAsignasionDeSedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAsignasionDeSedesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAsignasionDeSedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAsignasionDeSedesLayout.createSequentialGroup()
                        .addGroup(PanelAsignasionDeSedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clienteUsername)
                            .addGroup(PanelAsignasionDeSedesLayout.createSequentialGroup()
                                .addComponent(alta, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(baja, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addComponent(botonVolverAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(PanelAsignasionDeSedesLayout.createSequentialGroup()
                .addGroup(PanelAsignasionDeSedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadosDeBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelAsignasionDeSedesLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(platinum, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAsignasionDeSedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cambiarNivelDeSuscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(black, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gold, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAsignasionDeSedesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(63, 63, 63))
            .addGroup(PanelAsignasionDeSedesLayout.createSequentialGroup()
                .addGroup(PanelAsignasionDeSedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAsignasionDeSedesLayout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(cambiarAlta))
                    .addGroup(PanelAsignasionDeSedesLayout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(mostrarClientes)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelAsignasionDeSedesLayout.setVerticalGroup(
            PanelAsignasionDeSedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAsignasionDeSedesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultadosDeBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clienteUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAsignasionDeSedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baja, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(cambiarAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAsignasionDeSedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(black, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gold, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(platinum, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cambiarNivelDeSuscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonVolverAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 786, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelAsignasionDeSedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelAsignasionDeSedes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clienteUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteUsernameActionPerformed

    private void mostrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarClientesActionPerformed
        String devolver = "";
        for (Socio socio: soporteTécnico.getClientes()) {
            devolver += "<p>CLIENTE : " + socio.getUsername() + " - NIVEL DE SUSCRIPCION: " + socio.getNivelSuscripción() + " - ALTA: " + socio.isAlta() + ".</p>";
        }
        resultadosDeBusqueda.setText(strHTML(devolver));
    }//GEN-LAST:event_mostrarClientesActionPerformed

    private void cambiarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarAltaActionPerformed
        String username = clienteUsername.getText().toUpperCase();
        boolean existe_socio = false;
        for (Socio socio: soporteTécnico.getClientes()) {
            if (socio.getUsername().equals(username)){
                admin.gestionarAltaCliente(username, altaUsuario);
                existe_socio = true;
            }
        }
        if (!existe_socio) {
            IngresoErroneo ingresoErroneo = new IngresoErroneo();
            ingresoErroneo.setVisible(true);
            ingresoErroneo.setLocationRelativeTo(null);
        }
        clienteUsername.setText("");
    }//GEN-LAST:event_cambiarAltaActionPerformed

    private void altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaActionPerformed
        this.altaUsuario = "ALTA";
    }//GEN-LAST:event_altaActionPerformed

    private void bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaActionPerformed
        this.altaUsuario = "BAJA";
    }//GEN-LAST:event_bajaActionPerformed

    private void botonVolverAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverAtrasActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botonVolverAtrasActionPerformed

    private void cambiarNivelDeSuscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarNivelDeSuscripcionActionPerformed
        String username = clienteUsername.getText().toUpperCase();
        boolean existe_socio = false;
        for (Socio socio: soporteTécnico.getClientes()) {
            if (socio.getUsername().equals(username)){
                admin.gestionarNivelSuscripcionCliente(username, nivelSiscripcionUsuario);
                existe_socio = true;
            }
        }
        if (!existe_socio) {
            IngresoErroneo ingresoErroneo = new IngresoErroneo();
            ingresoErroneo.setVisible(true);
            ingresoErroneo.setLocationRelativeTo(null);
        }
        clienteUsername.setText("");
    }//GEN-LAST:event_cambiarNivelDeSuscripcionActionPerformed

    private void platinumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platinumActionPerformed
        this.nivelSiscripcionUsuario = "PLATINUM";
    }//GEN-LAST:event_platinumActionPerformed

    private void blackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackActionPerformed
        this.nivelSiscripcionUsuario = "BLACK";
    }//GEN-LAST:event_blackActionPerformed

    private void goldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goldActionPerformed
        this.nivelSiscripcionUsuario = "GOLD";
    }//GEN-LAST:event_goldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAsignasionDeSedes;
    private javax.swing.JButton alta;
    private javax.swing.JButton baja;
    private javax.swing.JButton black;
    private javax.swing.JButton botonVolverAtras;
    private javax.swing.JButton cambiarAlta;
    private javax.swing.JButton cambiarNivelDeSuscripcion;
    private javax.swing.JTextField clienteUsername;
    private javax.swing.JButton gold;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mostrarClientes;
    private javax.swing.JButton platinum;
    private javax.swing.JLabel resultadosDeBusqueda;
    // End of variables declaration//GEN-END:variables
}
