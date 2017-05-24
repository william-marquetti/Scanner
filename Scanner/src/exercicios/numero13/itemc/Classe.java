/*
 * 13.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado.

c.	Imprima true se o resultado da questão a e o resultado da questão b forem verdadeiras, 
ou o resultado da questão a e o resultado da questão b forem falsas.

 */
package exercicios.numero13.itemc;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero1;
		int numero2;
		int numero3;
		int numero4;
		boolean resultadoA;
		boolean resultadoB;

		System.out.println("Digite o primero numero");
		numero1 = scanner.nextInt();

		System.out.println("Digite o segundo numero");
		numero2 = scanner.nextInt();

		System.out.println("Digite o terceiro numero");
		numero3 = scanner.nextInt();
		
		System.out.println("Digite o quarto numero");
		numero4 = scanner.nextInt();

		// Comparação do resultado do exercício anterior A

		if ( ( numero1 <= (numero2 + numero3 + numero4) ) || ( numero1 % 2 != 0 ) || ( numero1 > 10 ) ) {

			resultadoA = true;
		} else {
			resultadoA = false;
		}
		
		// Comparação do resultado do exercício anterior B
		
		if  (
				 ( ( numero1 + numero2 + numero3 + numero4 ) % 10 == 0 ) ||
				 ( ( numero1 + numero2 + numero3 + numero4 ) % 5 == 0 ) || 
				 ( ( numero1 == 5) ) ||
				 ( ( ( numero1 + numero2 + numero3) > 100 ) && ( numero1 > 0 ) ) 
			 ) {

			resultadoB = true;
		} else {
			resultadoB = false;
		}
		
		if ( ( resultadoA && resultadoB == true) || ( resultadoA && resultadoB == false)){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
		scanner.close();
	}

}
