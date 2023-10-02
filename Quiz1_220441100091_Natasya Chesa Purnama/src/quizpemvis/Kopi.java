/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quizpemvis;

import javax.swing.JOptionPane;

/**
 *
 * @author Natasya
 */
public class Kopi extends javax.swing.JFrame {
    String menu,suhu,tambahan;
    String mmenu,msuhu,mtambahan;
    int harga,haddon,total,kembalian,inominal;
    public Kopi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        takedine = new javax.swing.ButtonGroup();
        gula = new javax.swing.ButtonGroup();
        Judul = new javax.swing.JLabel();
        judul2 = new javax.swing.JLabel();
        NoPesanan = new javax.swing.JLabel();
        Nama = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Pesanan = new javax.swing.JLabel();
        DinginPanas = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Gula = new javax.swing.JLabel();
        TakeDine = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        Kembalian = new javax.swing.JLabel();
        Addon = new javax.swing.JLabel();
        uNoPesanan = new javax.swing.JTextField();
        uNamaPelanggan = new javax.swing.JTextField();
        uMenu = new javax.swing.JComboBox<>();
        uSuhu = new javax.swing.JComboBox<>();
        uTanpaGula = new javax.swing.JRadioButton();
        uNormal = new javax.swing.JRadioButton();
        uSetengah = new javax.swing.JRadioButton();
        uAddon = new javax.swing.JComboBox<>();
        uTake = new javax.swing.JRadioButton();
        uDine = new javax.swing.JRadioButton();
        uKembalian = new javax.swing.JTextField();
        NomPem = new javax.swing.JLabel();
        uNominal = new javax.swing.JTextField();
        bHitung = new javax.swing.JButton();
        bCetak = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        uTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        uHarga = new javax.swing.JLabel();
        uHaddon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Judul.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Judul.setText("KASIR");
        getContentPane().add(Judul);
        Judul.setBounds(230, 20, 60, 24);

        judul2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        judul2.setText("KEDAI KOPI KITA");
        getContentPane().add(judul2);
        judul2.setBounds(190, 50, 160, 24);

        NoPesanan.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        NoPesanan.setText("No. Pesanan");
        getContentPane().add(NoPesanan);
        NoPesanan.setBounds(39, 109, 67, 16);

        Nama.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Nama.setText("Nama Pelanggan");
        getContentPane().add(Nama);
        Nama.setBounds(39, 137, 90, 16);

        jLabel4.setText("----------------------------------------------------------------------------------------------");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(39, 195, 470, 16);

        Pesanan.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Pesanan.setText("Nama Pesanan");
        getContentPane().add(Pesanan);
        Pesanan.setBounds(39, 229, 81, 16);

        DinginPanas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        DinginPanas.setText("Dingin / Panas");
        getContentPane().add(DinginPanas);
        DinginPanas.setBounds(40, 260, 81, 16);

