package sistema.modelos;

import javax.persistence.Entity;

@Entity
public class Escolha {
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
