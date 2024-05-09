package ngogrupp16;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.*;
import javax.swing.*;

public class ProjektledareMeny extends javax.swing.JFrame {

    private InfDB idb;
    private String inloggadAnvandare;    
    
    public ProjektledareMeny(InfDB idb, String inloggadAnvandare) {
        this.idb = idb;
        this.inloggadAnvandare = inloggadAnvandare;
        initComponents();
        lblInloggadAnvandare.setText(inloggadAnvandare);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHandlaggare = new javax.swing.JLabel();
        lblInloggadAnvandare = new javax.swing.JLabel();
        btnAndraMinaUppgifter = new javax.swing.JButton();
        btnMinaProjekt = new javax.swing.JButton();
        btnMinaUppgifter = new javax.swing.JButton();
        btnHallbarhetsmal = new javax.swing.JButton();
        btnPersonalPaAvdelning = new javax.swing.JButton();
        btnProjektPaMinAvdelningStatus = new javax.swing.JButton();
        btnPartnerPaMinaProjekt = new javax.swing.JButton();
        btnSokHandlaggare = new javax.swing.JButton();
        btnSokProjektDatum = new javax.swing.JButton();
        btnProjektPaMinAvdelning = new javax.swing.JButton();
        btnAndraProjektUppgifter = new javax.swing.JButton();
        btnTaBortPartner = new javax.swing.JButton();
        btnLaggTillHandlaggare = new javax.swing.JButton();
        btnTaBortHandläggare = new javax.swing.JButton();
        btnStatistik = new javax.swing.JButton();
        btnLaggTillPartner = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHandlaggare.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHandlaggare.setText("PROJEKTCHEF");
        getContentPane().add(lblHandlaggare, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 242, 41));

