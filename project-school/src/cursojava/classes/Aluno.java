package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

/*Esta  e nossa classe / objeto que representa Aluno*/
public class Aluno {
	private String nome;
	private int idade;
	private String dataDeNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	private List<Disciplina> disciplinas = new ArrayList <Disciplina>();
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public Aluno() {/*Cria dados na memoria Sendo padrão do java*/
			
	}
	public Aluno (String nomePadrao) {
		nome = nomePadrao;
	}
	public Aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	/*Veremos o metodos GETTER E SETTER do objeto*/
	/*SET e para adcionar ou receber dados para os atributos*/
	/*GET e para resgatar ou obter valor do atributo*/
	
	public void setNome(String nome) {
		this.nome = nome;

	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataDeNascmento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	/*Metodo que retorna a media do aluno*/
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		for(Disciplina discplina : disciplinas) {
			
			somaNotas += discplina.getNota();
		}
	return somaNotas / disciplinas.size();
	}
	/* Metodo retorna se o aluno esta aprovado e false se esta reprovado*/
	public boolean getAlunoAprovado(){
		double media = this.getMediaNota();
		if(media >= 70) {
			return true;
		}else {
			return false;
		}
	}
	public String getAlunoAprovado2(){
		double media = this.getMediaNota();
		if(media >= 50) {
			if (media >= 70) {
			return "Aluno esta aprovado";
			}else {
				return "Aluno esta de recuperação";
			}
		}else {
			return "Aluno esta reprovado";
		}
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataDeNascimento=" + dataDeNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado +"]";
	}

	
}