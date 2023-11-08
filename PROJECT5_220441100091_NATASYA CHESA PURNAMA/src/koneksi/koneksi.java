/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package koneksi;

import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Natasya
 */
public class koneksi {
    private static Connection mysqlkonek;
     
    public static Connection koneksiDB() throws SQLException{
         if (mysqlkonek == null){
             try {
                 String DB = "jdbc:mysql://localhost:3306/dbshop";
                 String user = "root";
                 String pw = "";
                 DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                 mysqlkonek = (Connection) DriverManager.getConnection(DB, user, pw);
                 JOptionPane.showMessageDialog(null, "Koneksi berhasil");
             
             }catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "Koneksi gagal: " + e.getMessage());
             }
         }
         return mysqlkonek;
    }

 public static void main(String[] args) {
    try {
            java.sql.Connection connection = koneksiDB();
            if (connection != null) {
                System.out.println("Koneksi BerhasiL.");
                
            }else {
                System.out.println("Koneksi Gagal");
            }
        }catch (Exception e){
            System.out.println("Terjadi kesalahan" + e.getMessage());
        }
    }
    
}
