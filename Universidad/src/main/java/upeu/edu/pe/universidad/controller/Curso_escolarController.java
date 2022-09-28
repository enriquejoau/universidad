package upeu.edu.pe.universidad.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.universidad.entity.Curso_escolar;
import upeu.edu.pe.universidad.services.Curso_escolarService;


@RestController
@RequestMapping("/api/curso_escolar")
public class Curso_escolarController {
	@Autowired
	private Curso_escolarService curso_escolarService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> listar(){
	 return curso_escolarService.readAll2();	
	}
	@PostMapping("/add")
	public int guardar(@RequestBody Curso_escolar curso_escolar){
	 return curso_escolarService.create(curso_escolar);	
	}
}
