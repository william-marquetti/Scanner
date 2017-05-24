/*
 * 13.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado.

b.	Imprima true se a soma do primeiro dígito mais o segundo mais o terceiro mais o 
quarto dígito for múltiplo de 10, ou múltiplo de 5, ou o primeiro dígito for 5,
 ou a soma do primeiro dígito mais o segundo e o terceiro dígito, 
 for maior que 100.0, e o primeiro dígito maior que 0.
 (
	 ( ( numero1 + numero2 + numero3 + numero4 ) % 10 == 0 ) ||
	 ( ( numero1 + numero2 + numero3 + numero4 ) % 5 == 0 ) || 
	 ( ( numero1 == 5) ) ||
	 ( ( numero1 + numero2 + numero3) > 100 ) && ( numero1 > 0 ) ) 
 ) 


 
 */
package exercicios.numero13.itemb;

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


		if  (
				 ( ( numero1 + numero2 + numero3 + numero4 ) % 10 == 0 ) ||
				 ( ( numero1 + numero2 + numero3 + numero4 ) % 5 == 0 ) || 
				 ( ( numero1 == 5) ) ||
				 ( ( ( numero1 + numero2 + numero3) > 100 ) && ( numero1 > 0 ) ) 
			 ) {

			System.out.println(true);
		} else {
			System.out.println(false);
		}

		scanner.close();
	}

}
