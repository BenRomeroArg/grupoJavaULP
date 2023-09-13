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


          //Inscribir alumno a materia, buscando el idAlumno y idMateria
//            AlumnoData alData = new AlumnoData();
//            MateriaData matData = new MateriaData();
//            InscripcionData iData = new InscripcionData();
//            
//            Alumno alBuscar = alData.buscarAlumno(5);
//            Materia matBuscar = matData.buscarMateria(1);
//            
//            Inscripcion insc = new Inscripcion(alBuscar,matBuscar,7.2);
//            
//            iData.guardarInscripcion(insc);
//
        
    } 
}
