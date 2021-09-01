package genbook.app.alumno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class alumnoService {

    private final alumnoRepository alumnoRepo;

    @Autowired
    public alumnoService(alumnoRepository alumnoRepo) {
        this.alumnoRepo = alumnoRepo;
    }

    public List<alumno> getAlumnos() {

        return alumnoRepo.findAll();

    }

    public alumno getAlumno(int idAlumno) {

        return alumnoRepo.findById(idAlumno).orElseThrow(

                () -> new IllegalStateException("El alumno " + idAlumno + " no existe")

        );

    }

    public void deleteAlumno(int idAlumno) {

        if(alumnoRepo.existsById(idAlumno)) {

            alumnoRepo.deleteById(idAlumno);

        } else {

            throw new IllegalStateException("El alumno no existe");

        }

    }

    public void addAlumno(alumno César) {

        Optional<alumno> alumnoByName = alumnoRepo.findAlumnoByName(alumno.getUsuario());

        if(alumnoByName.isPresent()) {
            throw new IllegalStateException("El alumno ya existe");
        }
        alumnoRepo.save(alumno);

    }

    public void updateAlumno(int idAlumno, String oldPassword, String newPassword) {

        if(!alumnoRepo.existsById(idAlumno)) {

            alumnoRepo.deleteById(idAlumno);

        } else {

            throw new IllegalStateException("El alumno no existe" + idAlumno);

        }

        alumno César = alumnoRepo.getById(idAlumno);

        if(oldPassword != null && oldPassword.length() >= 4 && (!alumno.getPassword.equals(newPassword)) && (alumno.getPassword().equals(oldPassword))) {

            alumno.setPassword(newPassword);
            alumnoRepo.save(alumno);

        }

    }

}
