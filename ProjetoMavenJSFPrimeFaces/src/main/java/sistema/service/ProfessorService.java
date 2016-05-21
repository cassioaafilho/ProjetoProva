package sistema.service;

import java.util.ArrayList;

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
	public ArrayList<Professor> getProfessores()
	{
		Professor p = new Professor();
		return Service.Listar(p);
	}
}
