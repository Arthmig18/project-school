package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
	
	/* main e um metodo auto executavel em java */
	public static void main(String[] args) {
		/* new Aluno() e uma instancia (riação do objeto)*/
		/* aluno 1 e referencia so objeto Aluno*/
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for (int qtd = 1 ; qtd <= 2 ; qtd++) {
		
		String nome = JOptionPane.showInputDialog("Qual é o nome do aluno"+qtd+"");
		String idade = JOptionPane.showInputDialog("Idade do aluno");
		String DataDeNascimento = JOptionPane.showInputDialog("Data de nascimento");
		String RegistroGeral = JOptionPane.showInputDialog("RG");
		String NumeroCpf = JOptionPane.showInputDialog("CPF");
		String NomeMae = JOptionPane.showInputDialog("Nome da mãe do aluno");
		String NomePai = JOptionPane.showInputDialog("Nome do pai do aluno");
		String DataMatricula = JOptionPane.showInputDialog("Data da Matricula");
		String SerieMatriculado = JOptionPane.showInputDialog("Qual é a Serie Matriculado");
		String NomeEscola = JOptionPane.showInputDialog("Nome da Escola");
		
				
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataDeNascimento(DataDeNascimento);
		aluno1.setRegistroGeral(RegistroGeral);
		aluno1.setNumeroCpf(NumeroCpf);
		aluno1.setNomeMae(NomeMae);
		aluno1.setNomePai(NomePai);
		aluno1.setDataMatricula(DataMatricula);
		aluno1.setSerieMatriculado(SerieMatriculado);
		aluno1.setNomeEscola(NomeEscola);*/
		
		for(int pos=1; pos<= 4; pos++) {
		String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+ "?");
		String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " +pos+ "?");
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina(notaDisciplina);
		disciplina.setNota(Double.valueOf(notaDisciplina));
		aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null,"Deseja remover alguma discplina?");
		if(escolha == 0) {/*Opção Sim e ZERO*/
			
			int continuarRemover = 0;
			int posicao = 1 ;
			while(continuarRemover == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual diciplina 1, 2, 3 ou 4?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()-posicao);
			posicao ++;
			continuarRemover = JOptionPane.showConfirmDialog(null,"Continuar a remover?");
			}
		}
		alunos.add(aluno1);
		}
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
			System.out.println("Média do aluno: "+aluno.getMediaNota());
			System.out.println("Resultado: "+ aluno.getAlunoAprovado2());
			System.out.println("--------------------------------------");
		}
		
		
    }
}