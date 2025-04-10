package ec.edu.ups.poo.clases;
import java.util.ArrayList;
import java.util.List;
public class Persona {
    private String nombre;
    private String cedula;
    private String apellido;
    private String telefono;
    private String correo;
    private List<Direccion> direcciones;

    public Persona(){
        direcciones = new ArrayList<>();
    }



    public Persona(String nombre, String cedula, String apellido, String telefono, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        direcciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void addDirecciones(Direccion direccion) {
        //Metodo para agregar un elemento a una lista
        direcciones.add(direccion);
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }
    /*Hacer el toString */

    @Override

    public String toString(){
        return " Persona: "+
                " Nombre: "+ nombre+
                " Apellido: "+ apellido+
                " Cedula: "+ cedula+
                " Telefono: "+ telefono+
                " correo: "+ correo+
                " Direcciones: "+ direcciones;
    }

}
