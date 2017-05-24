/*
 * 13.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado.

d.	Imprima false se o valor do primeiro dígito mais o segundo, 
terceiro e quarto for maior que 10, caso contrário true.

( ( numero1 + numero2 + numero3 + numero4 ) > 10 )

 */
package exercicios.numero13.itemd;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero1;
		int numero2;
		int numero3;
		int numero4;

		System.out.println("Digite o primero numero");
		numero1 = scanner.nextInt();

		System.out.println("Digite o segundo numero");
		numero2 = scanner.nextInt();

		System.out.println("Digite o terceiro numero");
		numero3 = scanner.nextInt();
		
		System.out.println("Digite o quarto numero");
		numero4 = scanner.nextInt();
		
		if ( ( numero1 + numero2 + numero3 + numero4 ) > 10 ){
			System.out.println(false);
		} else {
			System.out.println(true);
		}
		
		scanner.close();
	}

}
