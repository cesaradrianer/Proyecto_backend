package org.genbook.profesor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api/profesor")
public class ProfesorController {
    private final ProfesorService profesorService;
    @Autowired
    public ProfesorController(ProfesorService profesorService) {
        this.profesorService = profesorService;
    }

    @PostMapping
    public  void agregaProfesor(@RequestBody profesor objProfesor){
        profesorService.postNuevoProfesor(objProfesor);
    }
}
