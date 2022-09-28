package upeu.edu.pe.universidad.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno_se_matricula_asignatura {
	private int id_alumno;
	private int id_asignatura;
	private int id_curso_escolar;
	
	public int getId_alumno() {
		return id_alumno;
	}
	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}
	public int getId_asignatura() {
		return id_asignatura;
	}
	public void setId_asignatura(int id_asignatura) {
		this.id_asignatura = id_asignatura;
	}
	public int getId_curso_escolar() {
		return id_curso_escolar;
	}
	public void setId_curso_escolar(int id_curso_escolar) {
		this.id_curso_escolar = id_curso_escolar;
	}
	
}
