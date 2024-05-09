package ngogrupp16;

import oru.inf.InfDB;
import oru.inf.InfException;


public class Inloggning extends javax.swing.JFrame {

    private InfDB idb;

    public Inloggning(InfDB idb) {
        this.idb = idb;
        initComponents();
        lblFelmeddelande.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEPost = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();
        tfEPost = new javax.swing.JTextField();
        tfLosenord = new javax.swing.JTextField();
        lblFelmeddelande = new javax.swing.JLabel();
        btnLoggaIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEPost.setText("E-Post");
        getContentPane().add(lblEPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, 20));

        lblLosenord.setText("Lösenord");
        getContentPane().add(lblLosenord, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        tfEPost.setText("@example.com");
        tfEPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEPostActionPerformed(evt);
            }
        });
        getContentPane().add(tfEPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 100, -1));

        tfLosenord.setText("password");
        tfLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLosenordActionPerformed(evt);
            }
        });
        getContentPane().add(tfLosenord, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 100, -1));

        lblFelmeddelande.setForeground(new java.awt.Color(255, 51, 51));
        lblFelmeddelande.setText("Felaktigt E-Post eller Lösenord");
        getContentPane().add(lblFelmeddelande, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 156, -1, 29));

        btnLoggaIn.setText("Logga in");
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoggaIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Epost rutan
    private void tfEPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEPostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEPostActionPerformed

    //Metod för vad som sker när logga in knappen executear
    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed
        String ePost = tfEPost.getText();
        String losen = tfLosenord.getText();
        
        try
        {
            String sqlFraga = "SELECT losenord FROM anstalld WHERE epost = '" + ePost + "'";
            String sqlFraga2 = "SELECT behorighetsniva FROM admin INNER JOIN anstalld ON admin.aid = anstalld.aid WHERE epost = '" + ePost + "'";
            String sqlFraga3 = "SELECT projektchef FROM projekt WHERE projektchef IN (SELECT aid FROM handlaggare WHERE aid IN (SELECT aid FROM anstalld WHERE epost = '" + ePost + "'))";
            String sqlFraga4 = "SELECT aid FROM anstalld WHERE epost = '" + ePost + "'";
            System.out.println(sqlFraga);
            System.out.println(sqlFraga2);
            System.out.println(sqlFraga3);
            System.out.println(sqlFraga4);
            String dbLosen = idb.fetchSingle(sqlFraga);
            String dbAdmin = idb.fetchSingle(sqlFraga2);
            String dbProjektledare = idb.fetchSingle(sqlFraga3);
            String dbAid = idb.fetchSingle(sqlFraga4);
            
            if(losen.equals(dbLosen) && dbAdmin != null)
            {
                new AdminMeny(idb, ePost).setVisible(true);
                this.setVisible(false);
            }
             else if(losen.equals(dbLosen) && dbAdmin == null && dbProjektledare == null)
            {
                new HandlaggareMeny(idb, ePost).setVisible(true);
                this.setVisible(false);
            }
             else if(losen.equals(dbLosen) &&  dbAdmin == null && dbProjektledare.equals(dbAid))
            {
                new ProjektledareMeny(idb, ePost).setVisible(true);
                this.setVisible(false);
            }
            else
            {
                lblFelmeddelande.setVisible(true);
            }
                    
        } catch (InfException ex)
        {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnLoggaInActionPerformed

   //Lösenordsrutan
    private void tfLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLosenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLosenordActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Inloggning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggaIn;
    private javax.swing.JLabel lblEPost;
    private javax.swing.JLabel lblFelmeddelande;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JTextField tfEPost;
    private javax.swing.JTextField tfLosenord;
    // End of variables declaration//GEN-END:variables
}
