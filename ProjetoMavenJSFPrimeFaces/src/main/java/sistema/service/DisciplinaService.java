package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.modelos.Disciplina;
import sistema.modelos.Pergunta;

public class DisciplinaService {
	public void Salvar(Disciplina p)
	{
		Service.Salvar(p);
	}
	public void Editar(Disciplina p)
	{
		Service.Editar(p);
	}
	public void Deletar(Disciplina p)
	{
		Service.Deletar(p);
	}
	public List<Disciplina> getDisciplinas()
	{
		Disciplina p = new Disciplina();
		return Service.Listar(p, "SELECT c FROM Disciplina AS c WHERE c.Nome != ''");
	}
}
