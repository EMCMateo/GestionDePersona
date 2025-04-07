package ec.edu.ups.poo.clases;
import java.util.List;
public class Institucion {
    private String id;
    private String nombre;
    private List<String> sedes;
    private List<Direccion> direccionesIns;
    private List<Persona> personas;
    public Institucion() {}
    public Institucion(String id, String nombre, List<String> sedes, List<Direccion> direccionesIns, List<Persona> personas) {
        this.id = id;
        this.nombre = nombre;
        this.sedes = sedes;
        this.direccionesIns = direccionesIns;
        this.personas = personas;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getSedes() {
        return sedes;
    }

    public List<Direccion> getDireccionesIns() {
        return direccionesIns;
    }

    public List<Persona> getPersonas() {
        return personas;
    }
}