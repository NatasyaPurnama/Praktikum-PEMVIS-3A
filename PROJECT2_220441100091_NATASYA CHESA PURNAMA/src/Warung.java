
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Natasya
 */
public class Warung extends javax.swing.JFrame {
        String menu;
        int harga, Pesanan, Total;
    public Warung() {
        initComponents();
        uJumlah.setText("" + Pesanan);
        bTambah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Pesanan++;
                uJumlah.setText(Integer.toString(Pesanan));
            }
        });
        bKurang.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Pesanan > 0) {
                    Pesanan--;
                    uJumlah.setText(Integer.toString(Pesanan));
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rGrup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Judul = new javax.swing.JLabel();
        Judul2 = new javax.swing.JLabel();
        r3T = new javax.swing.JRadioButton();
        rNasgor = new javax.swing.JRadioButton();
        rSoto = new javax.swing.JRadioButton();
        rBakso = new javax.swing.JRadioButton();
        rRawon = new javax.swing.JRadioButton();
        rNascam = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JudulJumlah = new javax.swing.JLabel();
        uJumlah = new javax.swing.JLabel();
        bTambah = new javax.swing.JButton();
        bKurang = new javax.swing.JButton();
        JudulInfo = new javax.swing.JLabel();
        bBeli = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        uPesanan = new javax.swing.JLabel();
        uJumlahPesanan = new javax.swing.JLabel();
        uTotalPembayaran = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Judul.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Judul.setText("Waroenk Yaoke!");

        Judul2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Judul2.setText("--------- Menu Makanan ---------");

        rGrup.add(r3T);
        r3T.setText("3T");

        rGrup.add(rNasgor);
        rNasgor.setText("Nasi Goreng");

        rGrup.add(rSoto);
        rSoto.setText("Soto");

        rGrup.add(rBakso);
        rBakso.setText("Bakso");

        rGrup.add(rRawon);
        rRawon.setText("Rawon");

        rGrup.add(rNascam);
        rNascam.setText("Nasi Campur");

        jLabel3.setText("Rp. 7000");

        jLabel4.setText("Rp. 9000");

        jLabel5.setText("Rp. 9000");

        jLabel6.setText("Rp. 9000");

        jLabel7.setText("Rp. 10.000");

        jLabel8.setText("Rp. 12.000");

        JudulJumlah.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JudulJumlah.setText("Jumlah Beli");

        uJumlah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uJumlah.setText("0");
        uJumlah.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        bTambah.setText("+");

        bKurang.setText("-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JudulJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(uJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(bTambah)
                        .addGap(62, 62, 62)
                        .addComponent(bKurang)
                        .addGap(148, 148, 148))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JudulJumlah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTambah)
                    .addComponent(bKurang))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        JudulInfo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JudulInfo.setText("Informasi Pesanan");

        bBeli.setText("Beli");
        bBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBeliActionPerformed(evt);
            }
        });

        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        uPesanan.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        uPesanan.setText("Pesanan Anda       :");

        uJumlahPesanan.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        uJumlahPesanan.setText("Jumlah Pesanan    : ");

        uTotalPembayaran.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        uTotalPembayaran.setText("Total Pembayaran :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rNascam, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rRawon, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rBakso, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSoto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rNasgor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3T, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(bBeli)
                        .addGap(49, 49, 49)
                        .addComponent(bHapus))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uJumlahPesanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(uPesanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(uTotalPembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Judul2)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JudulInfo)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Judul)
                        .addGap(129, 129, 129))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Judul)
                .addGap(12, 12, 12)
                .addComponent(Judul2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r3T)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rNasgor)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSoto)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rBakso)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rRawon)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rNascam)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JudulInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bBeli)
                    .addComponent(bHapus))
                .addGap(18, 18, 18)
                .addComponent(uPesanan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uJumlahPesanan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uTotalPembayaran)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBeliActionPerformed
        if (r3T.isSelected()){
            menu = "3T (Tahu Tempe Telur)";
            harga = 7000;
        }else if (rNasgor.isSelected()){
            menu = "Nasi Goreng";
            harga = 9000;
        }else if(rNascam.isSelected()){
            menu = "Nasi Campur";
            harga = 12000;
        }else if(rRawon.isSelected()){
            menu = "Rawon";
            harga = 10000;
        }else if(rSoto.isSelected()){
            menu = "Soto";
            harga = 9000;
        }else if(rBakso.isSelected()){
            menu = "Bakso";
            harga = 9000;
        }else if (!r3T.isSelected() && !rNasgor.isSelected() && !rNascam.isSelected() && !rBakso.isSelected()&& !rRawon.isSelected()&& !rSoto.isSelected()) {
        JOptionPane.showMessageDialog(this, "Silahkan pilih menu terlebih dahulu");
        return; 
        }
        
        Pesanan = Integer.parseInt(uJumlah.getText());
        Total = Pesanan * harga;
        uPesanan.setText("Pesanan Anda       : " + menu);
        uJumlahPesanan.setText("Jumlah Pesanan    : " + Pesanan);
        uTotalPembayaran.setText("Total Pembayaran : " + Total);
    }//GEN-LAST:event_bBeliActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        rGrup.clearSelection();
        uJumlah.setText("0");
        uPesanan.setText("Pesanan Anda    : ");
        uJumlahPesanan.setText("Jumlah Pesanan : ");
    }//GEN-LAST:event_bHapusActionPerformed

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
            java.util.logging.Logger.getLogger(Warung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Warung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Warung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Warung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Warung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Judul;
    private javax.swing.JLabel Judul2;
    private javax.swing.JLabel JudulInfo;
    private javax.swing.JLabel JudulJumlah;
    private javax.swing.JButton bBeli;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bKurang;
    private javax.swing.JButton bTambah;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton r3T;
    private javax.swing.JRadioButton rBakso;
    private javax.swing.ButtonGroup rGrup;
    private javax.swing.JRadioButton rNascam;
    private javax.swing.JRadioButton rNasgor;
    private javax.swing.JRadioButton rRawon;
    private javax.swing.JRadioButton rSoto;
    private javax.swing.JLabel uJumlah;
    private javax.swing.JLabel uJumlahPesanan;
    private javax.swing.JLabel uPesanan;
    private javax.swing.JLabel uTotalPembayaran;
    // End of variables declaration//GEN-END:variables
}
