package ec.edu.ups.poo.clases;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String cedula, String nombre, String apellido, String telefono, String correo, String carrera) {
        super(cedula, nombre, apellido, telefono, correo);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString(){
        return super.toString()+
                " \n Estudiante: "+
                " \n Carrera: "+carrera;



    }

}