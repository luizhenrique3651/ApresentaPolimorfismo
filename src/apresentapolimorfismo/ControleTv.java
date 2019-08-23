/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentapolimorfismo;

/**
 *
 * @author luiz
 */
public class ControleTv extends javax.swing.JFrame  {
    ModeloTV001 tv1 = new ModeloTV001(21);
    int contador;
    
    public ControleTv() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLigaDesliga = new javax.swing.JButton();
        btnCanalMais = new javax.swing.JButton();
        btnCanalMenos = new javax.swing.JButton();
        btnVolumeMais = new javax.swing.JButton();
        btnVolumeMenos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLigaDesliga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ligaIcon.png"))); // NOI18N
        btnLigaDesliga.setBorder(null);
        btnLigaDesliga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigaDesligaActionPerformed(evt);
            }
        });

        btnCanalMais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/canalMais.png"))); // NOI18N
        btnCanalMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanalMaisActionPerformed(evt);
            }
        });

        btnCanalMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/canalMenos.png"))); // NOI18N
        btnCanalMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanalMenosActionPerformed(evt);
            }
        });

        btnVolumeMais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/volumeMais.png"))); // NOI18N
        btnVolumeMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolumeMaisActionPerformed(evt);
            }
        });

        btnVolumeMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/volumeMenos.png"))); // NOI18N
        btnVolumeMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolumeMenosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCanalMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCanalMais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolumeMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolumeMais, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLigaDesliga, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnLigaDesliga, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVolumeMais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCanalMais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCanalMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolumeMenos))
                .addGap(120, 120, 120))
        );

        setSize(new java.awt.Dimension(231, 438));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnCanalMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanalMaisActionPerformed
       
        tv1.passarCanal();
        
    }//GEN-LAST:event_btnCanalMaisActionPerformed

    private void btnLigaDesligaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigaDesligaActionPerformed

       contador++;
          if(contador==1){
       tv1.ligar();
          }
       if(contador==2){
       contador = 0;
       tv1.desligar();
       
       }    }//GEN-LAST:event_btnLigaDesligaActionPerformed

    private void btnCanalMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanalMenosActionPerformed
       
        tv1.voltarCanal();
    }//GEN-LAST:event_btnCanalMenosActionPerformed

    private void btnVolumeMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolumeMaisActionPerformed
        tv1.aumentarVolume();
    }//GEN-LAST:event_btnVolumeMaisActionPerformed

    private void btnVolumeMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolumeMenosActionPerformed
        tv1.diminuirVolume();
    }//GEN-LAST:event_btnVolumeMenosActionPerformed

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
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ControleTv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleTv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleTv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleTv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleTv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCanalMais;
    private javax.swing.JButton btnCanalMenos;
    private javax.swing.JButton btnLigaDesliga;
    private javax.swing.JButton btnVolumeMais;
    private javax.swing.JButton btnVolumeMenos;
    // End of variables declaration//GEN-END:variables
}
