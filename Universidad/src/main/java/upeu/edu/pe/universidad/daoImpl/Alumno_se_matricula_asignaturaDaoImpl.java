package upeu.edu.pe.universidad.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.universidad.dao.Operaciones;
import upeu.edu.pe.universidad.entity.Alumno_se_matricula_asignatura;
@Component
public class Alumno_se_matricula_asignaturaDaoImpl implements Operaciones<Alumno_se_matricula_asignatura>{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Alumno_se_matricula_asignatura t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO alumno_se_matricula_asignatura (id_alumno, id_asignatura, id_curso_escolar) values(?, ?,?)";
		return jdbcTemplate.update(SQL, t.getId_alumno(), t.getId_asignatura(), t.getId_curso_escolar());
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
		return jdbcTemplate.query("SELECT * from alumno_se_matricula_asignatura", BeanPropertyRowMapper.newInstance(Alumno_se_matricula_asignatura.class));
	}


	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String  SQL = "SELECT * FROM universidad.alumno_se_matricula_asignatura";
		return jdbcTemplate.queryForList(SQL);
	}

}
