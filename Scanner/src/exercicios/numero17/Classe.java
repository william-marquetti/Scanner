/*
 * 		17.	 Peça para o usuário digitar um número. 
		 * Guarde o número que o usuário digitou. 
		 * Some o número que o usuário digitou com 5. 
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
		
		System.out.println("Digite um número");
		numero1 = scanner.nextInt();
		
		scanner.close();
		
		soma = (numero1 + 5);
		System.out.println("Resultado: "+ soma);
		
		soma = (soma + 5);
		System.out.println("Resultado: "+ soma);
		
		
		
	}
}
