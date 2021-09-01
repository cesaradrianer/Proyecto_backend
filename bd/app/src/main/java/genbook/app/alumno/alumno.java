package genbook.app.alumno;

import javax.persistence.*;

@Table(name = "alumno")
public class alumno {

    @Column(name = "nombreAlumno", nullable = true)
    private String nombreAlumno;
    @Column(name = "apellidoAlumno", nullable = true)
    private String apellidoAlumno;
    @Column(name = "correoAlumno", nullable = true)
    private String correoAlumno;
    @Id
    private int idAlumno;
    @Column(name = "telefonoAlumno", nullable = true)
    private String telefonoAlumno;
    @Column(name = "usuarioAlumno", nullable = true)
    private String usuarioAlumno;

}
