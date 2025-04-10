package ec.edu.ups.poo;

import ec.edu.ups.poo.clases.*;
import ec.edu.ups.poo.enums.Rol;
import ec.edu.ups.poo.enums.TipoDireccion;

import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String [] args) {

        //Ejemplo creacion de SEDES


        Persona persona = new Persona();

        Direccion direccion = new Direccion();
        direccion.setCallePrincipal("Calle Principal");
        persona.addDirecciones(direccion);
        Institucion institucion = new Institucion();
        List<String> sedes = new ArrayList<>();
        sedes.add("El vecino");
        sedes.add("Quito");
        sedes.add("Guayaquil");
        institucion.setSedes(sedes);
        System.out.println(institucion.getSedes());

        //Ejemplo creacion de Cargos y Responsabilidades
        Administrativo administrativos = new Administrativo();
        List<String> cargos = new ArrayList<>();
        cargos.add("Rector");
        cargos.add("Coordinador");
        cargos.add("Vicerector");
        cargos.add("Secretario");
        administrativos.setCargos(cargos);

        List<String> responsabilidades = new ArrayList<>();
        responsabilidades.add("Manetner el orden dentro de la institucion");
        responsabilidades.add("Coordinar eventos dentro de la institucion");
        responsabilidades.add("Guiar a la insitucion por un buen camino");
        responsabilidades.add("Enfocar a los estudiantes en su carrera");

/*
        System.out.println(cargos);
        System.out.println(responsabilidades);
*/
        //Ejemplo creacion de Titulos y Areas (Profesor)
        Profesor profesores = new Profesor();
        List<String> titulosAcademicos = new ArrayList<>();
        titulosAcademicos.add("Titulo de Profesional en Ciencias de la Computacion");
        titulosAcademicos.add("Maestria en Ciencias de la Computacion");
        titulosAcademicos.add("PHD en Ciencias de la Computacion");
        titulosAcademicos.add("Titulo de Licenciado en Contabilidad");

        List<String> areasDeEspecializacion = new ArrayList<>();
        areasDeEspecializacion.add("Cyberseguridad ");
        areasDeEspecializacion.add("Base de Datos");
        areasDeEspecializacion.add("Programacion Orientada a Objetos");
        areasDeEspecializacion.add("Estructura de Datos");
        /*
        System.out.println(titulosAcademicos);
        System.out.println(areasDeEspecializacion);
        */

        List<Asignacion> asignaciones = new ArrayList<>();
        List<Asignacion> asignaciones2 = new ArrayList<>();



        Direccion direccionEstudiante = new Direccion(TipoDireccion.CASA,"Av Loja","Don Bosco", "787","Cuenca","Azuay", "Puerto Rico");
        Direccion direccionProfesor = new Direccion(TipoDireccion.INSTITUCION,"Av Las Americas","Kemba Walker", "787","Cuenca","Santulce", "Puerto Rico");
        Direccion direccionAdministrativo = new Direccion(TipoDireccion.TRABAJO,"Av España","Cruz Cafune", "8-8","Mallorca","Sevilla", "España");
        Direccion direccionVisitante = new Direccion(TipoDireccion.INSTITUCION,"Av Las Americas","Kemba Walker", "787","Cuenca","Santulce", "Puerto Rico");

        Institucion institucion1 = new Institucion(001,"Universidad Politecnica Salesiana - Cuenca",  sedes, asignaciones);
        Institucion institucion2 = new Institucion(002,"Universidad Politecnica Salesiana - Quito",  sedes, asignaciones2);

        Estudiante estudiante =  new Estudiante("0150363232", "Mateo","Molina", "0991650338", "mmolinac10@est.ups.edu.ec","Computacion");
        Profesor profesor =  new Profesor("01152351519", "Edwin","Vargas", "04516565165", "profesor@ups.edu.ec", titulosAcademicos, areasDeEspecializacion);
        Visitante visitante = new Visitante("3126516512","Juanito","Billar","6256156156","visitante@ups.edu.ec","Acceso a Instalaciones", new GregorianCalendar(2025, GregorianCalendar.AUGUST, 29),new GregorianCalendar(2025, GregorianCalendar.AUGUST, 30));
        Administrativo administrativo = new Administrativo("265165156","Jhon","Cabrion","12561561","administrativo@ups.edu.ec",cargos,responsabilidades);

        /*
        profesor.addTitulosAcademicos("Maestria en Ciencias de la Computacion");
        profesor.addAreasDeEspecializacion("Gestion de Estudiantes problematicos, Base de Datos");
*/
        estudiante.addDirecciones(direccionEstudiante);
        profesor.addDirecciones(direccionProfesor);
        administrativo.addDirecciones(direccionAdministrativo);
        visitante.addDirecciones(direccionVisitante);


        Asignacion asignacionEstudiante = new Asignacion(estudiante, new GregorianCalendar(2024, 1, 11), Rol.ESTUDIANTE);
        Asignacion asignacionProfesor = new Asignacion(profesor, new GregorianCalendar(2023, 3, 31), Rol.DOCENTE);
        Asignacion asignacionAdministrativo = new Asignacion(administrativo, new GregorianCalendar(2022, 8, 10), Rol.ADMINISTRATIVO);
        Asignacion asignacionVisitante = new Asignacion(visitante, new GregorianCalendar(2025, 4, 7), Rol.VISITANTE);

        // Asignar personas a instituciones
        institucion1.addAsignacion(asignacionEstudiante);
        institucion1.addAsignacion(asignacionProfesor);

        institucion2.addAsignacion(asignacionAdministrativo);
        institucion2.addAsignacion(asignacionVisitante);

        institucion1.addDireccion(TipoDireccion.INSTITUCION, "Av Bad Bunny","Calle Dei V underwatel","787","Cuenca","Almirante", "Australia" );
        institucion2.addDireccion(TipoDireccion.INSTITUCION, "De Carolina","KYOTO","593","Cuenca","Alicante", "España" );

        // Imprimir datos
        System.out.println(institucion1);
        System.out.println(institucion2);
    }
}