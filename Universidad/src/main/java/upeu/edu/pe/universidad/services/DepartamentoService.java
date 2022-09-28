package upeu.edu.pe.universidad.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.universidad.dao.Operaciones;
import upeu.edu.pe.universidad.daoImpl.DepartamentoDaoImpl;
import upeu.edu.pe.universidad.entity.Departamento;

@Service
public class DepartamentoService implements Operaciones<Departamento> {
	@Autowired
	private DepartamentoDaoImpl daoImpl;

	@Override
	public int create(Departamento t) {
		// TODO Auto-generated method stub
		return daoImpl.create(t);
	}

	@Override
	public int update(Departamento t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Departamento read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Departamento> reaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoImpl.readAll2();
	}
}
