/*
 * 4.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
 * Imprima no console true se o primeiro n�mero � maior que o segundo n�mero digitado.
 */
package exercicios.numero4;

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

		if (numero1 > numero2) {
			System.out.println("O primeiro n�mero � maior que o segundo.");
		} else if  (numero1 < numero2) {
			System.out.println("O primeiro n�mero � menor que o segundo.");
		} else {
			System.out.println("O primeiro e o segundo n�mero s�o iguais");
		}

		scanner.close();
	}
}
