package sistema.modelos;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Professor {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String Nome;
	@OneToMany
	private ArrayList<Disciplina> Disciplinas = new ArrayList<Disciplina>();
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
	public ArrayList<Disciplina> getDisciplinas() {
		return Disciplinas;
	}
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		Disciplinas = disciplinas;
	}
	@Override
	public String toString() {
		return "Professor [Id=" + Id + ", Nome=" + Nome + ", Disciplinas=" + Disciplinas + "]";
	}
}
