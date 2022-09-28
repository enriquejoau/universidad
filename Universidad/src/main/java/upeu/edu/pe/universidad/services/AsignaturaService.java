package upeu.edu.pe.universidad.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.universidad.dao.Operaciones;
import upeu.edu.pe.universidad.daoImpl.AsignaturaDaoImpl;
import upeu.edu.pe.universidad.entity.Asignatura;

@Service
public class AsignaturaService implements Operaciones<Asignatura> {
	@Autowired
	private AsignaturaDaoImpl daoImpl;

	@Override
	public int create(Asignatura t) {
		// TODO Auto-generated method stub
		return daoImpl.create(t);
	}

	@Override
	public int update(Asignatura t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Asignatura read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Asignatura> reaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoImpl.readAll2();
	}

}
	

