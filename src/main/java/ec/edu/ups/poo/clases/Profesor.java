package ec.edu.ups.poo.clases;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    private List<String> titulosAcademicos;
    private List<String> areasDeEspecializacion;



    public Profesor(String cedula, String nombre, String apellido, String telefono, String correo, List<Direccion> direcciones, List<String> titulosAcademicos, List<String> areasDeEspecializacion) {
        super(cedula, nombre, apellido, telefono, correo, direcciones);
        this.titulosAcademicos = new ArrayList<>();
        this.areasDeEspecializacion = new ArrayList<>();


    }

    public void addTitulosAcademicos(String tituAca) {
        titulosAcademicos.add(tituAca);
    }

    public List<String> getTitulosAcademicos() {
        return titulosAcademicos;
    }

    public void addAreasDeEspecializacion(String areasEsp) {
        areasDeEspecializacion.add(areasEsp);
    }

    public List<String> getAreasDeEspecializacion() {
        return titulosAcademicos;
    }

    @Override

    public String toString(){
        return super.toString()+
                "Profesor: "+
                "Titulos Academicos: "+ titulosAcademicos+
                "Areas de Especializacion: "+ areasDeEspecializacion;
    }
}