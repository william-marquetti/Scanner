/*
 * 15.	Vamos considerar que temos que validar um campo texto de uma tela de cadastro de pessoa,
 *  no qual � um campo de observa��o. 
 *  Caso a quantidade de caracteres que o usu�rio digitou for maior que 50, imprima false,
 *   caso contr�rio imprima true.
 */
package exercicios.numero15;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String texto;
		
		System.out.println("Digite um texto (minimo de 50 caracteres) ");
		texto = scanner.nextLine();
		
		if ( texto.length() > 50 ){
			System.out.println(false);
		} else {
			System.out.println(true);
		}
		
		scanner.close();
		
	}

}
