package upeu.edu.pe.universidad.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.universidad.dao.Operaciones;
import upeu.edu.pe.universidad.entity.Grado;
@Component
public class GradoDaoImpl implements Operaciones<Grado>{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Grado t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO grado (id, nombre) values("+" 0, ?)";
		return jdbcTemplate.update(SQL, t.getId(), t.getNombre());
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
		return jdbcTemplate.query("SELECT * from grado", BeanPropertyRowMapper.newInstance(Grado.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String  SQL = "SELECT * FROM universidad.grado";
		return jdbcTemplate.queryForList(SQL);
	}

}
