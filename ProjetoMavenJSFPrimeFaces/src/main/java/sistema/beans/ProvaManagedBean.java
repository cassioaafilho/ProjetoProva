package sistema.beans;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Aluno;
import sistema.modelos.Conteudo;
import sistema.modelos.Disciplina;
import sistema.modelos.PDFWithText;
import sistema.modelos.Pergunta;
import sistema.modelos.Prova;
import sistema.modelos.Professor;
import sistema.service.AlunoService;
import sistema.service.ConteudoService;
import sistema.service.ProvaService;
import sistema.service.ProfessorService;
import sistema.service.DisciplinaService;
import sistema.service.PerguntaService;

@ManagedBean(name = "provaManagedBean")
@SessionScoped
public class ProvaManagedBean {
	
	private static final long serialVersionUID = 1L;
	private Prova prova = new Prova();
	private Disciplina disciplina;
	private Conteudo conteudo;
	private ProvaService service = new ProvaService();
	private PerguntaService pgservice = new PerguntaService();
	private DisciplinaService dservice = new DisciplinaService();
	private ConteudoService cservice = new ConteudoService();
	private ProfessorService pservice = new ProfessorService();
	private ProvaService prservice = new ProvaService();
	private int quantidade;
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public List<Disciplina> getDisciplinas() {
		List<Disciplina> p = dservice.getDisciplinas();
		if(p.size() == 0)
		{
			Professor p1 = new Professor();
			p1.setNome("Glaucao");
			pservice.Salvar(p1);
			
			Disciplina d1 = new Disciplina();
			Disciplina d2 = new Disciplina();
			Disciplina d3 = new Disciplina();
			
			d1.setNome("POOI");
			d1.setProfessor(p1);
			d2.setNome("POOII");
			d2.setProfessor(p1);
			d3.setNome("CompGrafica");
			d3.setProfessor(p1);
			
			dservice.Salvar(d1);
			dservice.Salvar(d2);
			dservice.Salvar(d3);
			p.add(d1);
			p.add(d2);
			p.add(d3);
		}
		return p;
	}
	public List<Conteudo> getConteudos() {
		List<Conteudo> p = cservice.getConteudos();
		if(p.size() == 0)
		{
			Conteudo d1 = new Conteudo();
			Conteudo d2 = new Conteudo();
			Conteudo d3 = new Conteudo();
			
			d1.setNome("Java");
			d2.setNome("JSF");
			d3.setNome("JPA");
			cservice.Salvar(d1);
			cservice.Salvar(d2);
			cservice.Salvar(d3);
			p.add(d1);
			p.add(d2);
			p.add(d3);
		}
		return p;
	}


	public Conteudo getConteudo() {
		return conteudo;
	}

	public void setConteudo(Conteudo conteudo) {
		this.conteudo = conteudo;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public String salvar() throws IOException
	{
		int count = 1;
		PDFWithText p  = new PDFWithText();
		prova.setConteudo(conteudo);
		prova.setDisciplina(disciplina);
		prova.setPerguntas(getPerguntas());
		prservice.Salvar(prova);
		
		List<Pergunta> lista = pgservice.getPrguntasComp(disciplina, conteudo,quantidade);
		p.createPDF(lista, prova.getTitulo());
		prova = new Prova();
		return null;
	}
	public List<Pergunta> getPerguntas() {
		return pgservice.getPerguntas();
	}
	public Prova getProva() {
		return prova;
	}

	public void setProva(Prova prova) {
		this.prova = prova;
	}

	public List<Prova> getProvas() {
		return service.getProvas();
	}
}
