package org.genbook.Alumno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlumnoService {
    private final AlumnoRepository alumnoRepository;

    @Autowired
    public AlumnoService(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    public void obtenerAlumno(Long idAlumno) {

        alumnoRepository.findById(idAlumno).orElseThrow(

                () -> new IllegalStateException("El usuario no existe")

        );

    }

    public void postNuevoAlumno(alumno alumnoObjeto){
        System.out.println("Servicio");
        System.out.println(alumnoObjeto.getNombrealumno());

        Optional<alumno> alumnoObj = alumnoRepository.findAlumnoById(alumnoObjeto.getIdAlumno());
        if(alumnoObj.isPresent()){
            System.out.println("Ya existe el usuario");
            throw new IllegalStateException("El usuario ya existe");
        }else{
            System.out.println("Guarda en la bd");
            alumnoRepository.save(alumnoObjeto);
        }
    }

    public void updateAlumno(Long idAlumno, String oldNombre, String newNombre) {

        alumno alumnoObj = alumnoRepository.getById(idAlumno);

        if(oldNombre != null && oldNombre.length() >= 4 && (alumnoObj.getNombrealumno().equals(newNombre)) && (alumnoObj.getNombrealumno().equals(oldNombre))) {

            alumnoObj.setNombrealumno(newNombre);
            alumnoRepository.save(alumnoObj);

        }

    }

    public void deleteAlumno(Long idAlumno) {

        if(alumnoRepository.existsById(idAlumno)) {
            alumnoRepository.deleteById(idAlumno);
        } else {
            throw new IllegalStateException("El alumno no existe");
        }

    }



}
