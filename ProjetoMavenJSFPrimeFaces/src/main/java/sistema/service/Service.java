package sistema.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public abstract class Service<T> {
	
	
	public static <T> void Salvar(T obj )
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("ProjetoMavenJSFPrimeFaces");
		EntityManager em = emf.createEntityManager( );
	    em.getTransaction( ).begin( );
	    
	    em.merge(obj);
	    em.getTransaction().commit();
	    
	    em.close();
	    emf.close();
	}
	public  static <T>  void Deletar(T obj )
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("ProjetoMavenJSFPrimeFaces");
		EntityManager em = emf.createEntityManager( );
	    em.getTransaction( ).begin( );
	    
	    em.remove(obj);
	    em.getTransaction().commit();
	    
	    em.close();
	    emf.close();
	}
	public static <T> void Editar(T obj )
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("ProjetoMavenJSFPrimeFaces");
		EntityManager em = emf.createEntityManager( );
	    em.getTransaction( ).begin( );
	    
	    em.merge(obj);
	    em.getTransaction().commit();
	    
	    em.close();
	    emf.close();
	}
	public static <T> List<T> Listar(T obj, String Query )
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("ProjetoMavenJSFPrimeFaces");
		EntityManager em = emf.createEntityManager( );
		TypedQuery<String> query = em.createQuery(
				Query, String.class);
	    @SuppressWarnings("unchecked")
		List<T> lista = (List<T>)query.getResultList();
	    em.close();
	    emf.close();
	    return lista;
	}
}
