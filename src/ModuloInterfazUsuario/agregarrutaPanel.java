/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ModuloInterfazUsuario;

import ModuloModelos.Estacion;
import ModuloModelos.Horario;
import ModuloModelos.Tren;
import java.awt.Dimension;

/**
 *
 * @author nath_
 */
public class agregarrutaPanel extends javax.swing.JPanel {
    private String id;
    private Tren tren;
    private Horario horario;
    private Estacion salida;
    private Estacion llegada;
    private Estacion[] estaciones;
  
    public agregarrutaPanel() {
        initComponents();
        
        setPreferredSize(new Dimension(1510,820));
    }
    
    public void agregar(){
        id= txtFecha.getText();
        String tipoTren= opcionTren.getActionCommand();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datePicker = new com.raven.datechooser.DateChooser();
        jLabel10 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        estacionSalida = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        opcionTren = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        estacionLlegada = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        transbordo = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtID1 = new javax.swing.JTextField();
        opcionTren1 = new javax.swing.JComboBox<>();
        estacionSalida1 = new javax.swing.JComboBox<>();

        datePicker.setForeground(new java.awt.Color(0, 0, 0));
        datePicker.setTextRefernce(txtFecha);

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto ExtraBold", 1, 48)); // NOI18N
        jLabel10.setText("Editar Ruta");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 78, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 698, 160, 59));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 155, 31, -1));

        txtFecha.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 460, 430, 59));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setText("TREN");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 285, 101, -1));

        estacionSalida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(estacionSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 590, 430, 59));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setText("ESTACIÓN DE SALIDA");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 155, 251, -1));

        opcionTren.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(opcionTren, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 590, 430, 59));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setText("ESTACIÓN DE LLEGADA");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 285, 251, -1));

        estacionLlegada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(estacionLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 195, 430, 59));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setText("ESTACIONES");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 420, 251, -1));

        transbordo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(transbordo, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 460, 430, 59));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1309, 698, 160, 59));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setText("FECHA DE SALIDA");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 420, 215, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setText("HORA DE SALIDA");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 540, 215, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setText("HORA DE LLEGADA");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 540, 215, -1));

        txtID1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID1ActionPerformed(evt);
            }
        });
        add(txtID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 195, 430, 59));

        opcionTren1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(opcionTren1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 330, 430, 59));

        estacionSalida1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(estacionSalida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 330, 430, 59));
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private com.raven.datechooser.DateChooser datePicker;
    private javax.swing.JComboBox<String> estacionLlegada;
    private javax.swing.JComboBox<String> estacionSalida;
    private javax.swing.JComboBox<String> estacionSalida1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> opcionTren;
    private javax.swing.JComboBox<String> opcionTren1;
    private javax.swing.JComboBox<String> transbordo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtID1;
    // End of variables declaration//GEN-END:variables
}
