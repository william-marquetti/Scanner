/*
 * 23.	Diga se o c�digo abaixo esta condizente com o que ser� impresso no console, 
 * se n�o, o por que e diga o resultado correto.
 * a.	
 * 	String texto = �Vin�cius�;
	String outroTexto = texto + �Ferneda�;
	texto = outroTexto + �Ferneda�;
	System.out.println(outroTexto);
	
	Console:
	ViniciusFernedaFerneda

 */
package exercicios.numero23.itema;

public class Classe {
	public static void main(String[] args) {
		
		String texto = "Vin�cius";
		String outroTexto = texto + "Ferneda";
		texto = outroTexto + "Ferneda";
		System.out.println(outroTexto);
		
		/* n�o imprimiu ViniciusFernedaFerneda pois no comando "System.out.println(outroTexto);"
		 *  foi utilizada a variavel "outroTexto" que possui o valor " Vin�ciusFerneda
		 */
		

	}
}

		