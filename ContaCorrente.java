package senac.entra21.java.oop.lista02;

import java.util.Scanner;

public class ContaCorrente {
	
	Scanner leia = new Scanner(System.in);
	
	String banco;
	String titular;
	double numero;
	double saldo;
	boolean especial;
	double limite;
	double limiteAtual;
	
	
	void sacarDinheiro(double valor) {
		System.out.println("\nInforme o valor que deseja sacar: ");
		valor = leia.nextDouble();
		if (especial) {
			if ((saldo - valor) < -limite) {
				System.out.println("Saldo insuficiente");
			} else {
				System.out.println("Saque realizado");
				saldo -= valor;
				if (saldo < 0) {
					limiteAtual = limite + saldo;
				}
			}
		} else {
			if ((saldo - valor) < 0) {
				System.out.println("Saldo insuficiente");
			} else {
				System.out.println("Saque realizado");
				saldo = saldo - valor;
			}
		}
	}
	
	void depositarDinheiro(double valor) {
		System.out.println("\nInforme o valor que deseja depositar: ");
		valor = leia.nextDouble();
		saldo += valor;
		limiteAtual += valor;
		if (limite <= limiteAtual) {
			limiteAtual = limite;
		}
	}
	
	void consultarSaldo() {
		System.out.println("\nSeu saldo é: " + saldo);
		System.out.println("Seu limite especial é: " + limiteAtual);
		if (saldo < 0) {
			System.out.println("\nATENÇÃO: Você está usando " + saldo + " do seu limite especial.");
		}
	}
	
}
