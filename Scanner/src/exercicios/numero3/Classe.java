/*
 * 3. Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado.
 *  Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado.
 *  Imprima no console true se os dois n�mero s�o iguais ou false se s�o diferentes.
 */
package exercicios.numero3;

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
		
		if ( numero1 == numero2 ){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
		scanner.close();
	}

}
