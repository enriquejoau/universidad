package upeu.edu.pe.universidad.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.universidad.dao.Operaciones;
import upeu.edu.pe.universidad.entity.Profesor;

@Component
public class ProfesorDaoImpl implements Operaciones<Profesor> {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Profesor t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO profesor (id_profesor, id_departamento) values("+" 0, ?)";
		return jdbcTemplate.update(SQL, t.getId_profesor(), t.getId_departamento());
	}

	@Override
	public int update(Profesor t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Profesor read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profesor> reaAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * from profesor", BeanPropertyRowMapper.newInstance(Profesor.class));
	}


	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String  SQL = "SELECT * FROM universidad.profesor";
		return jdbcTemplate.queryForList(SQL);
	}

}
