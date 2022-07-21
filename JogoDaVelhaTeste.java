package senac.entra21.java.oop.lista02;

import java.util.Scanner;

public class JogoDaVelhaTeste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		JogoDaVelha novaPartida = new JogoDaVelha();
		
		boolean fimDeJogo = false;
		char sinal;
		int linha = 0, coluna = 0;
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		novaPartida.imprimirTabuleiro();
		
		while (!fimDeJogo) {
			if (novaPartida.jogadorDaVez()) {
				System.out.println("\nVez do jogar 1, escolha linha e coluna (1 a 3)");
				sinal = 'X';
			} else {
				System.out.println("\nVez do jogar 2, escolha linha e coluna (1 a 3)");
				sinal = 'O';
			}
			
			System.out.print("Linha: ");
			linha = leia.nextInt();
			linha--;
			while (linha < 0 || linha > 2) {
				System.out.println("Tente novamente");
				linha = leia.nextInt();
				linha--;
			} 
			
			System.out.print("Coluna: ");
			coluna = leia.nextInt();
			coluna--;
			while (coluna < 0 || coluna > 2) {
				System.out.println("Tente novamente");
				coluna = leia.nextInt();
				coluna--;
			} 	
			
			if (novaPartida.validarJogada(linha, coluna, sinal)) {
				novaPartida.imprimirTabuleiro();
			}
			
			if (novaPartida.verificarGanhador('X')) {
				fimDeJogo = true;
				System.out.println("\nParabéns, Jogador 1 ganhou!");
			} else if (novaPartida.verificarGanhador('O')) {
				fimDeJogo = true;
				System.out.println("\nParabéns, Jogador 2 ganhou!");
			} else if (novaPartida.jogada > 9) {
				fimDeJogo = true;
				System.out.println("\nDeu Velha, ninguém ganhou a partida");
			}
		}

		leia.close();

	}

}
