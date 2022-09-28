package upeu.edu.pe.universidad.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.universidad.dao.Operaciones;
import upeu.edu.pe.universidad.entity.Curso_escolar;
@Component
public class Curso_escolarDaoImpl implements Operaciones<Curso_escolar> {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Curso_escolar t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO curso_escolar (id, anyo_inicio, anyo_fin) values("+" 0, ?, ?)";
		return jdbcTemplate.update(SQL, t.getId(), t.getAnyo_inicio(), t.getAnyo_fin());
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
		return jdbcTemplate.query("SELECT * from curso_escolar", BeanPropertyRowMapper.newInstance(Curso_escolar.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String  SQL = "SELECT * FROM universidad.curso_escolar";
		return jdbcTemplate.queryForList(SQL);
	}

}
