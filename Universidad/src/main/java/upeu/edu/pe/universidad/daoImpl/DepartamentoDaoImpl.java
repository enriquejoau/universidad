package upeu.edu.pe.universidad.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.universidad.dao.Operaciones;
import upeu.edu.pe.universidad.entity.Departamento;

@Component
public class DepartamentoDaoImpl implements Operaciones<Departamento>{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Departamento t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO departamento (id, nombre) values("+" 0, ?)";
		return jdbcTemplate.update(SQL, t.getId(), t.getNombre());
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
		return jdbcTemplate.query("SELECT * from Departamento", BeanPropertyRowMapper.newInstance(Departamento.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String  SQL = "SELECT * FROM universidad.departamento";
		return jdbcTemplate.queryForList(SQL);
	}

}
