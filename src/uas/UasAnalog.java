package uas;
import java.util.ArrayList;
public class UasAnalog extends javax.swing.JDialog {
    int harga = 0;
    int pr,cr,pjt,fcl,fscl = 0;
    ArrayList<String> nama = new ArrayList<>();
    
    ArrayList<String> jamAgil = new ArrayList<>();
    ArrayList<String> tanggalAgil = new ArrayList<>();
    
    ArrayList<String> jamBabam = new ArrayList<>();
    ArrayList<String> tanggalBabam = new ArrayList<>();
    
    ArrayList<String> jamGusti = new ArrayList<>();
    ArrayList<String> tanggalGusti = new ArrayList<>();
    
    ArrayList<String> jamRapli = new ArrayList<>();
    ArrayList<String> tanggalRapli = new ArrayList<>();

    int hargaPotongRambut, hargaCuciRambut, hargaPijit, hargaFullService, hargaFacial = 0;

    public UasAnalog() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
int hargaTotal(){
    if (fullService.isSelected()) {
        return hargaFullService;
    }
    else{
        return hargaPotongRambut + hargaCuciRambut + hargaPijit + hargaFacial;
    }
}
    public UasAnalog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        nama.add("Agil");
        nama.add("Babam");
        nama.add("Gusti");
        nama.add("Rapli");
        
        jamAgil.add("10:00");
        jamAgil.add("11:00");
        jamAgil.add("12:00");
        jamAgil.add("14:00");
        jamAgil.add("16:00");
        jamAgil.add("17:00");
        jamAgil.add("18:00");
        jamAgil.add("20:00");
        jamAgil.add("21:00");
        
        tanggalAgil.add("22-juni-2020");

        jamBabam.add("10:00");
        jamBabam.add("11:00");
        jamBabam.add("12:00");
        jamBabam.add("14:00");
        jamBabam.add("16:00");
        jamBabam.add("17:00");
        jamBabam.add("18:00");
        jamBabam.add("20:00");
        jamBabam.add("21:00");
        
        tanggalBabam.add("22-juni-2020");

        jamGusti.add("10:00");
        jamGusti.add("11:00");
        jamGusti.add("12:00");
        jamGusti.add("14:00");
        jamGusti.add("16:00");
        jamGusti.add("17:00");
        jamGusti.add("18:00");
        jamGusti.add("20:00");
        jamGusti.add("21:00");
        
        tanggalGusti.add("23-juni-2020");

        jamRapli.add("10:00");
        jamRapli.add("11:00");
        jamRapli.add("12:00");
        jamRapli.add("14:00");
        jamRapli.add("16:00");
        jamRapli.add("17:00");
        jamRapli.add("18:00");
        jamRapli.add("20:00");
        jamRapli.add("21:00");
        
        tanggalRapli.add("23-juni-2020");
        
