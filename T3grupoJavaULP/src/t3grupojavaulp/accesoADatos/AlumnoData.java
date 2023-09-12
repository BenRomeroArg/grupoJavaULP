package t3grupojavaulp.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al acceder a la tabla", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Alumno buscarAlumno(int id) {
        Alumno alumno = null;
        String sql = "SELECT idAlumno,dni, apellido, nombre, fechaDeNacimiento FROM alumno WHERE idAlumno = ? AND estado = 1";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaDeNacimiento"));
                alumno.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno" + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return alumno;
    }

    public Alumno buscarAlumnoPorDni(int dni) {
        Alumno alumno = null;
        String sql = "SELECT idAlumno,dni,apellido, nombre, fechaDeNacimiento FROM alumno WHERE dni = ? AND estado = 1";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(dni);
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaDeNacimiento"));
                alumno.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return alumno;
    }
    
    public void eliminarAlumno(int id) {
        try {
            String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "El alumno se elimino con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public ArrayList<Alumno> listarAlumnos() {
        String sql = "SELECT idAlumno,dni,apellido,nombre FROM alumno WHERE estado = 1";
        ArrayList<Alumno> alList = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
           
            ResultSet res = ps.executeQuery();
            while (res.next()) {
               Alumno al = new Alumno();
                al.setIdAlumno(res.getInt("idAlumno"));
                al.setDni(res.getInt("dni"));
                al.setApellido(res.getString("apellido"));
                al.setNombre(res.getString("nombre"));
                alList.add(al);
            } 
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }
        return alList;
    }
    
    public void modificarAlumno(Alumno alumno) {
        String sql="UPDATE alumno SET dni=?, apellido=?, nombre=?, fechaDeNacimiento=? WHERE idAlumno=?";
        PreparedStatement ps=null;
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, alumno.getFechaNacimiento());
            ps.setInt(5, alumno.getIdAlumno());
            
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Ha modificado al alumno exitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "El alumno no existe");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno"+e.getMessage());
        }
    }
}
