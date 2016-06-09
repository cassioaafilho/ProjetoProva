package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.modelos.Prova;
import sistema.modelos.Professor;

public class ProvaService {
	public void Salvar(Prova p)
	{
		Service.Salvar(p);
	}
	public void Editar(Prova p)
	{
		Service.Editar(p);
	}
	public void Deletar(Prova p)
	{
		Service.Deletar(p);
	}
	public List<Prova> getProvas()
	{
		Prova p = new Prova();
		return Service.Listar(p, "SELECT c FROM Prova AS c WHERE c.titulo != ''");
	}
}
