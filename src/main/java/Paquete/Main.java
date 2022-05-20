package Paquete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Bean
	public ArrayList<Ciudad> ciudadList() {
		return new ArrayList<Ciudad>();
	}
	@Bean("bean1")
	public Persona persona1() {
		Persona persona1 = new Persona();
		persona1.setNombre("amigo1");
		return persona1;
	}
	@Bean("bean2")
	public Persona persona2() {
		Persona persona2 = new Persona();
		persona2.setNombre("amigo2");
		return persona2;
	}
	@Bean("bean3")
	public Persona persona3() {
		Persona persona3 = new Persona();
		persona3.setNombre("amigo3");
		return persona3;
	}

}
