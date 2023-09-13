package t3grupojavaulp.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import t3grupojavaulp.Entidades.Materia;
import t3grupojavaulp.Entidades.Alumno;
import t3grupojavaulp.Entidades.Inscripcion;

public class InscripcionData {

    Connection con;
    MateriaData matData;
    AlumnoData aluData;

    public InscripcionData() {
        con = Conexion.conectar();
    }

    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO `inscripcion`( `nota`, `idAlumno`, `idMateria`) VALUES (?,?,?);";
        
        try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
               
                ps.setDouble(1, insc.getNota());
                ps.setInt(2, insc.getAlumno().getIdAlumno());
                ps.setInt(3, insc.getMateria().getIdMateria());
                ps.executeUpdate();
                ResultSet res = ps.getGeneratedKeys();
                if(res.next()){
                    JOptionPane.showMessageDialog(null, "Se guardo la inscripcion con exito!");
                }
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error SQL");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error guardando la inscripción: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    public ArrayList<Inscripcion> obtenerInscripciones() {
        // TODO
        return null;
    }

    public ArrayList<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        // TODO
        return null;
    }

    public ArrayList<Materia> obtenerMateriasCursadas(int id) {
        ArrayList<Materia> materias= new ArrayList<>();
        try {
            String sql= "SELECT inscripcion.idMateria, nombre, año FROM inscripcion, materia"
                      + "WHERE inscripcion.idMateria= materia.idMateria AND inscripcion.idAlumno=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia=new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener inscripción"+e.getMessage());
        }
        return materias;
    }

    public ArrayList<Materia> obtenerMateriasNOCursadas(int id) {
        // TODO
        return null;
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {

    }

    public ArrayList<Alumno> obtenerAlumnosXMateria(int idMateria) {
        // TODO
        return null;
    }

}
