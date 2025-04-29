/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ModuloInterfazUsuario;

import ModuloModelos.Empleado;
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
        staticContentPanel= contentPanel;
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel5.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gestión Horarios");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bx--calendar (1).png"))); // NOI18N

        javax.swing.GroupLayout gestionHorariosLayout = new javax.swing.GroupLayout(gestionHorarios);
        gestionHorarios.setLayout(gestionHorariosLayout);
        gestionHorariosLayout.setHorizontalGroup(
            gestionHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionHorariosLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(148, 148, 148))
        );
        gestionHorariosLayout.setVerticalGroup(
            gestionHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionHorariosLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(gestionHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32))
        );

        jPanel2.add(gestionHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, -1, -1));

        gestionTrenes.setBackground(new java.awt.Color(0, 0, 0));
        gestionTrenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionTrenesMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gestión Trenes");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/material-symbols--train-outline (1).png"))); // NOI18N

        javax.swing.GroupLayout gestionTrenesLayout = new javax.swing.GroupLayout(gestionTrenes);
        gestionTrenes.setLayout(gestionTrenesLayout);
        gestionTrenesLayout.setHorizontalGroup(
            gestionTrenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionTrenesLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        gestionTrenesLayout.setVerticalGroup(
            gestionTrenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionTrenesLayout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(gestionTrenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11))
                .addGap(41, 41, 41))
        );

        jPanel2.add(gestionTrenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 420, -1));

        validarBoletos.setBackground(new java.awt.Color(0, 0, 0));
        validarBoletos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validarBoletosMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Validar Boletos");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/material-symbols-light--transit-ticket-outline.png"))); // NOI18N

        javax.swing.GroupLayout validarBoletosLayout = new javax.swing.GroupLayout(validarBoletos);
        validarBoletos.setLayout(validarBoletosLayout);
        validarBoletosLayout.setHorizontalGroup(
            validarBoletosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(validarBoletosLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        validarBoletosLayout.setVerticalGroup(
            validarBoletosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, validarBoletosLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(validarBoletosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel7))
                .addGap(33, 33, 33))
        );

        jPanel2.add(validarBoletos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 420, -1));

        gestionUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        gestionUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionUsuariosMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gestión Usuarios");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gg--user.png"))); // NOI18N

        javax.swing.GroupLayout gestionUsuariosLayout = new javax.swing.GroupLayout(gestionUsuarios);
        gestionUsuarios.setLayout(gestionUsuariosLayout);
        gestionUsuariosLayout.setHorizontalGroup(
            gestionUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionUsuariosLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        gestionUsuariosLayout.setVerticalGroup(
            gestionUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionUsuariosLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(gestionUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addGap(25, 25, 25))
        );

        jPanel2.add(gestionUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 850, 420, -1));

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

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 990, 210, 70));

        gestionRutas.setBackground(new java.awt.Color(0, 0, 0));
        gestionRutas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionRutasMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gestión Rutas");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/game-icons--trail.png"))); // NOI18N

        javax.swing.GroupLayout gestionRutasLayout = new javax.swing.GroupLayout(gestionRutas);
        gestionRutas.setLayout(gestionRutasLayout);
        gestionRutasLayout.setHorizontalGroup(
            gestionRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionRutasLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        gestionRutasLayout.setVerticalGroup(
            gestionRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionRutasLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(gestionRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35))
        );

        jPanel2.add(gestionRutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 420, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 420, 1090));

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

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 1500, 270));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1510, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );

        jPanel1.add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 1510, 820));
        contentPanel.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

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
        showHorariosPanel();
    }//GEN-LAST:event_gestionHorariosMouseClicked

    private void gestionTrenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionTrenesMouseClicked
        showTrenesPanel();
    }//GEN-LAST:event_gestionTrenesMouseClicked

    private void validarBoletosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validarBoletosMouseClicked
        showBoletosPanel();
        
    }//GEN-LAST:event_validarBoletosMouseClicked

    private void gestionUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionUsuariosMouseClicked

        Empleado usuario = Login.getUsuario();
        if(usuario==null){
            JOptionPane.showMessageDialog(this, "No hay sesion activa", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if("admin".equalsIgnoreCase(usuario.getTipo())){
            showUsuariosPanel();
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
                dashboard.setVisible(true);
                
               
                
            }
        });
         
    }
    private void showRutasPanel(){
        
    }
    private void showHorariosPanel(){
        contentPanel.removeAll();
        contentPanel.add(new resumenHorariosPanel(), BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }
     private void showTrenesPanel(){
        contentPanel.removeAll();
         contentPanel.add(new resumenTrenesPanel(), BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }
      private void showUsuariosPanel(){
        contentPanel.removeAll();
        contentPanel.add(new resumenUsuarioPanel(), BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }
       private void showBoletosPanel(){
        contentPanel.removeAll();
        contentPanel.add(new validarBoleto(), BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }
      private void logout(){
         new Login().setVisible(true);
      }
      private void showagregarRutasPanel(){
          
          if(resumenRutasPanel.isNuevo()){
        contentPanel.removeAll();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.add(new agregarrutaPanel(), BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
          }
        
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel validarBoletos;
    // End of variables declaration//GEN-END:variables
}
