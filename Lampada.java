package senac.entra21.java.oop.lista02;

public class Lampada {
	
	private	boolean ligada;
		
	boolean acionarInterruptor() {
		if (ligada) {
			ligada = false;
			System.out.println("L�MPADA DESLIGADA\n");
		} else {
			ligada = true;
			System.out.println("L�MPADA LIGADA\n");
		}
		return ligada;
	}	
	
	
	

}
