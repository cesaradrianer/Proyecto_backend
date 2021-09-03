package org.genbook.Alumno;
import javax.persistence.*;
@Entity
@Table(name="alumno")
public class alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name="idalumno", unique = true, nullable = false)
    private Long idAlumno;

    @Column(name = "nombre", nullable = true)
    private String  nombrealumno;

    @Column(name = "apellido", nullable = true)
    private String apellidoalumno;

    @Column(name = "telefono", nullable = true)
    private String telefonoalumno;

    @Column(name = "email", nullable = true)
    private String correoalumno;

    public alumno(Long idAlumno, String nombrealumno, String apellidoalumno, String telefonoalumno, String correoalumno) {
        this.idAlumno = idAlumno;
        this.nombrealumno = nombrealumno;
        this.apellidoalumno = apellidoalumno;
        this.telefonoalumno = telefonoalumno;
        this.correoalumno = correoalumno;
    }

    public alumno() {

    }


    public Long getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Long idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombrealumno() {
        return nombrealumno;
    }

    public void setNombrealumno(String nombrealumno) {
        this.nombrealumno = nombrealumno;
    }

    public String getApellidoalumno() {
        return apellidoalumno;
    }

    public void setApellidoalumno(String apellidoalumno) {
        this.apellidoalumno = apellidoalumno;
    }

    public String getTelefonoalumno() {
        return telefonoalumno;
    }

    public void setTelefonoalumno(String telefonoalumno) {
        this.telefonoalumno = telefonoalumno;
    }

    public String getCorreoalumno() {
        return correoalumno;
    }

    public void setCorreoalumno(String correoalumno) {
        this.correoalumno = correoalumno;
    }
}

