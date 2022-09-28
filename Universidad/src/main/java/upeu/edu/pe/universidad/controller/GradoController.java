package upeu.edu.pe.universidad.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.universidad.entity.Grado;
import upeu.edu.pe.universidad.services.GradoService;

@RestController
@RequestMapping("/api/grado")
public class GradoController {
	@Autowired
	private GradoService gradoService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> listar(){
	 return gradoService.readAll2();	
	}
	@PostMapping("/add")
	public int guardar(@RequestBody Grado grado){
	 return gradoService.create(grado);	
	}
	

}
