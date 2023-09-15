package t3grupojavaulp.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import t3grupojavaulp.Entidades.Materia;
import t3grupojavaulp.Entidades.Alumno;
import t3grupojavaulp.Entidades.Inscripcion;

public class InscripcionData {

    private Connection con;
    private MateriaData matData = new MateriaData();
    private AlumnoData aluData = new AlumnoData();

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
            if (res.next()) {
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
        String sql = "SELECT * FROM inscripcion";
        ArrayList<Inscripcion> insList = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet res = ps.executeQuery();
            while (res.next()) {
                Inscripcion ins = new Inscripcion();
                ins.setIdInscripcion(res.getInt("idInscripto"));
                ins.setNota(res.getDouble("nota"));
                ins.setAlumno(aluData.buscarAlumno(res.getInt("idAlumno")));
                ins.setMateria(matData.buscarMateria(res.getInt("idMateria")));
                insList.add(ins);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }
        return insList;

    }

    /**
     * *
     * Regresa la lista de inscripciones del alumno correspondiente a <b>id</b>
     *
     *
     * @param id idAlumno del alumno
     * @return Lista de inscripciones del alumno.
     * @see ArrayList
     * @see Alumno
     * @see Inscripcion
     */
    public ArrayList<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT i.* FROM inscripcion AS i "
                + "INNER JOIN alumno AS a ON a.idAlumno = i.idAlumno "
                + "INNER JOIN materia AS m ON m.idMateria = i.idMateria "
                + "WHERE a.idAlumno = ? AND a.estado = 1;";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion(rs.getInt("idInscripto"),
                        aluData.buscarAlumno(rs.getInt("idAlumno")),
                        matData.buscarMateria(rs.getInt("idMateria")),
                        rs.getDouble("nota"));
                inscripciones.add(inscripcion);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex.getMessage(), sql, JOptionPane.ERROR_MESSAGE);
        }

        return inscripciones;
    }

    public ArrayList<Materia> obtenerMateriasCursadas(int id) {
        ArrayList<Materia> materias = new ArrayList<>();
        try {
            String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion, materia"
                    + "WHERE inscripcion.idMateria= materia.idMateria AND inscripcion.idAlumno=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener inscripción" + e.getMessage());
        }
        return materias;
    }

    public ArrayList<Materia> obtenerMateriasNOCursadas(int id) {
        ArrayList<Materia> materias = new ArrayList<>();
        try {
            String sql = "SELECT * FROM materia "
                    + "WHERE idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener inscripción" + e.getMessage());
        }
        return materias;

    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Inscripcion eliminada!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error SQL!");
        }

    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String sql = "UPDATE `inscripcion` SET `nota`= ? WHERE idAlumno = ? AND idMateria = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int filas = ps.executeUpdate();

            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Nota actualizada!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error SQL!");
        }

    }

    public ArrayList<Alumno> obtenerAlumnosXMateria(int idMateria) {

        ArrayList<Alumno> alumnos = new ArrayList<>();
        String sql = "SELECT alumno.idAlumno,alumno.dni,alumno.apellido, alumno.nombre, alumno.fechaDeNacimiento,alumno.estado"
                + " FROM inscripcion,alumno WHERE inscripcion.idAlumno =alumno.idAlumno AND idMateria=? AND alumno.estado=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno(rs.getInt("idAlumno"),
                        rs.getInt("dni"),
                        rs.getString("apellido"),
                        rs.getString("nombre"),
                        rs.getDate("fechaDeNacimiento"),
                        rs.getBoolean("estado"));
                alumnos.add(alumno);
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener alumnos" + e.getMessage());
        }
        return alumnos;

    }

}
