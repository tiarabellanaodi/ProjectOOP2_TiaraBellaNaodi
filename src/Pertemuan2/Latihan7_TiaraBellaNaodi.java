/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

/**
 *
 * @author ThinkPad123
 */
import javax.swing.*;

public class Latihan7_TiaraBellaNaodi extends javax.swing.JFrame {

    /**
     * Creates new form Latihan7_TiaraBellaNaodi
     */
    public Latihan7_TiaraBellaNaodi() {
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

        btnProses = new javax.swing.JButton();
        btnPosisi = new javax.swing.JButton();
        btnMemotong = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PENGGUNAAN FUNGSI STRING");

        btnProses.setText("Proses");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });

        btnPosisi.setText("Cari Posisi");
        btnPosisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosisiActionPerformed(evt);
            }
        });

        btnMemotong.setText("Potong String");
        btnMemotong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemotongActionPerformed(evt);
            }
        });

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPosisi)
                    .addComponent(btnProses)
                    .addComponent(btnMemotong))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnProses)
                        .addGap(18, 18, 18)
                        .addComponent(btnPosisi)
                        .addGap(28, 28, 28)
                        .addComponent(btnMemotong))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        String hasil =""; String s="BANDUNG";
        int n=s.length();
        for(int i=0;i<n;i++) 
        {
            hasil  += "karakter ke-"+i+" = "+s.charAt(i)+"\n";
        }
        ta.setText("");
        ta.append(""+hasil); // TODO add your handling code here:
    }//GEN-LAST:event_btnProsesActionPerformed

    private void btnPosisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosisiActionPerformed
        String s="BANDUNG"; 
        String s1="AN";
        String s2="UNG"; 
        ta.setText(""); 
        ta.append("String :"+s+"\n"); 
        ta.append("string "+s1+" diposisi= "+s.indexOf(s1)+"\n"); 
        ta.append("string "+s2+" diposisi= "+s.indexOf(s2)+"\n");
   // TODO add your handling code here:
    }//GEN-LAST:event_btnPosisiActionPerformed

    private void btnMemotongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemotongActionPerformed
        String hasil =""; 
        String s="BANDUNG"; 
        System.out.println("string s="+s); 
        for(int i=0;i<s.length();i++) 
        { 
            hasil  += "s.substring("+i+")="+s.substring(i)+"\n"; 
        }
        ta.setText(""); ta.append(""+hasil); // TODO add your handling code here:
    }//GEN-LAST:event_btnMemotongActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan7_TiaraBellaNaodi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan7_TiaraBellaNaodi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan7_TiaraBellaNaodi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan7_TiaraBellaNaodi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan7_TiaraBellaNaodi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMemotong;
    private javax.swing.JButton btnPosisi;
    private javax.swing.JButton btnProses;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}
