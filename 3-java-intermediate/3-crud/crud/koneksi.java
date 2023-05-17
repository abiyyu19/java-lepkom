package crud;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class koneksi {
    private Statement data = null;
    private Connection koneksi = null;
    
    private String Url = "jdbc:mysql://localhost/mahasiswa";
    private String DBUser = "root";
    private String DBPassword = "";
    
    public koneksi() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(Url, DBUser, DBPassword);
            data = this.koneksi.createStatement();
            System.out.println("Koneksi Berhasil");
        } catch(Throwable ex) {
            System.out.println("error : " + ex);
            System.exit(1);
        }
    }
    
    public Connection getConnection() {
        return koneksi;
    }
    
    public Statement getStatement() {
        return data;
    }
}