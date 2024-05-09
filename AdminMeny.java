package ngogrupp16;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.*;
import javax.swing.*;

public class AdminMeny extends javax.swing.JFrame {

    //Fält, inkluderar random som används när lösenordsgenereraren används
    Random random = new Random();
    private InfDB idb;
    private String inloggadAnvandare;
   
    //Konstruktor 
    public AdminMeny(InfDB idb, String inloggadAnvandare) {
        this.idb = idb;
        this.inloggadAnvandare = inloggadAnvandare;
        initComponents();
        lblInloggadAnvandare.setText(inloggadAnvandare);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInloggadAnvandare = new javax.swing.JLabel();
        btnAvdelning = new javax.swing.JButton();
        btnPartner = new javax.swing.JButton();
        btnLand = new javax.swing.JButton();
        btnLaggTillProjekt = new javax.swing.JButton();
        btnLosenord = new javax.swing.JButton();
        btnTaBortAnstalld = new javax.swing.JButton();
        btnLaggTillAnstalld = new javax.swing.JButton();
        btnTaBortPartner = new javax.swing.JButton();
        btnTaBortProjekt = new javax.swing.JButton();
        btnAndraLand = new javax.swing.JButton();
        btnAndraPartner = new javax.swing.JButton();
        btnAndraProjekt = new javax.swing.JButton();
        lblAdmin = new javax.swing.JLabel();
        btnAndraAvdelning = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInloggadAnvandare.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInloggadAnvandare.setText("Användare");
        lblInloggadAnvandare.setToolTipText("");
        lblInloggadAnvandare.setName(""); // NOI18N
        getContentPane().add(lblInloggadAnvandare, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 183, 39));

