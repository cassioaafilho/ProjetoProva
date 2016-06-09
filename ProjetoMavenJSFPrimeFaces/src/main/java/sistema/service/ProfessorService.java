package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.modelos.Professor;

public class ProfessorService {
	public void Salvar(Professor p)
	{
		Service.Salvar(p);
	}
	public void Editar(Professor p)
	{
		Service.Editar(p);
	}
	public void Deletar(Professor p)
	{
		Service.Deletar(p);
	}
	public List<Professor> getProfessores()
	{
		Professor p = new Professor();
		return Service.Listar(p, "SELECT * FROM Professor AS c");
	}
}
