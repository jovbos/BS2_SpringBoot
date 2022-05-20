package Paquete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controlador1 {

    @Autowired
    PersonaService personaService;
    @Autowired
    ArrayList<Ciudad> ciudadList;

    @GetMapping("/controlador1/addPersona")
    public PersonaService newPersona (@RequestHeader(value="nombre") String name, @RequestHeader(value="poblacion") String city, @RequestHeader(value="edad") Integer age) {
        personaService.setNombre(name);
        personaService.setPoblacion(city);
        personaService.setEdad(age);
        return personaService;
    }

    @PostMapping("/controlador1/addCiudad")
    public void  addCiudad (@RequestBody Ciudad ciudad) {
        ciudadList.add(ciudad);
    }
}
