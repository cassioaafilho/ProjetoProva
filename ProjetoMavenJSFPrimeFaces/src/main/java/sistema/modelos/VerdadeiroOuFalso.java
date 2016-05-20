package sistema.modelos;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class VerdadeiroOuFalso extends Pergunta{
	
	@OneToMany
	private ArrayList<Afirmacao> Afirmacao = new ArrayList<Afirmacao>();

	public ArrayList<Afirmacao> getAfirmacao() {
		return Afirmacao;
	}

	public void setAfirmacao(ArrayList<Afirmacao> afirmacao) {
		Afirmacao = afirmacao;
	}

	@Override
	public String toString() {
		return "VerdadeiroOuFalso [Afirmacao=" + Afirmacao + "]";
	}
}
