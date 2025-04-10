package ec.edu.ups.poo.clases;
import ec.edu.ups.poo.enums.TipoDireccion;

import java.util.ArrayList;
import java.util.List;
public class Institucion {

    private int id;
    private String nombre;
    private List<String> sedes;
    private Direccion direcciones; //La clase Direccion
    private List<Asignacion> asignaciones;//De la clase Asignacion




    public Institucion() {}
    public Institucion(int id, String nombre,Direccion direcciones, List<String> sedes, List<Asignacion> asignaciones) {
        this.id = id;
        this.nombre = nombre;
        this.sedes = sedes;
        this.direcciones = new Direccion();
        this.asignaciones = asignaciones;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addSede(String sede) {
        //Metodo para agregar un elemento a una lista
        sedes.add(sede);
    }
    public void setSedes(List<String> sedes){
        this.sedes = sedes;
    }
    public List<String> getSedes() {
        return sedes;
    }

    public void addAsignacion(Asignacion asignacion) {
        //Metodo para agregar un elemento a una lista
        asignaciones.add(asignacion);
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void addDireccion (TipoDireccion tipoDireccion, String callePrincipal, String calleSecundaria, String numeracion, String ciudad, String provincia, String pais){
        this.direcciones = new Direccion(tipoDireccion,callePrincipal,calleSecundaria, numeracion,ciudad, provincia,pais);
    }
    public Direccion getDireccionesIns() {
        return direcciones;
    }



    @Override
    public String toString(){
        return " Institucion: "+
                " Nombre: "+nombre+
                " Direccion: " + direcciones+
                " Sede: "+sedes+
                " Asignacion: "+asignaciones+
                " ID: "+id;


    }
}