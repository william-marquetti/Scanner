/*
 * 1.	Escreva no console para digitar um n�mero inteiro, 
 * leia o n�mero inteiro digitado e imprima o n�mero no console.
 */

package exercicios.numero1;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		// Inicializa��o do scanner 
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero");
		
		// receber um numero atravez do scanner
		numero = scanner.nextInt();
		
		System.out.println(numero);
		
		// fechar o scanner
		scanner.close();
	}
}
