
package com.mycompany.automovil.igu;

import com.mycompany.automovil.logica.Automovil;
import com.mycompany.automovil.logica.Controladora;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class EditarAuto extends javax.swing.JFrame {
    
    Controladora control = null;
    Automovil auto = new Automovil();
    
    public EditarAuto(int idAuto) {
        control = new Controladora();
        initComponents();
        cargarDatosAUto(idAuto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        modelo = new javax.swing.JLabel();
        modelo1 = new javax.swing.JLabel();
        modelo2 = new javax.swing.JLabel();
        modelo3 = new javax.swing.JLabel();
        modelo4 = new javax.swing.JLabel();
        modelo5 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtNumPuertas = new javax.swing.JTextField();
        txtMotor = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setText("EDITAR DATOS AUTO");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Cursos\\curso_Java\\NetBeansProjects\\automovil\\recursos\\registro-auto.jpg")); // NOI18N

        modelo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        modelo.setText("Marca:");

        modelo1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        modelo1.setText("Modelo:");

        modelo2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        modelo2.setText("Color:");

        modelo3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        modelo3.setText("Motor:");

        modelo4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        modelo4.setText("N. Puertas:");

        modelo5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        modelo5.setText("Placas:");

        btnAtras.setIcon(new javax.swing.ImageIcon("C:\\Cursos\\curso_Java\\NetBeansProjects\\automovil\\recursos\\atras.png")); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Cursos\\curso_Java\\NetBeansProjects\\automovil\\recursos\\agregar.png")); // NOI18N
        btnEditar.setText("Guardar Cambios");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Cursos\\curso_Java\\NetBeansProjects\\automovil\\recursos\\limpiar.png")); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(133, 133, 133))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modelo5)
                            .addComponent(modelo2)
                            .addComponent(modelo3)
                            .addComponent(modelo)
                            .addComponent(modelo1)
                            .addComponent(modelo4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtras)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(47, 47, 47))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelo1)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modelo)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelo3)
                            .addComponent(txtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelo2)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelo5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelo4)
                            .addComponent(txtNumPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnEditar)
                            .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        ConsultaAutomovil consulAuto = new ConsultaAutomovil();
        consulAuto.setVisible(true);
        consulAuto.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        String modelo = txtModelo.getText();
        String marca = txtMarca.getText();
        String motor = txtMotor.getText();
        String color = txtColor.getText();
        String placa = txtPlaca.getText();
        int numPuertas = Integer.parseInt(txtNumPuertas.getText());

        control.modificarAutmovil(auto,modelo,marca,motor,color,placa,numPuertas);
        
        mostrarMensaje("Datos modificados correctamente","Info","Edicion Exitosa");
        
        ConsultaAutomovil consul = new ConsultaAutomovil();
        consul.setVisible(true);
        consul.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtModelo.setText("");
        txtMarca.setText("");
        txtMotor.setText("");
        txtColor.setText("");
        txtPlaca.setText("");
        txtNumPuertas.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel modelo;
    private javax.swing.JLabel modelo1;
    private javax.swing.JLabel modelo2;
    private javax.swing.JLabel modelo3;
    private javax.swing.JLabel modelo4;
    private javax.swing.JLabel modelo5;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtNumPuertas;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables

    private void cargarDatosAUto(int idAuto) {
        auto = control.traerAuto(idAuto);
        
        txtModelo.setText(auto.getModelo());
        txtMarca.setText(auto.getMarca());
        txtMotor.setText(auto.getMotor());
        txtColor.setText(auto.getColor());
        txtPlaca.setText(auto.getPlaca());
        txtNumPuertas.setText(String.valueOf(auto.getNumPuertas()));
        
    }
    
    public void mostrarMensaje(String mensaje, String tipo, String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if(tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if(tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
    }
}
