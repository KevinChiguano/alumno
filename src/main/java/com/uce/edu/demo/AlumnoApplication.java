package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Alumno;
import com.uce.edu.demo.modelo.Universidad;
import com.uce.edu.demo.service.IAlumnoService;
import com.uce.edu.demo.service.IUniversidadService;

@SpringBootApplication
public class AlumnoApplication implements CommandLineRunner{

	private static final Logger LOGGER = Logger.getLogger(AlumnoApplication.class);
	
	@Autowired
	private IUniversidadService universidadService;
	
	@Autowired
	private IAlumnoService alumnoService;
	
	public static void main(String[] args) {
		SpringApplication.run(AlumnoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		/*Universidad universidad1 = new Universidad();
		universidad1.setNombre("Universidad Central del Ecuador");
		universidad1.setDireccion("Jerónimo Leiton y Benjamín Chávez");*/
		
		//this.universidadService.insertar(universidad1);
		/*universidad1.setId(2);
		
		Alumno alumno = new Alumno();
		alumno.setNombre("Kevin");
		alumno.setApellido("Montalvo");
		alumno.setFechaNacimiento(LocalDateTime.now());
		
		Alumno alumno1 = new Alumno();
		alumno1.setNombre("Juan");
		alumno1.setApellido("Ramirez");
		alumno1.setFechaNacimiento(LocalDateTime.now());
		
		alumno.setUniversidad(universidad1);
		alumno1.setUniversidad(universidad1);
		
		this.alumnoService.insertar(alumno);
		this.alumnoService.insertar(alumno1);
		
		//this.universidadService.eliminar(1);*/
		
		/*Alumno alumno = new Alumno();
		alumno.setNombre("Kevin");
		alumno.setApellido("Arguello");
		alumno.setFechaNacimiento(LocalDateTime.now());
		alumno.setId(5);
		
		universidad1.setId(2);
		
		alumno.setUniversidad(universidad1);
		
		this.alumnoService.actualizar(alumno);*/
		//this.alumnoService.eliminar(3);
		LOGGER.info("alumnos: "+this.alumnoService.buscarAlumnoPorNombre());
		
	}

}
