package sistema.modelos;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Disciplina {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String Nome;
	@OneToMany
	private ArrayList<Conteudo> Conteudos = new ArrayList<Conteudo>();
	@OneToMany
	private ArrayList<Prova> Provas = new ArrayList<Prova>();
	@ManyToOne
	private Professor Professor = new Professor();
	
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
	public ArrayList<Conteudo> getConteudos() {
		return Conteudos;
	}
	public void setConteudos(ArrayList<Conteudo> conteudos) {
		Conteudos = conteudos;
	}
	
	public ArrayList<Prova> getProvas() {
		return Provas;
	}
	public void setProvas(ArrayList<Prova> provas) {
		Provas = provas;
	}
	@Override
	public String toString() {
		return "Disciplina [Id=" + Id + ", Nome=" + Nome + ", Conteudos=" + Conteudos + "]";
	}
	
}
