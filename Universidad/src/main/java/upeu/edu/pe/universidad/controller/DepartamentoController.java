package upeu.edu.pe.universidad.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.universidad.entity.Departamento;
import upeu.edu.pe.universidad.services.DepartamentoService;

@RestController
@RequestMapping("/api/departamento")
public class DepartamentoController {
	@Autowired
	private DepartamentoService departamentoService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> listar(){
	 return departamentoService.readAll2();	
	}
	@PostMapping("/add")
	public int guardar(@RequestBody Departamento departamento){
	 return departamentoService.create(departamento);	
	}
}
