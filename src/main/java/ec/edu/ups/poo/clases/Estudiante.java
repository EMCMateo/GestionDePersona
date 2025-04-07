package ec.edu.ups.poo.clases;

import java.util.List;

public class Estudiante extends Estudiante.Persona {
    private String carrera;
    private String matricula;
    public Estudiante() {}
    public Estudiante(String cedula, String nombre, String apellido, String telefono, String correoElectronico, List<Administrativo.Direccion> direcciones, List<Institucion> instituciones, String carrera, String matricula) {
        super(cedula, nombre, apellido, telefono, correoElectronico,direcciones, instituciones);
        this.carrera = carrera;
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public static class Persona {
        private String cedula;
        private String nombre;
        private String apellido;
        private String telefono;
        private String correoElectronico;
        private List<Administrativo.Direccion> direcciones;
        private List<Institucion> instituciones;
        public Persona() {}
        public Persona(String cedula, String nombre, String apellido, String telefono, String correoElectronico,
                       List<Administrativo.Direccion> direcciones, List<Institucion> instituciones) {
            this.cedula = cedula;
            this.nombre = nombre;
            this.apellido = apellido;
            this.telefono = telefono;
            this.correoElectronico = correoElectronico;
            this.direcciones = direcciones;
            this.instituciones = instituciones;
        }

        public String getCedula() {
            return cedula;
        }

        public void setCedula(String cedula) {
            this.cedula = cedula;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
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

        public String getCorreoElectronico() {
            return correoElectronico;
        }

        public void setCorreoElectronico(String correoElectronico) {
            this.correoElectronico = correoElectronico;
        }

        public List<Administrativo.Direccion> getDirecciones() {
            return direcciones;
        }

        public void setDirecciones(List<Administrativo.Direccion> direcciones) {
            this.direcciones = direcciones;
        }

        public List<Institucion> getInstituciones() {
            return instituciones;
        }

        public void setInstituciones(List<Institucion> instituciones) {
            this.instituciones = instituciones;
        }

        @Override
        public String toString() {
            String resultado = "Persona {\n" +
                    "  Cedula: " + cedula + ",\n" +
                    "  Nombre: " + nombre + ",\n" +
                    "  Apellido: " + apellido + ",\n" +
                    "  Telefono: " + telefono + ",\n" +
                    "  Correo Electronico: " + correoElectronico + ",\n";

            resultado += "  Direcciones:\n";
            if (direcciones != null && !direcciones.isEmpty()) {
                for (Administrativo.Direccion direccion : direcciones) {
                    resultado += "    - " + direccion + "\n";
                }
            } else {
                resultado += "    (ninguna)\n";
            }

            resultado += "  Instituciones:\n";
            if (instituciones != null && !instituciones.isEmpty()) {
                for (Institucion institucion : instituciones) {
                    resultado += "    - " + institucion + "\n";
                }
            } else {
                resultado += "    (ninguna)\n";
            }

            resultado += "}";

            return resultado;
        }
    }
}