package ec.edu.ups.poo.clases;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    private List<String> titulosAcademicos;
    private List<String> areasDeEspecializacion;

    public Profesor(){

    }

    public Profesor(String cedula, String nombre, String apellido, String telefono, String correo, List<String> titulosAcademicos, List<String> areasDeEspecializacion) {
        super(cedula, nombre, apellido, telefono, correo);
        this.titulosAcademicos = titulosAcademicos;
        this.areasDeEspecializacion = areasDeEspecializacion;


    }

    public void addTitulosAcademicos(String tituAca) {
        titulosAcademicos.add(tituAca);
    }

    public List<String> getTitulosAcademicos() {
        return titulosAcademicos;
    }

    public void setTitulosAcademicos(List<String> titulosAcademicos) {
        this.titulosAcademicos = titulosAcademicos;
    }

    public void setAreasDeEspecializacion(List<String> areasDeEspecializacion) {
        this.areasDeEspecializacion = areasDeEspecializacion;
    }

    public void addAreasDeEspecializacion(String areasEsp) {
        areasDeEspecializacion.add(areasEsp);
    }

    public List<String> getAreasDeEspecializacion() {
        return areasDeEspecializacion;
    }

    @Override

    public String toString(){
        return super.toString()+
                " \n Profesor: "+
                " \n Titulos Academicos: "+ titulosAcademicos+
                " \n Areas de Especializacion: "+ areasDeEspecializacion;
    }
}