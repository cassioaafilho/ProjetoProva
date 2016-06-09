package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.modelos.Conteudo;
import sistema.modelos.Pergunta;

public class ConteudoService {
	public void Salvar(Conteudo p)
	{
		Service.Salvar(p);
	}
	public void Editar(Conteudo p)
	{
		Service.Editar(p);
	}
	public void Deletar(Conteudo p)
	{
		Service.Deletar(p);
	}
	public List<Conteudo> getConteudos()
	{
		Conteudo p = new Conteudo();
		return Service.Listar(p, "SELECT c FROM Conteudo AS c WHERE c.Nome != ''");
	}
}
