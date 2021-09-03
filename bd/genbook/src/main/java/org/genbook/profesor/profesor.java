package org.genbook.profesor;
import javax.persistence.*;
@Entity
@Table(name="profesor")
public class profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name="idprofesor", unique = true, nullable = false)
    private int idProfesor;

    @Column(name = "nombre", nullable = true)
    private String  nombreprofesor;

    @Column(name = "apellido", nullable = true)
    private String apellidoprofesor;

    @Column(name = "telefono", nullable = true)
    private String telefonoprofesor;

    @Column(name = "email", nullable = true)
    private String correoprofesor;

    public profesor(int idProfesor, String nombreprofesor, String apellidoprofesor, String telefonoprofesor, String correoprofesor) {
        this.idProfesor = idProfesor;
        this.nombreprofesor = nombreprofesor;
        this.apellidoprofesor = apellidoprofesor;
        this.telefonoprofesor = telefonoprofesor;
        this.correoprofesor = correoprofesor;
    }

    public profesor() {

    }


    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombreprofesor() {
        return nombreprofesor;
    }

    public void setNombreprofesor(String nombreprofesor) {
        this.nombreprofesor = nombreprofesor;
    }

    public String getApellidoprofesor() {
        return apellidoprofesor;
    }

    public void setApellidoprofesor(String apellidoprofesor) {
        this.apellidoprofesor = apellidoprofesor;
    }

    public String getTelefonoprofesor() {
        return telefonoprofesor;
    }

    public void setTelefonoprofesor(String telefonoprofesor) {
        this.telefonoprofesor = telefonoprofesor;
    }

    public String getCorreoprofesor() {
        return correoprofesor;
    }

    public void setCorreoprofesor(String correoprofesor) {
        this.correoprofesor = correoprofesor;
    }
}

