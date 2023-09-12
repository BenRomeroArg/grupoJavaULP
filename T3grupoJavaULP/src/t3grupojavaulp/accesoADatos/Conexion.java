package t3grupojavaulp.accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

 // @author naigg

public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String USUARIO = "root";
    private static final String PASS = "";
    private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String DB = "universidad_db";
    
    private static Connection cx;

    public Conexion(String bd) {}

    public static Connection conectar() {
        try {
            Class.forName(DRIVER);
            cx = DriverManager.getConnection(URL + DB, USUARIO, PASS);

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar el Driver " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión " + ex.getMessage());
        }
        return cx;
    }

//PEGAR EN UN MAIN
//    public static void main(String[] args) {
//        Conexion con = new Conexion("universidad_db");
//        con.conectar();
//    }
}