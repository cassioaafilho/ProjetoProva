package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.modelos.Pergunta;
import sistema.modelos.Professor;

public class PerguntaService {
	public void Salvar(Pergunta p)
	{
		Service.Salvar(p);
	}
	public void Editar(Pergunta p)
	{
		Service.Editar(p);
	}
	public void Deletar(Pergunta p)
	{
		Service.Deletar(p);
	}
	public List<Pergunta> getPerguntas()
	{
		Pergunta p = new Pergunta();
		return Service.Listar(p, "SELECT c FROM Pergunta AS c");
	}
}
