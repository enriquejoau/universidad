package upeu.edu.pe.universidad.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.universidad.dao.Operaciones;
import upeu.edu.pe.universidad.daoImpl.GradoDaoImpl;
import upeu.edu.pe.universidad.entity.Grado;

@Service
public class GradoService implements Operaciones<Grado>{
	@Autowired
	private GradoDaoImpl daoImpl;
	@Override
	public int create(Grado t) {
		// TODO Auto-generated method stub
		return daoImpl.create(t);
	}

	@Override
	public int update(Grado t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Grado read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Grado> reaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoImpl.readAll2();
	}

}
