package t3grupojavaulp.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import t3grupojavaulp.Entidades.Materia;


public class MateriaData {
    private Connection con;

    public MateriaData() {
        con = Conexion.conectar();
    }
    
    public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nombre, año, estado) VALUES (?,?,?)";
        
        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            
            // Ejecutamos el comando
            ps.executeUpdate();
            
            // Recuperamos el id.
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()) {
                materia.setIdMateria(rs.getInt("idMateria"));
                JOptionPane.showMessageDialog(null, "La materia se añadió con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al acceder a la tabla", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Materia buscarMateria(int id) {
        Materia materia = null;
        String sql = "SELECT idMateria, nombre, año, estado FROM materia WHERE idMateria = ? AND estado = 1";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            
            // Ejecutamos el query
            ResultSet rs = ps.executeQuery();
            
            // Si hay resultado lo agregamos a un objeto Materia
            if (rs.next()) {
                materia = new Materia(rs.getInt("idMateria"), 
                                    rs.getString("nombre"), 
                                    rs.getInt("año"), 
                                    rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno", "Sin resultados", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'materia'" + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            return materia;
        }
    }
    
    public void modificarMateria(Materia materia) {
        // TODO
    }
    
    public void eliminarMateria(int id) {
        // TODO
    }
    
    public ArrayList<Materia> listarMaterias() {
        // TODO
        return null;
    }
}
