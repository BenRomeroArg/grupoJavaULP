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
        // TODO
        String sql = "INSERT INTO `inscripcion`( `nota`, `idAlumno`, `idMateria`) VALUES (?,?,?)";
        
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
        }
        
    }

    public void eliminarMateria(int id) {
        // TODO
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
        // TODO
        return null;
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
