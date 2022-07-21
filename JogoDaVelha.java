package senac.entra21.java.oop.lista02;

public class JogoDaVelha {

	char jogoDaVelha[][] = new char[3][3];
	int jogada = 1;
	
	void imprimirTabuleiro() {
		System.out.println("\n    1   2   3  ");
		System.out.println("  :---:---:---:");
		for (int i=0; i<jogoDaVelha.length; i++) {
			System.out.print(i+1);
			for (int j=0; j<jogoDaVelha[i].length; j++) {
				System.out.print(" | " + jogoDaVelha[i][j]);
			}
			System.out.println(" |");
			System.out.println("  :---:---:---:");
		}
	}
	
	boolean jogadorDaVez() {
		if (jogada % 2 ==1) {
			return true;
		} return false;
	}
	
	boolean validarJogada(int linha, int coluna, char sinal) {
		if (jogoDaVelha [linha][coluna] == 'X' || jogoDaVelha [linha][coluna] == 'O') {
			System.out.println("\n<<<< Jogada inválida, tente novamente! >>>>");
			return false;
		} else {
			jogoDaVelha [linha][coluna] = sinal;
			jogada++;
			return true;
		}
	}
	
	boolean verificarGanhador(char sinal) {
		if((jogoDaVelha[0][0]==sinal && jogoDaVelha[0][1]==sinal && jogoDaVelha[0][2]==sinal)||
			(jogoDaVelha[1][0]==sinal && jogoDaVelha[1][1]==sinal && jogoDaVelha[1][2]==sinal)||
			(jogoDaVelha[2][0]==sinal && jogoDaVelha[2][1]==sinal && jogoDaVelha[2][2]==sinal)||
			(jogoDaVelha[0][0]==sinal && jogoDaVelha[1][0]==sinal && jogoDaVelha[2][0]==sinal)||
			(jogoDaVelha[0][1]==sinal && jogoDaVelha[1][1]==sinal && jogoDaVelha[2][1]==sinal)||
			(jogoDaVelha[0][2]==sinal && jogoDaVelha[1][2]==sinal && jogoDaVelha[2][2]==sinal)||
			(jogoDaVelha[0][0]==sinal && jogoDaVelha[1][1]==sinal && jogoDaVelha[2][2]==sinal)||
			(jogoDaVelha[0][2]==sinal && jogoDaVelha[1][1]==sinal && jogoDaVelha[2][0]==sinal)) {
			return true;
		} return false;
	}
	
}
