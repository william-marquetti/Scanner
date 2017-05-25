/*
 * 23.	Diga se o código abaixo esta condizente com o que será impresso no console, 
 * se não, o por que e diga o resultado correto.
 * a.	
 * 	String texto = “Vinícius”;
	String outroTexto = texto + “Ferneda”;
	texto = outroTexto + “Ferneda”;
	System.out.println(outroTexto);
	
	Console:
	ViniciusFernedaFerneda

 */
package exercicios.numero23.itema;

public class Classe {
	public static void main(String[] args) {
		
		String texto = "Vinícius";
		String outroTexto = texto + "Ferneda";
		texto = outroTexto + "Ferneda";
		System.out.println(outroTexto);
		
		/* não imprimiu ViniciusFernedaFerneda pois no comando "System.out.println(outroTexto);"
		 *  foi utilizada a variavel "outroTexto" que possui o valor " ViníciusFerneda
		 */
		

	}
}

		