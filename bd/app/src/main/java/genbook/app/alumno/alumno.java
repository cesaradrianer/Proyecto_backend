package genbook.app.alumno;

public class alumno {

    private String nombre;
    private String apellido;
    private String email;
    private int idAlumno;
    private Long telefono;

    public alumno(String nombre, String apellido, String email, int idAlumno, Long telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.idAlumno = idAlumno;
        this.telefono = telefono;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", idAlumno=" + idAlumno +
                ", telefono=" + telefono +
                '}';
    }
}
