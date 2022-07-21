package senac.entra21.java.oop.lista02;

import java.util.Scanner;

public class ContaCorrenteTeste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
		ContaCorrente mau = new ContaCorrente();
				
		mau.saldo = 1000;
		mau.especial = true;
		mau.limite = 1000;
		mau.limiteAtual = mau.limite;
				
		int opcao = 4;
		
		while (opcao != 0) {
			System.out.println("\n <<<< Use o menu para selecionar o que deseja fazer >>>>\n");
			System.out.println("1 para sacar");
			System.out.println("2 para depositar");
			System.out.println("3 para consultar saldo");
			System.out.println("0 para sair");
			opcao = leia.nextInt();
			
			while (opcao > 3 || opcao < 0) {
				System.out.println("\nFavor escolher uma opção válida:");
				System.out.println("\n <<<< Use o menu para selecionar o que deseja fazer >>>>\n");
				System.out.println("1 para sacar");
				System.out.println("2 para depositar");
				System.out.println("3 para consultar saldo");
				System.out.println("0 para sair");
				opcao = leia.nextInt();
			}
			
			if (opcao == 1) {;
				mau.sacarDinheiro(0);
			} else if (opcao == 2) {
				mau.depositarDinheiro(0);
			} else if (opcao == 3) {
				mau.consultarSaldo();
			} else {
				System.out.println("\n<<<< Obrigado >>>>");
			}
		}
		
		leia.close();
				
	}

}
