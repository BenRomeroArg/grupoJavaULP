package t3grupojavaulp.accesoADatos;

import java.sql.Connection;
import t3grupojavaulp.Entidades.Materia;


public class MateriaData {
    private Connection con;

    public MateriaData() {
        con = Conexion.conectar();
    }
    
    public void guardarMateria(Materia materia) {
        // TODO
    }
    
    public Materia buscarMateria(int id) {
        // TODO
    }
    
    public void modificarMateria(Materia materia) {
        // TODO
    }
    
    public void eliminarMateria(int id) {
        // TODO
    }
    
    public ArrayList<Materia> listarMaterias() {
        // TODO
    }
}
