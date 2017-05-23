/*
 * 9.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Imprima no console true se o primeiro número é menor igual a zero ou
 *  o segundo número é maior que 10. Caso contrário imprima false.
 */
package exercicios.numero9;

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

		if ( ( numero1 <= 0 ) && ( numero2 > 10) ){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		

		scanner.close();
	}

}
