package upeu.edu.pe.universidad.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import upeu.edu.pe.universidad.entity.Profesor;
import upeu.edu.pe.universidad.services.ProfesorService;



@RestController
@RequestMapping("/api/profesor")
public class ProfesorController {
	@Autowired
	private ProfesorService profesorService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> listar(){
	 return profesorService.readAll2();	
	}
	@PostMapping("/add")
	public int guardar(@RequestBody Profesor profesor){
	 return profesorService.create(profesor);	
	}

}
