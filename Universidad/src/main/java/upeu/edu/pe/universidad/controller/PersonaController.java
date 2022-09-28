package upeu.edu.pe.universidad.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.universidad.entity.Persona;
import upeu.edu.pe.universidad.services.PersonaService;



@RestController
@RequestMapping("/api/persona")
public class PersonaController {
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> listar(){
	 return personaService.readAll2();	
	}
	@PostMapping("/add")
	public int guardar(@RequestBody Persona persona){
	 return personaService.create(persona);	
	}
}
