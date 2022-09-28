package upeu.edu.pe.universidad.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.universidad.dao.Operaciones;
import upeu.edu.pe.universidad.daoImpl.Curso_escolarDaoImpl;
import upeu.edu.pe.universidad.entity.Curso_escolar;

@Service
public class Curso_escolarService implements Operaciones<Curso_escolar>{
	@Autowired
	private Curso_escolarDaoImpl daoImpl;
	
	@Override
	public int create(Curso_escolar t) {
		// TODO Auto-generated method stub
		return daoImpl.create(t);
	}

	@Override
	public int update(Curso_escolar t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Curso_escolar read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Curso_escolar> reaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoImpl.readAll2();
	}

}
