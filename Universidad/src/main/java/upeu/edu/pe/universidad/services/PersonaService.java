package upeu.edu.pe.universidad.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.universidad.dao.Operaciones;
import upeu.edu.pe.universidad.daoImpl.PersonaDaoImpl;
import upeu.edu.pe.universidad.entity.Persona;

@Service
public class PersonaService implements Operaciones<Persona> {
	@Autowired
	private PersonaDaoImpl daoImpl;
	
	@Override
	public int create(Persona t) {
		// TODO Auto-generated method stub
		return daoImpl.create(t);
	}

	@Override
	public int update(Persona t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> reaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoImpl.readAll2();
	}

}
