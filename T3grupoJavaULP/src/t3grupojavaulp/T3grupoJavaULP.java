package t3grupojavaulp;

import java.sql.Connection;
import t3grupojavaulp.Entidades.Alumno;
import t3grupojavaulp.accesoADatos.AlumnoData;
import t3grupojavaulp.accesoADatos.Conexion;


public class T3grupoJavaULP {
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con=Conexion.conectar();
        AlumnoData AD=new AlumnoData();
        for(Alumno al: AD.listarAlumnos()){
            System.out.println(al.getIdAlumno());
            System.out.println(al.getDni());
            System.out.println(al.getApellido());
            System.out.println(al.getNombre());
            System.out.println(al.getFechaNacimiento());
        }
        
    } 
}
