package senac.entra21.java.oop.lista02;

public class Lampada {
	
	private	boolean ligada;
		
	boolean acionarInterruptor() {
		if (ligada) {
			ligada = false;
			System.out.println("LÂMPADA DESLIGADA\n");
		} else {
			ligada = true;
			System.out.println("LÂMPADA LIGADA\n");
		}
		return ligada;
	}	
	
	
	

}
