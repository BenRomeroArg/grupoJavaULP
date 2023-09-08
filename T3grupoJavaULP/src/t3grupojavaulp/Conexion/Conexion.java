package t3grupojavaulp.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author naigg
 */
public class Conexion {
    


    private String url, bd, usuario, pass, driver;
    private Connection cx;

    public Conexion(String bd) {
        this.bd = bd;
        url = "jdbc:mariadb://localhost:3306/";
        usuario = "root";
        pass = "";
        driver = "org.mariadb.jdbc.Driver";
    }

    public Connection conectar() {
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url + bd, usuario, pass);

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar el Driver " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión " + ex.getMessage());
        }
        return cx;
    }

//PEGAR EN UN MAIN
    public static void main(String[] args) {
        Conexion con = new Conexion("universidad_db");
        con.conectar();
    }
}


