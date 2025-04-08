package ec.edu.ups.poo.clases;

import java.util.GregorianCalendar;
import java.util.List;

public class Visitante extends Persona {
    private String motivo;
    private GregorianCalendar fechaEntrada;
    private GregorianCalendar fechaSalida;

    public Visitante(String cedula, String nombre, String apellido, String telefono, String correo, List<Direccion> direcciones, String motivo, GregorianCalendar fechaEntrada, GregorianCalendar fechaSalida) {
        super(cedula, nombre, apellido, telefono, correo, direcciones);
        this.motivo = motivo;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public String getMotivoVisita() {
        return motivo;
    }

    public void setMotivoVisita(String motivoVisita) {
        this.motivo = motivo;
    }

    public GregorianCalendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(GregorianCalendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public GregorianCalendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(GregorianCalendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override

    public String toString(){
        return super.toString()+
                "Visitante: "+
                "Fecha de Entrada: "+ fechaEntrada+
                "Fecha de Salida: "+ fechaSalida+
                "Motivo: "+ motivo;
    }
}