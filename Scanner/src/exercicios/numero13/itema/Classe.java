/*
 * 13.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado.
a.	Imprima true se o valor do primeiro n�mero � menor ou igual a 
soma do segundo n�mero com o terceiro e 
o quarto n�mero, for impar ou maior que 10, 
caso contr�rio false.

 
 */
package exercicios.numero13.itema;

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


		if ( ( numero1 <= (numero2 + numero3 + numero4) ) || ( numero1 % 2 != 0 ) || ( numero1 > 10 ) ) {

			System.out.println(true);
		} else {
			System.out.println(false);
		}

		scanner.close();
	}

}
