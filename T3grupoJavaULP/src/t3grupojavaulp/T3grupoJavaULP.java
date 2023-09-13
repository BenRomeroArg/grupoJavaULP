package t3grupojavaulp;

import java.sql.Connection;
import java.sql.Date;
import t3grupojavaulp.Entidades.Alumno;
import t3grupojavaulp.Entidades.Inscripcion;
import t3grupojavaulp.Entidades.Materia;
import t3grupojavaulp.accesoADatos.AlumnoData;
import t3grupojavaulp.accesoADatos.Conexion;
import t3grupojavaulp.accesoADatos.InscripcionData;
import t3grupojavaulp.accesoADatos.MateriaData;


public class T3grupoJavaULP {
    public static void main(String[] args) {
        Connection con=Conexion.conectar();
//        AlumnoData AD=new AlumnoData();
//        MateriaData MD = new MateriaData();
//        for(Alumno al: AD.listarAlumnos()){
//            System.out.println(al.getIdAlumno());
//            System.out.println(al.getDni());
//            System.out.println(al.getApellido());
//            System.out.println(al.getNombre());
//            System.out.println(al.getFechaNacimiento());
//        }
//        for (Materia m: MD.listarMaterias()) {
//            System.out.println(m.getNombre());
//        }

//        Alumno al = new Alumno(11,210500,"Rober","Maria",Date.valueOf("2012-09-09"),true);
//        //AlumnoData alData = new AlumnoData();
//        //alData.guardarAlumno(al);
//        
//        Materia mat = new Materia(8,"Fisica",1,true);
////        MateriaData matData = new MateriaData();
////        matData.modificarMateria(mat);
//        
//        Inscripcion insc = new Inscripcion(al,mat,7.8);
//        
//        InscripcionData iData = new InscripcionData();
//        
//        iData.guardarInscripcion(insc);
        
    } 
}