        for (int i = 0; i < nama.size(); i++) {
            Barberman.addItem(nama.get(i));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Nama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Barberman = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Jam = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cuciRambut = new javax.swing.JCheckBox();
        facial = new javax.swing.JCheckBox();
        potongRambut = new javax.swing.JCheckBox();
        pijit = new javax.swing.JCheckBox();
        fullService = new javax.swing.JCheckBox();
        Exit = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        Hari = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 9, 33));

        jPanel2.setBackground(new java.awt.Color(234, 198, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Kantu' Barbershop");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(32, 64, 81));

        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tanggal");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Barber Man");

        Barberman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarbermanActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DD/MM/YYYY");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pilih Jam");

        Jam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JamActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Service");

        cuciRambut.setForeground(new java.awt.Color(255, 255, 255));
        cuciRambut.setText("Cuci Rambut");
        cuciRambut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuciRambutActionPerformed(evt);
            }
        });

        facial.setForeground(new java.awt.Color(255, 255, 255));
        facial.setText("Facial");
        facial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facialActionPerformed(evt);
            }
        });

        potongRambut.setForeground(new java.awt.Color(255, 255, 255));
        potongRambut.setText("Potong Rambut");
        potongRambut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potongRambutActionPerformed(evt);
            }
        });

        pijit.setForeground(new java.awt.Color(255, 255, 255));
        pijit.setText("Pijit");
        pijit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pijitActionPerformed(evt);
            }
        });

        fullService.setForeground(new java.awt.Color(255, 255, 255));
        fullService.setText("Full Service");
        fullService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullServiceActionPerformed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(211, 38, 38));
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Exit");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Next.setBackground(new java.awt.Color(64, 186, 213));
        Next.setForeground(new java.awt.Color(255, 255, 255));
        Next.setText("Pesan");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        Hari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(Nama, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(Barberman, 0, 141, Short.MAX_VALUE)
                    .addComponent(Jam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hari, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fullService)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pijit)
                            .addComponent(potongRambut))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(facial)
                            .addComponent(cuciRambut))))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Hari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Barberman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jam))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cuciRambut)
                    .addComponent(potongRambut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(facial)
                    .addComponent(pijit, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fullService)
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Exit)
                    .addComponent(Next))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
      Output output = new Output(Nama.getText(), Jam.getItemAt(Jam.getSelectedIndex()), Barberman.getItemAt(Barberman.getSelectedIndex()), Hari.getItemAt(Hari.getSelectedIndex()), String.valueOf(hargaTotal()));
        
        switch (Barberman.getSelectedIndex()) {
            case 0:
                jamAgil.remove(Jam.getSelectedIndex());
                break;
            case 1:
                jamBabam.remove(Jam.getSelectedIndex());
                break;
            case 2:
                jamGusti.remove(Jam.getSelectedIndex());
                break;
            case 3:
                jamRapli.remove(Jam.getSelectedIndex());
                break;
        }
        Jam.removeAllItems();
        switch (Barberman.getSelectedIndex()) {
            case 0:
                for (int i = 0; i < jamAgil.size(); i++) {
                    Jam.addItem(jamAgil.get(i));
                }
                break;
            case 1:
                for (int i = 0; i < jamBabam.size(); i++) {
                    Jam.addItem(jamBabam.get(i));
                }
                break;
            case 2:
                for (int i = 0; i < jamGusti.size(); i++) {
                    Jam.addItem(jamGusti.get(i));
                }
                break;
            case 3:
                for (int i = 0; i < jamRapli.size(); i++) {
                    Jam.addItem(jamRapli.get(i));
                }
                break;
        }
        
        output.setVisible(true);
                    this.setVisible(false);
                    output.pack();
                    output.setLocationRelativeTo(null);
                    output.setDefaultCloseOperation(UasAnalog.EXIT_ON_CLOSE);
        
       
    }//GEN-LAST:event_NextActionPerformed

    private void JamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JamActionPerformed

    }//GEN-LAST:event_JamActionPerformed

    private void BarbermanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarbermanActionPerformed
        Jam.removeAllItems();
        switch (Barberman.getSelectedIndex()) {
            case 0:
                for (int i = 0; i < jamAgil.size(); i++) {
                    Jam.addItem(jamAgil.get(i));
                }
                break;
            case 1:
                for (int i = 0; i < jamBabam.size(); i++) {
                    Jam.addItem(jamBabam.get(i));
                }
                break;
            case 2:
                for (int i = 0; i < jamGusti.size(); i++) {
                    Jam.addItem(jamGusti.get(i));
                }
                break;
            case 3:
                for (int i = 0; i < jamRapli.size(); i++) {
                    Jam.addItem(jamRapli.get(i));
                }
                break;
        }
        
        Hari.removeAllItems();
        switch (Barberman.getSelectedIndex()) {
            case 0:
                for (int i = 0; i < tanggalAgil.size(); i++) {
                    Hari.addItem(tanggalAgil.get(i));
                }
                break;
            case 1:
                for (int i = 0; i < tanggalBabam.size(); i++) {
                    Hari.addItem(tanggalBabam.get(i));
                }
                break;
            case 2:
                for (int i = 0; i < tanggalGusti.size(); i++) {
                    Hari.addItem(tanggalGusti.get(i));
                }
                break;
            case 3:
                for (int i = 0; i < tanggalRapli.size(); i++) {
                    Hari.addItem(tanggalRapli.get(i));
                }
                break;
        }
    }//GEN-LAST:event_BarbermanActionPerformed

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void fullServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullServiceActionPerformed
        if (fullService.isSelected()) {
            //set harga full service jika di centang
            hargaFullService = 100000;
            
            //jangan biarkan checkbox lain dicentang
            potongRambut.setEnabled(false);
            facial.setEnabled(false);
            cuciRambut.setEnabled(false);
            pijit.setEnabled(false);
        }
        else{
            //set harga full service ke default
            hargaFullService = 0;
            
            //biarkan checkbox lain bisa dicentang
            potongRambut.setEnabled(true);
            facial.setEnabled(true);
            cuciRambut.setEnabled(true);
            pijit.setEnabled(true);
        }
    }//GEN-LAST:event_fullServiceActionPerformed

    private void potongRambutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potongRambutActionPerformed
        if (potongRambut.isSelected()) {
            //set harga potong rambut jika di centang
            hargaPotongRambut = 30000;
        }
        else{
            //set harga potong rambut ke default
            hargaPotongRambut = 0;
        }
    }//GEN-LAST:event_potongRambutActionPerformed

    private void cuciRambutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuciRambutActionPerformed
        if (cuciRambut.isSelected()) {
            //set harga cuci rambut jika di centang
            hargaCuciRambut = 20000;
        } else {
            //set harga potong rambut ke default
            hargaCuciRambut = 0;
        }
    }//GEN-LAST:event_cuciRambutActionPerformed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void HariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HariActionPerformed

    private void facialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facialActionPerformed
        if (facial.isSelected()) {
            //set harga facial jika di centang
            hargaFacial = 30000;
        } else {
            //set harga facial ke default
            hargaFacial = 0;
        }
    }//GEN-LAST:event_facialActionPerformed

    private void pijitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pijitActionPerformed
        if (pijit.isSelected()) {
            //set harga facial jika di centang
            hargaPijit = 25000;
        } else {
            //set harga facial ke default
            hargaPijit = 0;
        }
    }//GEN-LAST:event_pijitActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(UasAnalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UasAnalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UasAnalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UasAnalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            UasAnalog dialog = new UasAnalog(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Barberman;
    private javax.swing.JButton Exit;
    private javax.swing.JComboBox<String> Hari;
    private javax.swing.JComboBox<String> Jam;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton Next;
    private javax.swing.JCheckBox cuciRambut;
    private javax.swing.JCheckBox facial;
    private javax.swing.JCheckBox fullService;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JCheckBox pijit;
    private javax.swing.JCheckBox potongRambut;
    // End of variables declaration//GEN-END:variables
}
