package t3grupojavaulp.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import t3grupojavaulp.Entidades.Alumno;


public class AlumnoData {
    private Connection con;

    public AlumnoData() {
        con = Conexion.conectar();
    }
    
    public void guardarAlumno(Alumno alumno) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO `alumno`( `dni`, `apellido`, `nombre`, `fechaDeNacimiento`, `estado`) VALUES (?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, alumno.getFechaNacimiento());
            ps.setInt(5, alumno.getEstadoAsInt());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                JOptionPane.showMessageDialog(null, "El alumno se añadio con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
            }
            ps.close();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al acceder a la tabla", JOptionPane.ERROR_MESSAGE);
        }
    }
}
