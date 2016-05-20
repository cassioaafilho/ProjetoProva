package sistema.modelos;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Pergunta {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String Titulo;
	private int VezesUtilizadas;
	@ManyToMany(mappedBy = "Perguntas")
	private ArrayList<Conteudo> Conteudos = new ArrayList<Conteudo>();
	@ManyToOne
	private Prova Prova = new Prova();
	
	public ArrayList<Conteudo> getConteudos() {
		return Conteudos;
	}
	public void setConteudos(ArrayList<Conteudo> conteudos) {
		Conteudos = conteudos;
	}
	public Prova getProva() {
		return Prova;
	}
	public void setProva(Prova prova) {
		Prova = prova;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public int getVezesUtilizadas() {
		return VezesUtilizadas;
	}
	public void setVezesUtilizadas(int vezesUtilizadas) {
		VezesUtilizadas = vezesUtilizadas;
	}
	@Override
	public String toString() {
		return "Pergunta [Id=" + Id + ", Titulo=" + Titulo + ", VezesUtilizadas=" + VezesUtilizadas + "]";
	}
	
}
