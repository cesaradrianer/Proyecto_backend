package org.genbook.Alumno;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AlumnoRepository extends JpaRepository<alumno, Long> {

    @Query("SELECT u FROM alumno u WHERE u.idAlumno=?1")
        Optional<org.genbook.Alumno.alumno> findAlumnoById(Long idAlumno);

}