        btnAvdelning.setText("Lägg till avdelning");
        btnAvdelning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvdelningActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvdelning, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        btnPartner.setText("Lägg till partner");
        btnPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartnerActionPerformed(evt);
            }
        });
        getContentPane().add(btnPartner, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        btnLand.setText("Lägg till land");
        btnLand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLandActionPerformed(evt);
            }
        });
        getContentPane().add(btnLand, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        btnLaggTillProjekt.setText("Lägg till projekt");
        btnLaggTillProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillProjektActionPerformed(evt);
            }
        });
        getContentPane().add(btnLaggTillProjekt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        btnLosenord.setText("Generera lösenord");
        btnLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLosenordActionPerformed(evt);
            }
        });
        getContentPane().add(btnLosenord, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        btnTaBortAnstalld.setText("Ta bort anställd");
        btnTaBortAnstalld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortAnstalldActionPerformed(evt);
            }
        });
        getContentPane().add(btnTaBortAnstalld, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, -1));

        btnLaggTillAnstalld.setText("Lägg till anställd");
        btnLaggTillAnstalld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillAnstalldActionPerformed(evt);
            }
        });
        getContentPane().add(btnLaggTillAnstalld, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        btnTaBortPartner.setText("Ta bort partner");
        btnTaBortPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortPartnerActionPerformed(evt);
            }
        });
        getContentPane().add(btnTaBortPartner, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        btnTaBortProjekt.setText("Ta bort projekt");
        btnTaBortProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortProjektActionPerformed(evt);
            }
        });
        getContentPane().add(btnTaBortProjekt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        btnAndraLand.setText("Ändra land");
        btnAndraLand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraLandActionPerformed(evt);
            }
        });
        getContentPane().add(btnAndraLand, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        btnAndraPartner.setText("Ändra partner");
        btnAndraPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraPartnerActionPerformed(evt);
            }
        });
        getContentPane().add(btnAndraPartner, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        btnAndraProjekt.setText("Ändra projekt");
        btnAndraProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraProjektActionPerformed(evt);
            }
        });
        getContentPane().add(btnAndraProjekt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        lblAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdmin.setText("ADMIN ");
        getContentPane().add(lblAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 286, 48));

        btnAndraAvdelning.setText("Ändra Avdelning");
        btnAndraAvdelning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraAvdelningActionPerformed(evt);
            }
        });
        getContentPane().add(btnAndraAvdelning, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Lägg till avdelning, samt inmatning av dess värden
    private void btnAvdelningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvdelningActionPerformed
         JTextField textField1 = new JTextField();
         JTextField textField2 = new JTextField();
         JTextField textField3 = new JTextField();
         JTextField textField4 = new JTextField();
         JTextField textField5 = new JTextField();
         JTextField textField6 = new JTextField();
         JTextField textField7 = new JTextField();
         JTextField textField8 = new JTextField();
         
          JComponent[] components = new JComponent[]{
                new JLabel("Ange avdid:"),
                textField1,
                new JLabel("Ange namn:"),
                textField2,
                new JLabel("Ange beskrivning:"),
                textField3,
                new JLabel("Ange adress:"),
                textField4,
                new JLabel("Ange epost:"),
                textField5,
                new JLabel("Ange telefon:"),
                textField6,
                new JLabel("Ange stad (1-6):"),
                textField7,
                new JLabel("Ange chef (1-3):"),
                textField8,
            };
              
           int result = JOptionPane.showConfirmDialog(null, components, "Ange värden", JOptionPane.OK_CANCEL_OPTION);
           
           if(Validering.textHarFelVarde(textField1) && Validering.textHarFelVarde(textField2) && Validering.textHarFelVarde(textField3) && Validering.textHarFelVarde(textField4) && Validering.textHarFelVarde(textField5) && Validering.textHarFelVarde(textField6) && Validering.textHarFelVarde(textField7) && Validering.textHarFelVarde(textField8))
           {
           try 
        {
            if(result == JOptionPane.OK_OPTION) 
            {
            String avdid = textField1.getText();
            String namn = textField2.getText();
            String beskrivning = textField3.getText();
            String adress = textField4.getText();
            String epost = textField5.getText();
            String telefon = textField6.getText();
            String stad = textField7.getText();
            String chef = textField8.getText();
            String sqlFraga = "INSERT INTO avdelning (avdid, namn, beskrivning, adress, epost, telefon, stad, chef) VALUES (" + avdid+ ",'" + namn +"','"+ beskrivning +"','"+ adress +"','"+ epost +"','"+ telefon +"','" + stad +"','" + chef +"')";
           
            System.out.println(avdid);
            System.out.println(namn);
            System.out.println(beskrivning);
            System.out.println(adress);
            System.out.println(epost);
            System.out.println(telefon);
            System.out.println(stad);
            System.out.println(chef);
            
            idb.insert(sqlFraga);
            
            System.out.println("Avdelning: " + avdid + " har lagts till");
            JOptionPane.showMessageDialog(this, "Avdelning: " + avdid + " har lagts till");
         
        } 
           
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
           }
    }//GEN-LAST:event_btnAvdelningActionPerformed

    //Lägg till partner, samt dess värden
    private void btnPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartnerActionPerformed
         JTextField textField1 = new JTextField();
         JTextField textField2 = new JTextField();
         JTextField textField3 = new JTextField();
         JTextField textField4 = new JTextField();
         JTextField textField5 = new JTextField();
         JTextField textField6 = new JTextField();
         JTextField textField7 = new JTextField();
         JTextField textField8 = new JTextField();
         
          JComponent[] components = new JComponent[]{
                new JLabel("Ange pid:"),
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
            String pid = textField1.getText();
            String namn = textField2.getText();
            String kontaktperson = textField3.getText();
            String kontaktepost = textField4.getText();
            String telefon = textField5.getText();
            String adress = textField6.getText();
            String branch = textField7.getText();
            String stad = textField8.getText();
            String sqlFraga = "INSERT INTO partner (pid, namn, kontaktperson, kontaktepost, telefon, adress, branch, stad) VALUES (" + pid + ",'" + namn +"','"+kontaktperson+"','"+ kontaktepost +"','"+ telefon +"','"+ adress +"','" + branch +"','" + stad +"')";
           
            System.out.println(pid);
            System.out.println(namn);
            System.out.println(kontaktperson);
            System.out.println(kontaktepost);
            System.out.println(telefon);
            System.out.println(adress);
            System.out.println(branch);
            System.out.println(stad);
            
            idb.insert(sqlFraga);
            
            System.out.println("Partner: " + pid + " har lagts till");
            JOptionPane.showMessageDialog(this, "Partner: " + pid + " har lagts till");
         
        } 
           
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
           }
          
    }//GEN-LAST:event_btnPartnerActionPerformed

    //Lägg till land samt dess värden
    private void btnLandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLandActionPerformed
        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        JTextField textField3 = new JTextField();
        JTextField textField4 = new JTextField();
        JTextField textField5 = new JTextField();
        JTextField textField6 = new JTextField();
        JTextField textField7 = new JTextField();
        
         JComponent[] components = new JComponent[]{
                new JLabel("Ange lid:"),
                textField1,
                new JLabel("Ange namn"),
                textField2,
                new JLabel("Ange språk"),
                textField3,
                new JLabel("Ange valuta (xx.xxxx)"),
                textField4,
                new JLabel("Ange tidszon"),
                textField5,
                new JLabel("Ange politisk struktur"),
                textField6,
                new JLabel("Ange ekonomi"),
                textField7,
         
        };
         
          int result = JOptionPane.showConfirmDialog(null, components, "Ange värden", JOptionPane.OK_CANCEL_OPTION);
        
          if(Validering.textHarFelVarde(textField1) && Validering.textHarFelVarde(textField2) && Validering.textHarFelVarde(textField3) && Validering.textHarFelVarde(textField4) && Validering.textHarFelVarde(textField5) && Validering.textHarFelVarde(textField6) && Validering.textHarFelVarde(textField7))
           {
          
        try 
        {
            if(result == JOptionPane.OK_OPTION) 
            {
            String lid = textField1.getText();
            String namn = textField2.getText();
            String sprak = textField3.getText();
            String valuta = textField4.getText();
            String tidszon = textField5.getText();
            String politisk_struktur = textField6.getText();
            String ekonomi = textField7.getText();
       
            String sqlFraga = "INSERT INTO land (lid, namn, sprak, valuta, tidszon, politisk_struktur, ekonomi) VALUES (" + lid + ",'" + namn +"','"+ sprak +"',"+ valuta +",'"+ tidszon +"','"+ politisk_struktur +"','" + ekonomi +"')";
           
            
          
            System.out.println(lid);
            System.out.println(namn);
            System.out.println(sprak);
            System.out.println(valuta);
            System.out.println(tidszon);
            System.out.println(politisk_struktur);
            System.out.println(ekonomi);
           
            
            idb.insert(sqlFraga);
            
            System.out.println("Land: " + lid + " har lagts till");
            JOptionPane.showMessageDialog(this, "Land: " + lid + " har lagts till");
         
           
        } 
           
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
           }
    }//GEN-LAST:event_btnLandActionPerformed

    //Lägg till projekt, samt värden
    private void btnLaggTillProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillProjektActionPerformed
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
                new JLabel("Ange pid:"),
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
       
            String sqlFraga = "INSERT INTO projekt (pid, projektnamn, beskrivning, startdatum, slutdatum, kostnad, status, prioritet, projektchef, land) VALUES (" + pid + ",'" + projektnamn +"','"+ beskrivning +"','"+ startdatum +"','"+ slutdatum +"',"+ kostnad +",'" + status +"','" + prioritet + "'," + projektchef + "," + land +")";
           
            
          
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
            
            idb.insert(sqlFraga);
            
            System.out.println("Projekt: " + pid + " har lagts till");
            JOptionPane.showMessageDialog(this, "Projekt: " + pid + " har lagts till");
         
           
        } 
           
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
           }
    }//GEN-LAST:event_btnLaggTillProjektActionPerformed

    //Lösenords generatorn
    private void btnLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLosenordActionPerformed
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
         for (int i = 0; i < 5; i++) {
            char randomLetter = (char) ('a' + random.nextInt(26)); // Slumpmässigt välj en bokstav från a till z
            letters.append(randomLetter); // Lägg till bokstaven i strängen
        }
           for (int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(10); // Generera ett slumpmässigt heltal mellan 0 och 9
            numbers.append(randomNumber); // Lägg till siffran i strängen
        }
        String sentence = letters.toString() + "" + numbers.toString();
        JOptionPane.showMessageDialog(this, "Nytt lösenord: " + sentence);

    }//GEN-LAST:event_btnLosenordActionPerformed

    //Ta bort anställd utifrån aid
    private void btnTaBortAnstalldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortAnstalldActionPerformed
          String inmatning = JOptionPane.showInputDialog(this, "aid");

          if(Validering.textHarFelVarde2(inmatning))
                  {
          try
          {    
               String sqlFraga = "SELECT * FROM anstalld WHERE aid = " + inmatning;
               String dbAid = idb.fetchSingle(sqlFraga);
               if(dbAid!=null)
               {
                   String sqlFraga2 = "DELETE FROM ans_proj WHERE aid = " + inmatning;
                   String sqlFraga3 = "DELETE FROM admin WHERE aid = " + inmatning;
                   String sqlFraga4 = "DELETE FROM handlaggare WHERE aid = " + inmatning;
                   String sqlFraga5 = "DELETE FROM anstalld WHERE aid = " + inmatning;
                   System.out.println(sqlFraga2);
                   System.out.println(sqlFraga3);
                   System.out.println(sqlFraga4);
                   System.out.println(sqlFraga5);
                   idb.delete(sqlFraga2);
                   idb.delete(sqlFraga3);
                   idb.delete(sqlFraga4);
                   idb.delete(sqlFraga5);
                   System.out.println("Anställd: " + inmatning + " har tagits bort");
                   JOptionPane.showMessageDialog(this, "Anställd: " + inmatning + " har tagits bort");

               }               
          }   catch (InfException ex) {
              System.out.println(ex.getMessage());
          }
                  }
    
    }//GEN-LAST:event_btnTaBortAnstalldActionPerformed

    //Lägg till anställd samt dess värden
    private void btnLaggTillAnstalldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillAnstalldActionPerformed
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
                new JLabel("Ange aid:"),
                textField1,
                new JLabel("Ange förnamn"),
                textField2,
                new JLabel("Ange efternamn"),
                textField3,
                new JLabel("Ange adress"),
                textField4,
                new JLabel("Ange epost"),
                textField5,
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
            String aid = textField1.getText();
            String fornamn = textField2.getText();
            String efternamn = textField3.getText();
            String adress = textField4.getText();
            String epost = textField5.getText();
            String telefon = textField6.getText();
            String anstallningsdatum = textField7.getText();
            String losenord = textField8.getText();
            String avdelning = textField9.getText();
            String sqlFraga = "INSERT INTO anstalld (aid, fornamn, efternamn, adress, epost, telefon, anstallningsdatum, losenord, avdelning) VALUES (" + aid + ",'" + fornamn +"','"+efternamn+"','"+ adress +"','"+epost +"','"+telefon +"','" +anstallningsdatum +"','" + losenord +"','"+ avdelning +"')";
           
            
          
            System.out.println(aid);
            System.out.println(fornamn);
            System.out.println(efternamn);
            System.out.println(adress);
            System.out.println(epost);
            System.out.println(telefon);
            System.out.println(anstallningsdatum);
            System.out.println(losenord);
            System.out.println(avdelning);
            
            idb.insert(sqlFraga);
            
            System.out.println("Anställd: " + aid + ", " + fornamn + " har lagts till");
            JOptionPane.showMessageDialog(this, "Anställd: " + aid + ", " + fornamn + " har lagts till");
         
           
        } 
           
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
           }
    }//GEN-LAST:event_btnLaggTillAnstalldActionPerformed

    //Ta bort partner utifrån pid
    private void btnTaBortPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortPartnerActionPerformed
        String inmatning = JOptionPane.showInputDialog(this, "pid");

        if(Validering.textHarFelVarde2(inmatning))
        {
          try
          {    
               String sqlFraga = "SELECT * FROM partner WHERE pid = " + inmatning;
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

    //Ta bort projekt utifrån pid
    private void btnTaBortProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortProjektActionPerformed
        String inmatning = JOptionPane.showInputDialog(this, "pid");
           
        if(Validering.textHarFelVarde2(inmatning))
        {
          try
          {    
               String sqlFraga = "SELECT * FROM projekt WHERE pid = " + inmatning;
               String dbPid = idb.fetchSingle(sqlFraga);
               if(dbPid!=null)
               {
                   String sqlFraga2 = "DELETE FROM projekt_partner WHERE pid = " + inmatning;
                   String sqlFraga3 = "DELETE FROM proj_hallbarhet WHERE pid = " + inmatning;
                   String sqlFraga4 = "DELETE FROM projekt WHERE pid = " + inmatning;
                   
                   System.out.println(sqlFraga2);
                   System.out.println(sqlFraga3);
                   System.out.println(sqlFraga4);
                   idb.delete(sqlFraga2);
                   idb.delete(sqlFraga3);
                   idb.delete(sqlFraga4);

                   System.out.println("Projekt: " + inmatning + " har tagits bort");
                   JOptionPane.showMessageDialog(this, "Projekt: " + inmatning + " har tagits bort");

               }               
          }   catch (InfException ex) {
              System.out.println(ex.getMessage());
          }
        }
    }//GEN-LAST:event_btnTaBortProjektActionPerformed

    //Ändra landets information utifrån lid
    private void btnAndraLandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLandActionPerformed

        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        JTextField textField3 = new JTextField();
        JTextField textField4 = new JTextField();
        JTextField textField5 = new JTextField();
        JTextField textField6 = new JTextField();
        JTextField textField7 = new JTextField();
        
         JComponent[] components = new JComponent[]{
                new JLabel("Ange lid:"),
                textField1,
                new JLabel("Ange namn"),
                textField2,
                new JLabel("Ange språk"),
                textField3,
                new JLabel("Ange valuta (xx.xxxx)"),
                textField4,
                new JLabel("Ange tidszon"),
                textField5,
                new JLabel("Ange politisk struktur"),
                textField6,
                new JLabel("Ange ekonomi"),
                textField7,
         
        };
         
          int result = JOptionPane.showConfirmDialog(null, components, "Ange värden", JOptionPane.OK_CANCEL_OPTION);
        
          if(Validering.textHarFelVarde(textField1) && Validering.textHarFelVarde(textField2) && Validering.textHarFelVarde(textField3) && Validering.textHarFelVarde(textField4) && Validering.textHarFelVarde(textField5) && Validering.textHarFelVarde(textField6) && Validering.textHarFelVarde(textField7))
           {
          
        try 
        {
            if(result == JOptionPane.OK_OPTION) 
            {
            String lid = textField1.getText();
            String namn = textField2.getText();
            String sprak = textField3.getText();
            String valuta = textField4.getText();
            String tidszon = textField5.getText();
            String politisk_struktur = textField6.getText();
            String ekonomi = textField7.getText();
       
            String sqlFraga = "UPDATE land SET namn = '" + namn + "', sprak = '" + sprak + "', valuta = " + valuta + ", tidszon = '" + tidszon + "', politisk_struktur = '" + politisk_struktur + "', ekonomi = '" + ekonomi + "' WHERE lid = " + lid;
           
            System.out.println(lid);
            System.out.println(namn);
            System.out.println(sprak);
            System.out.println(valuta);
            System.out.println(tidszon);
            System.out.println(politisk_struktur);
            System.out.println(ekonomi);
           
            
            idb.update(sqlFraga);
            
            System.out.println("Land: " + lid + " har ändrats");
            JOptionPane.showMessageDialog(this, "Land: " + lid + " har ändrats");
         
           
        } 
           
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
           }
    }//GEN-LAST:event_btnAndraLandActionPerformed

    //Ändra partners info utifrån pid
    private void btnAndraPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraPartnerActionPerformed
        
         JTextField textField1 = new JTextField();
         JTextField textField2 = new JTextField();
         JTextField textField3 = new JTextField();
         JTextField textField4 = new JTextField();
         JTextField textField5 = new JTextField();
         JTextField textField6 = new JTextField();
         JTextField textField7 = new JTextField();
         JTextField textField8 = new JTextField();
         
          JComponent[] components = new JComponent[]{
                new JLabel("Ange pid:"),
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
            String pid = textField1.getText();
            String namn = textField2.getText();
            String kontaktperson = textField3.getText();
            String kontaktepost = textField4.getText();
            String telefon = textField5.getText();
            String adress = textField6.getText();
            String branch = textField7.getText();
            String stad = textField8.getText();
            String sqlFraga = "UPDATE partner SET namn = '" + namn +"', kontaktperson = '"+kontaktperson+"', kontaktepost = '"+ kontaktepost +"', telefon = '"+ telefon +"', adress = '"+ adress +"', branch = '" + branch +"', stad = '" + stad +"' WHERE pid = " + pid;
           
            System.out.println(pid);
            System.out.println(namn);
            System.out.println(kontaktperson);
            System.out.println(kontaktepost);
            System.out.println(telefon);
            System.out.println(adress);
            System.out.println(branch);
            System.out.println(stad);
            
            idb.update(sqlFraga);
            
            System.out.println("Partner: " + pid + " har ändrats");
            JOptionPane.showMessageDialog(this, "Partner: " + pid + " har ändrats");
         
        } 
           
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
           }
    }//GEN-LAST:event_btnAndraPartnerActionPerformed

    //ändra Projekt info utifrån pid
    private void btnAndraProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraProjektActionPerformed
        
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
                new JLabel("Ange pid:"),
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
       
            String sqlFraga = "UPDATE projekt SET projektnamn = '" + projektnamn +"', beskrivning = '"+ beskrivning +"', startdatum = '"+ startdatum +"', slutdatum = '"+ slutdatum +"', kostnad = "+ kostnad +", status = '" + status +"', prioriteT = '" + prioritet + "', projektchef = " + projektchef + ", land = " + land + " WHERE pid = " + pid;
           
            
          
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
            
            System.out.println("Projekt: " + pid + " har ändrats");
            JOptionPane.showMessageDialog(this, "Projekt: " + pid + " har ändrats");
         
           
        } 
           
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
           }
    }//GEN-LAST:event_btnAndraProjektActionPerformed

    //Ändra avdelningsinfo utifrån avdid
    private void btnAndraAvdelningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraAvdelningActionPerformed
        JTextField textField1 = new JTextField();
         JTextField textField2 = new JTextField();
         JTextField textField3 = new JTextField();
         JTextField textField4 = new JTextField();
         JTextField textField5 = new JTextField();
         JTextField textField6 = new JTextField();
         JTextField textField7 = new JTextField();
         JTextField textField8 = new JTextField();
         
          JComponent[] components = new JComponent[]{
                new JLabel("Ange avdid:"),
                textField1,
                new JLabel("Ange namn:"),
                textField2,
                new JLabel("Ange beskrivning:"),
                textField3,
                new JLabel("Ange adress:"),
                textField4,
                new JLabel("Ange epost:"),
                textField5,
                new JLabel("Ange telefon:"),
                textField6,
                new JLabel("Ange stad (1-6):"),
                textField7,
                new JLabel("Ange chef (1-3):"),
                textField8,
            };
              
           int result = JOptionPane.showConfirmDialog(null, components, "Ange värden", JOptionPane.OK_CANCEL_OPTION);
           
           if(Validering.textHarFelVarde(textField1) && Validering.textHarFelVarde(textField2) && Validering.textHarFelVarde(textField3) && Validering.textHarFelVarde(textField4) && Validering.textHarFelVarde(textField5) && Validering.textHarFelVarde(textField6) && Validering.textHarFelVarde(textField7) && Validering.textHarFelVarde(textField8))
           {
           
           try 
        {
            if(result == JOptionPane.OK_OPTION) 
            {
            String avdid = textField1.getText();
            String namn = textField2.getText();
            String beskrivning = textField3.getText();
            String adress = textField4.getText();
            String epost = textField5.getText();
            String telefon = textField6.getText();
            String stad = textField7.getText();
            String chef = textField8.getText();
            String sqlFraga = "UPDATE avdelning SET namn = '" + namn +"', beskrivning = '"+ beskrivning +"', adress = '"+ adress +"', epost = '"+ epost +"', telefon = '"+ telefon +"', stad = '" + stad +"', chef = '" + chef +"' WHERE avdid = " + avdid;
           
            System.out.println(avdid);
            System.out.println(namn);
            System.out.println(beskrivning);
            System.out.println(adress);
            System.out.println(epost);
            System.out.println(telefon);
            System.out.println(stad);
            System.out.println(chef);
            
            idb.update(sqlFraga);
            
            System.out.println("Avdelning: " + avdid + " har ändrats");
            JOptionPane.showMessageDialog(this, "Avdelning: " + avdid + " har ändrats");
         
        } 
           
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
           }
    }//GEN-LAST:event_btnAndraAvdelningActionPerformed

   
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
            java.util.logging.Logger.getLogger(AdminMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Meny().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraAvdelning;
    private javax.swing.JButton btnAndraLand;
    private javax.swing.JButton btnAndraPartner;
    private javax.swing.JButton btnAndraProjekt;
    private javax.swing.JButton btnAvdelning;
    private javax.swing.JButton btnLaggTillAnstalld;
    private javax.swing.JButton btnLaggTillProjekt;
    private javax.swing.JButton btnLand;
    private javax.swing.JButton btnLosenord;
    private javax.swing.JButton btnPartner;
    private javax.swing.JButton btnTaBortAnstalld;
    private javax.swing.JButton btnTaBortPartner;
    private javax.swing.JButton btnTaBortProjekt;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblInloggadAnvandare;
    // End of variables declaration//GEN-END:variables
}
