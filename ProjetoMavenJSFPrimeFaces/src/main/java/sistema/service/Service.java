package sistema.service;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public abstract class Service<T> {
	
	
	public static <T> void Salvar(T obj )
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("TesteDB");
		EntityManager em = emf.createEntityManager( );
	    em.getTransaction( ).begin( );
	    
	    em.persist(obj);
	    em.getTransaction().commit();
	    
	    em.close();
	    emf.close();
	}
	public  static <T>  void Deletar(T obj )
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("DBTeste");
		EntityManager em = emf.createEntityManager( );
	    em.getTransaction( ).begin( );
	    
	    em.remove(obj);
	    em.getTransaction().commit();
	    
	    em.close();
	    emf.close();
	}
	public static <T> void Editar(T obj )
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("DBTeste");
		EntityManager em = emf.createEntityManager( );
	    em.getTransaction( ).begin( );
	    
	    em.merge(obj);
	    em.getTransaction().commit();
	    
	    em.close();
	    emf.close();
	}
	public static <T> ArrayList<T> Listar(T obj )
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("DBTeste");
		EntityManager em = emf.createEntityManager( );
		String classe = obj.getClass().getName();
		TypedQuery<String> query = em.createQuery(
			      "SELECT * FROM " + classe + " AS c", String.class);
	    @SuppressWarnings("unchecked")
		ArrayList<T> lista = (ArrayList<T>) query.getResultList();
	    em.close();
	    emf.close();
	    return lista;
	}
}
