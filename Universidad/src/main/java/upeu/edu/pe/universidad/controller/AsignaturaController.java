package upeu.edu.pe.universidad.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.universidad.entity.Asignatura;
import upeu.edu.pe.universidad.services.AsignaturaService;



@RestController
@RequestMapping("/api/asignatura")
public class AsignaturaController {
	@Autowired
	private AsignaturaService asignaturaService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> listar(){
	 return asignaturaService.readAll2();	
	}
	@PostMapping("/add")
	public int guardar(@RequestBody Asignatura asignatura){
	 return asignaturaService.create(asignatura);	
	}
	
}
