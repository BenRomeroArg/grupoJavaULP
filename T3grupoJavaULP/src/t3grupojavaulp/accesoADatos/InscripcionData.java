package t3grupojavaulp.accesoADatos;

import java.sql.Connection;
import java.util.ArrayList;
import t3grupojavaulp.Entidades.Inscripcion;
import t3grupojavaulp.Entidades.Materia;
import t3grupojavaulp.Entidades.Alumno;

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
    public ArrayList<Inscripcion> ObtenerInscripciones() {
        // TODO
        return null;
        // TODO
}
   public ArrayList<Inscripcion> ObtenerInscripcionesPorAlumno(int id) {
        // TODO
        return null;
        // TODO
}
 public ArrayList<Materia> ObtenerMateriasCursadas(int id) {
        // TODO
        return null;
        // TODO
}
 public ArrayList<Materia> ObtenerMateriasNOCursadas(int id) {
        // TODO
        return null;
        // TODO
}
    
    
    public void borrarInscripcionMateriaAlumno(int idAlumno,int idMateria) {
        // TODO
    }
    
    public void actualizarNota(int idMateria,double nota) {
        // TODO
    }
    
  public ArrayList<Alumno> ObtenerAlumnosXMateria(int idMateria) {
        // TODO
        return null;
        // TODO

}
}