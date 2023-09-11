package t3grupojavaulp.accesoADatos;

import java.sql.Connection;
import java.util.ArrayList;
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
