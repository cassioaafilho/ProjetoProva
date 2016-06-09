package sistema.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Escolha {
	@Id
	private String Texto;

	public String getTexto() {
		return Texto;
	}

	public void setTexto(String texto) {
		Texto = texto;
	}

	@Override
	public String toString() {
		return "Escolha [Texto=" + Texto + "]";
	}
	
}
