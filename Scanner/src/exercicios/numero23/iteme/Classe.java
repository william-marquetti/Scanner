/*23.	Diga se o código abaixo esta condizente com o que será impresso no console, 
 * se não, o por que e diga o resultado correto.
 * 
 * e.	String numero = “A”;
	int texto = 1;
	numero = numero + numero;
	texto = texto;
	texto = 2;
	System.out.println(numero);
	System.out.println(texto);
	
	Console:
	1
	2

 */

package exercicios.numero23.iteme;

public class Classe {

	public static void main(String[] args) {
		String numero = "A";
		int texto = 1;
		numero = numero + numero;
		texto = texto;
		texto = 2;
		System.out.println(numero);
		System.out.println(texto);
		
		/*
		 * Imrimiu AA 2 pois a variavel numero é uma string de valor A
		 * que foi concatenada com ela mesma
		 */

	}

}
