/*
 * 10.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Imprima no console o valor do resultado do primeiro número elevado ao quadrado
 *  mais o segundo número elevado ao quadrado.
 */
package exercicios.numero10;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numero1;
		int numero2;

		System.out.println("Digite o primero numero");
		numero1 = scanner.nextInt();

		System.out.println("Digite o segundo numero");
		numero2 = scanner.nextInt();

		System.out.println( (numero1 * numero1 ) + ( numero2 * numero2) );
		

		scanner.close();
	}

}