        jLabel8.setText("----------------------------------------------------------------------------------------------");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 350, 460, 16);

        Gula.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Gula.setText("Gula");
        getContentPane().add(Gula);
        Gula.setBounds(40, 290, 37, 16);

        TakeDine.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        TakeDine.setText("Take Away / Dine In");
        getContentPane().add(TakeDine);
        TakeDine.setBounds(39, 170, 102, 16);

        Total.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Total.setText("Total Pembayaran");
        getContentPane().add(Total);
        Total.setBounds(39, 379, 95, 16);

        Kembalian.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Kembalian.setText("Kembalian");
        getContentPane().add(Kembalian);
        Kembalian.setBounds(39, 477, 55, 16);

        Addon.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Addon.setText("Add-On");
        getContentPane().add(Addon);
        Addon.setBounds(40, 320, 41, 16);
        getContentPane().add(uNoPesanan);
        uNoPesanan.setBounds(224, 106, 238, 22);
        getContentPane().add(uNamaPelanggan);
        uNamaPelanggan.setBounds(224, 134, 238, 22);

        uMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilihan Menu", "Vanilla Latte", "Dolce Latte", "Choco Latte", "Americano", " " }));
        uMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uMenuActionPerformed(evt);
            }
        });
        getContentPane().add(uMenu);
        uMenu.setBounds(229, 223, 237, 22);

        uSuhu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilihan Dingin / Panas", "Dingin", "Panas" }));
        uSuhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uSuhuActionPerformed(evt);
            }
        });
        getContentPane().add(uSuhu);
        uSuhu.setBounds(230, 260, 237, 22);

        takedine.add(uTanpaGula);
        uTanpaGula.setText("Tanpa Gula");
        getContentPane().add(uTanpaGula);
        uTanpaGula.setBounds(230, 290, 90, 21);

        takedine.add(uNormal);
        uNormal.setText("Normal");
        getContentPane().add(uNormal);
        uNormal.setBounds(400, 290, 80, 21);

        takedine.add(uSetengah);
        uSetengah.setText("Setengah");
        getContentPane().add(uSetengah);
        uSetengah.setBounds(320, 290, 80, 21);

        uAddon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilihan Add-On", "Whip Cream", "Sirup Coklat", "Gula Aren", "Es Krim" }));
        uAddon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uAddonActionPerformed(evt);
            }
        });
        getContentPane().add(uAddon);
        uAddon.setBounds(230, 320, 237, 22);

        gula.add(uTake);
        uTake.setText("Take Away");
        getContentPane().add(uTake);
        uTake.setBounds(224, 168, 98, 21);

        gula.add(uDine);
        uDine.setText("Dine In");
        getContentPane().add(uDine);
        uDine.setBounds(357, 168, 98, 21);
        getContentPane().add(uKembalian);
        uKembalian.setBounds(227, 474, 239, 22);

        NomPem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        NomPem.setText("Nominal Pembayaran");
        getContentPane().add(NomPem);
        NomPem.setBounds(39, 416, 112, 16);
        getContentPane().add(uNominal);
        uNominal.setBounds(225, 413, 241, 22);

        bHitung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizpemvis/BayarE.png"))); // NOI18N
        bHitung.setText("Hitung");
        bHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHitungActionPerformed(evt);
            }
        });
        getContentPane().add(bHitung);
        bHitung.setBounds(357, 441, 110, 27);

        bCetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizpemvis/Printttt.png"))); // NOI18N
        bCetak.setText("Cetak Struk");
        bCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCetakActionPerformed(evt);
            }
        });
        getContentPane().add(bCetak);
        bCetak.setBounds(340, 500, 130, 26);

        bReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizpemvis/reset.png"))); // NOI18N
        bReset.setText("Reset");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });
        getContentPane().add(bReset);
        bReset.setBounds(230, 500, 100, 27);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizpemvis/logo.png"))); // NOI18N
        logo.setText("jLabel2");
        getContentPane().add(logo);
        logo.setBounds(59, 0, 104, 100);

        uTotal.setBackground(new java.awt.Color(255, 255, 255));
        uTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(uTotal);
        uTotal.setBounds(230, 380, 240, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizpemvis/bgkopi.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 510, 560);

        uHarga.setText("jLabel2");
        getContentPane().add(uHarga);
        uHarga.setBounds(480, 430, 0, 16);

        uHaddon.setText("jLabel2");
        getContentPane().add(uHaddon);
        uHaddon.setBounds(450, 370, 38, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHitungActionPerformed
        String nominal = uNominal.getText();
        inominal = Integer.parseInt(nominal);
        kembalian = inominal - total;
        uKembalian.setText(""+ Integer.toString(kembalian));
    }//GEN-LAST:event_bHitungActionPerformed

    private void uMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uMenuActionPerformed
        menu = (String)uMenu.getSelectedItem();
        switch (menu){
            case "Pilihan Menu" :
                mmenu = "-";
                break;
            case "Vanilla Latte" :
                mmenu = "Vanilla Latte";
                harga = (int) 15000;
                break;
            case "Dolce Latte" :
                mmenu = "Dolce Latte";
                harga = (int)17000;
                break;
            case "Choco Latte" : 
                mmenu = "Choco Latte";
                harga = (int) 20000;
                break;
            case "Americano" :
                mmenu = "Americano";
                harga = (int) 25000;
                break;
        }
        uHarga.setText(""+Integer.toString(harga));
    }//GEN-LAST:event_uMenuActionPerformed

    private void uSuhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uSuhuActionPerformed
        suhu = (String)uSuhu.getSelectedItem();
        switch (suhu){
            case "Pilihan Dingin/Panas":
                msuhu = "-";
                break;
            case "Dingin" :
                msuhu = "Dingin";
                break;
            case "Panas" :
                msuhu = "Panas";
                break;
        }
    }//GEN-LAST:event_uSuhuActionPerformed

    private void uAddonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uAddonActionPerformed
        tambahan = (String)uAddon.getSelectedItem();
        switch (tambahan){
            case "Pilihan Add-On":
                mtambahan = "-";
                break;
            case "Whip Cream" :
                mtambahan = "Whip Cream";
                haddon = (int) 3000;
                break;
            case "Sirup Coklat" :
                mtambahan= "Sirup Coklat";
                haddon = (int) 2000;
                break;
            case "Gula Aren" :
                mtambahan = "Gula Aren";
                haddon = (int) 5000;
                break;
            case "Es Krim" :
                mtambahan = "Es Krim";
                haddon = (int) 7000;
                break;
        }
        uHaddon.setText(""+Integer.toString(haddon));  
        harga = Integer.parseInt(uHarga.getText());
        haddon = Integer.parseInt(uHaddon.getText());
        total = harga + haddon;
        uTotal.setText(""+Integer.toString(total));
    }//GEN-LAST:event_uAddonActionPerformed

    private void bCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCetakActionPerformed
        String nopes = uNoPesanan.getText();
        String nama = uNamaPelanggan.getText();
        String TakeDine, Gula;
        
        if(uDine.isSelected()){
            TakeDine = "Dine In";
        }else{
            TakeDine = "Take away";}
        
        if (uTanpaGula.isSelected()){
            Gula = "Tanpa Gula";
        }else if (uSetengah.isSelected()){
            Gula = "Setengah";
        }else{
            Gula = "Normal";
        }
        JOptionPane.showMessageDialog(null, 
                "        -- Struk Pembayaran --" + 
                "\nNo.Pesanan                  : "+ nopes +
                "\nNama Pelanggan          : "+nama + 
                "\nTake away/Dine in        : "+TakeDine +
                "\n------------------------------------------" +
                "\nPesanan                         : " + mmenu +
                "\nDingin/Panas                 : "+ msuhu +
                "\nGula                                : " + Gula +
                "\nAdd-On                           : " + mtambahan +
                "\nTotal Pembayaran         : " + total + 
                "\nNominal Pembayaran    : " + inominal +
                "\nKembalian                      : " +kembalian);
    }//GEN-LAST:event_bCetakActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        uNamaPelanggan.setText("");
        uNoPesanan.setText("");
        uMenu.setSelectedIndex(0);
        uSuhu.setSelectedIndex(0);
        uAddon.setSelectedIndex(0);
        uTotal.setText("");
        uNominal.setText("");
        uKembalian.setText("");
        takedine.clearSelection();
        gula.clearSelection();

    }//GEN-LAST:event_bResetActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kopi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Addon;
    private javax.swing.JLabel DinginPanas;
    private javax.swing.JLabel Gula;
    private javax.swing.JLabel Judul;
    private javax.swing.JLabel Kembalian;
    private javax.swing.JLabel Nama;
    private javax.swing.JLabel NoPesanan;
    private javax.swing.JLabel NomPem;
    private javax.swing.JLabel Pesanan;
    private javax.swing.JLabel TakeDine;
    private javax.swing.JLabel Total;
    private javax.swing.JButton bCetak;
    private javax.swing.JButton bHitung;
    private javax.swing.JButton bReset;
    private javax.swing.ButtonGroup gula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel judul2;
    private javax.swing.JLabel logo;
    private javax.swing.ButtonGroup takedine;
    private javax.swing.JComboBox<String> uAddon;
    private javax.swing.JRadioButton uDine;
    private javax.swing.JLabel uHaddon;
    private javax.swing.JLabel uHarga;
    private javax.swing.JTextField uKembalian;
    private javax.swing.JComboBox<String> uMenu;
    private javax.swing.JTextField uNamaPelanggan;
    private javax.swing.JTextField uNoPesanan;
    private javax.swing.JTextField uNominal;
    private javax.swing.JRadioButton uNormal;
    private javax.swing.JRadioButton uSetengah;
    private javax.swing.JComboBox<String> uSuhu;
    private javax.swing.JRadioButton uTake;
    private javax.swing.JRadioButton uTanpaGula;
    private javax.swing.JLabel uTotal;
    // End of variables declaration//GEN-END:variables
}
