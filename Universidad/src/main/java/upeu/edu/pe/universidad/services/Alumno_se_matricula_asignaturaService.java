package upeu.edu.pe.universidad.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.universidad.dao.Operaciones;
import upeu.edu.pe.universidad.daoImpl.Alumno_se_matricula_asignaturaDaoImpl;
import upeu.edu.pe.universidad.entity.Alumno_se_matricula_asignatura;

@Service
public class Alumno_se_matricula_asignaturaService implements Operaciones<Alumno_se_matricula_asignatura>{
	@Autowired
	private Alumno_se_matricula_asignaturaDaoImpl daoImpl;
	@Override
	public int create(Alumno_se_matricula_asignatura t) {
		// TODO Auto-generated method stub
		return daoImpl.create(t);
	}

	@Override
	public int update(Alumno_se_matricula_asignatura t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Alumno_se_matricula_asignatura read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alumno_se_matricula_asignatura> reaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoImpl.readAll2();
	}

}
