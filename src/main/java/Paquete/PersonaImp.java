package Paquete;

import org.springframework.stereotype.Service;

@Service
public class PersonaImp implements PersonaService{
    Persona persona = new Persona();
    public String getNombre() {
        return persona.getNombre();
    }
    public void setNombre(String nombre) {
        persona.setNombre(nombre);
    }
    public String getPoblacion() {
        return persona.getPoblacion();
    }
    public void setPoblacion(String poblacion) {
        persona.setPoblacion(poblacion);
    }
    public Integer getEdad() {
        return persona.getEdad();
    }
    public void setEdad(Integer edad) {
        persona.setEdad(edad);
    }
}
