package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class koneksi {

    // Ganti dengan username, password, dan nama database yang sesuai
    private static final String URL = "jdbc:mysql://localhost:3306/app_umkm";
    private static final String USER = "root"; // Username MySQL
    private static final String PASSWORD = ""; // Password MySQL

    // Mengambil koneksi ke database
    public static Connection getConnection() {
        try {
            // Cek apakah koneksi berhasil
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            return conn;
        } catch (SQLException e) {
            System.out.println("Error koneksi: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        // Coba koneksi ke database
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("Koneksi berhasil!");
        } else {
            System.out.println("Koneksi gagal!");
        }
    }

    Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}