/*
 * 12.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado.
 *  Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
	
	a.	Imprima o resultado do seguinte cálculo 
		(primeiro número multiplicado pelo terceiro número mais, o resultado somando
		 com o segundo número elevado ao cubo). 

 */
package exercicios.numero12.itema;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numero1;
		int numero2;
		int numero3;

		System.out.println("Digite o primero numero");
		numero1 = scanner.nextInt();

		System.out.println("Digite o segundo numero");
		numero2 = scanner.nextInt();
		
		System.out.println("Digite o terceiro numero");
		numero3 = scanner.nextInt();

		System.out.println( (int) ( (numero1 * numero3 ) + (Math.pow(numero2, 3) ) ) );
		

		scanner.close();
	}

}
