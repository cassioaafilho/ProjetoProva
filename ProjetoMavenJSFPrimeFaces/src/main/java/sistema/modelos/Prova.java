package sistema.modelos;

import java.util.ArrayList;
import java.util.List;

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
	private String titulo;
	@ManyToOne
	private Disciplina Disciplina = new Disciplina();
	@ManyToOne
	private Conteudo Conteudo = new Conteudo();
	private List<Pergunta> Perguntas = new ArrayList<Pergunta>();
	public int getId() {
		return Id;
	}
	public Conteudo getConteudo() {
		return Conteudo;
	}
	public void setConteudo(Conteudo conteudo) {
		Conteudo = conteudo;
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
	public List<Pergunta> getPerguntas() {
		return Perguntas;
	}
	public void setPerguntas(List<Pergunta> list) {
		Perguntas = list;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		return "Prova [Id=" + Id + ", titulo=" + titulo + ", Disciplina=" + Disciplina + ", Perguntas=" + Perguntas
				+ "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
		return true;
		if (obj == null)
		return false;
		if (getClass() != obj.getClass())
		return false;
		Prova other = (Prova) obj;
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
