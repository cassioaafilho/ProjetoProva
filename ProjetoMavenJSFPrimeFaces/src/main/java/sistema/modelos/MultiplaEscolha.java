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
public class MultiplaEscolha extends Pergunta {
	
	@OneToMany
	private ArrayList<Escolha> Escolhas = new ArrayList<Escolha>();
	private Escolha EscolhaCorreta;
	public ArrayList<Escolha> getEscolhas() {
		return Escolhas;
	}
	public void setEscolhas(ArrayList<Escolha> escolhas) {
		Escolhas = escolhas;
	}
	public Escolha getEscolhaCorreta() {
		return EscolhaCorreta;
	}
	public void setEscolhaCorreta(Escolha escolhaCorreta) {
		EscolhaCorreta = escolhaCorreta;
	}
	
}
