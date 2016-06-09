package sistema.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import sistema.modelos.Conteudo;
import sistema.modelos.Disciplina;
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
	
	public List<Pergunta> getPrguntasComp(Disciplina d, Conteudo c, int quant)
	{
		Pergunta p = new Pergunta();
		//List<Pergunta> lista = Service.ListarParam(p, "SELECT c FROM Pergunta AS c where c.Titulo != '' and c.Disciplina.Id = :discid");
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("ProjetoMavenJSFPrimeFaces");
		EntityManager em = emf.createEntityManager( );
		//TypedQuery<Pergunta> query = em.createQuery(
		//		"SELECT c FROM Pergunta AS c where c.Titulo != '' and c.Disciplina.Id = ?discid", Pergunta.class);
		Query q = em.createQuery("SELECT c FROM Pergunta AS c where c.Titulo != ?1 and c.disciplina.Id = ?2");
		q.setParameter(1,"").setParameter(2, d.getId());
		q.setMaxResults(quant);
	    @SuppressWarnings("unchecked")
		List<Pergunta> lista = q.getResultList();
	    em.close();
	    emf.close();
	    return lista;		
	}
}
