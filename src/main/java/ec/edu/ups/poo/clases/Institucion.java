package ec.edu.ups.poo.clases;
import java.util.ArrayList;
import java.util.List;
public class Institucion {
    
    private int id;
    private String nombre;
    private List<String> sedes;
    private Direccion direccionesIns; //La clase Direccion
    private List<Asignacion> asignaciones;//De la clase Asignacion




    public Institucion() {}
    public Institucion(int id, String nombre, List<String> sedes, Direccion direccionesIns, List<Asignacion> asignaciones) {
        this.id = id;
        this.direccionesIns = direccionesIns;
        this.nombre = nombre;
        this.sedes = sedes;
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

    public Direccion getDireccionesIns() {
        return direccionesIns;
    }

    public void setDireccionesIns(Direccion direccionesIns) {
        this.direccionesIns = direccionesIns;
    }


    @Override
    public String toString(){
        return "Institucion: "+
                "Nombre: "+nombre+
                "Direccion: " + direccionesIns+
                "Sede: "+sedes+
                "Asignacion: "+asignaciones+
                "ID: "+id;


    }
}