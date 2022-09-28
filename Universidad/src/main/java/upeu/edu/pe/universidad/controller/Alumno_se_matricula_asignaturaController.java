package upeu.edu.pe.universidad.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.universidad.entity.Alumno_se_matricula_asignatura;
import upeu.edu.pe.universidad.services.Alumno_se_matricula_asignaturaService;



@RestController
@RequestMapping("/api/alumno_se_matricula_asignatura")
public class Alumno_se_matricula_asignaturaController {
	@Autowired
	private Alumno_se_matricula_asignaturaService alumno_se_matricula_asignaturaService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> listar(){
	 return alumno_se_matricula_asignaturaService.readAll2();	
	}
	@PostMapping("/add")
	public int guardar(@RequestBody Alumno_se_matricula_asignatura alumno_se_matricula_asignatura){
	 return alumno_se_matricula_asignaturaService.create(alumno_se_matricula_asignatura);	
	}
}