        lblInloggadAnvandare.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInloggadAnvandare.setText("Användare");
        getContentPane().add(lblInloggadAnvandare, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 175, 39));

        btnAndraMinaUppgifter.setText("Ändra mina uppgifter");
        btnAndraMinaUppgifter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraMinaUppgifterActionPerformed(evt);
            }
        });
        getContentPane().add(btnAndraMinaUppgifter, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        btnMinaProjekt.setText("Mina Projekt");
        btnMinaProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinaProjektActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinaProjekt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        btnMinaUppgifter.setText("Mina Uppgifter");
        btnMinaUppgifter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinaUppgifterActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinaUppgifter, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        btnHallbarhetsmal.setText("Hållbarhetsmålen");
        btnHallbarhetsmal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHallbarhetsmalActionPerformed(evt);
            }
        });
        getContentPane().add(btnHallbarhetsmal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        btnPersonalPaAvdelning.setText("Personal på min avdelning");
        btnPersonalPaAvdelning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonalPaAvdelningActionPerformed(evt);
            }
        });
        getContentPane().add(btnPersonalPaAvdelning, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        btnProjektPaMinAvdelningStatus.setText("Projekt på min avdelning efter status");
        btnProjektPaMinAvdelningStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProjektPaMinAvdelningStatusActionPerformed(evt);
            }
        });
        getContentPane().add(btnProjektPaMinAvdelningStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        btnPartnerPaMinaProjekt.setText("Partners på mina projekt");
        btnPartnerPaMinaProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartnerPaMinaProjektActionPerformed(evt);
            }
        });
        getContentPane().add(btnPartnerPaMinaProjekt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, 20));

        btnSokHandlaggare.setText("Sök handläggare");
        btnSokHandlaggare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokHandlaggareActionPerformed(evt);
            }
        });
        getContentPane().add(btnSokHandlaggare, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        btnSokProjektDatum.setText("Sök projekt på datum");
        btnSokProjektDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokProjektDatumActionPerformed(evt);
            }
        });
        getContentPane().add(btnSokProjektDatum, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        btnProjektPaMinAvdelning.setText("Projekt på min avdelning");
        btnProjektPaMinAvdelning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProjektPaMinAvdelningActionPerformed(evt);
            }
        });
        getContentPane().add(btnProjektPaMinAvdelning, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        btnAndraProjektUppgifter.setText("Ändra uppgifter för mina projekt");
        btnAndraProjektUppgifter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraProjektUppgifterActionPerformed(evt);
            }
        });
        getContentPane().add(btnAndraProjektUppgifter, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, -1));

        btnTaBortPartner.setText("Ta bort partner");
        btnTaBortPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortPartnerActionPerformed(evt);
            }
        });
        getContentPane().add(btnTaBortPartner, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, -1, -1));

        btnLaggTillHandlaggare.setText("Lägg till handläggare");
        btnLaggTillHandlaggare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillHandlaggareActionPerformed(evt);
            }
        });
        getContentPane().add(btnLaggTillHandlaggare, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        btnTaBortHandläggare.setText("Ta bort handläggare");
        btnTaBortHandläggare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortHandläggareActionPerformed(evt);
            }
        });
        getContentPane().add(btnTaBortHandläggare, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        btnStatistik.setText("Statistik för projektkostnader");
        btnStatistik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatistikActionPerformed(evt);
            }
        });
        getContentPane().add(btnStatistik, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        btnLaggTillPartner.setText("Lägg till partner");
        btnLaggTillPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillPartnerActionPerformed(evt);
            }
        });
        getContentPane().add(btnLaggTillPartner, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Ändrar projektledarens egna uppgifter utifrån epost
    private void btnAndraMinaUppgifterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraMinaUppgifterActionPerformed
        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        JTextField textField3 = new JTextField();
        JTextField textField4 = new JTextField();
        JTextField textField5 = new JTextField();
        JTextField textField6 = new JTextField();
        JTextField textField7 = new JTextField();
        JTextField textField8 = new JTextField();
        JTextField textField9 = new JTextField();

        JComponent[] components = new JComponent[]{
            new JLabel("Ange förnamn"),
            textField2,
            new JLabel("Ange efternamn"),
            textField3,
            new JLabel("Ange adress"),
            textField4,
            new JLabel("Ange telefon"),
            textField6,
            new JLabel("Ange anställningsdatum (xxxx-xx-xx)"),
            textField7,
            new JLabel("Ange lösenord"),
            textField8,
            new JLabel("Ange avdelning (1-3)"),
            textField9,
        };

        int result = JOptionPane.showConfirmDialog(null, components, "Ange värden", JOptionPane.OK_CANCEL_OPTION);

        if(Validering.textHarFelVarde(textField1) && Validering.textHarFelVarde(textField2) && Validering.textHarFelVarde(textField3) && Validering.textHarFelVarde(textField4) && Validering.textHarFelVarde(textField5) && Validering.textHarFelVarde(textField6) && Validering.textHarFelVarde(textField7) && Validering.textHarFelVarde(textField8) && Validering.textHarFelVarde(textField9))
           {
        
        try
        {
            if(result == JOptionPane.OK_OPTION)
            {
                String fornamn = textField2.getText();
                String efternamn = textField3.getText();
                String adress = textField4.getText();
                String telefon = textField6.getText();
                String anstallningsdatum = textField7.getText();
                String losenord = textField8.getText();
                String avdelning = textField9.getText();
                String sqlFraga = "UPDATE anstalld SET fornamn = '" + fornamn +"', efternamn = '"+efternamn+"', adress = '"+ adress +"', telefon = '"+telefon +"', anstallningsdatum = '" +anstallningsdatum +"', losenord = '" + losenord +"', avdelning = '"+ avdelning +"' WHERE epost = '" + inloggadAnvandare+"'";

                System.out.println(fornamn);
                System.out.println(efternamn);
                System.out.println(adress);
                System.out.println(telefon);
                System.out.println(anstallningsdatum);
                System.out.println(losenord);
                System.out.println(avdelning);
                System.out.println(inloggadAnvandare);

                idb.update(sqlFraga);

                System.out.println("Anställd: " + fornamn + " har ändrats");
                JOptionPane.showMessageDialog(this, "Anställd: " + fornamn + " har ändrats");

            }

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
           }
    }//GEN-LAST:event_btnAndraMinaUppgifterActionPerformed

    //Visar alla projekt tilldelade till den inloggade projektledaren
    private void btnMinaProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinaProjektActionPerformed
        try
        {
            String sqlFraga = "SELECT pid FROM projekt WHERE pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "'))";
            String sqlFraga2 = "SELECT projektnamn FROM projekt WHERE pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "'))";
            String sqlFraga3 = "SELECT beskrivning FROM projekt WHERE pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "'))";
            String sqlFraga4 = "SELECT startdatum FROM projekt WHERE pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "'))";
            String sqlFraga5 = "SELECT slutdatum FROM projekt WHERE pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "'))";
            String sqlFraga6 = "SELECT kostnad FROM projekt WHERE pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "'))";
            String sqlFraga7 = "SELECT status FROM projekt WHERE pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "'))";
            String sqlFraga8 = "SELECT prioritet FROM projekt WHERE pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "'))";
            String sqlFraga9 = "SELECT projektchef FROM projekt WHERE pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "'))";
            String sqlFraga10 = "SELECT land FROM projekt WHERE pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "'))";

            System.out.println(sqlFraga);
            System.out.println(sqlFraga2);
            System.out.println(sqlFraga3);
            System.out.println(sqlFraga4);
            System.out.println(sqlFraga5);
            System.out.println(sqlFraga6);
            System.out.println(sqlFraga7);
            System.out.println(sqlFraga8);
            System.out.println(sqlFraga9);
            System.out.println(sqlFraga10);

            ArrayList<HashMap<String,String>> minaProjektList = idb.fetchRows(sqlFraga);
            ArrayList<HashMap<String,String>> minaProjektList2 = idb.fetchRows(sqlFraga2);
            ArrayList<HashMap<String,String>> minaProjektList3 = idb.fetchRows(sqlFraga3);
            ArrayList<HashMap<String,String>> minaProjektList4 = idb.fetchRows(sqlFraga4);
            ArrayList<HashMap<String,String>> minaProjektList5 = idb.fetchRows(sqlFraga5);
            ArrayList<HashMap<String,String>> minaProjektList6 = idb.fetchRows(sqlFraga6);
            ArrayList<HashMap<String,String>> minaProjektList7 = idb.fetchRows(sqlFraga7);
            ArrayList<HashMap<String,String>> minaProjektList8 = idb.fetchRows(sqlFraga8);
            ArrayList<HashMap<String,String>> minaProjektList9 = idb.fetchRows(sqlFraga9);
            ArrayList<HashMap<String,String>> minaProjektList10 = idb.fetchRows(sqlFraga10);

            JOptionPane.showMessageDialog(this, minaProjektList);
            JOptionPane.showMessageDialog(this, minaProjektList2);
            JOptionPane.showMessageDialog(this, minaProjektList3);
            JOptionPane.showMessageDialog(this, minaProjektList4);
            JOptionPane.showMessageDialog(this, minaProjektList5);
            JOptionPane.showMessageDialog(this, minaProjektList6);
            JOptionPane.showMessageDialog(this, minaProjektList7);
            JOptionPane.showMessageDialog(this, minaProjektList8);
            JOptionPane.showMessageDialog(this, minaProjektList9);
            JOptionPane.showMessageDialog(this, minaProjektList10);

        }
        catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnMinaProjektActionPerformed

    //Visar projekt på samma avdelning utifrån valt status
    private void btnProjektPaMinAvdelningStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProjektPaMinAvdelningStatusActionPerformed

        JTextField textField1 = new JTextField();
        JComponent[] components = new JComponent[]{
            new JLabel("Status: (Pågående, Planerat eller Avslutat)"),
            textField1,
        };

        int result = JOptionPane.showConfirmDialog(null, components, "Ange värden", JOptionPane.OK_CANCEL_OPTION);

        if(Validering.textHarFelVarde(textField1))
        {
        
        try
        {
            if(result == JOptionPane.OK_OPTION) {

                String statusSvar = textField1.getText();

                if(statusSvar.equals("Pågående") || statusSvar.equals("pågående"))
                {
                    String sqlFraga = "SELECT projektnamn FROM projekt WHERE status = 'Pågående' AND pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE avdelning IN (SELECT avdelning FROM anstalld WHERE epost = '" + inloggadAnvandare + "')))";
                    System.out.println(sqlFraga);
                    ArrayList<HashMap<String,String>> projektPaAvdelningList = idb.fetchRows(sqlFraga);
                    JOptionPane.showMessageDialog(this, projektPaAvdelningList);
                }
                else if(statusSvar.equals("Planerat") || statusSvar.equals("planerat"))
                {
                    String sqlFraga = "SELECT projektnamn FROM projekt WHERE status = 'Planerat' AND pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE avdelning IN (SELECT avdelning FROM anstalld WHERE epost = '" + inloggadAnvandare + "')))";
                    System.out.println(sqlFraga);
                    ArrayList<HashMap<String,String>> projektPaAvdelning2List = idb.fetchRows(sqlFraga);
                    JOptionPane.showMessageDialog(this, projektPaAvdelning2List);
                }
                else if(statusSvar.equals("Avslutat") || statusSvar.equals("avslutat"))
                {
                    String sqlFraga = "SELECT projektnamn FROM projekt WHERE status = 'Avslutat' AND pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE avdelning IN (SELECT avdelning FROM anstalld WHERE epost = '" + inloggadAnvandare + "')))";
                    System.out.println(sqlFraga);
                    ArrayList<HashMap<String,String>> projektPaAvdelning3List = idb.fetchRows(sqlFraga);
                    JOptionPane.showMessageDialog(this, projektPaAvdelning3List);
                }
                else
                {
                    System.out.println("Testa igen");
                }

            }
        }
        catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
        }
    }//GEN-LAST:event_btnProjektPaMinAvdelningStatusActionPerformed

    //Visar partners på projektledarens egna projekt
    private void btnPartnerPaMinaProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartnerPaMinaProjektActionPerformed
        try
        {
            String sqlFraga = "SELECT kontaktperson FROM partner WHERE pid IN (SELECT partner_pid FROM projekt_partner WHERE pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE avdelning IN (SELECT avdelning FROM anstalld WHERE epost = '" + inloggadAnvandare + "'))))";
            System.out.println(sqlFraga);
            ArrayList<HashMap<String,String>> partnersPaProjektList = idb.fetchRows(sqlFraga);
            JOptionPane.showMessageDialog(this, partnersPaProjektList);
        }
        catch (InfException ex) {
              System.out.println(ex.getMessage());
          }
    }//GEN-LAST:event_btnPartnerPaMinaProjektActionPerformed

    //Listar alla hållbarhetsmål
    private void btnHallbarhetsmalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHallbarhetsmalActionPerformed

        try
        {
            String sqlFraga = "SELECT namn FROM hallbarhetsmal";
            System.out.println(sqlFraga);
            ArrayList<HashMap<String,String>> hallbarhetsmalList = idb.fetchRows(sqlFraga);
            JOptionPane.showMessageDialog(this, hallbarhetsmalList);
        }
        catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnHallbarhetsmalActionPerformed

    //Personal på samma avdelning som projektledaren
    private void btnPersonalPaAvdelningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalPaAvdelningActionPerformed

        try
        {
            String sqlFraga = "SELECT fornamn FROM anstalld WHERE avdelning in (SELECT avdelning FROM anstalld WHERE epost = '" + inloggadAnvandare + "')";
            System.out.println(sqlFraga);
            ArrayList<HashMap<String,String>> personalPaAvdelningList = idb.fetchRows(sqlFraga);
            JOptionPane.showMessageDialog(this, personalPaAvdelningList);
        }
        catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnPersonalPaAvdelningActionPerformed

    //Visar projektledarens egna uppgifter
    private void btnMinaUppgifterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinaUppgifterActionPerformed
        try
        {
            String sqlFraga = "SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare +"'";
            String sqlFraga2 = "SELECT fornamn FROM anstalld WHERE epost = '" + inloggadAnvandare +"'";
            String sqlFraga3 = "SELECT efternamn FROM anstalld WHERE epost = '" + inloggadAnvandare +"'";
            String sqlFraga4 = "SELECT adress FROM anstalld WHERE epost = '" + inloggadAnvandare +"'";
            String sqlFraga5 = "SELECT epost FROM anstalld WHERE epost = '" + inloggadAnvandare +"'";
            String sqlFraga6 = "SELECT telefon FROM anstalld WHERE epost = '" + inloggadAnvandare +"'";
            String sqlFraga7 = "SELECT anstallningsdatum FROM anstalld WHERE epost = '" + inloggadAnvandare +"'";
            String sqlFraga8 = "SELECT losenord FROM anstalld WHERE epost = '" + inloggadAnvandare +"'";
            String sqlFraga9 = "SELECT avdelning FROM anstalld WHERE epost = '" + inloggadAnvandare +"'";

            System.out.println(sqlFraga);
            System.out.println(sqlFraga2);
            System.out.println(sqlFraga3);
            System.out.println(sqlFraga4);
            System.out.println(sqlFraga5);
            System.out.println(sqlFraga6);
            System.out.println(sqlFraga7);
            System.out.println(sqlFraga8);
            System.out.println(sqlFraga9);

            ArrayList<HashMap<String,String>> MinaUppgifterList = idb.fetchRows(sqlFraga);
            ArrayList<HashMap<String,String>> MinaUppgifterList2 = idb.fetchRows(sqlFraga2);
            ArrayList<HashMap<String,String>> MinaUppgifterList3 = idb.fetchRows(sqlFraga3);
            ArrayList<HashMap<String,String>> MinaUppgifterList4 = idb.fetchRows(sqlFraga4);
            ArrayList<HashMap<String,String>> MinaUppgifterList5 = idb.fetchRows(sqlFraga5);
            ArrayList<HashMap<String,String>> MinaUppgifterList6 = idb.fetchRows(sqlFraga6);
            ArrayList<HashMap<String,String>> MinaUppgifterList7 = idb.fetchRows(sqlFraga7);
            ArrayList<HashMap<String,String>> MinaUppgifterList8 = idb.fetchRows(sqlFraga8);
            ArrayList<HashMap<String,String>> MinaUppgifterList9 = idb.fetchRows(sqlFraga9);

            JOptionPane.showMessageDialog(this, MinaUppgifterList);
            JOptionPane.showMessageDialog(this, MinaUppgifterList2);
            JOptionPane.showMessageDialog(this, MinaUppgifterList3);
            JOptionPane.showMessageDialog(this, MinaUppgifterList4);
            JOptionPane.showMessageDialog(this, MinaUppgifterList5);
            JOptionPane.showMessageDialog(this, MinaUppgifterList6);
            JOptionPane.showMessageDialog(this, MinaUppgifterList7);
            JOptionPane.showMessageDialog(this, MinaUppgifterList8);
            JOptionPane.showMessageDialog(this, MinaUppgifterList9);

        }
        catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnMinaUppgifterActionPerformed

    //Sökfunktion för att få fram handläggares aid, förnamn, ansvarighetsområde utifrån sökt epost
    private void btnSokHandlaggareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokHandlaggareActionPerformed
        JTextField textField1 = new JTextField();

        JComponent[] components = new JComponent[]{
            new JLabel("Ange handläggarens epost:"),
            textField1,
        };

        int result = JOptionPane.showConfirmDialog(null, components, "Ange epost", JOptionPane.OK_CANCEL_OPTION);

        if(Validering.textHarFelVarde(textField1))
        {
        
        try
        {
            if(result == JOptionPane.OK_OPTION)
            {

                String epost = textField1.getText();

                String sqlFraga = "SELECT aid FROM handlaggare WHERE aid IN (SELECT aid FROM anstalld WHERE epost = '" + epost + "')";
                String sqlFraga2 = "SELECT fornamn FROM anstalld WHERE epost = '" + epost + "'";
                String sqlFraga3 = "SELECT ansvarighetsomrade FROM handlaggare WHERE aid IN (SELECT aid FROM anstalld WHERE epost = '" + epost + "')";

                System.out.println(sqlFraga);
                System.out.println(sqlFraga2);
                System.out.println(sqlFraga3);

                ArrayList<HashMap<String,String>> sokHandlaggareList = idb.fetchRows(sqlFraga);
                ArrayList<HashMap<String,String>> sokHandlaggareList2 = idb.fetchRows(sqlFraga2);
                ArrayList<HashMap<String,String>> sokHandlaggareList3 = idb.fetchRows(sqlFraga3);

                JOptionPane.showMessageDialog(this, sokHandlaggareList);
                JOptionPane.showMessageDialog(this, sokHandlaggareList2);
                JOptionPane.showMessageDialog(this, sokHandlaggareList3);

            }
        }
        catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
        }
    }//GEN-LAST:event_btnSokHandlaggareActionPerformed

    //sök projekt utifrån valt datumintervall
    private void btnSokProjektDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokProjektDatumActionPerformed

        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();

        JComponent[] components = new JComponent[]{
            new JLabel("Ange startdatum (xxxx-xx-xx)"),
            textField1,
            new JLabel("Ange slutdatum"),
            textField2,
        };

        int result = JOptionPane.showConfirmDialog(null, components, "Ange datum", JOptionPane.OK_CANCEL_OPTION);

        if(Validering.textHarFelVarde(textField1) && Validering.textHarFelVarde(textField2))
        {
        
        try
        {
            if(result == JOptionPane.OK_OPTION)
            {
                String startdatum = textField1.getText();
                String slutdatum = textField2.getText();
                String sqlFraga = "SELECT projektnamn FROM projekt WHERE startdatum >= '" + startdatum + "' AND slutdatum <= '" + slutdatum + "' AND status = 'Pågående' AND pid IN (SELECT PID FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE avdelning IN(SELECT avdelning FROM anstalld WHERE epost = '" + inloggadAnvandare + "')))";

                System.out.println(sqlFraga);
                ArrayList<HashMap<String,String>> projektPaAvdelningList = idb.fetchRows(sqlFraga);
                JOptionPane.showMessageDialog(this, projektPaAvdelningList);

            }
        }
        catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
        }
    }//GEN-LAST:event_btnSokProjektDatumActionPerformed

    //Projekt på samma avdelning som projektledaren
    private void btnProjektPaMinAvdelningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProjektPaMinAvdelningActionPerformed

        try
        {
            String sqlFraga = "SELECT pid FROM projekt WHERE pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE avdelning IN (SELECT avdelning FROM anstalld WHERE epost = '" + inloggadAnvandare + "')))";
            String sqlFraga2 = "SELECT projektnamn FROM projekt WHERE pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE avdelning IN (SELECT avdelning FROM anstalld WHERE epost = '" + inloggadAnvandare + "')))";
            String sqlFraga3 = "SELECT beskrivning FROM projekt WHERE pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE avdelning IN (SELECT avdelning FROM anstalld WHERE epost = '" + inloggadAnvandare + "')))";
            String sqlFraga4 = "SELECT startdatum FROM projekt WHERE pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE avdelning IN (SELECT avdelning FROM anstalld WHERE epost = '" + inloggadAnvandare + "')))";
            String sqlFraga5 = "SELECT slutdatum FROM projekt WHERE pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE avdelning IN (SELECT avdelning FROM anstalld WHERE epost = '" + inloggadAnvandare + "')))";
            String sqlFraga6 = "SELECT kostnad FROM projekt WHERE pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE avdelning IN (SELECT avdelning FROM anstalld WHERE epost = '" + inloggadAnvandare + "')))";
            String sqlFraga7 = "SELECT status FROM projekt WHERE pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE avdelning IN (SELECT avdelning FROM anstalld WHERE epost = '" + inloggadAnvandare + "')))";
            String sqlFraga8 = "SELECT prioritet FROM projekt WHERE pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE avdelning IN (SELECT avdelning FROM anstalld WHERE epost = '" + inloggadAnvandare + "')))";
            String sqlFraga9 = "SELECT projektchef FROM projekt WHERE pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE avdelning IN (SELECT avdelning FROM anstalld WHERE epost = '" + inloggadAnvandare + "')))";
            String sqlFraga10 = "SELECT land FROM projekt WHERE pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE avdelning IN (SELECT avdelning FROM anstalld WHERE epost = '" + inloggadAnvandare + "')))";

            System.out.println(sqlFraga);
            System.out.println(sqlFraga2);
            System.out.println(sqlFraga3);
            System.out.println(sqlFraga4);
            System.out.println(sqlFraga5);
            System.out.println(sqlFraga6);
            System.out.println(sqlFraga7);
            System.out.println(sqlFraga8);
            System.out.println(sqlFraga9);
            System.out.println(sqlFraga10);

            ArrayList<HashMap<String,String>> projektPaMinAvdelningList = idb.fetchRows(sqlFraga);
            ArrayList<HashMap<String,String>> projektPaMinAvdelningList2 = idb.fetchRows(sqlFraga2);
            ArrayList<HashMap<String,String>> projektPaMinAvdelningList3 = idb.fetchRows(sqlFraga3);
            ArrayList<HashMap<String,String>> projektPaMinAvdelningList4 = idb.fetchRows(sqlFraga4);
            ArrayList<HashMap<String,String>> projektPaMinAvdelningList5 = idb.fetchRows(sqlFraga5);
            ArrayList<HashMap<String,String>> projektPaMinAvdelningList6 = idb.fetchRows(sqlFraga6);
            ArrayList<HashMap<String,String>> projektPaMinAvdelningList7 = idb.fetchRows(sqlFraga7);
            ArrayList<HashMap<String,String>> projektPaMinAvdelningList8 = idb.fetchRows(sqlFraga8);
            ArrayList<HashMap<String,String>> projektPaMinAvdelningList9 = idb.fetchRows(sqlFraga9);
            ArrayList<HashMap<String,String>> projektPaMinAvdelningList10 = idb.fetchRows(sqlFraga10);

            JOptionPane.showMessageDialog(this, projektPaMinAvdelningList);
            JOptionPane.showMessageDialog(this, projektPaMinAvdelningList2);
            JOptionPane.showMessageDialog(this, projektPaMinAvdelningList3);
            JOptionPane.showMessageDialog(this, projektPaMinAvdelningList4);
            JOptionPane.showMessageDialog(this, projektPaMinAvdelningList5);
            JOptionPane.showMessageDialog(this, projektPaMinAvdelningList6);
            JOptionPane.showMessageDialog(this, projektPaMinAvdelningList7);
            JOptionPane.showMessageDialog(this, projektPaMinAvdelningList8);
            JOptionPane.showMessageDialog(this, projektPaMinAvdelningList9);
            JOptionPane.showMessageDialog(this, projektPaMinAvdelningList10);

        }
        catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnProjektPaMinAvdelningActionPerformed

    //Visar statistik för totalkostnader för projektledarens alla projekt
    private void btnStatistikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatistikActionPerformed
 try
        {
            String sqlFraga = "SELECT SUM(kostnad) AS totalkostnader FROM projekt JOIN ans_proj ON projekt.pid = ans_proj.pid JOIN anstalld ON ans_proj.aid = anstalld.aid WHERE epost = '" + inloggadAnvandare + "'";
            System.out.println(sqlFraga);
            ArrayList<HashMap<String,String>> totalKostnadList = idb.fetchRows(sqlFraga);
            JOptionPane.showMessageDialog(this, totalKostnadList);
        }
        catch (InfException ex) {
            System.out.println(ex.getMessage());
        }        
    }//GEN-LAST:event_btnStatistikActionPerformed

    //Ändrar projektuppgifterna utifrån pid
    private void btnAndraProjektUppgifterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraProjektUppgifterActionPerformed

        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        JTextField textField3 = new JTextField();
        JTextField textField4 = new JTextField();
        JTextField textField5 = new JTextField();
        JTextField textField6 = new JTextField();
        JTextField textField7 = new JTextField();
        JTextField textField8 = new JTextField();
        JTextField textField9 = new JTextField();
        JTextField textField10 = new JTextField();
        
         JComponent[] components = new JComponent[]{
                new JLabel("Ange pid"),
                textField1,
                new JLabel("Ange projektnamn"),
                textField2,
                new JLabel("Ange beskrivning"),
                textField3,
                new JLabel("Ange startdatum (xxxx-xx-xx)"),
                textField4,
                new JLabel("Ange slutdatum (xxxx-xx-xx)"),
                textField5,
                new JLabel("Ange kostnader (xx.xxxx)"),
                textField6,
                new JLabel("Ange status"),
                textField7,
                new JLabel("Ange prioritet"),
                textField8,
                new JLabel("Ange projektchef (1-10)"),
                textField9,
                new JLabel("Ange land (1-5)"),
                textField10,
         
        };
         
          int result = JOptionPane.showConfirmDialog(null, components, "Ange värden", JOptionPane.OK_CANCEL_OPTION);
        
          if(Validering.textHarFelVarde(textField1) && Validering.textHarFelVarde(textField2) && Validering.textHarFelVarde(textField3) && Validering.textHarFelVarde(textField4) && Validering.textHarFelVarde(textField5) && Validering.textHarFelVarde(textField6) && Validering.textHarFelVarde(textField7) && Validering.textHarFelVarde(textField8) && Validering.textHarFelVarde(textField9) && Validering.textHarFelVarde(textField10))
           {
          
        try 
        {
            if(result == JOptionPane.OK_OPTION) 
            {
            String pid = textField1.getText();
            String projektnamn = textField2.getText();
            String beskrivning = textField3.getText();
            String startdatum = textField4.getText();
            String slutdatum = textField5.getText();
            String kostnad = textField6.getText();
            String status = textField7.getText();
            String prioritet = textField8.getText();
            String projektchef = textField9.getText();
            String land = textField10.getText();
       
            String sqlFraga = "UPDATE projekt SET projektnamn = '" + projektnamn +"', beskrivning = '"+ beskrivning +"', startdatum = '"+ startdatum +"', slutdatum = '"+ slutdatum +"', kostnad = "+ kostnad +", status = '" + status +"', prioritet = '" + prioritet + "', projektchef = " + projektchef + ", land = " + land + " WHERE pid = " + pid + " AND pid IN (SELECT pid FROM ans_proj WHERE aid IN (SELECT aid FROM anstalld WHERE avdelning IN (SELECT avdelning FROM anstalld WHERE epost = '" + inloggadAnvandare + "')))";
           
            
            System.out.println(pid);
            System.out.println(projektnamn);
            System.out.println(beskrivning);
            System.out.println(startdatum);
            System.out.println(slutdatum);
            System.out.println(kostnad);
            System.out.println(status);
            System.out.println(prioritet);
            System.out.println(projektchef);
            System.out.println(land);
            
            idb.update(sqlFraga);
            
            System.out.println("Ditt Projekt: " + pid + " har ändrats");
            JOptionPane.showMessageDialog(this, "Ditt Projekt: " + pid + " har ändrats");
         
           
        } 
           
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
           }
    }//GEN-LAST:event_btnAndraProjektUppgifterActionPerformed

    //Ta bort handläggare utifrån aid
    private void btnTaBortHandläggareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortHandläggareActionPerformed
        String inmatning = JOptionPane.showInputDialog(this, "handläggares aid:");

        if(Validering.textHarFelVarde2(inmatning))
        {
       
          try
          {    
               String sqlFraga = "SELECT * FROM handlaggare WHERE aid = " + inmatning + " AND aid IN (SELECT aid FROM ans_proj WHERE pid IN (SELECT pid FROM projekt WHERE projektchef IN (SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "')))";
               String dbAid = idb.fetchSingle(sqlFraga);
               if(dbAid!=null)
               {
                   String sqlFraga2 = "DELETE FROM handlaggare WHERE aid = " + inmatning;
                   
                   System.out.println(sqlFraga2);
                   idb.delete(sqlFraga2);
                  
                   System.out.println("Handläggare: " + inmatning + " har tagits bort");
                   JOptionPane.showMessageDialog(this, "Handläggare: " + inmatning + " har tagits bort");

               }               
          }   catch (InfException ex) {
              System.out.println(ex.getMessage());
          }
        }
    }//GEN-LAST:event_btnTaBortHandläggareActionPerformed

    //Ta bort partner utifrån pid
    private void btnTaBortPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortPartnerActionPerformed

        String inmatning = JOptionPane.showInputDialog(this, "partner pid:");
        
        if(Validering.textHarFelVarde2(inmatning))
        {

          try
          {    
               String sqlFraga = "SELECT * FROM partner WHERE pid = " + inmatning + " AND pid IN (SELECT partner_pid FROM projekt_partner WHERE pid IN (SELECT pid FROM projekt WHERE projektchef IN (SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "')))";
               String dbPid = idb.fetchSingle(sqlFraga);
               if(dbPid!=null)
               {
                   String sqlFraga2 = "DELETE FROM projekt_partner WHERE partner_pid = " + inmatning;
                   String sqlFraga3 = "DELETE FROM partner WHERE pid = " + inmatning;
                   
                   System.out.println(sqlFraga2);
                   System.out.println(sqlFraga3);
                   idb.delete(sqlFraga2);
                   idb.delete(sqlFraga3);
                  
                   System.out.println("Partner: " + inmatning + " har tagits bort");
                   JOptionPane.showMessageDialog(this, "Partner: " + inmatning + " har tagits bort");

               }               
          }   catch (InfException ex) {
              System.out.println(ex.getMessage());
          }
        }
    }//GEN-LAST:event_btnTaBortPartnerActionPerformed

    //Lägg till partner samt värden
    private void btnLaggTillPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillPartnerActionPerformed
         
        
         JTextField textField1 = new JTextField();
         JTextField textField2 = new JTextField();
         JTextField textField3 = new JTextField();
         JTextField textField4 = new JTextField();
         JTextField textField5 = new JTextField();
         JTextField textField6 = new JTextField();
         JTextField textField7 = new JTextField();
         JTextField textField8 = new JTextField();
         
          JComponent[] components = new JComponent[]{
                new JLabel("Ange partner pid:"),
                textField1,
                new JLabel("Ange namn:"),
                textField2,
                new JLabel("Ange kontaktperson:"),
                textField3,
                new JLabel("Ange kontaktepost:"),
                textField4,
                new JLabel("Ange telefon:"),
                textField5,
                new JLabel("Ange adress:"),
                textField6,
                new JLabel("Ange bransch:"),
                textField7,
                new JLabel("Ange stad (1-6):"),
                textField8,
            };
              
           int result = JOptionPane.showConfirmDialog(null, components, "Ange värden", JOptionPane.OK_CANCEL_OPTION);
           
           if(Validering.textHarFelVarde(textField1) && Validering.textHarFelVarde(textField2) && Validering.textHarFelVarde(textField3) && Validering.textHarFelVarde(textField4) && Validering.textHarFelVarde(textField5) && Validering.textHarFelVarde(textField6) && Validering.textHarFelVarde(textField7) && Validering.textHarFelVarde(textField8))
           {
           
           try 
        {
            if(result == JOptionPane.OK_OPTION) 
            {
            String sqlFraga = "SELECT pid FROM projekt WHERE projektchef IN (SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "')";
            String dbPid = idb.fetchSingle(sqlFraga);
        
                
            String pid = textField1.getText();
            String namn = textField2.getText();
            String kontaktperson = textField3.getText();
            String kontaktepost = textField4.getText();
            String telefon = textField5.getText();
            String adress = textField6.getText();
            String branch = textField7.getText();
            String stad = textField8.getText();
            String sqlFraga2 = "INSERT INTO partner (pid, namn, kontaktperson, kontaktepost, telefon, adress, branch, stad) VALUES (" + pid + ",'" + namn +"','"+kontaktperson+"','"+ kontaktepost +"','"+ telefon +"','"+ adress +"','" + branch +"','" + stad +"')";
            String sqlFraga3 = "INSERT INTO projekt_partner (pid, partner_pid) VALUES (" + dbPid + ", " + pid + ")";
            
            System.out.println(pid);
            System.out.println(namn);
            System.out.println(kontaktperson);
            System.out.println(kontaktepost);
            System.out.println(telefon);
            System.out.println(adress);
            System.out.println(branch);
            System.out.println(stad);
            
            idb.insert(sqlFraga2);
            idb.insert(sqlFraga3);
            
            System.out.println("Partner: " + pid + " har lagts till");
            JOptionPane.showMessageDialog(this, "Partner: " + pid + " har lagts till");
         
        } 
           
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
           }
    }//GEN-LAST:event_btnLaggTillPartnerActionPerformed

    //Lägg till handläggare samt dess värden
    private void btnLaggTillHandlaggareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillHandlaggareActionPerformed
         JTextField textField1 = new JTextField();
         
          JComponent[] components = new JComponent[]{
                new JLabel("Ange handläggares aid:"),
                textField1,
            };
              
           int result = JOptionPane.showConfirmDialog(null, components, "Ange värden", JOptionPane.OK_CANCEL_OPTION);
           
           if(Validering.textHarFelVarde(textField1))
           {
           
           try 
        {
            if(result == JOptionPane.OK_OPTION) 
            {
            String aid = textField1.getText();
            System.out.println(aid);
            String sqlFraga1 = "SELECT pid FROM projekt WHERE projektchef IN (SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "')";
            String sqlFraga2 = "SELECT aid FROM handlaggare WHERE aid = " + aid;
            String dbPid = idb.fetchSingle(sqlFraga1);
            String dbAid = idb.fetchSingle(sqlFraga2);
                
            String sqlFraga = "INSERT INTO ans_proj (pid, aid) VALUES (" + dbPid + ", " + dbAid + ")"; 
            idb.insert(sqlFraga);
            
            System.out.println("Handläggare: " + aid + " har lagts till");
            JOptionPane.showMessageDialog(this, "Handläggare: " + aid + " har lagts till");
         
        } 
           
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
           }
    }//GEN-LAST:event_btnLaggTillHandlaggareActionPerformed

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
            java.util.logging.Logger.getLogger(ProjektledareMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjektledareMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjektledareMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjektledareMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ProjektledareMeny().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraMinaUppgifter;
    private javax.swing.JButton btnAndraProjektUppgifter;
    private javax.swing.JButton btnHallbarhetsmal;
    private javax.swing.JButton btnLaggTillHandlaggare;
    private javax.swing.JButton btnLaggTillPartner;
    private javax.swing.JButton btnMinaProjekt;
    private javax.swing.JButton btnMinaUppgifter;
    private javax.swing.JButton btnPartnerPaMinaProjekt;
    private javax.swing.JButton btnPersonalPaAvdelning;
    private javax.swing.JButton btnProjektPaMinAvdelning;
    private javax.swing.JButton btnProjektPaMinAvdelningStatus;
    private javax.swing.JButton btnSokHandlaggare;
    private javax.swing.JButton btnSokProjektDatum;
    private javax.swing.JButton btnStatistik;
    private javax.swing.JButton btnTaBortHandläggare;
    private javax.swing.JButton btnTaBortPartner;
    private javax.swing.JLabel lblHandlaggare;
    private javax.swing.JLabel lblInloggadAnvandare;
    // End of variables declaration//GEN-END:variables
}
