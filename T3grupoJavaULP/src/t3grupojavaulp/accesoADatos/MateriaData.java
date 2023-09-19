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
    
    /**
     * Guarda un objeto <b>Materia</b> en la base de datos.
     * 
     * @param   materia El objeto Materia a guardar.
     * @see     Materia
     */
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
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "La materia se añadió con exito, ID: " + materia.getIdMateria(), "Exito", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al acceder a la tabla", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /***
     * Regresa de la base de datos el objeto <b>Materia</b> correspondiente al id proporcionado.
     * 
     * @param   id  id de la materia en la base de datos (<b>idMateria</b>).
     * @return      el objeto correspondiente al id.
     * @see         Materia
     */
    public Materia buscarMateria(int id) {
        Materia materia = null;
        String sql = "SELECT idMateria, nombre, año, estado FROM materia WHERE idMateria = ? AND estado = 1";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            
            // Ejecutamos el query
            ResultSet rs = ps.executeQuery();
            
            // Si hay resultado lo agregamos a un objeto Materia
            if (rs.next()) {
                materia = new Materia(  rs.getInt("idMateria"), 
                                        rs.getString("nombre"), 
                                        rs.getInt("año"), 
                                        rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia con el ID: " + id, "Sin resultados", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'materia'" + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            return materia;
        }
    }
    
    /***
     * Guarda los cambios de un objeto <b>Materia</b> ya existente en la base de datos.
     * 
     * @param materia el objeto a guardar
     * @see Materia
     */
    public void modificarMateria(Materia materia) {
        String sql = "UPDATE materia SET nombre = ?, año = ?, estado = ? WHERE idMateria = ?";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.setInt(4, materia.getIdMateria());
            
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Modificado exitosamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "La materia no existe en la base de datos.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex.getMessage(), "SQL ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /***
     * Elimina de la base de datos la <b>Materia</b> correspondiente al id proporcionado.
     * 
     * @param id correspondiente al <b>idMateria</b> en la base de datos.
     */
    public void eliminarMateria(int id) {
        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó la materia.", "Exito", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex.getMessage(), "SQL ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /***
     * Regresa <b>ArrayList</b> de <b>Materia</b> que se encuentran en la base de datos.
     * 
     * @return Lista de objetos <b>Materia</b> en la base de datos.
     * @see Materia
     * @see ArrayList
     */
    public ArrayList<Materia> listarMaterias() {
        ArrayList<Materia> materias = new ArrayList<>();
        String sql = "SELECT * FROM materia WHERE estado = 1";
        
        try (ResultSet rs = con.prepareStatement(sql).executeQuery()) {
            while (rs.next()) {
                Materia materia = new Materia(  rs.getInt("idMateria"), 
                                                rs.getString("nombre"), 
                                                rs.getInt("año"), 
                                                rs.getBoolean("estado"));
                materias.add(materia);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex.getMessage(), "SQL ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return materias;
    }
}
