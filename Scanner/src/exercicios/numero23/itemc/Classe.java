/*
 * 23.	Diga se o c�digo abaixo esta condizente com o que ser� impresso no console, 
 * se n�o, o por que e diga o resultado correto.
 * 
 * c.	int numero = 10;
		int outroNumero = numero;
		outroNumero = outroNumero + 10;
		numero = outroNumero;
		numero = outroNumero + 1;
		System.out.println(numero + 1);
		outroNumero = numero + 1;
		System.out.println(numero);

		Console:
		21		
		22
		



 * 
 */
package exercicios.numero23.itemc;

public class Classe {

	public static void main(String[] args) {
		
		int numero = 10;
		int outroNumero = numero;
		
		outroNumero = outroNumero + 10;
		
		numero = outroNumero;
		
		numero = outroNumero + 1;
		
		System.out.println(numero + 1);
		
		outroNumero = numero + 1;
		
		System.out.println(numero);
		
		/*
		 * Vai imprimir 22 e 21 pois os valores foram trocdos e na primeira impressao, 
		 * foi somado 1 com o numero que naquele momento era 21.
		 * logo em seguida, a vari�vel outroNumero foi alterada recebendo o numero que era 21 
		 * e foi impresso somente a variavel numero, sem qualquer opera��o
		 */


	}

}
