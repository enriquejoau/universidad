package upeu.edu.pe.universidad.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.universidad.dao.Operaciones;
import upeu.edu.pe.universidad.entity.Asignatura;
@Component
public class AsignaturaDaoImpl implements Operaciones<Asignatura> {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Asignatura t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO asignatura (id, nombre, creditos, tipo, curso, cuatrimestre, id_profesor, id_grado) values("+" 0, ?, ?, ?, ?, ?, ?, ?)";
		return jdbcTemplate.update(SQL, t.getId(), t.getNombre(), t.getCreditos(),t.getTipo(),t.getCurso(),t.getCuatrimestre(),t.getId_profesor(),t.getId_grado());
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
		return jdbcTemplate.query("SELECT * from asignatura", BeanPropertyRowMapper.newInstance(Asignatura.class));
	}
	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String  SQL = "SELECT * FROM universidad.asignatura";
		return jdbcTemplate.queryForList(SQL);
	}

}
