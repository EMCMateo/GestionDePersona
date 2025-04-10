package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enums.Rol;

import java.util.GregorianCalendar;

public class Asignacion {
    private Persona persona;
    private GregorianCalendar fechaI;
    private Rol rol;

    public Asignacion(){

    }
    public Asignacion(Persona persona, GregorianCalendar fechaI, Rol rol){
        this.persona = persona;
        this.fechaI = fechaI;
        this.rol = rol;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public GregorianCalendar getFechaI() {
        return fechaI;
    }

    public void setFechaI(GregorianCalendar fechaI) {
        this.fechaI = fechaI;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString(){
        return  " \n Persona: "+persona+
                " \n Fecha de Inicio: " + fechaI+
                " \n Rol: "+rol;



    }
}
