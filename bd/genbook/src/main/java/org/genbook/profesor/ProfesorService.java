package org.genbook.profesor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfesorService {
    private final ProfesorRepository profesorRepository;

    @Autowired
    public ProfesorService(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }
    public void postNuevoProfesor(profesor profesorObjeto){
        System.out.println("Servicio");
        System.out.println(profesorObjeto.getNombreprofesor());

        Optional<profesor> profesorObj = profesorRepository.findProfesorByEmail(profesorObjeto.getCorreoprofesor());
        if(profesorObj.isPresent()){
            System.out.println("Ya existe el usuario");
            throw new IllegalStateException("El usuario ya existe");
        }else{
            System.out.println("Guarda en la bd");
            profesorRepository.save(profesorObjeto);
        }
    }
}
