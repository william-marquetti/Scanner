/*
 * 		17.	 Pe�a para o usu�rio digitar um n�mero. 
		 * Guarde o n�mero que o usu�rio digitou. 
		 * Some o n�mero que o usu�rio digitou com 5. 
		 * Imprima o resultado da soma. 
		 * Pegue o resultado e some com 5 novamente. 
		 * Imprima o resultado da soma.
 */
package exercicios.numero17;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero1;
		int soma;
		
		System.out.println("Digite um n�mero");
		numero1 = scanner.nextInt();
		
		scanner.close();
		
		soma = (numero1 + 5);
		System.out.println("Resultado: "+ soma);
		
		soma = (soma + 5);
		System.out.println("Resultado: "+ soma);
		
		
		
	}
}
