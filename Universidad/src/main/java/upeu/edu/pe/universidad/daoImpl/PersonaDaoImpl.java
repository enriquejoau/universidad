package upeu.edu.pe.universidad.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.universidad.dao.Operaciones;
import upeu.edu.pe.universidad.entity.Persona;

@Component
public class PersonaDaoImpl implements Operaciones<Persona>{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Persona t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO persona (id, nif, nombre, apellido1, apellido2, ciudad, direccion, telefono, fecha_nacimiento, sexo, tipo) "
				+ "values("+" 0, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		return jdbcTemplate.update(SQL, t.getId(), t.getNombre(), t.getApellido1(), t.getApellido2(),t.getCiudad(),t.getDireccion(),t.getTelefono(),t.getFecha_nacimiento(),t.getSexo(),t.getTipo());
	}

	@Override
	public int update(Persona t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> reaAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * from persona", BeanPropertyRowMapper.newInstance(Persona.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String  SQL = "SELECT * FROM universidad.persona";
		return jdbcTemplate.queryForList(SQL);
	}

}
