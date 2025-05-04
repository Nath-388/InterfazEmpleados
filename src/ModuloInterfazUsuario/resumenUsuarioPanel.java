/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ModuloInterfazUsuario;

import ModuloEstructuras.ListaEnlazada;
import static ModuloInterfazUsuario.Dashboard.ShowJPanel;
import ModuloInterfazUsuario.table.TableHeaderAlignment;
import ModuloInterfazUsuario.table.checkBoxTableHeaderRenderer;
import ModuloModelos.Empleado;
import ModuloServicios.Autenticacion;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Dimension;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nath_
 */
public class resumenUsuarioPanel extends javax.swing.JPanel {

   private ListaEnlazada<Empleado> empleados;
   
    public resumenUsuarioPanel() {
        initComponents();
         setPreferredSize(new Dimension(1510,820));
         empleados= Autenticacion.getEmpleados();
         init();
    }
     public void init(){
         txtSearch.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingrese la cédula del empleado");
        txtSearch.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("Imagenes/search.svg"));
        table.getColumnModel().getColumn(0).setHeaderRenderer(new checkBoxTableHeaderRenderer(table, 0));
        table.getTableHeader().setDefaultRenderer(new TableHeaderAlignment(table));
       
        testData();
       
    }
     private void testData(){
        DefaultTableModel model = (DefaultTableModel)table.getModel();

        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        model.addRow(new Object[] {false, "1097496590", "Nathalia Sofia", "Rojas Pimienta", "Admin", "1097496590@UrbanLink.com", "1097496590"});
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1459, 761));
        setPreferredSize(new java.awt.Dimension(1459, 761));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto ExtraBold", 1, 48)); // NOI18N
        jLabel10.setText("Usuarios");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 78, -1, -1));

        txtSearch.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 172, 1226, 59));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Buscar");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1309, 172, 139, 59));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SELECT", "CÉDULA", "NOMBRES", "APELLIDOS", "TIPO", "USERNAME", "PASSWORD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 250, 1400, -1));

        btnNuevo.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevo.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1007, 698, 139, 59));

        btnEditar.setBackground(new java.awt.Color(0, 0, 0));
        btnEditar.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1158, 698, 139, 59));

        btnBorrar.setBackground(new java.awt.Color(0, 0, 0));
        btnBorrar.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1309, 698, 139, 59));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        ShowJPanel(new agregarUsuarioPanel());
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        ShowJPanel(new agregarUsuarioPanel());
    }//GEN-LAST:event_btnEditarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
