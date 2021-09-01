package genbook.app.alumno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/alumno")
public class alumnoController {

    private final alumnoService alumnoService;

    @Autowired
    public alumnoController(genbook.app.alumno.alumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping
    public List<alumno> getAlumnos() {

        return alumnoService.getAlumnos();

    }

    @GetMapping(path = "{idAlumno}")
    public alumno getAlumno(@PathVariable("idAlumno") int idAlumno) {

        return alumnoService.getAlumno(idAlumno);

    }

    @PostMapping
    public void addAlumno(@RequestBody alumno César) {

        alumnoService.addAlumno(César);

    }

    public void updateAlumno(@PathVariable("idAlumno") int idAlumno, @RequestParam String oldpassword, @RequestParam String password) {

        alumnoService.updateAlumno(idAlumno, oldpassword, password);

    }



}
