package ec.edu.ups.poo.clases;

import java.util.List;

public class Administrativo extends Estudiante.Persona {
    private List<String> cargos;
    private List<String> responsabilidades;
    public Administrativo() {}
    public Administrativo(String cedula, String nombre, String apellido, String telefono, String correoElectronico, List<Direccion> direcciones, List<Institucion> instituciones, List<String> cargos, List<String> responsabilidades) {
        super(cedula, nombre, apellido, telefono, correoElectronico, direcciones, instituciones);
        this.cargos=cargos;
        this.responsabilidades=responsabilidades;
    }

    public List<String> getCargos() {
        return cargos;
    }

    public void setCargos(List<String> cargos) {
        this.cargos = cargos;
    }

    public List<String> getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(List<String> responsabilidades) {
        this.responsabilidades = responsabilidades;
    }

    public static class Direccion {
        private String tipo;
        private String callePrincipal;
        private String calleSecundaria;
        private String numeracion;
        private String ciudad;
        private String provincia;
        private String pais;

        public Direccion() {}

        public Direccion(String tipo, String callePrincipal, String calleSecundaria, String numeracion, String ciudad, String provincia, String pais) {
            this.tipo = tipo;
            this.callePrincipal = callePrincipal;
            this.calleSecundaria = calleSecundaria;
            this.numeracion = numeracion;
            this.ciudad = ciudad;
            this.provincia = provincia;
            this.pais = pais;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getCallePrincipal() {
            return callePrincipal;
        }

        public void setCallePrincipal(String callePrincipal) {
            this.callePrincipal = callePrincipal;
        }

        public String getCalleSecundaria() {
            return calleSecundaria;
        }

        public void setCalleSecundaria(String calleSecundaria) {
            this.calleSecundaria = calleSecundaria;
        }

        public String getNumeracion() {
            return numeracion;
        }

        public void setNumeracion(String numeracion) {
            this.numeracion = numeracion;
        }

        public String getCiudad() {
            return ciudad;
        }

        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }

        public String getProvincia() {
            return provincia;
        }

        public void setProvincia(String provincia) {
            this.provincia = provincia;
        }

        public String getPais() {
            return pais;
        }

        public void setPais(String pais) {
            this.pais = pais;
        }

    }
}