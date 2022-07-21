package senac.entra21.java.oop.lista02;

import java.util.Scanner;

public class Aluno {
	
	Scanner leia = new Scanner(System.in);

	String nomeAluno;
	int matriculaAluno;
	String curso;
	String disciplina [];
	double notas [][];
	double media;
		
	void cadastrarDisciplinas() {
		for (int i=0; i<disciplina.length; i++) {
			System.out.print("Informe o nome da " + (i+1) + "ª disciplina: ");
			disciplina[i] = leia.next();
		}
	}
		
	void cadastrarNotas() {
		for (int i=0; i<notas.length; i++) {
			System.out.println("\nInforme as notas da disciplina " + disciplina[i]);
			for (int j=0; j<notas[i].length; j++) {
				System.out.print("Insira a " + (j+1) + "ª nota: ");
				notas[i][j] = leia.nextDouble();
				while (notas[i][j] < 0 || notas[i][j] > 10) {
					System.out.print("Favor digitar uma nota entre 0 e 10: ");
					notas[i][j] = leia.nextDouble();
				}
			}
		}
	}
	
	void gerarBoletim () {
		System.out.println("\n============================ BOLETIM ===========================");
		System.out.println("Nome do Aluno: " + nomeAluno);
		System.out.println("Matricula do Aluno: " + matriculaAluno);
		System.out.println("Curso: " + curso);
		System.out.println("================================================================\n");
		
		for (int i=0; i<notas.length; i++) {
			System.out.print(disciplina[i] + "\t");
			media = 0;
			for (int j=0; j<notas[i].length; j++) {
				System.out.print(String.format("%.2f", notas[i][j]) + "\t");
				media += notas[i][j];
			}
			media = media/4;
			System.out.print("Média: " + String.format("%.2f", media) + " - ");
			System.out.println(media >= 7? "APROVADO": "REPROVADO");
		}
		System.out.println("================================================================\n");
	}
	
}

