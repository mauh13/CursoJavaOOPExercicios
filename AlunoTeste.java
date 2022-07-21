package senac.entra21.java.oop.lista02;

public class AlunoTeste {

	public static void main(String[] args) {
		
		Aluno mau = new Aluno();
			
		mau.nomeAluno = "Maurici";
		mau.curso = "Entra21";
		mau.matriculaAluno = 280180;
		mau.disciplina = new String[3];
		mau.notas = new double[3][4];
		
		mau.cadastrarDisciplinas();
			
		mau.cadastrarNotas();
			
		mau.gerarBoletim();

		}

	}
