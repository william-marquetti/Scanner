/*23.	Diga se o c�digo abaixo esta condizente com o que ser� impresso no console, 
 * se n�o, o por que e diga o resultado correto.
 * 
 * f.	boolean numero = true;
	String booleano = �false�;
	numero = false | true;
booleano = �false | false�;
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
		
		
		/* na primeira impressao ser� impresso false | false pois a vari�vel booleano � uma String e teve este valor atribuido
		 * 
		 */
		
	
	}

}
