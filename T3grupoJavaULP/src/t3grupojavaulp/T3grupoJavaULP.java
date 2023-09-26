package t3grupojavaulp;

import java.sql.Connection;

import t3grupojavaulp.Vistas.UniversidadVista;

import t3grupojavaulp.accesoADatos.Conexion;


public class T3grupoJavaULP {

    public static void main(String[] args) {
        Connection con = Conexion.conectar();
        UniversidadVista app = new UniversidadVista();
        app.setVisible(true);

    }
}
//////////////////LISTA DE PAQUETES IMPORTADOS///////////////////
//import java.sql.Date;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import t3grupojavaulp.Entidades.Alumno;
//import t3grupojavaulp.Entidades.Inscripcion;
//import t3grupojavaulp.Entidades.Materia;
//import t3grupojavaulp.accesoADatos.AlumnoData;
//import t3grupojavaulp.accesoADatos.InscripcionData;
//import t3grupojavaulp.accesoADatos.MateriaData;
//////////////////PRUEBA DE METODOS/////////////////////////////
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

        // Inscribir alumno a materia, buscando el idAlumno y idMateria
//        AlumnoData alData = new AlumnoData();
//        MateriaData matData = new MateriaData();
//        InscripcionData iData = new InscripcionData();

//        Alumno alBuscar = alData.buscarAlumno(8);
//        Materia matBuscar = matData.buscarMateria(6);
//
//        Inscripcion insc = new Inscripcion(alBuscar,matBuscar,8.2);
//        iData.guardarInscripcion(insc);
        //iData.actualizarNota(5, 4, 9);
        //iData.borrarInscripcionMateriaAlumno(5, 4);
//        for (Alumno a: iData.obtenerAlumnosXMateria(4)) {
//            System.out.println(a.toString());
//        }
//        for (Inscripcion i : iData.obtenerInscripciones()) {
//            System.out.println(i.toString());
//        }
//          for (Inscripcion i : iData.obtenerInscripcionesPorAlumno(5)) {
//            try {
//                System.out.println(i.getMateria().toString());
//            } catch (Exception ex) {
//                Logger.getLogger(T3grupoJavaULP.class.getName()).log(Level.SEVERE, null, ex);
//            }
//          }
//        for (Materia i : iData.obtenerMateriasNOCursadas(3)) {
//            System.out.println(i.toString());
//        }
//        MateriaData mD= new MateriaData();
//        mD.listarMaterias();