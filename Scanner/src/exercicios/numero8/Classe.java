/*
 * 8.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Imprima no console true se o primeiro número digitado é maior que 5 e
 *  o segundo número menor que 10. Caso contrário imprima false.
 */
package exercicios.numero8;

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

		if ( ( numero1 > 5 ) && ( numero2 < 10) ){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		

		scanner.close();
	}

}
