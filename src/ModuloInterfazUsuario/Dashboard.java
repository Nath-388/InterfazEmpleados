/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ModuloInterfazUsuario;

import ModuloModelos.Empleado;
import com.formdev.flatlaf.FlatDarkLaf;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nath_
 */
public class Dashboard extends javax.swing.JFrame {
    
    private static JPanel staticContentPanel;
    public Dashboard() {
        
        initComponents();
        staticContentPanel = contentPanel;
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        gestionHorarios = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        gestionTrenes = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        validarBoletos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        gestionUsuarios = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        gestionRutas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mingcute--user-4-fill (1).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 250, 210));

        gestionHorarios.setBackground(new java.awt.Color(0, 0, 0));
        gestionHorarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionHorariosMouseClicked(evt);
            }
        });
        gestionHorarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gestión Horarios");
        gestionHorarios.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 36, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bx--calendar (1).png"))); // NOI18N
        gestionHorarios.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 36, -1, -1));

        jPanel2.add(gestionHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 420, 90));

        gestionTrenes.setBackground(new java.awt.Color(0, 0, 0));
        gestionTrenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionTrenesMouseClicked(evt);
            }
        });
        gestionTrenes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gestión Trenes");
        gestionTrenes.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 30, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/material-symbols--train-outline (1).png"))); // NOI18N
        gestionTrenes.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 27, -1, -1));

        jPanel2.add(gestionTrenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 420, 80));

        validarBoletos.setBackground(new java.awt.Color(0, 0, 0));
        validarBoletos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validarBoletosMouseClicked(evt);
            }
        });
        validarBoletos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Validar Boletos");
        validarBoletos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 38, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/material-symbols-light--transit-ticket-outline.png"))); // NOI18N
        validarBoletos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 35, -1, -1));

        jPanel2.add(validarBoletos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 420, 90));

        gestionUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        gestionUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionUsuariosMouseClicked(evt);
            }
        });
        gestionUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gestión Usuarios");
        gestionUsuarios.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 43, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gg--user.png"))); // NOI18N
        gestionUsuarios.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 43, -1, -1));

        jPanel2.add(gestionUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 850, 420, 100));

        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        jLabel8.setText("Cerrar Sesión");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(25, 25, 25))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 970, 210, 70));

        gestionRutas.setBackground(new java.awt.Color(0, 0, 0));
        gestionRutas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionRutasMouseClicked(evt);
            }
        });
        gestionRutas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gestión Rutas");
        gestionRutas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 39, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/game-icons--trail.png"))); // NOI18N
        gestionRutas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 36, -1, -1));

        jPanel2.add(gestionRutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 420, 90));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 420, 1090));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Roboto ExtraBold", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bienvenid@ {usuario}");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(507, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(499, 499, 499))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(104, 104, 104))
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 1500, 270));

        contentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 1510, 810));
        contentPanel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gestionRutasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionRutasMouseClicked
        ShowJPanel(new resumenRutasPanel());
        
       
      
    }//GEN-LAST:event_gestionRutasMouseClicked

    public static void ShowJPanel(JPanel p){
        staticContentPanel.removeAll();
        staticContentPanel.setLayout(new BorderLayout());
        staticContentPanel.add(p, BorderLayout.CENTER);
        staticContentPanel.revalidate();
        staticContentPanel.repaint();
    }
    private void gestionHorariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionHorariosMouseClicked
       ShowJPanel(new resumenHorariosPanel());
    }//GEN-LAST:event_gestionHorariosMouseClicked

    private void gestionTrenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionTrenesMouseClicked
      ShowJPanel(new resumenTrenesPanel());

    }//GEN-LAST:event_gestionTrenesMouseClicked

    private void validarBoletosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validarBoletosMouseClicked
      ShowJPanel(new validarBoleto());

        
    }//GEN-LAST:event_validarBoletosMouseClicked

    private void gestionUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionUsuariosMouseClicked

        Empleado usuario = Login.getUsuario();
        if(usuario==null){
            JOptionPane.showMessageDialog(this, "No hay sesion activa", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if("admin".equalsIgnoreCase(usuario.getTipo())){
           ShowJPanel(new resumenUsuarioPanel());

        } else{
            JOptionPane.showMessageDialog(this, "Se requieren permisos de admin", "Acceso denegado", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_gestionUsuariosMouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        logout();
    }//GEN-LAST:event_jPanel8MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dashboard dashboard= new Dashboard();
                dashboard.setExtendedState(MAXIMIZED_BOTH);
                dashboard.setVisible(true);
                
               
                
            }
        });
         
    }
    
      private void logout(){
         new Login().setVisible(true);
      }
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel gestionHorarios;
    private javax.swing.JPanel gestionRutas;
    private javax.swing.JPanel gestionTrenes;
    private javax.swing.JPanel gestionUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel validarBoletos;
    // End of variables declaration//GEN-END:variables
}
