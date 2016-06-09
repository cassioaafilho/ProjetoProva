package sistema.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Afirmacao {
	@Id
	private String Texto;
	private boolean Veracidade;
	private String Justificativa;
	public String getTexto() {
		return Texto;
	}
	public void setTexto(String texto) {
		Texto = texto;
	}
	public boolean isVeracidade() {
		return Veracidade;
	}
	public void setVeracidade(boolean veracidade) {
		Veracidade = veracidade;
	}
	public String getJustificativa() {
		return Justificativa;
	}
	public void setJustificativa(String justificativa) {
		Justificativa = justificativa;
	}
	@Override
	public String toString() {
		return "Afirmação [Texto=" + Texto + ", Veracidade=" + Veracidade + ", Justificativa=" + Justificativa + "]";
	}
}
