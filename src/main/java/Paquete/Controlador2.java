package Paquete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controlador2 {

    @Autowired
    PersonaService personaService;
    @Autowired
    ArrayList<Ciudad> ciudadList;

    @GetMapping("/controlador2/getPersona")
    public PersonaService newPersona2 () {
        Integer newEdad = personaService.getEdad() * 2;
        personaService.setEdad(newEdad);
        return personaService;
    }
    @GetMapping("/controlador2/getCiudad")
    public ArrayList<Ciudad> lista()  {
        return ciudadList;
    }

}
