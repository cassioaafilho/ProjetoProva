package sistema.modelos;

import javax.persistence.Entity;

@Entity
public class Dissertativa extends Pergunta{
	private String Resposta;

	public String getResposta() {
		return Resposta;
	}

	public void setResposta(String resposta) {
		Resposta = resposta;
	}
	
}
