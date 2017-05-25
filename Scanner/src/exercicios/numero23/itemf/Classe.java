/*23.	Diga se o código abaixo esta condizente com o que será impresso no console, 
 * se não, o por que e diga o resultado correto.
 * 
 * f.	boolean numero = true;
	String booleano = “false”;
	numero = false | true;
booleano = “false | false”;
numero = false | numero;
System.out.println(booleano );
System.out.println(numero );

Console:
false
true



 * 
 */
package exercicios.numero23.itemf;

public class Classe {

	public static void main(String[] args) {
		boolean numero = true;
		String booleano = "false";
		numero = false | true;
		booleano = "false | false";
		numero = false | numero;
		System.out.println(booleano );
		System.out.println(numero );
		
		
		/* na primeira impressao será impresso false | false pois a variável booleano é uma String e teve este valor atribuido
		 * 
		 */
		
	
	}

}
