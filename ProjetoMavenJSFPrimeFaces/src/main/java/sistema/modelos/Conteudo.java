package sistema.modelos;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Conteudo {
	 
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String Nome;
	private int Ordem;
	@ManyToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	private ArrayList<Pergunta> Perguntas = new ArrayList<Pergunta>();
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
	public int getOrdem() {
		return Ordem;
	}
	public void setOrdem(int ordem) {
		Ordem = ordem;
	}
	public ArrayList<Pergunta> getPerguntas() {
		return Perguntas;
	}
	public void setPerguntas(ArrayList<Pergunta> perguntas) {
		Perguntas = perguntas;
	}
	@Override
	public String toString() {
		return "Conteudo [Id=" + Id + ", Nome=" + Nome + ", Ordem=" + Ordem + ", Perguntas=" + Perguntas + "]";
	}
}
