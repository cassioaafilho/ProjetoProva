package sistema.modelos;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Prova {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	@ManyToOne
	private Disciplina Disciplina = new Disciplina();
	@OneToMany
	private ArrayList<Pergunta> Perguntas = new ArrayList<Pergunta>();
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Disciplina getDisciplina() {
		return Disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		Disciplina = disciplina;
	}
	public ArrayList<Pergunta> getPerguntas() {
		return Perguntas;
	}
	public void setPerguntas(ArrayList<Pergunta> perguntas) {
		Perguntas = perguntas;
	}
	
}
