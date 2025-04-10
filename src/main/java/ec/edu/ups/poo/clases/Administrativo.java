package ec.edu.ups.poo.clases;

import java.util.ArrayList;
import java.util.List;

public class Administrativo extends Persona {
    private List<String> cargos;
    private List<String> responsabilidades;


    public Administrativo(String cedula, String nombre, String apellido, String telefono, String correo, List<String> cargos, List<String> responsabilidades) {
        super(cedula, nombre, apellido, telefono, correo);
        this.cargos= new ArrayList<>();
        this.responsabilidades=new ArrayList<>();


    }
    public Administrativo() {
        this.cargos = new ArrayList<>();
        this.responsabilidades = new ArrayList<>();
    }
    public void addCargos(String cargo) {
        //Metodo para agregar un elemento a una lista
        cargos.add(cargo);
    }

    public List<String> getCargos() {
        return cargos;
    }

    public void setCargos (List<String> cargos){
        this.cargos = cargos;
    }

    public void addResponsabilidades(String resp) {
        //Metodo para agregar un elemento a una lista
        responsabilidades.add(resp);
    }

    public List<String> getResponsabilidades() {
        return responsabilidades;
    }
    @Override

    public String toString(){
        return super.toString()+
                " Administrativo: "+
                " Cargos: "+ cargos+
                " Responsabilidades: "+ responsabilidades;
    }
}