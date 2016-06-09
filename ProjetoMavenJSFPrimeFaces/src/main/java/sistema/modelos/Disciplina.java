package sistema.modelos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Disciplina {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String Nome;
	@OneToMany
	private List<Prova> Provas = new ArrayList<Prova>();
	@ManyToOne
	private Professor Professor = new Professor();
	
	/*public Pergunta getPergunta() {
		return pergunta;
	}
	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}*/
	public Professor getProfessor() {
		return Professor;
	}
	public void setProfessor(Professor professor) {
		Professor = professor;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	/*public ArrayList<Conteudo> getConteudos() {
		return Conteudos;
	}
	public void setConteudos(ArrayList<Conteudo> conteudos) {
		Conteudos = conteudos;
	}*/
	
	public List<Prova> getProvas() {
		return Provas;
	}
	public void setProvas(ArrayList<Prova> provas) {
		Provas = provas;
	}
	
	/*public void addConteudo(Conteudo c)
	{
		this.Conteudos.add(c);
	}*/
	@Override
	public String toString() {
		return "Disciplina [Id=" + Id + ", Nome=" + Nome;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
		return true;
		if (obj == null)
		return false;
		if (getClass() != obj.getClass())
		return false;
		Disciplina other = (Disciplina) obj;
		if (Id != other.Id)
		return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
			int result = 1;
			result = prime * result + Id;
			return result;
	}
}
