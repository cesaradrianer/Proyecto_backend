package org.genbook.Alumno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api/alumno")
public class AlumnoController {
    private final AlumnoService alumnoService;
    @Autowired
    public AlumnoController(AlumnoService alumnoService)
    {this.alumnoService = alumnoService;}

    @GetMapping(path = "{idAlumno}")
    public void obtenerAlumno(@PathVariable("idAlumno") Long idAlumno)
    {alumnoService.obtenerAlumno(idAlumno);}

    @PostMapping
    public void agregaAlumno(@RequestBody alumno objAlumno)
    {alumnoService.postNuevoAlumno(objAlumno);}

    @PutMapping(path = "{idAlumno}")
    public void actualizarAlumno(@PathVariable("idAlumno") Long idAlumno, @RequestParam String oldNombre, @RequestParam String newNombre)
    {alumnoService.updateAlumno(idAlumno, oldNombre, newNombre);}

    @DeleteMapping("{idAlumno}")
    public void borrarAlumno(@PathVariable("idAlumno") Long idAlumno)
    {alumnoService.deleteAlumno(idAlumno);}
}
