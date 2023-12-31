/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import controladores.SoporteTécnico;

/**
 *
 * @author francobmassi
 */
public class CreacionClases extends javax.swing.JFrame {
    
    private SoporteTécnico soporteTécnico;
    
    public void setST(SoporteTécnico soporteTécnico){
        this.soporteTécnico = soporteTécnico;
    }
    
    public String strHTML(String texto) {
        return "<html>" + texto + "</html>";
    }
    
    
    /**
     * Creates new form CreacionClases
     */
    public CreacionClases() {
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

        crearClase = new javax.swing.JPanel();
        botonVolverAtras2 = new javax.swing.JButton();
        botonCrearClase = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombreProfesor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tipoEmplazamiento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        adminUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        horaDeClase = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        duracionDeClase = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ubicacionSede = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tipoDisciplina = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        diaDeClase = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonVolverAtras2.setText("VOLVER ATRÁS");
        botonVolverAtras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverAtras2ActionPerformed(evt);
            }
        });

        botonCrearClase.setText("CREAR CLASE");
        botonCrearClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearClaseActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel4.setText("CREAR NUEVA CLASE");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel6.setText("INGRESE EL NOMBRE DEL PROFESOR");

        nombreProfesor.setText("Nombre...");
        nombreProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreProfesorActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel7.setText("INGRESE EL EMPLAZAMIENTO DONDE TENDRÁ LUGAR LA CLASE");

        tipoEmplazamiento.setText("Emplazamiento...");
        tipoEmplazamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoEmplazamientoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel8.setText("INGRESE EL USERNAME DEL ADMINISTRADOR ENCARGADO");

        adminUsername.setText("Administrador...");
        adminUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminUsernameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel9.setText("INGRESE LA HORA DE INICIO");

        horaDeClase.setText("Hora...");
        horaDeClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaDeClaseActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel10.setText("INGRESE LA DURACION DE LA CLASE (EN HORAS)");

        duracionDeClase.setText("Duración...");
        duracionDeClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duracionDeClaseActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel11.setText("INGRESE EL NOMBRE DE LA SEDE DONDE SE REALIZARÁ LA CLASE");

        ubicacionSede.setText("Sede...");
        ubicacionSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicacionSedeActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel12.setText("INGRESE LA DISCIPLINA");

        tipoDisciplina.setText("Disciplina...");
        tipoDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoDisciplinaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel13.setText("INGRESE EL DÍA");

        diaDeClase.setText("Día...");
        diaDeClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaDeClaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout crearClaseLayout = new javax.swing.GroupLayout(crearClase);
        crearClase.setLayout(crearClaseLayout);
        crearClaseLayout.setHorizontalGroup(
            crearClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearClaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(crearClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crearClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tipoEmplazamiento)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ubicacionSede, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horaDeClase, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(crearClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(adminUsername)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(crearClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botonCrearClase, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonVolverAtras2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(crearClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(duracionDeClase, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaDeClase, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(crearClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(crearClaseLayout.createSequentialGroup()
                            .addComponent(nombreProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)))
                    .addGroup(crearClaseLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5))
        );
        crearClaseLayout.setVerticalGroup(
            crearClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearClaseLayout.createSequentialGroup()
                .addGroup(crearClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crearClaseLayout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(jLabel5))
                    .addGroup(crearClaseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ubicacionSede, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoEmplazamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(crearClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(crearClaseLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addComponent(diaDeClase, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(horaDeClase, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(duracionDeClase, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(botonCrearClase, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonVolverAtras2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(crearClase, javax.swing.GroupLayout.PREFERRED_SIZE, 479, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(crearClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverAtras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverAtras2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botonVolverAtras2ActionPerformed

    private void botonCrearClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearClaseActionPerformed
        String admin = adminUsername.getText().toUpperCase();
        String prof = nombreProfesor.getText().toUpperCase();
        String sede = ubicacionSede.getText().toUpperCase();
        String emplazamiento = tipoEmplazamiento.getText().toUpperCase();
        String disc = tipoDisciplina.getText().toUpperCase();
        String dia = diaDeClase.getText();
        String hora = horaDeClase.getText();
        String duracion = duracionDeClase.getText();
        soporteTécnico.crearNuevaClase(admin, prof, sede, emplazamiento, disc, dia, hora, duracion);
        adminUsername.setText("");
        nombreProfesor.setText("");
        ubicacionSede.setText("");
        tipoEmplazamiento.setText("");
        tipoDisciplina.setText("");
        diaDeClase.setText("");
        horaDeClase.setText("");
        duracionDeClase.setText("");
    }//GEN-LAST:event_botonCrearClaseActionPerformed

    private void nombreProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProfesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreProfesorActionPerformed

    private void tipoEmplazamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoEmplazamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoEmplazamientoActionPerformed

    private void adminUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminUsernameActionPerformed

    private void horaDeClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaDeClaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaDeClaseActionPerformed

    private void duracionDeClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duracionDeClaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duracionDeClaseActionPerformed

    private void ubicacionSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicacionSedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubicacionSedeActionPerformed

    private void tipoDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoDisciplinaActionPerformed

    private void diaDeClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaDeClaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaDeClaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminUsername;
    private javax.swing.JButton botonCrearClase;
    private javax.swing.JButton botonVolverAtras2;
    private javax.swing.JPanel crearClase;
    private javax.swing.JTextField diaDeClase;
    private javax.swing.JTextField duracionDeClase;
    private javax.swing.JTextField horaDeClase;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombreProfesor;
    private javax.swing.JTextField tipoDisciplina;
    private javax.swing.JTextField tipoEmplazamiento;
    private javax.swing.JTextField ubicacionSede;
    // End of variables declaration//GEN-END:variables
}
