/*
 * 23.	Diga se o código abaixo esta condizente com o que será impresso no console, 
 * se não, o por que e diga o resultado correto.
 * 
 * d.	double numero = 0.1 + 0.2;
		numero = 0.1 + 0.2;
		double outroNumero = numero - 0.1;
		numero = outroNumero;
		outroNumero = numero - 1;
		System.out.println(numero);

		Console: 
		0.3

 */
package exercicios.numero23.itemd;

public class Classe {

	public static void main(String[] args) {
		double numero = 0.1 + 0.2;
		numero = 0.1 + 0.2;
		double outroNumero = numero - 0.1;
		numero = outroNumero;
		outroNumero = numero - 1;
		System.out.println(numero);
		
		/*
		 * Será impresso 0.2 pois a variavel outroNumero recebeu o valor de numero - 1.0
		 *  (que naquele momento era 0.3
		 *  e numero recebeu o valor de outroNumero que era 0.2
		 */


	}

}
