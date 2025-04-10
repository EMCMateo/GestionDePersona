package ec.edu.ups.poo.clases;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;

public class Visitante extends Persona {
    private String motivo;
    private GregorianCalendar fechaEntrada;
    private GregorianCalendar fechaSalida;

    public Visitante(String cedula, String nombre, String apellido, String telefono, String correo, String motivo, GregorianCalendar fechaEntrada, GregorianCalendar fechaSalida) {
        super(cedula, nombre, apellido, telefono, correo);
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
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateadaEntrada = formato.format(fechaEntrada.getTime()); // fechaI es tu GregorianCalendar
        String fechaFormateadaSalida = formato.format(fechaSalida.getTime()); // fechaI es tu GregorianCalendar


        return super.toString()+
                " Visitante: "+
                " Fecha de Entrada: "+ fechaFormateadaEntrada+
                " Fecha de Salida: "+ fechaFormateadaSalida+
                " Motivo: "+ motivo;
    }
}