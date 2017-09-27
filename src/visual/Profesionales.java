/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

/**
 *
 * @author Silvia
 */
public class Profesionales extends javax.swing.JFrame {

    public Profesionales() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("PROFESIONALES");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botMenuPrincipal = new javax.swing.JButton();
        botRegProf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botCxE = new javax.swing.JButton();
        botCxF = new javax.swing.JButton();
        botCxP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botMenuPrincipal.setText("VOLVER A MENU PRINCIPAL");
        botMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botMenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(botMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, -1, 30));

        botRegProf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botRegProf.setText("REGISTRO DE PROFESIONALES");
        botRegProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRegProfActionPerformed(evt);
            }
        });
        getContentPane().add(botRegProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 400, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/images (1).jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 110, 110));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("PROFESIONALES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 330, 60));

        botCxE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botCxE.setText("CONSULTA POR ESPECIALIDAD");
        botCxE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCxEActionPerformed(evt);
            }
        });
        getContentPane().add(botCxE, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 400, 50));

        botCxF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botCxF.setText("CONSULTA POR FECHA");
        botCxF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCxFActionPerformed(evt);
            }
        });
        getContentPane().add(botCxF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 400, 50));

        botCxP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botCxP.setText("CONSULTA POR PACIENTE");
        botCxP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCxPActionPerformed(evt);
            }
        });
        getContentPane().add(botCxP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 400, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/A-GUARDAPOLVO-MEDIC.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botRegProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRegProfActionPerformed
        
        ProfRegistro registroProf = new ProfRegistro();
        registroProf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botRegProfActionPerformed

    private void botMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botMenuPrincipalActionPerformed
       
       MenuPrincipal menu = new MenuPrincipal();
       menu.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_botMenuPrincipalActionPerformed

    private void botCxFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCxFActionPerformed
       
        ProfesionalesCxF cxfProfesional = new ProfesionalesCxF();
        cxfProfesional.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botCxFActionPerformed

    private void botCxPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCxPActionPerformed
       
        ProfesionalesCxP cxpProfesional = new ProfesionalesCxP();
        cxpProfesional.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botCxPActionPerformed

    private void botCxEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCxEActionPerformed
        
        ProfesionalesCxE cxeProfesional = new ProfesionalesCxE();
        cxeProfesional.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botCxEActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botCxE;
    private javax.swing.JButton botCxF;
    private javax.swing.JButton botCxP;
    private javax.swing.JButton botMenuPrincipal;
    private javax.swing.JButton botRegProf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
