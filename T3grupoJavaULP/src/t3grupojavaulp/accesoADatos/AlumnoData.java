package t3grupojavaulp.accesoADatos;

import java.sql.Connection;


public class AlumnoData {
    private Connection con = null;

    public AlumnoData() {
        con = Conexion.conectar();
    }

}
